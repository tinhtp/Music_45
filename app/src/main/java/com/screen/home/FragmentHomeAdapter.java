package com.screen.home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.data.model.Genres;
import com.framgia.music_45.R;
import java.util.List;

public class FragmentHomeAdapter extends RecyclerView.Adapter<FragmentHomeAdapter.MusicHolder> {
    private Context mContext;
    private List<Genres> mGenresList;

    public FragmentHomeAdapter(Context context, List<Genres> genresList) {
        mContext = context;
        mGenresList = genresList;
    }

    @Override
    public MusicHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_genres, viewGroup, false);
        return new MusicHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicHolder musicHolder, int i) {
        musicHolder.bindData(mGenresList.get(i));
    }

    @Override
    public int getItemCount() {
        return mGenresList.size();
    }

    class MusicHolder extends RecyclerView.ViewHolder {
        private ImageView mImageGenres;
        private TextView mTextViewNameGenres;

        public MusicHolder(@NonNull View itemView) {
            super(itemView);
            mImageGenres = itemView.findViewById(R.id.imageGenres);
            mTextViewNameGenres = itemView.findViewById(R.id.textGenres);
        }

        public void bindData(Genres genres) {
            mImageGenres.setImageResource(genres.getGenresImage());
            mTextViewNameGenres.setText(genres.getNameGenres());
        }
    }
}
