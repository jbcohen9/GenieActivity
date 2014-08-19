package com.example.genieactivity;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;


public class MainActivity extends Activity implements OnClickListener{

	ToggleButton T1;
	ToggleButton T2;
	ToggleButton T3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1 =(ToggleButton)findViewById(R.id.toggleButton1);
        T2 =(ToggleButton)findViewById(R.id.toggleButton2);
        T3 =(ToggleButton)findViewById(R.id.toggleButton3);
        
        
		T1.setOnCheckedChangeListener(null);
		T2.setOnCheckedChangeListener(null);
		T3.setOnCheckedChangeListener(null);
    }

public void onCheckedChanged(CompoundButton buttonview, boolean isChecked){
	
	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
