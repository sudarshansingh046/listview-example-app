package com.example.listview;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class Colors extends ListActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors);
        btn1=(Button)findViewById(R.id.btn1);
        final Intent intent = getIntent();
        String[] values={ "black", "white", "red", "green", "yellow", "blue", "brown", "orange", "pink", "purple", "grey"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,values);
        setListAdapter(arrayAdapter);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://simple.wikipedia.org/wiki/List_of_colors"));
                startActivity(i);
            }
        });
    }
}
