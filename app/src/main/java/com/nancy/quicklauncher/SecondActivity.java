package com.nancy.quicklauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.nancy.quicklauncher.SOMETHING")){
            TextView tv = (TextView) findViewById(R.id.textView);

            String text = getIntent().getExtras().getString("com.nancy.quicklauncher.SOMETHING");
            tv.setText(text);
        }
    }
}
