package cd.synapsehub.smartgeotools.callbacks;

import java.util.ArrayList;

import cd.synapsehub.smartgeotools.pojo.Movie;

/**
 * Created by Windows on 02-03-2015.
 */
public interface BoxOfficeMoviesLoadedListener {
    public void onBoxOfficeMoviesLoaded(ArrayList<Movie> listMovies);
}
