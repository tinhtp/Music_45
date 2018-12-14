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
import com.utils.ItemtRecyclerViewClick;
import java.util.List;

public class FragmentHomeAdapter extends RecyclerView.Adapter<FragmentHomeAdapter.MusicHolder> {
    private Context mContext;
    private List<Genres> mGenresList;
    private ItemtRecyclerViewClick mItemtRecyclerViewClick;

    public FragmentHomeAdapter(Context context, List<Genres> genresList,
            ItemtRecyclerViewClick recyclerViewClick) {
        mContext = context;
        mGenresList = genresList;
        mItemtRecyclerViewClick = recyclerViewClick;
    }

    @Override
    public MusicHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_genres, viewGroup, false);
        return new MusicHolder(view, mItemtRecyclerViewClick);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicHolder musicHolder, int i) {
        musicHolder.bindData(mGenresList.get(i));
    }

    @Override
    public int getItemCount() {
        return mGenresList.size();
    }

    class MusicHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView mImageGenres;
        private TextView mTextViewNameGenres;
        ItemtRecyclerViewClick mItemtRecyclerViewClick;

        public MusicHolder(@NonNull View itemView, ItemtRecyclerViewClick itemtRecyclerViewClick) {
            super(itemView);
            mImageGenres = itemView.findViewById(R.id.imageGenres);
            mTextViewNameGenres = itemView.findViewById(R.id.textGenres);
            mItemtRecyclerViewClick = itemtRecyclerViewClick;
            itemView.setOnClickListener(this);
        }

        public void bindData(Genres genres) {
            mImageGenres.setImageResource(genres.getGenresImage());
            mTextViewNameGenres.setText(genres.getNameGenres());
        }

        @Override
        public void onClick(View v) {
            mItemtRecyclerViewClick.onItemRecyclerViewClick();
        }
    }
}
