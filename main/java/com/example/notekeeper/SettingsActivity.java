package com.example.notekeeper;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.preference.PreferenceFragmentCompat;
import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchAnimListener;
import com.mahfa.dnswitch.DayNightSwitchListener;
import com.google.android.material.button.MaterialButton;

public class SettingsActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);


            DayNightSwitch day_night_switch = findViewById(R.id.day_night_switch);

            Button test_button = findViewById(R.id.testbutton);
            test_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
            });


//            day_night_switch.setListener(new DayNightSwitchListener(){
//                @Override
//                public void onSwitch(boolean is_night) {
//                    if (is_night)
//                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//                }
//                });

//        day_night_switch.setDuration(450);
//
//            if (savedInstanceState != null
//                    && savedInstanceState.containsKey(KEY_DAY_NIGHT_SWITCH_STATE))
//                day_night_switch.setIsNight(savedInstanceState.getBoolean(KEY_DAY_NIGHT_SWITCH_STATE), true);


            ;}
    }
    public static final String KEY_DAY_NIGHT_SWITCH_STATE = "day_night_switch_state";


        public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);

        }
    }

}