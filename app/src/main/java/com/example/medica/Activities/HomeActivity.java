package com.example.medica.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.medica.DataBaseRoom.MyDataBase;
import com.example.medica.DataBaseRoom.QuizModel;
import com.example.medica.R;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {


    protected CardView cardThree;
    protected ImageView bg;
    protected ImageView image;
    protected TextView name;
    protected TextView desc;
    protected CardView cardOne;
    protected ImageView image2;
    protected TextView name2;
    protected TextView desc2;
    protected CardView cardTwo;
    protected ImageView image3;
    protected TextView name3;
    protected TextView desc3;
    List<QuizModel> data;
    List<QuizModel> res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        super.setContentView(R.layout.activity_home);

        data = new ArrayList<>();
        res = new ArrayList<>();
        MyDataBase.getInstance(this).QuizDAo().addItem(new QuizModel(
                "xx", "xx", "xx", "xx", "xx",
                "xx", "xx", "xx", "xx", "xx",
                "xx", "xx", "xx", "xx", "xxxx",
                "xx", "xx", "xx", "xx", "xx",
                "xx", "xx", "xx", "xx", "xx",
                "xx", "xx", "xx", "xx", "xx",
                "xx", "xx", "xx", "xx", "xx",
                "xx", "xx", "xx", "xx", "xx",
                "xx", "xxx", "xx", "xx", "xx",
                "xx", "xx", "xx", "xx", "xx", "xx"));

        data = MyDataBase.getInstance(this).QuizDAo().selectAllItems();
        Log.e("DATA LEN", data.size() + "");


        /*res=MyDataBase.getInstance(this).QuizDAo().selectAllItems("xx");
        Log.e("DATA ",res.size()+"");*/
        res = MyDataBase.getInstance(this).QuizDAo().selectAllItems("xx", "xx", "xx", "xx", "xx",
                "xx", "xx", "xx", "xx", "xx",
                "xx", "xx", "xx", "xx", "xx",
                "xx", "xx");

        Log.e("DATA ", res.size() + "");
        initView();
    }


    private void initView() {
        cardThree = (CardView) findViewById(R.id.cardThree);
        bg = (ImageView) findViewById(R.id.bg);
        image = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name);
        desc = (TextView) findViewById(R.id.desc);
        cardOne = (CardView) findViewById(R.id.cardOne);
        image2 = (ImageView) findViewById(R.id.image2);
        image2.setOnClickListener(HomeActivity.this);
        name2 = (TextView) findViewById(R.id.name2);
        desc2 = (TextView) findViewById(R.id.desc2);
        cardTwo = (CardView) findViewById(R.id.cardTwo);
        image3 = (ImageView) findViewById(R.id.image3);
        name3 = (TextView) findViewById(R.id.name3);
        desc3 = (TextView) findViewById(R.id.desc3);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.image2) {

            startActivity(new Intent(HomeActivity.this,QuizActivity.class));
        }
    }
}



