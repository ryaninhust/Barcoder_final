package com.stip.android.activity;

import com.stip.android.activity.R.id;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class UserMain extends Activity {
	private RelativeLayout infoRelativeLayout = null;
	private RelativeLayout hotRelativeLayout = null;
	private RelativeLayout activityrRelativeLayout = null;
	private RelativeLayout newsRelativeLayout = null;
	private RelativeLayout shcLayout = null;
	private RelativeLayout scanLayout = null;
	private RelativeLayout settinglLayout = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setContentView(R.layout.usermain);
		infoRelativeLayout = (RelativeLayout) findViewById(R.id.usermain_info);
		hotRelativeLayout = (RelativeLayout) findViewById(R.id.usermain_hot);
		activityrRelativeLayout = (RelativeLayout) findViewById(R.id.usermain_activties);
		newsRelativeLayout = (RelativeLayout) findViewById(R.id.usermain_news);
		scanLayout = (RelativeLayout) findViewById(R.id.usermain_scan);
		shcLayout = (RelativeLayout) findViewById(R.id.usermain_shcedule);
		settinglLayout = (RelativeLayout) findViewById(R.id.usermain_setting);
        infoRelativeLayout.setOnClickListener(new mainOnclick());
        hotRelativeLayout.setOnClickListener(new mainOnclick());
        activityrRelativeLayout.setOnClickListener(new mainOnclick());
        newsRelativeLayout.setOnClickListener(new mainOnclick());
        scanLayout.setOnClickListener(new mainOnclick());
        settinglLayout.setOnClickListener(new mainOnclick());
        shcLayout.setOnClickListener(new mainOnclick());
	}

	class mainOnclick implements OnClickListener {

		public void onClick(View v) {
			// TODO Auto-generated method stub
			v.setBackgroundColor(Color.WHITE);
			switch (v.getId()) {
			case R.id.usermain_info:
				startActivity(new Intent(UserMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;

			case R.id.usermain_hot:
				startActivity(new Intent(UserMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
			case R.id.usermain_activties:
				startActivity(new Intent(UserMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
			case R.id.usermain_news:
				startActivity(new Intent(UserMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
			case R.id.usermain_scan:
				startActivity(new Intent(UserMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
			case R.id.usermain_shcedule:
				startActivity(new Intent(UserMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
			case R.id.usermain_setting:
				startActivity(new Intent(UserMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;

			default:
				break;
			}
		}

	}

}
