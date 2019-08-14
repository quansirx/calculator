package com.example.translate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.view.View;
import dz2017.quanjiamin.tools.Translate;
public class First_Activity extends Activity {
	
	
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_layout);
		 final EditText edittext_1=(EditText)findViewById(R.id.edittext_01);
		 final EditText edittext_2=(EditText)findViewById(R.id.edittext_02);
		 Button button_1=(Button)findViewById(R.id.button_01);
		button_1.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
			
				if(edittext_1.getText().toString().equals("0")){
					edittext_2.setText("zero");
				}
			else if(edittext_1.getText().toString().length()>10||Integer.parseInt(edittext_1.getText().toString())<0){
				AlertDialog.Builder dialog=new AlertDialog.Builder(First_Activity.this);
				dialog.setTitle("AlertDialog");
				dialog.setMessage("请输入0到999999999的正整数");
				dialog.setCancelable(false);
				dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {		
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
					}});
				dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						}});
				dialog.show();	
			}
			else if(Integer.parseInt(edittext_1.getText().toString())>1000000000){
					Toast.makeText(First_Activity.this, "最大翻译位数为9位数", Toast.LENGTH_SHORT).show();
				}
				else edittext_2.setText(Translate.translate(Integer.parseInt(edittext_1.getText().toString())));			
			}

		});
	}
}
