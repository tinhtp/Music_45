package com.data.model;

public class Genres {
    private int mGenresImage;
    private String mNameGenres;

    public Genres(int genresImage, String nameGenres) {
        mGenresImage = genresImage;
        mNameGenres = nameGenres;
    }

    public int getGenresImage() {
        return mGenresImage;
    }

    public void setGenresImage(int genresImage) {
        mGenresImage = genresImage;
    }

    public String getNameGenres() {
        return mNameGenres;
    }

    public void setNameGenres(String nameGenres) {
        mNameGenres = nameGenres;
    }
}
