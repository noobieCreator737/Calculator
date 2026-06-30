package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button one, two, three, four, five, six, seven, eight, nine, zero;
Button times, plus, minus, divide, clear, square_root, equals;

Button sheetDialog;
TextView operation_view, display;

private Boolean isRepalced = false;



@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
EdgeToEdge.enable(this);
setContentView(R.layout.activity_main);
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
    return insets;
});
iniatialize();
}

public void iniatialize(){


one = findViewById(R.id.one);
two = findViewById(R.id.two);
three = findViewById(R.id.three);
four = findViewById(R.id.four);
five = findViewById(R.id.five);
six = findViewById(R.id.six);
seven = findViewById(R.id.seven);
eight = findViewById(R.id.eight);
nine = findViewById(R.id.nine);
zero = findViewById(R.id.zero);

times = findViewById(R.id.time);
plus = findViewById(R.id.plus);
minus = findViewById(R.id.minus);
divide = findViewById(R.id.divide);
clear = findViewById(R.id.clear);
square_root = findViewById(R.id.erase);
equals = findViewById(R.id.equals);

operation_view = findViewById(R.id.operationView);
display = findViewById(R.id.result);
sheetDialog = findViewById(R.id.sheet_dialog);

one.setOnClickListener(this);
two.setOnClickListener(this);
three.setOnClickListener(this);
four.setOnClickListener(this);
five.setOnClickListener(this);
six.setOnClickListener(this);
seven.setOnClickListener(this);
eight.setOnClickListener(this);
nine.setOnClickListener(this);
zero.setOnClickListener(this);

//        Symbols
times.setOnClickListener(this);
plus.setOnClickListener(this);
minus.setOnClickListener(this);
divide.setOnClickListener(this);
clear.setOnClickListener(this);
square_root.setOnClickListener(this);
equals.setOnClickListener(this);
operation_view.setText("0");
sheetDialog.setOnClickListener(this);
}

@Override
public void onClick(View v) {
MediaPlayer soundOne = MediaPlayer.create(MainActivity.this, R.raw.vibespoptapclick);

int bID = v.getId();
String value = operation_view.getText().toString();
if(bID == R.id.one){

    if(value.equals("0") || isRepalced){
        operation_view.setText(one.getText().toString());
        isRepalced = false;
    }else{
        operation_view.append(one.getText().toString());

    }
    soundOne.start();
} else if (bID == R.id.two) {
    //MediaPlayer soundTwo = MediaPlayer.create(MainActivity.this, R.raw.immersivecontrolbutton);
    if(value.equals("0") || isRepalced){
        operation_view.setText(two.getText().toString());
        isRepalced = false;
    }else{
        operation_view.append(two.getText().toString());

    }
    soundOne.start();
}else if (bID == R.id.three) {
    if(value.equals("0") || isRepalced){
        operation_view.setText(three.getText().toString());
        isRepalced = false;
    }else{
        operation_view.append(three.getText().toString());

    }
    soundOne.start();
}else if (bID == R.id.four) {
    if(value.equals("0") || isRepalced){
        operation_view.setText(four.getText().toString());
        isRepalced = false;
    }else{
        operation_view.append(four.getText().toString());

    }
    soundOne.start();
}else if (bID == R.id.five) {
    if(value.equals("0") || isRepalced){
        operation_view.setText(five.getText().toString());
        isRepalced = false;
    }else{
        operation_view.append(five.getText().toString());

    }
    soundOne.start();
}else if (bID == R.id.six) {
    if(value.equals("0") || isRepalced){
        operation_view.setText(six.getText().toString());
        isRepalced = false;
    }else{
        operation_view.append(six.getText().toString());

    }
    soundOne.start();
}else if (bID == R.id.seven) {
    if(value.equals("0") || isRepalced){
        operation_view.setText(seven.getText().toString());
        isRepalced = false;
    }else{
        operation_view.append(seven.getText().toString());

    }
    soundOne.start();
}else if (bID == R.id.eight) {
    if(value.equals("0") || isRepalced){
        operation_view.setText(eight.getText().toString());
        isRepalced = false;
    }else{
        operation_view.append(eight.getText().toString());

    }
    soundOne.start();
}else if (bID == R.id.nine) {
    if(value.equals("0") || isRepalced){
        operation_view.setText(nine.getText().toString());
        isRepalced = false;
    }else{
        operation_view.append(nine.getText().toString());

    }
    soundOne.start();
}else if (bID == R.id.zero) {
    if(value.equals("0") || isRepalced){
        operation_view.setText(zero.getText().toString());
        isRepalced = false;
    }else{
        operation_view.append(zero.getText().toString());

    }
    soundOne.start();
}else if (bID == R.id.time) {

    if (value.contains("*")) return;
    operation_view.setText(value + times.getText());
    soundOne.start();
}else if (bID == R.id.plus) {
    if (value.contains("+")) return;
    operation_view.setText(value + plus.getText());
    soundOne.start();
}else if (bID == R.id.divide) {
    if (value.contains("/")) return;
    operation_view.setText(value.concat((String) divide.getText()));
    soundOne.start();
}else if (bID == R.id.minus) {
    if (value.contains("-")) return;
    operation_view.setText(value.concat((String) minus.getText()));
    soundOne.start();
}else if (bID == R.id.erase) {
    CharSequence currentNumbers = operation_view.getText();
    if (currentNumbers != null && currentNumbers.length() > 0) {
        operation_view.setText(currentNumbers.subSequence(0, currentNumbers.length() - 1));
    }else if(operation_view.length() < 1){
        operation_view.setText("0");
    }
    soundOne.start();
}
else if (bID == R.id.equals) {
    soundOne.start();
    try {
        String mathExp = value;
        String operator = "";
        if (mathExp.contains("+")) {
            operator = "+";
        }
        if (mathExp.contains("-")) {
            operator = "-";
        }
        if (mathExp.contains("/")) {
            operator = "/";
        }
        if (mathExp.contains("*")) {
            operator = "*";
        }

        if (mathExp.contains("⌫")) {
            operator = "⌫";
        }

        if (operator.isEmpty()) {
            return;
        }

        String[] parts = mathExp.split(java.util.regex.Pattern.quote(operator));

        if (parts.length < 2) {
            return;
        }

        double num1 = Double.parseDouble(parts[0]);
        double num2 = Double.parseDouble(parts[1]);
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                display.setText(String.valueOf(result));
                break;
            case "-":
                result = num1 - num2;
                display.setText(String.valueOf(result));
                break;
            case "/":
                if (num2 == 0) {
                    display.setText("Error: Div by 0");
                    return;
                }
                result = num1 / num2;
                display.setText(String.valueOf(result));
                break;
            case "*":
                result = num1 * num2;
                display.setText(String.valueOf(result));
                break;
            default: return;
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
} else if (bID == R.id.clear) {
    soundOne.start();
        operation_view.setText("0");
        display.setText("");
        isRepalced = false;
} else if (bID == R.id.sheet_dialog) {
    soundOne.start();
    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
    View view1 = LayoutInflater.from(MainActivity.this).inflate(R.layout.more_options,null);
    bottomSheetDialog.setContentView(view1);
    bottomSheetDialog.show();

    LinearLayout trig = bottomSheetDialog.findViewById(R.id.tigLayout);
//    LinearLayout matrix = bottomSheetDialog.findViewById(R.id.matrixLayout);
//    LinearLayout prob = bottomSheetDialog.findViewById(R.id.probLayout);

    trig.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sheetDialog.cancelDragAndDrop();
            Intent intent = new Intent(MainActivity.this, TRig.class);
            startActivity(intent);
        }
    });

//    matrix.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            sheetDialog.cancelDragAndDrop();
//            Intent intent = new Intent(MainActivity.this, Matrix.class);
//            startActivity(intent);
//        }
//    });
//
//    prob.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            sheetDialog.cancelDragAndDrop();
////                    Intent intent = new Intent(MainActivity.this, Prob.class);
////                    startActivity(intent);
//        }
//    });
}
}
}
