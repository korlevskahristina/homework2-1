package com.example.homework2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<String> itemList;
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listV = (ListView) findViewById(R.id.list);
        final EditText editText = (EditText) findViewById(R.id.txtInput);
        final EditText editText1 = (EditText) findViewById(R.id.txtInput1);
        Button btAdd = (Button) findViewById(R.id.btAdd);
        itemList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, R.layout.list_row,R.id.txtview,itemList);
        listV.setAdapter(adapter);
    }
}
