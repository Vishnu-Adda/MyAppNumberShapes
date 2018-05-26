package com.someapp.vishnu.myappnumbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view) {

        Log.i("Info", "Button Pressed");

        EditText edit = findViewById(R.id.numberEntered);
        String numString = edit.getText().toString();

        if(numString.length() == 0) {
            Toast.makeText(this, "Enter a number value before pressing the button",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        for(int i=0; i< numString.length(); i++) {
            if(numString.charAt(i) == '.') {

                Toast.makeText(this, "No decimals please",
                        Toast.LENGTH_SHORT).show();
                return;

            }
            else if(!Character.isDigit(numString.charAt(i))) {
                Toast.makeText(this,
                        "Only enter number values", Toast.LENGTH_SHORT).show();
                return;
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
