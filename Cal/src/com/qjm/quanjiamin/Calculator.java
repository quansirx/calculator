package com.qjm.quanjiamin;

import Cal.Cal_express;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity implements OnClickListener{
	private Button []button=new Button[20];
	private EditText edittext01;
	private EditText edittext02;
	private String S="";
	public void onClick(View v){
		switch(v.getId()){	
		case R.id.button01:{S+="(";edittext01.setText(S);break;}
		case R.id.button02:{S+=")";edittext01.setText(S);break;}
		case R.id.button03:{S+="/";edittext01.setText(S);break;}
		case R.id.button04:{S="";edittext01.setText(S);edittext02.setText(S);break;}
		
		case R.id.button05:{S+="7";edittext01.setText(S);break;}
		case R.id.button06:{S+="8";edittext01.setText(S);break;}
		case R.id.button07:{S+="9";edittext01.setText(S);break;}
		case R.id.button08:{S+="*";edittext01.setText(S);break;}
		
		case R.id.button09:{S+="4";edittext01.setText(S);break;}
		case R.id.button10:{S+="5";edittext01.setText(S);break;}
		case R.id.button11:{S+="6";edittext01.setText(S);break;}
		case R.id.button12:{S+="-";edittext01.setText(S);break;}
		
		case R.id.button13:{S+="1";edittext01.setText(S);break;}
		case R.id.button14:{S+="2";edittext01.setText(S);break;}
		case R.id.button15:{S+="3";edittext01.setText(S);break;}
		case R.id.button16:{S+="+";edittext01.setText(S);break;}
		
		case R.id.button17:{S+="0";edittext01.setText(S);break;}
		case R.id.button18:{S+=".";edittext01.setText(S);break;}
		case R.id.button19:{S=S.substring(0,S.length()-1);edittext01.setText(S);edittext02.setText("");break;}
		case R.id.button20:{edittext02.setText(Cal_express.parse(S)+"");edittext01.setText(S);break;}
		
		default:edittext02.setText("Error!!!");
		}
		
		
		
	}
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cal01);
		edittext01=(EditText)findViewById(R.id.edittext01);
		edittext02=(EditText)findViewById(R.id.edittext02);
		button[0]=(Button)findViewById(R.id.button01);
		button[1]=(Button)findViewById(R.id.button02);
		button[2]=(Button)findViewById(R.id.button03);
		button[3]=(Button)findViewById(R.id.button04);
		
		button[4]=(Button)findViewById(R.id.button05);
		button[5]=(Button)findViewById(R.id.button06);
		button[6]=(Button)findViewById(R.id.button07);
		button[7]=(Button)findViewById(R.id.button08);
		
		button[8]=(Button)findViewById(R.id.button09);
		button[9]=(Button)findViewById(R.id.button10);
		button[10]=(Button)findViewById(R.id.button11);
		button[11]=(Button)findViewById(R.id.button12);
		
		button[12]=(Button)findViewById(R.id.button13);
		button[13]=(Button)findViewById(R.id.button14);
		button[14]=(Button)findViewById(R.id.button15);
		button[15]=(Button)findViewById(R.id.button16);
		
		button[16]=(Button)findViewById(R.id.button17);
		button[17]=(Button)findViewById(R.id.button18);
		button[18]=(Button)findViewById(R.id.button19);
		button[19]=(Button)findViewById(R.id.button20);
		
		for(int i=0;i<20;i++)button[i].setOnClickListener(this);	
	}
		
}
