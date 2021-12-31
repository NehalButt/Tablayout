package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.os.Bundle;
import android.view.SurfaceControl;
import android.widget.Switch;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab = (TabLayout) findViewById(R.id.mytab);
        chat chat= new chat();
        FragmentTransaction chatchange= getSupportFragmentManager().beginTransaction();
        chatchange.replace(R.id.myfame,chat).commit();
       tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {
               switch (tab.getPosition()){
                   case 0:
                       chat chat= new chat();
                       FragmentTransaction chatchange= getSupportFragmentManager().beginTransaction();
                       chatchange.replace(R.id.myfame,chat).commit();
                       break;

                   case 1:
                       status status= new status();
                       FragmentTransaction statuschange= getSupportFragmentManager().beginTransaction();
                       statuschange.replace(R.id.myfame,status).commit();
                       break;

                   case 2:
                       calls call= new calls();
                       FragmentTransaction callchange= getSupportFragmentManager().beginTransaction();
                       callchange.replace(R.id.myfame,call).commit();
                       break;
               }

           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });
    }

}