package com.example.countrylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ListView simpleList;
    String countryList[] = {"India", "USA", "australia", "Portugle", "America", "NewZealand", "Canada", "Finland", "Iceland", "Japan", "Norway"};
    int flags[] = {R.drawable.india, R.drawable.usa, R.drawable.australia, R.drawable.australia, R.drawable.usa, R.drawable.india, R.drawable.canada,
    R.drawable.australia, R.drawable.canada, R.drawable.usa, R.drawable.australia};
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList=findViewById(R.id.simplelistview);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),countryList,flags);
        simpleList.setAdapter(customAdapter);
    }

    @Override
    public void onClick(View v) {

    }
}