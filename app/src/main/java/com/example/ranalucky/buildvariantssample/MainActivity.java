package com.example.ranalucky.buildvariantssample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.exchange.epos.ConstantBaseUrl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = ConstantBaseUrl.BASE_URL;
        Log.i("Base url", url);
        Toast.makeText(getApplicationContext(),url, Toast.LENGTH_LONG).show();
    }
}
