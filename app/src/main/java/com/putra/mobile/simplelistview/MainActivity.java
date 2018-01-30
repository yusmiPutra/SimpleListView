package com.putra.mobile.simplelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Defining android ListView
    ListView lv;
    //Elements that will be displayed in android ListView
    String[] hewan = new String[]{"Ayam", "Ikan", "Kucing","Kuda", "Kambing", "Burung"};

    //Setting the android ListView's adapter to the newly created adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.list);
        //Declaring Array adapter
        final ArrayAdapter<String> hewanAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, hewan);
        lv.setAdapter(hewanAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "kamu klick "+hewanAdapter.getItem(i).toString(), Toast.LENGTH_SHORT)
                        .show();
            }
        });


    }
}
