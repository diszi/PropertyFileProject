package com.example.szidonialaszlo.propertyfileproject;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by szidonia.laszlo on 2017. 11. 16..
 */

public class AssetsPropertyReader {

    private Context context;
    private Properties properties;

    public AssetsPropertyReader(Context context) {
        this.context=context;
        properties = new Properties();
    }

    public Properties getProperties(String fileName){
        try{
            AssetManager assetManager = context.getAssets();
            System.out.println("assetManager="+assetManager);
            InputStream inputStream = assetManager.open(fileName);
            System.out.println(" inputStream="+inputStream);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
