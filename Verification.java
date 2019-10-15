package com.uniqtechnologies.diseasediagnisor;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Verification extends Activity {

	Button typhoid, jaundice, malaria, viralfever, chickunganya, cancer,
			thyroid;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.verification);

		typhoid = (Button) findViewById(R.id.Ty);

		jaundice = (Button) findViewById(R.id.Ja);

		malaria = (Button) findViewById(R.id.Ma);

		viralfever = (Button) findViewById(R.id.Vi);

		chickunganya = (Button) findViewById(R.id.chikungunya);

		cancer = (Button) findViewById(R.id.Ca);

		thyroid = (Button) findViewById(R.id.Throid);

		thyroid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog alertDialog = new AlertDialog.Builder(
						Verification.this).create();

				// Setting Dialog Title
				alertDialog.setTitle("Thyroid:");

				// Setting Dialog Message
				alertDialog
						.setMessage("Symptom ::: Dry hair,Dry Skin,Slower heart rate ::: \nReferences:: Dr.kamalakar Rao,no 23/8,T.nagar,chennai-18,phn no:04424315382 ");

				// Setting Icon to Dialog
				alertDialog.setIcon(R.drawable.info);

				// Setting OK Button
				alertDialog.setButton("OK",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								// Write your code here to execute after dialog
								// closed
								// Toast.makeText(getApplicationContext(),
								// "You clicked on OK",
								// Toast.LENGTH_SHORT).show();
							}
						});

				// Showing Alert Message
				alertDialog.show();
			}

		});
		cancer.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog alertDialog = new AlertDialog.Builder(
						Verification.this).create();

				// Setting Dialog Title
				alertDialog.setTitle("Cancer:");

				// Setting Dialog Message
				alertDialog
						.setMessage("Symptom ::: Bloodin your stools,Diarrhoea,Blood in your vomit,Mole is bigger than 7mm in diameter ::: \nReferences :: Dr.kamalakar Rao,no 23/8,T.nagar,chennai-18,phn no:04424315382 ");

				// Setting Icon to Dialog
				alertDialog.setIcon(R.drawable.info);

				// Setting OK Button
				alertDialog.setButton("OK",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								// Write your code here to execute after dialog
								// closed
								// Toast.makeText(getApplicationContext(),
								// "You clicked on OK",
								// Toast.LENGTH_SHORT).show();
							}
						});

				// Showing Alert Message
				alertDialog.show();
			}

		});
		chickunganya.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog alertDialog = new AlertDialog.Builder(
						Verification.this).create();

				// Setting Dialog Title
				alertDialog.setTitle("Chikunganya:");

				// Setting Dialog Message
				alertDialog
						.setMessage("Symptom ::: Muscle pain,back pain,rash(about 50% of affected people. \nReferences :::  Dr.Shankar Nobel hospital ,purasaivakkam,chennai tel :04466949441");

				// Setting Icon to Dialog
				alertDialog.setIcon(R.drawable.info);

				// Setting OK Button
				alertDialog.setButton("OK",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								// Write your code here to execute after dialog
								// closed
								// Toast.makeText(getApplicationContext(),
								// "You clicked on OK",
								// Toast.LENGTH_SHORT).show();
							}
						});

				// Showing Alert Message
				alertDialog.show();
			}

		});
		viralfever.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog alertDialog = new AlertDialog.Builder(
						Verification.this).create();

				// Setting Dialog Title
				alertDialog.setTitle("Viral Fever");

				// Setting Dialog Message
				alertDialog
						.setMessage("Symptom ::: Severe pain around the joints ,Swelling of the face,Vomitting,Skin rash \nReferences ::: Dr.Shankar Nobel hospital ,purasaivakkam,chennai tel :04466949441");

				// Setting Icon to Dialog
				alertDialog.setIcon(R.drawable.info);

				// Setting OK Button
				alertDialog.setButton("OK",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								// Write your code here to execute after dialog
								// closed
								// Toast.makeText(getApplicationContext(),
								// "You clicked on OK",
								// Toast.LENGTH_SHORT).show();
							}
						});

				// Showing Alert Message
				alertDialog.show();
			}

		});
		malaria.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog alertDialog = new AlertDialog.Builder(
						Verification.this).create();

				// Setting Dialog Title
				alertDialog.setTitle("Malaria:");

				// Setting Dialog Message
				alertDialog
						.setMessage("Symptom ::: fever,chills,headache,sweats,fatigue,nausea and vomiting  \nReferences :::  Dr.chandrasekaran soomiya hospital.Sligramam,chennai,phn no:04424315382 ");

				// Setting Icon to Dialog
				alertDialog.setIcon(R.drawable.info);

				// Setting OK Button
				alertDialog.setButton("OK",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								// Write your code here to execute after dialog
								// closed
								// Toast.makeText(getApplicationContext(),
								// "You clicked on OK",
								// Toast.LENGTH_SHORT).show();
							}
						});

				// Showing Alert Message
				alertDialog.show();
			}

		});
		jaundice.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog alertDialog = new AlertDialog.Builder(
						Verification.this).create();

				// Setting Dialog Title
				alertDialog.setTitle("Jaundice:");

				// Setting Dialog Message
				alertDialog
						.setMessage("Symptom ::: Yellow Descolaration of the skin,light-colored stools,itching of the skin \nReferences :::  Dr.kamalakar Rao,no 23/8,T.nagar,chennai-18,phn no:04424315382 ");

				// Setting Icon to Dialog
				alertDialog.setIcon(R.drawable.info);

				// Setting OK Button
				alertDialog.setButton("OK",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								// Write your code here to execute after dialog
								// closed
								// Toast.makeText(getApplicationContext(),
								// "You clicked on OK",
								// Toast.LENGTH_SHORT).show();
							}
						});

				// Showing Alert Message
				alertDialog.show();
			}

		});

		typhoid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog alertDialog = new AlertDialog.Builder(
						Verification.this).create();

				// Setting Dialog Title
				alertDialog.setTitle("Typhoid:");

				// Setting Dialog Message
				alertDialog
						.setMessage("Symptom ::: High Temperature Headache Stomach pain Diarrhoea \nReferences :::  Dr.kamalakar Rao,no 23/8,T.nagar,chennai-18,phn no:04424315382 ");

				// Setting Icon to Dialog
				alertDialog.setIcon(R.drawable.info);

				// Setting OK Button
				alertDialog.setButton("OK",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								// Write your code here to execute after dialog
								// closed
								// Toast.makeText(getApplicationContext(),
								// "You clicked on OK",
								// Toast.LENGTH_SHORT).show();
							}
						});

				// Showing Alert Message
				alertDialog.show();
			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.verification, menu);
		return true;
	}

}
