package com.example.aggrogahu.lgmproject0;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Debug;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.aggrogahu.lgmproject0.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view){
        //change toast message according to which button is calling sendMessage
        String toastMessage;
        if(view==mainBinding.button){
//            toastMessage = getString(R.string.UItoastMessage1);
            Intent intent = getPackageManager().getLaunchIntentForPackage("com.example.aggrogahu.popularmovies");
            if (intent != null){
                startActivity(intent);
                return;
            }else {
                return;
            }
        }
        else if(view==mainBinding.button2){
            toastMessage = getString(R.string.UItoastMessage2);
        }
        else if(view==mainBinding.button3){
            toastMessage = getString(R.string.UItoastMessage3);
        }
        else if(view==mainBinding.button4){
            toastMessage = getString(R.string.UItoastMessage4);
        }
        else if(view==mainBinding.button5){
            toastMessage = getString(R.string.UItoastMessage5);
        }
        else if(view==mainBinding.button6){
            toastMessage = getString(R.string.UItoastMessage6);
        }
        else{
            toastMessage = "something happened";
        }

        if(toastMessage != null) {
            Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
        }
    }
}
