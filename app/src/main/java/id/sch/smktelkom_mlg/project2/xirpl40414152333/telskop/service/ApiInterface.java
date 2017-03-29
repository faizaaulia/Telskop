package id.sch.smktelkom_mlg.project2.xirpl40414152333.telskop.service;

import id.sch.smktelkom_mlg.project2.xirpl40414152333.telskop.model.City;
import id.sch.smktelkom_mlg.project2.xirpl40414152333.telskop.model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by faizaaulia on 3/29/2017.
 */
public interface ApiInterface {

    @GET("api/jadwal-bioskop")
    Call<City> getCity();

    @GET("api/jadwal-bioskop")
    Call<Movie> getMovie(
            @Query("id") String id);
}