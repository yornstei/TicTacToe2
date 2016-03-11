package com.example.student1.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by student1 on 3/10/2016.
 */
public class NewGameWindow extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.new_game_layout);

        Intent activityThatCalled = getIntent();

        String previousActivity = activityThatCalled.getExtras().toString();

    }
}
