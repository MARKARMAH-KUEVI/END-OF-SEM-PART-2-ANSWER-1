package com.example.end_of_sem_part_2_answer_1;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button button;
    String[] trafficColor = {"#ff0000", "#008000", "#ffff00"};
    String[] trafficLabel = {"STOP", "GO", "WAIT"};
    int onButtonPressed = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setBackgroundColor(Color.parseColor(trafficColor[onButtonPressed]));
        button.setText(trafficLabel[onButtonPressed]);
        button.setTextSize(30);
    }

    public void changeTrafficSignal(View v){

        onButtonPressed +=1;
        onButtonPressed = onButtonPressed % 3;
        button.setBackgroundColor(Color.parseColor(trafficColor[onButtonPressed]));
        button.setText(trafficLabel[onButtonPressed]);

    }
}