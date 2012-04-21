package com.stip.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;

public class WelcomeActivity extends Activity {
	/** Called when the activity is first created. */

	private EditText uidEditText = null;
	private EditText nameEditText = null;
	private LinearLayout loginLinearLayout = null;
	private LinearLayout nextLinearLayout = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setContentView(R.layout.welcome);
		uidEditText = (EditText) findViewById(R.id.welcome_uid_eidt);
		nameEditText = (EditText) findViewById(R.id.welcome_name_eidt);
		loginLinearLayout = (LinearLayout) findViewById(R.id.welcome_login);
		nextLinearLayout = (LinearLayout) findViewById(R.id.welcome_next);
		loginLinearLayout.setOnClickListener(new welcomeOnclickListner());
		nextLinearLayout.setOnClickListener(new welcomeOnclickListner());

	}

	class welcomeOnclickListner implements OnClickListener {

		public void onClick(View v) {
			// TODO Auto-generated method stub
			v.setBackgroundColor(Color.WHITE);
			switch (v.getId()) {
			case R.id.welcome_login:

				startActivity(new Intent(WelcomeActivity.this,
						LgoinActivity.class)
						.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_right_in,
						R.anim.push_right_out);
				break;

			default:

				// ͨ������ѧ�Ż�ȡhub�����Ϣ������,��ѡ���Ƿ���ת if(����!=null)
				startActivity(new Intent(WelcomeActivity.this,
						EnsureInfoActivity.class)
						.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in,
						R.anim.push_left_out);
				break;
			}
		}

	}

}