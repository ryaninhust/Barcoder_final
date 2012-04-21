package com.stip.android.activity;

import com.stip.android.activity.UserMain.mainOnclick;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class OrgMain extends Activity {
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
		setContentView(R.layout.orgmain);
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setContentView(R.layout.orgmain);
		infoRelativeLayout = (RelativeLayout) findViewById(R.id.org_1);
		hotRelativeLayout = (RelativeLayout) findViewById(R.id.org_3);
		activityrRelativeLayout = (RelativeLayout) findViewById(R.id.org_5);
		newsRelativeLayout = (RelativeLayout) findViewById(R.id.org_6);
		scanLayout = (RelativeLayout) findViewById(R.id.org_2);
		shcLayout = (RelativeLayout) findViewById(R.id.org_7);
		settinglLayout = (RelativeLayout) findViewById(R.id.org_4);
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
			//info
			case R.id.org_1:
				startActivity(new Intent(OrgMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
  //scan
			case R.id.org_2:
				startActivity(new Intent(OrgMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
				//actives
			case R.id.org_3:
				startActivity(new Intent(OrgMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
				//setting
			case R.id.org_4:
				startActivity(new Intent(OrgMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
				//manager
			case R.id.org_5:
				startActivity(new Intent(OrgMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
				//news
			case R.id.org_6:
				startActivity(new Intent(OrgMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
				//schdule
			case R.id.org_7:
				startActivity(new Intent(OrgMain.this, UserMain.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;

			default:
				break;
			}
		}

	}
}
