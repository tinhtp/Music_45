package com.data.resource;

import com.data.resource.remote.RemoteDataCallBack;

public interface SongDataSource {
    interface RemoteDataSource {
        void getSongRemote(RemoteDataCallBack remoteDataCallBack);
    }
}
