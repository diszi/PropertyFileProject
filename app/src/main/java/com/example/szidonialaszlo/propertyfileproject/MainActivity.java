package com.example.szidonialaszlo.propertyfileproject;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Properties;

public class MainActivity extends Activity {

    private AssetsPropertyReader assetsPropertyReader;
    private Context context;
    private Properties p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context  = this;
        assetsPropertyReader = new AssetsPropertyReader(context);
        p = assetsPropertyReader.getProperties("MyStringsFile.properties");
        Toast.makeText(context,p.getProperty("MyBlog"),Toast.LENGTH_LONG).show();

    }
}
