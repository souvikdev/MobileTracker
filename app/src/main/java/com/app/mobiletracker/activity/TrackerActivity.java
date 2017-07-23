package com.app.mobiletracker.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.CompoundButton;

import com.app.mobiletracker.R;

public class TrackerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);

        ToggleButton toggle = (ToggleButton) findViewById(R.id.permToggle);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(),"Switched On",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Switched Off",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
