package com.hh.listveiweaxm;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.hh.listveiweaxm.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import adaptors.StoreAdapter;
import data.Store;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding act;

    List<Store> myStroeList = new ArrayList<>();
    private android.widget.ListView storeListView;


    StoreAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
    }

    void bindViews(){
        this.storeListView = (ListView) findViewById(R.id.storeListView);

    }

    void setupEvents(){

    }

//    ArrayList 안에 가게들을 채우는 메쏘드, 연습용으로 임시로 작성
//    실무에서는 이런식으로 데이터들을 채우지 않고,
//    서버에서 받아온 데이터를 ArrayList에 채워넣는다.

    void fillStore(){
        myStroeList.add(new Store("서향",0, 0,"월계1동 411", "09:00" , "21:00"));
        myStroeList.add(new Store("상호각",0, 0,"마들로", "09:00" , "21:00"));
        myStroeList.add(new Store("안등장",0, 0,"장위1동 411", "09:00" , "21:00"));

    }

    void setValues(){

        fillStore();

        myAdapter = new StoreAdapter(MainActivity.this, myStroeList);
        //storeListView.setAdapter(myAdapter);
        act.storeListView.setAdapter(myAdapter);
        act.appNameTxt.setText("배달의민족");





    }

}
