package id.sch.smktelkom_mlg.project2.xirpl40414152333.telskop.model;

import java.util.List;

/**
 * Created by faizaaulia on 3/29/2017.
 */
public class Movie {

    private String status;
    private String message;
    private String kota;
    private String date;
    private List<MovieData> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<MovieData> getData() {
        return data;
    }

    public void setData(List<MovieData> data) {
        this.data = data;
    }
}
