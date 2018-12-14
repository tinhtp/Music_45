package com.data.model;

public class Song {
    private String mNameSong;
    private String mNameSinger;
    private String mImage;
    private String mDuration;
    private String mUrlPlay;
    private String mUrlDownLoad;
    private String mID;

    public Song(String nameSong, String nameSinger, String image, String duration, String urlPlay,
            String urlDownLoad,String ID) {
        mNameSong = nameSong;
        mNameSinger = nameSinger;
        mImage = image;
        mDuration = duration;
        mUrlPlay = urlPlay;
        mUrlDownLoad = urlDownLoad;
        mID=ID;
    }

    public String getNameSong() {
        return mNameSong;
    }

    public void setNameSong(String nameSong) {
        mNameSong = nameSong;
    }

    public String getNameSinger() {
        return mNameSinger;
    }

    public void setNameSinger(String nameSinger) {
        mNameSinger = nameSinger;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getDuration() {
        return mDuration;
    }

    public void setDuration(String duration) {
        mDuration = duration;
    }

    public String getUrlPlay() {
        return mUrlPlay;
    }

    public void setUrlPlay(String urlPlay) {
        mUrlPlay = urlPlay;
    }

    public String getUrlDownLoad() {
        return mUrlDownLoad;
    }

    public void setUrlDownLoad(String urlDownLoad) {
        mUrlDownLoad = urlDownLoad;
    }

    public String getID() {
        return mID;
    }

    public void setID(String ID) {
        mID = ID;
    }
}
