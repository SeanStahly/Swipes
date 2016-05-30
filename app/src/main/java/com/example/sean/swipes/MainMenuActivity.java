package com.example.sean.swipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    /**called when the user hits the "play" button */
    public void playGame(View view) {
        Intent intent = new Intent(this, StandardGame.class);
        startActivity(intent);
    }

    public void viewHighScores(View view) {
        Intent intent = new Intent(this, HighScores.class);
        startActivity(intent);
    }

    public void viewSettings(View view) {
        Intent intent = new Intent(this, SettingsMenu.class);
        startActivity(intent);
    }
}
