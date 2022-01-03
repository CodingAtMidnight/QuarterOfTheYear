package com.example.praktiki_one;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

 EditText userInput;
 Button buttonQuarter;
 TextView displayQuarter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.userInput);
        buttonQuarter = findViewById(R.id.buttonQuarter);
        displayQuarter = findViewById(R.id.displayQuarter);

        buttonQuarter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quarterOfTheYear();
            }
        });
    }

    private void quarterOfTheYear() {
        int numberInput = parseInt(userInput.getText().toString());
        int quarter = (numberInput + 2) / 3;
        String quarterToString = String.valueOf(quarter);
        displayQuarter.setText(quarterToString);
    }


}
