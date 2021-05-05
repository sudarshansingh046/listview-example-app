package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.t1);
        String[] values={"COLORS","ANIMALS","BIRDS"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,values);
        setListAdapter(arrayAdapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v,int Position,long id)
    {
        super.onListItemClick(l,v,Position,id);
        int itemPosition=Position;
        String itemvalues=(String)l.getItemAtPosition(Position);
        t1.setText(itemvalues);
        if(itemPosition==0)
        {
            Intent i=new Intent(MainActivity.this,Colors.class);
            startActivity(i);
        }
        if(itemPosition==1)
        {
            Intent i=new Intent(MainActivity.this,Animals.class);
            startActivity(i);
        }
        if(itemPosition==2)
        {
            Intent i=new Intent(MainActivity.this,Birds.class);
            startActivity(i);
        }
    }
}