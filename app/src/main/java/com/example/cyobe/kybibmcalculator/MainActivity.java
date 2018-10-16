package com.example.cyobe.kybibmcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                final EditText heightText = (EditText)
                        findViewById (R.id.heightInput);
             String heightStr = heightText.getText().toString();
             double height = Double.parseDouble(heightStr);

                final EditText weightText = (EditText)
                        findViewById(R.id.weightInput);
              String weightStr = weightText.getText().toString();
              double weight = Double.parseDouble(heightStr);

              double BMI = (weight)/(height*height);

    final EditText BMIResult = (EditText)
            findViewById (R.id.BMIResult);

    BMIResult.setText(Double.toString(BMI));

    String BMI_Cat;

    if (BMI < 15)
        BMI_Cat = "Very severely underweight";
    else if (BMI < 16)
        BMI_Cat = "Severly underweight";
    else if (BMI < 18.5)
        BMI_Cat = "Underweight";
    else if (BMI < 25)
        BMI_Cat = "Normal";
    else if ( BMI < 30)
        BMI_Cat = "Overweight";
    else if (BMI < 35)
        BMI_Cat = "Obese class 1 - Moderately obese";
    else if (BMI < 40)
        BMI_Cat = "Obese class 2 - severely obese";
    else
        BMI_Cat = "Obese class 3 - Very Severely Obese";


    final TextView BMICategory = (TextView)
            findViewById (R.id.BMICategory);
            BMICategory.setText(BMI_Cat);
            }
        });
    };
}