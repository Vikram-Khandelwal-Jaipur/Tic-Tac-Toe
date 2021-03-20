package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    Button newt;
    TextView status1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        newt = findViewById(R.id.newgame1);


        status1 = findViewById(R.id.status1);

        //Intent i2 = getIntent();
        //String r = i2.getStringExtra("K");
        //status1.setText(r);
        status1.setText(getIntent().getStringExtra("K"));
    }

    public void newGame(View obj) {
        Intent i = new Intent(Result.this, GamePlay.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(Result.this, GamePlay.class);
        startActivity(i);
    }
}