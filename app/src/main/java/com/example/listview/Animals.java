package com.example.listview;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Animals extends ListActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animals);
        b1=(Button)findViewById(R.id.btn1);
        Intent intent = getIntent();
        String[] values={"Bear ","Buffalo","Butterfly","Camel","Cat","Chameleon","Chimpanzee","Cow", "Crab"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,values);
        setListAdapter(arrayAdapter);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://en.wikipedia.org/wiki/List_of_animal_names"));
                startActivity(i);
            }
        });
    }
}
