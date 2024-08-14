package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewText1,textViewText2;
    private Button buttonchange,buttontext2;
    private boolean textFlag;
    private boolean text2flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

    textViewText1 = (TextView) findViewById(R.id.textView_text1);
    textViewText2= (TextView) findViewById(R.id.textView_text2);
    buttonchange= (Button) findViewById(R.id.button_change);

    textFlag= true;
    buttonchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textFlag) {
                    textViewText1.setText("Hello World！");
                    textViewText2.setText("Good Morning！");
                    textFlag=false;
                } else {
                    textViewText1.setText("Good Morning！");
                    textViewText2.setText("Hello World！");
                    textFlag=true;
                }
            }
        });
        buttontext2=(Button) findViewById(R.id.button_text2);
        text2flag=true;
        buttontext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text2flag) {
                    textViewText2.setText("1234567");
                    text2flag = false;
                } else {
                    textViewText2.setText("Good Morning！");
                    text2flag = true;
                }
            }
        });
    }
}