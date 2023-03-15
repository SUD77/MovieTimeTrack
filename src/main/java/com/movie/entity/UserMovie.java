package com.movie.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user_movie")
public class UserMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String movieName;
    private Long timeSpent;


    public UserMovie() {
    }

    public UserMovie(Long id, String movieName, Long timeSpent) {
        this.id = id;
        this.movieName = movieName;
        this.timeSpent = timeSpent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Long getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(Long timeSpent) {
        this.timeSpent = timeSpent;
    }
}
