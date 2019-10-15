package com.uniqtechnologies.diseasediagnisor;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Diarrhea extends Activity {
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diarrhea);
		b1=(Button)findViewById(R.id.mapdiarrhea);
	b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
			
				SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE); 
			    Editor editor = pref.edit();

			    editor.putString("lat", "13.04987"); 
			    editor.putString("lon", "80.208393"); 
				
			    editor.commit(); 
				
				Intent in = new Intent(getApplicationContext(), SingleMap.class);
				
				startActivity(in);
			}
		});
	}
}
