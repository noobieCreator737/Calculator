package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class TRig extends AppCompatActivity implements View.OnClickListener {

    Button sin, cos, tan, back;
    TextView display;

    EditText operation_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trig);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();
    }

    public void init(){
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        operation_view = findViewById(R.id.operationView);
        back = findViewById(R.id.back);
        display = findViewById(R.id.result);


        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int btnId = v.getId();
//        SINE VALUE
        if (btnId == R.id.sin){
            String value = operation_view.getText().toString().trim();

            if (value.isEmpty()) {
                Toast.makeText(this, "Please enter a number first", Toast.LENGTH_SHORT).show();
                return; // Stop execution
            }
            try {
                double num = Double.parseDouble(value);

                double radians = Math.toRadians(num);

                double sineValue = Math.sin(radians);
                display.setText(String.valueOf(sineValue));
                System.out.println(sineValue);
            } catch (Exception e) {
                Toast.makeText(this, "Nullpointer", Toast.LENGTH_SHORT).show();
            }
        }
//        COSINE VALUE
        else if (btnId == R.id.cos) {
            String value = operation_view.getText().toString().trim();

            if (value.isEmpty()) {
                Toast.makeText(this, "Please enter a number first", Toast.LENGTH_SHORT).show();
                return; // Stop execution
            }
            try {
                double num = Double.parseDouble(value);

                double radians = Math.toRadians(num);


            double cosineValue = Math.cos(radians);
            display.setText(String.valueOf(cosineValue));
            System.out.println(cosineValue);
            } catch (Exception e) {
                Toast.makeText(this, "Nullpointer", Toast.LENGTH_SHORT).show();
            }
        }
//        TANGENT VALUE
        else if (btnId == R.id.tan) {
            String value = operation_view.getText().toString().trim();

            if (value.isEmpty()) {
                Toast.makeText(this, "Please enter a number first", Toast.LENGTH_SHORT).show();
                return; // Stop execution
            }
            try {
                double num = Double.parseDouble(value);

                double radians = Math.toRadians(num);


            double tangentValue = Math.tan(radians);
            display.setText(String.valueOf(tangentValue));
            System.out.println(tangentValue);
            } catch (Exception e) {
                Toast.makeText(this, "Nullpointer", Toast.LENGTH_SHORT).show();
            }
        } else if (btnId == R.id.back) {
            Intent backIntent = new Intent(TRig.this,MainActivity.class);
            startActivity(backIntent);
        }
    }
}