package com.example.seekbarapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class SeekBarApp extends Activity {

	RelativeLayout background;
	SeekBar seek_bar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seek_bar);

		background = (RelativeLayout) findViewById(R.id.bckgrnd);

		seek_bar = (SeekBar) findViewById(R.id.seekBar1);

		seek_bar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				seek_bar.setMax(255);
				int r = progress;
				int bg = android.graphics.Color.rgb(255, 255 - r, 255 - r);
				background.setBackgroundColor(bg);

			}
		});

	}

}
