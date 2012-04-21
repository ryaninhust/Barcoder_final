package com.stip.android.activity;

import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class CompleteInfoActiviey extends Activity {
	
	private EditText qqEditText=null;
	private EditText phoneEditText=null;
	private EditText emailEditText=null;
	private EditText shuoEditText=null;
	private Spinner dormSpinner=null;
	private RelativeLayout okRelativeLayout=null;
	private LinearLayout backLinearLayout=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.completeinfo);
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setContentView(R.layout.completeinfo);
		qqEditText=(EditText)findViewById(R.id.complete_qq);
		phoneEditText=(EditText)findViewById(R.id.complete_phone);
		emailEditText=(EditText)findViewById(R.id.complete_email);
		
		shuoEditText=(EditText)findViewById(R.id.complete_shuoshuo);
		dormSpinner=(Spinner)findViewById(R.id.complete_dorm);
		okRelativeLayout=(RelativeLayout)findViewById(R.id.complete_ok_button);
		backLinearLayout=(LinearLayout)findViewById(R.id.completeinfo_back);
	}
	
	class completeOnclick implements OnClickListener{

		public void onClick(View v) {
			// TODO Auto-generated method stub
			v.setBackgroundColor(color.white);
			switch (v.getId()) {
			case R.id.complete_ok_button:
				
//				存储用户信息,带着所有个人信息跳转...
				startActivity(new Intent(CompleteInfoActiviey.this, EnsureInfoActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;

			default:
				finish();
				break;
			}
		}
		
		
		
	}
}
