package com.example.koreanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Colors.NumbersClickListener clickListener = new Colors.NumbersClickListener();
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(clickListener);

        TextView books = (TextView) findViewById(R.id.books);
        books.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_LONG).show();
            }
        });*/
    }

    public void Books(View view){
        Intent intent = new Intent(this, Books.class);
        startActivity(intent);
    }

    public void Colors(View view){
        Intent intent = new Intent(this, Colors.class);
        startActivity(intent);
    }
    public void Alphabet(View view){
        Intent intent = new Intent(this, Alphabet.class);
        startActivity(intent);
    }


}
