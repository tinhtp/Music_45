package com.data.reponsitory;

import com.data.resource.SongDataSource;
import com.data.resource.remote.RemoteDataCallBack;

public class SongRepository {
    private SongDataSource.RemoteDataSource mRemoteDataSource;

    public SongRepository(SongDataSource.RemoteDataSource remoteDataSource) {
        mRemoteDataSource = remoteDataSource;
    }

    public void getSongRemote(RemoteDataCallBack remoteDataCallBack) {
        mRemoteDataSource.getSongRemote(remoteDataCallBack);
    }
}
