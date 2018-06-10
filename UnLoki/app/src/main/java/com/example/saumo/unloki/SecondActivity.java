package com.example.saumo.unloki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = (TextView) findViewById(R.id.text);

    }

    public void Gate(View View)
    {
        String button_text;
        button_text =((Button)View).getText().toString();
        if(button_text.equals("Front Gate"))
        {
            Intent gate = new Intent(this,ThirdActivity.class);
            startActivity(gate);
        }

        else if(button_text.equals("2nd Floor Conference Room"))
        {
            Intent gate = new Intent(this,FourthActivity.class);
            startActivity(gate);
        }


    }
}