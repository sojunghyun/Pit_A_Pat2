package com.example.wips.pit_a_pat.Checklist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.wips.pit_a_pat.R;

public class ChecklistActivity extends AppCompatActivity
{

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.action_one:
                    transaction.replace(R.id.content, new FirstFragment()).commit();
                    return true;
                case R.id.action_two:
                    transaction.replace(R.id.content, new SecondFragment()).commit();
                    return true;
                case R.id.action_three:
                    transaction.replace(R.id.content, new ThirdFragment()).commit();
                    return true;
                case R.id.action_four:
                    transaction.replace(R.id.content, new FourSettingFragment()).commit();
                    return true;
            }

            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


}
