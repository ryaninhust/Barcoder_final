package com.stip.android.activity;

import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.CompletionInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class PasswordSetting extends Activity {
    EditText passwordEditText=null;
    EditText passwordEditText2=null;
    RelativeLayout okRelativeLayout=null;
    LinearLayout backLinearLayout=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.passwordsetting);
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setContentView(R.layout.passwordsetting);
		passwordEditText=(EditText)findViewById(R.id.password_edit_fisr);
		passwordEditText2=(EditText)findViewById(R.id.password_edit_second);
		okRelativeLayout=(RelativeLayout)findViewById(R.id.password_ok_button);
		okRelativeLayout.setOnClickListener(new PasswordOnclick());
		
		backLinearLayout=(LinearLayout)findViewById(R.id.password_ok_button);
		backLinearLayout.setOnClickListener(new PasswordOnclick());
	}
	class PasswordOnclick implements OnClickListener{

		public void onClick(View v) {
			// TODO Auto-generated method stub
			v.setBackgroundColor(color.white);
			switch (v.getId()) {
			case R.id.password_back:
				finish();
				break;
			
			default:
				//设置密码并将得到的token传至下一层
				startActivity(new Intent(PasswordSetting.this, CompletionInfo.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
			}
			
		}
		
		
		
	}

}
