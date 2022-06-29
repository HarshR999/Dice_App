package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClicked(View v){

        int[] source = {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
        Random r = new Random();
        int n1 = r.nextInt(6);

        ImageView img1,img2;
        img1 = findViewById(R.id.diceOne);
        img1.setImageResource(source[n1]);

        int n2 = r.nextInt(6);

        img2 = findViewById(R.id.diceSec);
        img2.setImageResource(source[n2]);

        YoYo.with(Techniques.Tada)
                .duration(700)
                .repeat(1/2)
                .playOn(img1);
        YoYo.with(Techniques.Wave)
                .duration(700)
                .repeat(1/2)
                .playOn(img2);


    }
}