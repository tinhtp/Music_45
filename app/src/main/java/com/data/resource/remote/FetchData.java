package com.data.resource.remote;

import android.os.AsyncTask;
import com.data.model.Song;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FetchData extends AsyncTask<String, Void, List<Song>> {
    private RemoteDataCallBack mRemote;

    public FetchData(RemoteDataCallBack remoteDataCallBack) {
        mRemote = remoteDataCallBack;
    }

    @Override
    protected List<Song> doInBackground(String... strings) {
        String SongURL = HttpUrl(strings[0]);
        return parseJson(SongURL);
    }

    private String HttpUrl(String string) {
        String data = "";
        try {
            URL url = new URL(string);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            InputStream stream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
            httpURLConnection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private List<Song> parseJson(String data) {
        List<Song> songList = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(data);
            JSONArray jsonArray = jsonObject.getJSONArray("collection");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject object = jsonArray.getJSONObject(i);
                Song song = new Song(object.getString("title"), object.getString("label_name"),
                        object.getString("artwork_url"), object.getString("duration"),
                        object.getString("stream_url"), object.getString("stream_url"),
                        object.getString("id"));
                songList.add(song);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return songList;
    }

    @Override
    protected void onPostExecute(List<Song> songList) {
        super.onPostExecute(songList);
        mRemote.onSuccess(songList);
    }
}
