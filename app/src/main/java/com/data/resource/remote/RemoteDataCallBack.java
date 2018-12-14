package com.data.resource.remote;

import com.data.model.Song;
import java.util.List;

public interface RemoteDataCallBack {
    void onSuccess(List<Song> ListSong);
}
