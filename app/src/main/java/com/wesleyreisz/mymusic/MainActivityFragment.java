package com.wesleyreisz.mymusic;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.wesleyreisz.mymusic.model.Song;
import com.wesleyreisz.mymusic.service.MockMusicService;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // super.onCreate(savedInstanceState);
        // setContentView(R.layout.fragment_main);

        ListView listView = (ListView) getView().findViewById(R.id.listView);
        List<Song> songs = new MockMusicService().findAll();
        SongAdapter songAdapter = new SongAdapter(this.getActivity(), R.layout.activity_main, songs);
        listView.setAdapter(songAdapter);
    }

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
