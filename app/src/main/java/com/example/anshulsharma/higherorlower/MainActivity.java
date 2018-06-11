package com.example.anshulsharma.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int random;
    public void guess(View view) {

        EditText number = findViewById(R.id.num);
        int finalNumber = Integer.parseInt(number.getText().toString());

        if (finalNumber > random) {
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        } else if (finalNumber < random) {
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "That's Right!,Great Job!", Toast.LENGTH_SHORT).show();
        }
    }
    public void reset(View view){

        Random rand = new Random();
        random = rand.nextInt(20) + 1;
        Toast.makeText(this, "Guess again!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand= new Random();
        random=rand.nextInt(20)+1;
    }
}
