package com.mechanit.mechanitdroidapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ViewUserInfo extends ActionBarActivity {
    TextView nickname;
    TextView make;
    TextView model;
    TextView year;
    TextView mileage;
    TextView tire;
    TextView oil;
    TextView spark;



    public static final String Nickname = "nicknameKey";
    public static final String Make = "makeKey";
    public static final String Model = "modelKey";
    public static final String Year = "yearKey";
    public static final String Mileage = "mileageKey";
    public static final String Tire = "tireKey";
    public static final String Oil = "oilKey";
    public static final String Spark = "sparkKey";

    public SharedPreferences userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user_info);

        nickname = (TextView) findViewById(R.id.view_nickname);
        make = (TextView) findViewById(R.id.view_make);
        model = (TextView) findViewById(R.id.view_model);
        year = (TextView) findViewById(R.id.view_year);
        mileage = (TextView) findViewById(R.id.view_mileage);
        tire = (TextView) findViewById(R.id.view_tire_para);
        oil = (TextView) findViewById(R.id.view_oil_para);
        spark = (TextView) findViewById(R.id.view_spark_para);

        userInfo = getSharedPreferences("userInfo", Context.MODE_PRIVATE);

        if (userInfo.contains(Nickname))
        {
            nickname.setText(userInfo.getString(Nickname, ""));

        }
        if (userInfo.contains(Make))
        {
            make.setText(userInfo.getString(Make, ""));

        }
        if (userInfo.contains(Model))
        {
            model.setText(userInfo.getString(Model, ""));

        }
        if (userInfo.contains(Year))
        {
            year.setText(userInfo.getString(Year, ""));

        }
        if (userInfo.contains(Mileage))
        {
            mileage.setText(userInfo.getString(Mileage,""));

        }

        if (userInfo.contains(Tire))
        {
            tire.setText(userInfo.getString(Tire,""));

        }

        if (userInfo.contains(Oil))
        {
            oil.setText(userInfo.getString(Oil,""));

        }

        if (userInfo.contains(Spark))
        {
            spark.setText(userInfo.getString(Spark,""));

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_user_info, menu);
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
}
