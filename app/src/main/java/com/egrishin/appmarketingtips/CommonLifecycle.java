package com.egrishin.appmarketingtips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CommonLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_lifecycle);
    }
}
