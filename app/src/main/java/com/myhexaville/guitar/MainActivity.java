package com.myhexaville.guitar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.databinding.DataBindingUtil;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.LoopingMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.myhexaville.guitar.databinding.ActivityMainBinding;

import java.io.IOException;

import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_UP;


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "MainActivity";
    private ActivityMainBinding binding;

    private MediaPlayer c4;
    private MediaPlayer cSharp4;
    private MediaPlayer d4;
    private MediaPlayer dSharp4;
    private MediaPlayer e4;
    private MediaPlayer f4;
    private MediaPlayer fSharp4;
    private MediaPlayer g4;
    private MediaPlayer gSharp4;
    private MediaPlayer a4;
    private MediaPlayer aSharp4;
    private MediaPlayer b4;
    private MediaPlayer c5;
    private MediaPlayer cSharp5;
    private MediaPlayer fSharp5;
    private MediaPlayer f5;
    private MediaPlayer e5;
    private MediaPlayer dSharp5;
    private MediaPlayer d5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        try {
            initNotes();
        } catch (RawResourceDataSource.RawResourceDataSourceException e) {
            e.printStackTrace();
        }

        setupTabs();
    }

    private void initNotes() throws RawResourceDataSource.RawResourceDataSourceException {
        c4 = MediaPlayer.create(this, R.raw.c4);
        cSharp4 = MediaPlayer.create(this, R.raw.c_sharp_4);
        d4 = MediaPlayer.create(this, R.raw.d4);
        dSharp4 = MediaPlayer.create(this, R.raw.d_sharp_4);
        e4 = MediaPlayer.create(this, R.raw.e4);
        f4 = MediaPlayer.create(this, R.raw.f4);
        fSharp4 = MediaPlayer.create(this, R.raw.f_sharp_4);
        g4 = MediaPlayer.create(this, R.raw.g4);
        gSharp4 = MediaPlayer.create(this, R.raw.g_sharp_4);
        a4 = MediaPlayer.create(this, R.raw.a4);
        aSharp4 = MediaPlayer.create(this, R.raw.a_sharp_4);
        b4 = MediaPlayer.create(this, R.raw.b4);
        c5 = MediaPlayer.create(this, R.raw.c5);
        cSharp5 = MediaPlayer.create(this, R.raw.c_sharp_5);
        d5 = MediaPlayer.create(this, R.raw.d5);
        dSharp5 = MediaPlayer.create(this, R.raw.d_sharp_5);
        e5 = MediaPlayer.create(this, R.raw.e5);
        f5 = MediaPlayer.create(this, R.raw.f5);
        fSharp5 = MediaPlayer.create(this, R.raw.f_sharp_5);
    }

    private void setupTabs() {
        binding.c4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                c4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (c4.isPlaying()) {
                    c4.stop();
                    c4.release();
                    c4 = MediaPlayer.create(this, R.raw.c4);
                }
            }
            return true;
        });

        binding.cSharp4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                cSharp4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (cSharp4.isPlaying()) {
                    cSharp4.stop();
                    cSharp4.release();
                    cSharp4 = MediaPlayer.create(this, R.raw.c_sharp_4);
                }
            }
            return true;
        });

        binding.d4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                d4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (d4.isPlaying()) {
                    d4.stop();
                    d4.release();
                    d4 = MediaPlayer.create(this, R.raw.d4);
                }
            }
            return true;
        });

        binding.dSharp4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                dSharp4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (dSharp4.isPlaying()) {
                    dSharp4.stop();
                    dSharp4.release();
                    dSharp4 = MediaPlayer.create(this, R.raw.d_sharp_4);
                }
            }
            return true;
        });

        binding.e4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                e4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (e4.isPlaying()) {
                    e4.stop();
                    e4.release();
                    e4 = MediaPlayer.create(this, R.raw.e4);
                }
            }
            return true;
        });

        binding.f4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                f4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (f4.isPlaying()) {
                    f4.stop();
                    f4.release();
                    f4 = MediaPlayer.create(this, R.raw.f4);
                }
            }
            return true;
        });

        binding.fSharp4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                fSharp4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (fSharp4.isPlaying()) {
                    fSharp4.stop();
                    fSharp4.release();
                    fSharp4 = MediaPlayer.create(this, R.raw.f_sharp_4);
                }
            }
            return true;
        });

        binding.g4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                g4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (g4.isPlaying()) {
                    g4.stop();
                    g4.release();
                    g4 = MediaPlayer.create(this, R.raw.g4);
                }
            }
            return true;
        });

        binding.gSharp4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                gSharp4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (gSharp4.isPlaying()) {
                    gSharp4.stop();
                    gSharp4.release();
                    gSharp4 = MediaPlayer.create(this, R.raw.g_sharp_4);
                }
            }
            return true;
        });

        binding.a4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                a4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (a4.isPlaying()) {
                    a4.stop();
                    a4.release();
                    a4 = MediaPlayer.create(this, R.raw.a4);
                }
            }
            return true;
        });

        binding.aSharp4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                aSharp4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (aSharp4.isPlaying()) {
                    aSharp4.stop();
                    aSharp4.release();
                    aSharp4 = MediaPlayer.create(this, R.raw.a_sharp_4);
                }
            }
            return true;
        });

        binding.b4.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                b4.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (b4.isPlaying()) {
                    b4.stop();
                    b4.release();
                    b4 = MediaPlayer.create(this, R.raw.b4);
                }
            }
            return true;
        });

        binding.c5.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                c5.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (c5.isPlaying()) {
                    c5.stop();
                    c5.release();
                    c5 = MediaPlayer.create(this, R.raw.c5);
                }
            }
            return true;
        });

        binding.cSharp5.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                cSharp5.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (cSharp5.isPlaying()) {
                    cSharp5.stop();
                    cSharp5.release();
                    cSharp5 = MediaPlayer.create(this, R.raw.c_sharp_5);
                }
            }
            return true;
        });


        binding.d5.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                d5.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (d5.isPlaying()) {
                    d5.stop();
                    d5.release();
                    d5 = MediaPlayer.create(this, R.raw.d5);
                }
            }
            return true;
        });

        binding.dSharp5.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                dSharp5.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (dSharp5.isPlaying()) {
                    dSharp5.stop();
                    dSharp5.release();
                    dSharp5 = MediaPlayer.create(this, R.raw.d_sharp_5);
                }
            }
            return true;
        });

        binding.e5.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                e5.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (e5.isPlaying()) {
                    e5.stop();
                    e5.release();
                    e5 = MediaPlayer.create(this, R.raw.e5);
                }
            }
            return true;
        });

        binding.f5.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                f5.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (f5.isPlaying()) {
                    f5.stop();
                    f5.release();
                    f5 = MediaPlayer.create(this, R.raw.f5);
                }
            }
            return true;
        });

        binding.fSharp5.setOnTouchListener((v, event) -> {
            if (event.getAction() == ACTION_DOWN) {
                Log.d(LOG_TAG, "setupTabs: ");
                fSharp5.start();
            } else if (event.getAction() == ACTION_UP) {
                Log.d(LOG_TAG, "setupTabs: ");
                if (fSharp5.isPlaying()) {
                    fSharp5.stop();
                    fSharp5.release();
                    fSharp5 = MediaPlayer.create(this, R.raw.f_sharp_5);
                }
            }
            return true;
        });
    }


}