package com.anncode.amazonviewer.dao;

import com.anncode.amazonviewer.db.IDBConnection;
import com.anncode.amazonviewer.model.Movie;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.anncode.amazonviewer.db.DataBase.*;

public interface MovieDAO extends IDBConnection {
    default Movie setMovieViewed(Movie movie){
        return movie;
    }
    default ArrayList<Movie> read(){
        ArrayList<Movie> movies = new ArrayList<>();
        try(Connection connection = connectToDB()){
            String query = "SELECT * FROM " + TMOVIE;
        }catch (SQLException e){

        }
        return movies;
    }
    private boolean getMovieViewed{
        return false;
    }
}
