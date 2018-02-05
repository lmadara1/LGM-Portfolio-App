package com.example.aggrogahu.lgmproject0;

import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {

    private View view1,view2, view3, view4, view5, view6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //finding and storing reference to buttons as views
        view1 = findViewById(R.id.button);
        view2 = findViewById(R.id.button2);
        view3 = findViewById(R.id.button3);
        view4 = findViewById(R.id.button4);
        view5 = findViewById(R.id.button5);
        view6 = findViewById(R.id.button6);

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
        if(view==view1){
//            toastMessage = getString(R.string.UItoastMessage1);
            Intent intent = getPackageManager().getLaunchIntentForPackage("com.example.aggrogahu.popularmovies");
            if (intent != null){
                startActivity(intent);
                return;
            }else {
                return;
            }
        }
        else if(view==view2){
            toastMessage = getString(R.string.UItoastMessage2);
        }
        else if(view==view3){
            toastMessage = getString(R.string.UItoastMessage3);
        }
        else if(view==view4){
            toastMessage = getString(R.string.UItoastMessage4);
        }
        else if(view==view5){
            toastMessage = getString(R.string.UItoastMessage5);
        }
        else if(view==view6){
            toastMessage = getString(R.string.UItoastMessage6);
        }
        else{
            toastMessage = "something happened";
        }
        Toast.makeText(getApplicationContext(),toastMessage,Toast.LENGTH_SHORT).show();
    }
}
