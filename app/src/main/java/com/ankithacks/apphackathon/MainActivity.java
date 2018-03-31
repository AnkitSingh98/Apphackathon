package com.ankithacks.apphackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


   public static ArrayList<String> lis=new ArrayList<String>();

    public static ArrayList<String> getList()
    {
        return lis;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void start(View view)
    {

        String data=new Date().toString();
        lis.add(data);

        Intent i=new Intent(getApplicationContext(),livestream.class);
        startActivity(i);



    }

    public void stop(View view)
    {

        Intent i=new Intent(getApplicationContext(),log.class);
        startActivity(i);


    }


    public void log(View view)
    {

        Intent i=new Intent(getApplicationContext(),log.class);
        startActivity(i);

    }


}
