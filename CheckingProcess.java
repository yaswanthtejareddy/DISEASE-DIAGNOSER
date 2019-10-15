package com.uniqtechnologies.diseasediagnisor;



import android.os.Bundle;
import android.os.IInterface;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class CheckingProcess extends Activity implements OnItemSelectedListener
{
	
	 String[] Sym1 = { "DryHair", "FrequentUrination", "Abdominalpain", "fever", "Coughing","HighFever","Vomiting","Coughing up Blood","SpeechDifficulities","CloudyVision","Fainting"};  
	 String[] Sym2= { "DrySkin", "Unusual Weight loss", "Watery Stool", "loss Of Appetite", "Shortness of Breath","Joint and Muscle aches","Fatigue","NightSweats","DoubleVision","Changes in Color","Depression"  };  
	 String[] Sym3 = { "SlowerHeartRate", "Vision", "Bleeding", "Tiredness", "Wheezing","StomachPain","ChestPain","Pain With Breathing","Severe Headaches","Double Vision","Dizziness"  };  
TextView a;
	   Button submit,result;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_checking_process);
		a=(TextView)findViewById(R.id.Symreultansw);
		 //Getting the instance of Spinner and applying OnItemSelectedListener on it  
        final Spinner Symptom1 = (Spinner) findViewById(R.id.symspinner1);  
        Symptom1.setOnItemSelectedListener(this);  
          
        //Creating the ArrayAdapter instance having the country list  
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Sym1);  
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
        //Setting the ArrayAdapter data on the Spinner  
        Symptom1.setAdapter(aa); 
        
        //Getting the instance of Spinner and applying OnItemSelectedListener on it  
        final Spinner Symptom2 = (Spinner) findViewById(R.id.symspinner2);  
        Symptom2.setOnItemSelectedListener(this);  
          
        //Creating the ArrayAdapter instance having the country list  
        ArrayAdapter ab = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Sym2);  
        ab.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
        //Setting the ArrayAdapter data on the Spinner  
        Symptom2.setAdapter(ab);
        
        
        //Getting the instance of Spinner and applying OnItemSelectedListener on it  
        final Spinner Symptom3 = (Spinner) findViewById(R.id.symspinner3);  
        Symptom3.setOnItemSelectedListener(this);  
          
        //Creating the ArrayAdapter instance having the country list  
        ArrayAdapter ac = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Sym3);  
        ac.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
        //Setting the ArrayAdapter data on the Spinner  
        Symptom3.setAdapter(ac);
        submit=(Button)findViewById(R.id.suysubmit);
        result=(Button)findViewById(R.id.symresult);
        result.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				String Symfind1,Symfind2,Symfind3;
				Symfind1 = Symptom1.getSelectedItem().toString();
				Symfind2 = Symptom2.getSelectedItem().toString();
				Symfind3 = Symptom3.getSelectedItem().toString();
				
				if(Symfind1.equals("DryHair")&&Symfind2.equals("DrySkin")&&Symfind3.equals("SlowerHeartRate"))
				{
					Intent a=new Intent(getApplicationContext(),Thypoid.class);
					startActivity(a);
				}
				else if(Symfind1.equals("FrequentUrination")&&Symfind2.equals("Unusual Weight loss")&&Symfind3.equals("Vision"))
				{
					Intent a=new Intent(getApplicationContext(),Diabetes.class);
					startActivity(a);
				}
				else if(Symfind1.equals("Abdominalpain")&&Symfind2.equals("Watery Stool")&&Symfind3.equals("Bleeding"))
				{
					Intent a=new Intent(getApplicationContext(),Diarrhea.class);
					startActivity(a);
				}
				else if(Symfind1.equals("fever")&&Symfind2.equals("loss Of Appetite")&&Symfind3.equals("Tiredness"))
				{
					Intent a=new Intent(getApplicationContext(),Chickenpox.class);
					startActivity(a);
				}
				else if(Symfind1.equals("Coughing")&&Symfind2.equals("Shortness of Breath")&&Symfind3.equals("Wheezing"))
				{
					Intent a=new Intent(getApplicationContext(),Asthma.class);
					startActivity(a);
				}
				else if(Symfind1.equals("HighFever")&&Symfind2.equals("Joint and Muscle aches")&&Symfind3.equals("StomachPain"))
				{
					Intent a=new Intent(getApplicationContext(),Ebola.class);
					startActivity(a);
				}
				
				else if(Symfind1.equals("Vomiting")&&Symfind2.equals("Fatigue")&&Symfind3.equals("ChestPain"))
				{
					Intent a=new Intent(getApplicationContext(),Pheumonia.class);
					startActivity(a);
				}
				else if(Symfind1.equals("Coughing up Blood")&&Symfind2.equals("NightSweats")&&Symfind3.equals("Pain With Breathing"))
				{
					Intent a=new Intent(getApplicationContext(),Tb.class);
					startActivity(a);
				}
				else if(Symfind1.equals("SpeechDifficulities")&&Symfind2.equals("DoubleVision")&&Symfind3.equals("Severe Headaches"))
				{
					Intent a=new Intent(getApplicationContext(),BrainTumer.class);
					startActivity(a);
				}
				else if(Symfind1.equals("CloudyVision")&&Symfind2.equals("Changes in Color")&&Symfind3.equals("Double Vision"))
				{
					Intent a=new Intent(getApplicationContext(),Cataracts.class);
					startActivity(a);
				}
				else 
				{
					Intent a=new Intent(getApplicationContext(),Bloodpressure.class);
					startActivity(a);
				}
			}
		});
        
        submit.setOnClickListener(new OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				String Symfind1,Symfind2,Symfind3;
				Symfind1 = Symptom1.getSelectedItem().toString();
				Symfind2 = Symptom2.getSelectedItem().toString();
				Symfind3 = Symptom3.getSelectedItem().toString();
				
				if(Symfind1.equals("DryHair")&&Symfind2.equals("DrySkin")&&Symfind3.equals("SlowerHeartRate"))
				{
					a.setText("Thyroid");
				}
				else if(Symfind1.equals("FrequentUrination")&&Symfind2.equals("Unusual Weight loss")&&Symfind3.equals("Vision"))
				{
					a.setText("Diabetes");
				}
				else if(Symfind1.equals("Abdominalpain")&&Symfind2.equals("Watery Stool")&&Symfind3.equals("Bleeding"))
				{
					a.setText("Diarrhea");
				}
				else if(Symfind1.equals("fever")&&Symfind2.equals("loss Of Appetite")&&Symfind3.equals("Tiredness"))
				{
					a.setText("Chickenpox");
				}
				else if(Symfind1.equals("Coughing")&&Symfind2.equals("Shortness of Breath")&&Symfind3.equals("Wheezing"))
				{
					a.setText("Asthma");
				}
				else if(Symfind1.equals("HighFever")&&Symfind2.equals("Joint and Muscle aches")&&Symfind3.equals("StomachPain"))
				{
					a.setText("Ebola");
				}
				
				else if(Symfind1.equals("Vomiting")&&Symfind2.equals("Fatigue")&&Symfind3.equals("ChestPain"))
				{
					a.setText("Pheumonia");
				}
				else if(Symfind1.equals("Coughing up Blood")&&Symfind2.equals("NightSweats")&&Symfind3.equals("Pain With Breathing"))
				{
					a.setText("Tb");
				}
				else if(Symfind1.equals("SpeechDifficulities")&&Symfind2.equals("DoubleVision")&&Symfind3.equals("Severe Headaches"))
				{
					a.setText("Brain Tumar");
				}
				else if(Symfind1.equals("CloudyVision")&&Symfind2.equals("Changes in Color")&&Symfind3.equals("Double Vision"))
				{
					a.setText("Cataracts");
				}
				else 
				{
					a.setText("Blood Pressure");
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.checking_process, menu);
		return true;
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
