package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView t;
Spinner s,p;
    String array[]={"1","2","3","4"};
    ArrayAdapter<String > arr;

    String array1[]={"100","200","300","400"};
    ArrayAdapter<String > arr1;
    int a,d,c;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.t1);
        s=findViewById(R.id.s1);
        arr=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,array);
        s.setAdapter(arr);


        p=findViewById(R.id.s2);
        arr1=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,array1);
        p.setAdapter(arr1);


        b=findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s.getSelectedItem().toString();
                s2=p.getSelectedItem().toString();
                a=Integer.parseInt(s1);
                d=Integer.parseInt(s2);
                c=a*d;
                t.setText(String.valueOf(c));




            }
        });
    }
}
