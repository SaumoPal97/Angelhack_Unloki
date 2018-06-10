package com.example.saumo.unloki;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        textView = (TextView) findViewById(R.id.text);

    }

    BluetoothAdapter mBtAdapter = BluetoothAdapter.getDefaultAdapter();
    if(!mBtAdapter.isEnabled()){
        mBtAdapter.enable();
    }

    public void Location(View View)
    {
        String button_text;
        button_text =((Button)View).getText().toString();
        if(button_text.equals("MBRDI GGA"))
        {
            Intent location = new Intent(this,SecondActivity.class);
            startActivity(location);
        }
    }
}


