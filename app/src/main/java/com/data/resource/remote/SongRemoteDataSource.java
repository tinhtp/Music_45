package com.data.resource.remote;

import com.data.resource.SongDataSource;
import com.utils.Constant;

public class SongRemoteDataSource implements SongDataSource.RemoteDataSource {

    private static SongRemoteDataSource mSongRemoteDataSource;

    public static SongRemoteDataSource newInstance() {
        if (mSongRemoteDataSource == null) {
            mSongRemoteDataSource = new SongRemoteDataSource();
        }
        return mSongRemoteDataSource;
    }

    @Override
    public void getSongRemote(RemoteDataCallBack remoteDataCallBack) {
        new FetchData(remoteDataCallBack).execute(Constant.URL_BASE + Constant.KEY_API);
    }
}
