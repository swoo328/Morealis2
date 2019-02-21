package com.example.morealis;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureProductButton();
    }

    // sets button click on products button to swap to products activity
    private void configureProductButton(){
        Button productButton = (Button) findViewById(R.id.button1);
        productButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)  {
                startActivity(new Intent(MainActivity.this, Products.class));

            }
        });
    }

    public void goToSite (View view){
        goToUrl ( "https://morealis.co/");
    }

    public void goToFB (View view) {
        goToUrl ( "https://www.facebook.com/morealiss");
    }

    public void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }


}
