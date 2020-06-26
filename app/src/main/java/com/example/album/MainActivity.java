package com.example.album;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int photoid = 1;

    public void nextPhoto(View view){

        ImageView img = findViewById(R.id.imageView);
        if(photoid==1){
            img.setImageResource(R.drawable.a1);
            ++photoid;}
        else if(photoid==2){
            img.setImageResource(R.drawable.a2);
            ++photoid;}
        else if(photoid==3){
            img.setImageResource(R.drawable.a3);
            ++photoid;}
        else if(photoid==4){
            img.setImageResource(R.drawable.a4);
            ++photoid;}
        else if(photoid==5){
            img.setImageResource(R.drawable.a5);
            ++photoid;}
        else if(photoid==6){
            img.setImageResource(R.drawable.a6);
            ++photoid;}
        else if(photoid==7){
            img.setImageResource(R.drawable.a7);
            photoid=1;}

    }
    public void previousPhoto(View view)
    {
        ImageView img = findViewById(R.id.imageView);

        if(photoid==1){
            img.setImageResource(R.drawable.a7);
            photoid=7;}
        else if(photoid==2){
            img.setImageResource(R.drawable.a1);
            --photoid;}
        else if(photoid==3){
            img.setImageResource(R.drawable.a2);
            --photoid;}
        else if(photoid==4){
            img.setImageResource(R.drawable.a3);
            --photoid;}
        else if(photoid==5){
            img.setImageResource(R.drawable.a4);
            --photoid;}
        else if(photoid==6){
            img.setImageResource(R.drawable.a5);
            --photoid;}
        else if(photoid==7){
            img.setImageResource(R.drawable.a6);
            --photoid;}


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}