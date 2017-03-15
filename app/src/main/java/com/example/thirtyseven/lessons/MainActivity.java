package com.example.thirtyseven.lessons;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private Button button;
    private TextView textGroup;
    private TextView textReplacement;
    private TextView textSchedule;
    private TextView textProfile;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_mygroup:
                    textGroup.setVisibility(View.VISIBLE);
                    textReplacement.setVisibility(View.GONE);
                    textSchedule.setVisibility(View.GONE);
                    textProfile.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_replacement:
                    textGroup.setVisibility(View.GONE);
                    textReplacement.setVisibility(View.VISIBLE);
                    textSchedule.setVisibility(View.GONE);
                    textProfile.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_schedule:
                    textGroup.setVisibility(View.GONE);
                    textReplacement.setVisibility(View.GONE);
                    textSchedule.setVisibility(View.VISIBLE);
                    textProfile.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_profile:
                    textGroup.setVisibility(View.GONE);
                    textReplacement.setVisibility(View.GONE);
                    textSchedule.setVisibility(View.GONE);
                    textProfile.setVisibility(View.VISIBLE);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        initVars();
        setListeners();
        if(!isUser()){
            //TODO переходит intentом в другой activity
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy/dd/MM HH:mm:ss");
        Date date = new Date();
        WeekDate weekDate = new WeekDate();
        setDate();
        setOddOrNot();

    }

    private void setListeners() {
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*switch (v.getId()){
                    case R.id.button2:
                        Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent1);
                        break;
                }*/
            }
        };


    }

    private void initVars() {
        textGroup = (TextView)findViewById(R.id.text_mygroup);
        textReplacement= (TextView)findViewById(R.id.text_replacement);
        textSchedule = (TextView)findViewById(R.id.text_schedules);
        textProfile = (TextView)findViewById(R.id.text_profile);

    }

    private void setOddOrNot() {

    }

    private void setDate() {

    }

    private boolean isUser() {
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
