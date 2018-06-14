package com.example.dave.mycrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.View;
import android.widget.Button;

public class ShareActivity extends AppCompatActivity {

    private ShareActionProvider mshareActionprovider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);




        Button shareApp = (Button) findViewById(R.id.shareApk);
        shareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setAction(intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"Place your link here");
                intent.putExtra(Intent.EXTRA_SUBJECT,"entries");
                intent.setType("text/plain");



                /*startActivity(Intent.createChooser(intent,"Choose app"));*/

                startActivity(intent);
            }
        });
    }
}
