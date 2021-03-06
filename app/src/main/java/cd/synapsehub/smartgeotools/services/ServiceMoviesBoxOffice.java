package cd.synapsehub.smartgeotools.services;

import java.util.ArrayList;

import cd.synapsehub.smartgeotools.callbacks.BoxOfficeMoviesLoadedListener;
import cd.synapsehub.smartgeotools.logging.L;
import cd.synapsehub.smartgeotools.pojo.Movie;
import cd.synapsehub.smartgeotools.task.TaskLoadMoviesBoxOffice;
import me.tatarka.support.job.JobParameters;
import me.tatarka.support.job.JobService;


public class ServiceMoviesBoxOffice extends JobService implements BoxOfficeMoviesLoadedListener {
    private JobParameters jobParameters;

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        L.t(this, "onStartJob");
        this.jobParameters = jobParameters;
        new TaskLoadMoviesBoxOffice(this).execute();
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        L.t(this, "onStopJob");
        return false;
    }


    @Override
    public void onBoxOfficeMoviesLoaded(ArrayList<Movie> listMovies) {
        L.t(this, "onBoxOfficeMoviesLoaded");
        jobFinished(jobParameters, false);
    }
}

