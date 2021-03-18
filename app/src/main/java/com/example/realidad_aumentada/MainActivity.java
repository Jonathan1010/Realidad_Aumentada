package com.example.realidad_aumentada;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wikitude.NativeStartupConfiguration;
import com.wikitude.WikitudeSDK;
import com.wikitude.common.camera.CameraSettings;
import com.wikitude.common.rendering.InternalRendering;
import com.wikitude.common.rendering.RenderExtension;
import com.wikitude.tracker.ImageTrackerListener;
import com.wikitude.tracker.TargetCollectionResource;

import java.sql.Driver;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button ra , a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        NativeStartupConfiguration startupConfiguration = new NativeStartupConfiguration();
        startupConfiguration.setLicenseKey(WikitudeSDKConstants.WIKITUDE_SDK_KEY);
        wikitudeSDK.onCreate(getApplicationContext(), startupConfiguration);

        ra = (Button) findViewById(R.id.ra);
        ra.setOnClickListener(this);

        a = (Button) findViewById(R.id.a);
        a.setOnClickListener(this);

        /*WikitudeSDK wikitudeSDK = new WikitudeSDK((InternalRendering) this);
        NativeStartupConfiguration startupConfiguration = new NativeStartupConfiguration();
        startupConfiguration.setLicenseKey(WikitudeSDKConstants.WIKITUDE_SDK_KEY);
        startupConfiguration.setCameraPosition(CameraSettings.CameraPosition.BACK);
        startupConfiguration.setCameraResolution(CameraSettings.CameraResolution.AUTO);*/

        //wikitudeSDK.onCreate(getApplicationContext(), this, startupConfiguration);

        //final TargetCollectionResource targetCollectionResource = wikitudeSDK.getTrackerManager().createTargetCollectionResource("file:///android_asset/magazine.wtc");
        //wikitudeSDK.getTrackerManager().createImageTracker(targetCollectionResource, (ImageTrackerListener) this, null);
    }

    @Override
    public void onClick(View v) {
        if(v==ra){
            Intent i = new Intent(this, realidad_aumentada.class);
            startActivity(i);
        }
        if(v==a){
            Intent i = new Intent(this, realidad_aumentada.class);
            startActivity(i);
        }
    }

    public static class wikitudeSDK{

        public static void onCreate(Context applicationContext, NativeStartupConfiguration startupConfiguration) {

        }
    }
}
