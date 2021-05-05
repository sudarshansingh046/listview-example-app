package com.example.listview;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Birds extends ListActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors);
        btn1=(Button)findViewById(R.id.btn1);
        Intent intent = getIntent();
        String[] values={"Cock","Crane","Crow","Cuckoo", "Dove","Duck","Eagle","Hen","Kingfisher"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,values);
        setListAdapter(arrayAdapter);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://en.wikipedia.org/wiki/List_of_birds_of_India"));
                startActivity(i);
            }
        });

    }
}
