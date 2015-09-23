package com.example.dwayne.brainrandom;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.VideoView;


public class Frag_Celebration extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag__celebration, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().getWindow().setFormat(PixelFormat.TRANSLUCENT);
        final RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.videoViewContainer);
        final VideoView videoView = (VideoView) relativeLayout.findViewById(R.id.videoView);
        Uri videoUri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.iceb);
        videoView.setVideoURI(videoUri);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        videoView.start();
    }

}
