package br.com.andrecoutofirebase.a13mobfirebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        FirebaseMessaging.getInstance().subscribeToTopic("mob");
    }

    public void forcarCrash(View view) {
       int x = 2 / 0;
    }

    public void clickMe(View view) {
        Bundle params = new Bundle();
        params.putString("NOME","COUTO");
        mFirebaseAnalytics.logEvent("clickMe", params);
    }
}
