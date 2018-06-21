package com.inturnes.emotisong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    MasterPlaylist masterPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //TODO temp code
        new Song("Rolling in the deep","Adele").execute("");

        getSupportActionBar().setTitle("Welcome to EmotiSong!");

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(LoginActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, CaptureActivity.class);
                startActivity(intent);
            }
        });
    }

    //TODO push info passed from user into masterPlaylist
}
