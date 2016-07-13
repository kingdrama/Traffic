package com.example.pcom_5.traffic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } //main Metod

    private void createListView() {
        MyData objMydata = new MyData();
        int[] intIcon = objMydata.icon();
        String[] strTitle = objMydata.title();

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle);
        ListView myListView = (ListView) findViewById(R.id.listView);
        myListView.setAdapter(objMyAdapter);
    } //createListView
    public void clickAboutMe(View view) {
        Intent objIntent = new Intent(Intent.ACTION_VIEW);
        objIntent.setData(Uri.parse("http://ran.in.th"));
        startActivity(objIntent);

    }//clickAboutMe

}//Main Activity

