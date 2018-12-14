package com.screen.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.data.model.Genres;
import com.framgia.music_45.R;
import com.screen.listsong.ListSongFragment;
import com.utils.ItemtRecyclerViewClick;
import java.util.ArrayList;
import java.util.List;

public class FragmentGenres extends Fragment implements ItemtRecyclerViewClick {

    private FragmentHomeAdapter mHomeAdapter;
    private List<Genres> mGenreList;

    public static FragmentGenres newInstance() {
        return new FragmentGenres();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music_genres, container, false);
        initData();
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        mHomeAdapter = new FragmentHomeAdapter(getContext(), mGenreList, this);
        recyclerView.setAdapter(mHomeAdapter);
        return view;
    }

    private void initData() {
        mGenreList = new ArrayList<>();
        mGenreList.add(new Genres(R.drawable.all, getString(R.string.all_music)));
        mGenreList.add(new Genres(R.drawable.audio, getString(R.string.audio)));
        mGenreList.add(new Genres(R.drawable.rock, getString(R.string.ambient)));
        mGenreList.add(new Genres(R.drawable.country, getString(R.string.alternative_rock)));
        mGenreList.add(new Genres(R.drawable.clasical, getString(R.string.classical)));
        mGenreList.add(new Genres(R.drawable.ambient, getString(R.string.country)));
    }

    @Override
    public void onItemRecyclerViewClick() {

    }
}
