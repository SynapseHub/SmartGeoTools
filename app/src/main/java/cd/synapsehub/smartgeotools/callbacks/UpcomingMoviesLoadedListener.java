package cd.synapsehub.smartgeotools.callbacks;

import java.util.ArrayList;

import cd.synapsehub.smartgeotools.pojo.Movie;

/**
 * Created by Windows on 13-04-2015.
 */
public interface UpcomingMoviesLoadedListener {
    public void onUpcomingMoviesLoaded(ArrayList<Movie> listMovies);
}
