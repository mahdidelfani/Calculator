// # Copyright © 2021-2022 Mahdi82Delfani.ir
// # This Project Coded By Mehdi .
// # Url Download Project : [ https://github.com/Mahdi82Delfani/Simple-Calculator.git ]
// # My Website For Reach Me : [ Mahdi82Delfani.ir ]
// # Our Telegram Channel For More Information : [ https://t.me/Mahdi_Memorial ]


package com.mahdi82delfani.calculator;

import android.app.*;
import android.os.*;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends Activity 
{
	
	private Button number0,number1,number2,number3,number4,power,tide,channel,
			number5,number6,number7,number8,number9,plus,minus,multi,divide,equal,del;
	private TextView output;
	private int operator = 0;
	private double value1 = 0;
	private double value2 = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		output = findViewById(R.id.output);
		number0 = findViewById(R.id.num0);
		number0.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					inputNum(0);
				}
			});
		number1 = findViewById(R.id.num1);
		number1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					inputNum(1);
				}
			});
		number2 = findViewById(R.id.num2);
		number2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					inputNum(2);
				}
			});
		number3 = findViewById(R.id.num3);
		number3.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					inputNum(3);
				}
			});
		number4 = findViewById(R.id.num4);
		number4.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					inputNum(4);
				}
			});
		number5 = findViewById(R.id.num5);
		number5.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					inputNum(5);
				}
			});
		number6 = findViewById(R.id.num6);
		number6.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					inputNum(6);
				}
			});
		number7 = findViewById(R.id.num7);
		number7.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					inputNum(7);
				}
			});
		number8 = findViewById(R.id.num8);
		number8.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					inputNum(8);
				}
			});
		number9 = findViewById(R.id.num9);
		number9.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					inputNum(9);
				}
			});
		equal = findViewById(R.id.equal);
		equal.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					result();
				}
			});
		del = findViewById(R.id.del);
		del.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					clear();
				}
			});
		multi = findViewById(R.id.multi);
		multi.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					if(operator > 0){
						result();
					}
					operator = 3;
				}
			});
		divide = findViewById(R.id.divide);
		divide.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					if(operator > 0){
						result();
					}
					operator = 4;

				}
			});
		minus = findViewById(R.id.minus);
		minus.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					if(operator > 0){
						result();
					}
					operator = 2;

				}
			});
		plus = findViewById(R.id.plus);
		plus.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					if(operator > 0){
						result();
					}
					operator = 1;

				}
			});
		tide = findViewById(R.id.tide);
		tide.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					operator = 6;
					if(operator > 0){
						result();
					}
				}
			});
		power = findViewById(R.id.power);
		power.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					if(operator > 0){
						result();
					}
					operator = 5;

				}
			});
		channel = findViewById(R.id.channel);
		channel.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1) {
					startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://t.me/Mahdi_Memorial")));
				}
			});
    }
	
	
	public void clear(){
		output.setText("0");
		operator = 0;
		value1 = 0;
		value2 = 0;
	}
	
	
	public void inputNum(final double d){
		if(operator == 0){
			value1 = (value1*10) + d;
			output.setText(String.valueOf(value1));
		}else{
			value2 = (value2*10) + d;
			output.setText(String.valueOf(value2));
		}
	}
	
	public void result(){
		switch(operator){
			case 1 :
				value1 = value1 + value2;
				value2 = 0;
				operator = 0;
				output.setText(String.valueOf(value1));
				break;
			case 2 :
				value1 = value1 - value2;
				value2 = 0;
				operator = 0;
				output.setText(String.valueOf(value1));
				break;
			case 3 :
				value1 = value1 * value2;
				value2 = 0;
				operator = 0;
				output.setText(String.valueOf(value1));
				break;
			case 4 :
				value1 = value1 / value2;
				value2 = 0;
				operator = 0;
				output.setText(String.valueOf(value1));
				break;
			case 5 :
				value1 = Math.pow(value1,value2);
				value2 = 0;
				operator = 0;
				output.setText(String.valueOf(value1));
				break;
			case 6 :
				value1 = Math.sqrt(value1);
				value2 = 0;
				operator = 0;
				output.setText(String.valueOf(value1));
				break;
		}
	}
}
