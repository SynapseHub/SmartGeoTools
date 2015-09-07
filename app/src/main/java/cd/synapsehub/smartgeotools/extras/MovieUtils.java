package cd.synapsehub.smartgeotools.extras;

import com.android.volley.RequestQueue;

import org.json.JSONObject;

import java.util.ArrayList;

import cd.synapsehub.smartgeotools.database.DBMovies;
import cd.synapsehub.smartgeotools.json.Endpoints;
import cd.synapsehub.smartgeotools.json.Parser;
import cd.synapsehub.smartgeotools.json.Requestor;
import cd.synapsehub.smartgeotools.materialdesign.MyApplication;
import cd.synapsehub.smartgeotools.pojo.Movie;


public class MovieUtils {


    public static ArrayList<Movie> loadBoxOfficeMovies(RequestQueue requestQueue) {
        JSONObject response = Requestor.requestMoviesJSON(requestQueue, Endpoints.getRequestUrlBoxOfficeMovies(30));
        ArrayList<Movie> listMovies = Parser.parseMoviesJSON(response);
        MyApplication.getWritableDatabase().insertMovies(DBMovies.BOX_OFFICE, listMovies, true);
        return listMovies;
    }

    public static ArrayList<Movie> loadUpcomingMovies(RequestQueue requestQueue) {
        JSONObject response = Requestor.requestMoviesJSON(requestQueue, Endpoints.getRequestUrlUpcomingMovies(30));
        ArrayList<Movie> listMovies = Parser.parseMoviesJSON(response);
        MyApplication.getWritableDatabase().insertMovies(DBMovies.UPCOMING, listMovies, true);
        return listMovies;
    }
}
