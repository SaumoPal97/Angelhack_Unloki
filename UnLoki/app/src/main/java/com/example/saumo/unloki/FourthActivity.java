package com.example.saumo.unloki;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;


public class FourthActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button Btn = (Button)findViewById(R.id.button_agora);

        Btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://agora-saumo-pal.herokuapp.com/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
