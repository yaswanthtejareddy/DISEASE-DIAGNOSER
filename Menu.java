package com.uniqtechnologies.diseasediagnisor;



import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;


public class Menu extends Activity {
	Button about,checking,verification,contact;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		about=(Button)findViewById(R.id.MAbout);
		checking=(Button)findViewById(R.id.Mchecking);
		verification=(Button)findViewById(R.id.Mverification);
		contact=(Button)findViewById(R.id.Mcontact);
		checking.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a= new Intent(getApplicationContext(),CheckingProcess.class);
				startActivity(a);
			}
		});
		
		verification.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a= new Intent(getApplicationContext(),Verification.class);
				startActivity(a);
				
			}
		});
		
		contact.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog alertDialog = new AlertDialog.Builder(
                        Menu.this).create();
 
        // Setting Dialog Title
        alertDialog.setTitle("Contact Us");
 
        // Setting Dialog Message
        alertDialog.setMessage("Some INFO");
 
        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.info);
 
        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
              //  Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
                }
        });
 
        // Showing Alert Message
        alertDialog.show();
			}
				
			
		});
		
		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog alertDialog = new AlertDialog.Builder(
                        Menu.this).create();
 
        // Setting Dialog Title
        alertDialog.setTitle("About Us");
 
        // Setting Dialog Message
        alertDialog.setMessage("Some INFO");
 
        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.info);
 
        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
              //  Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
                }
        });
 
        // Showing Alert Message
        alertDialog.show();
			}
		});
		
		
		
		
	}



}
