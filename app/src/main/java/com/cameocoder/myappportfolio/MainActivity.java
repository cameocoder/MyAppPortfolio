package com.cameocoder.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button spotifyStreamer;
    Button scoresApp;
    Button libraryApp;
    Button buildBigger;
    Button xyzReader;
    Button myApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initializeViews();
        addButtonClickListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initializeViews() {
        spotifyStreamer = (Button) findViewById(R.id.spotify_streamer);
        scoresApp = (Button) findViewById(R.id.scores_app);
        libraryApp = (Button) findViewById(R.id.library_app);
        buildBigger = (Button) findViewById(R.id.build_it_bigger);
        xyzReader = (Button) findViewById(R.id.xyx_reader);
        myApp = (Button) findViewById(R.id.my_app);
    }

    private void addButtonClickListeners() {
        spotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch Spotify Streamer!");
            }
        });

        scoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch Scores App!");
            }
        });

        libraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch Library App!");
            }
        });

        buildBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This Button will launch Build it Bigger!");
            }
        });

        xyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch XYZ Reader!");
            }
        });

        myApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my capstone app!");
            }
        });
    }

    private void showToast(String text) {
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }

}
