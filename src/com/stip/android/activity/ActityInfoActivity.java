package com.stip.android.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActityInfoActivity extends Activity {
	//Activity activity=null;
	//UserAct useract=null;
	TextView actName=null;
	TextView acttime=null;
	TextView actloction=null;
	TextView actorg=null;
	TextView actemail=null;
	TextView actqq=null;
	TextView actvalidate=null;
	TextView actabstract=null;
	LinearLayout actOkLayout=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);
		//获取 useract
		//获取 actit...
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setContentView(R.layout.activity);
		 actName=(TextView)findViewById(R.id.act_name);
		 acttime=(TextView)findViewById(R.id.act_date);
		 actloction=(TextView)findViewById(R.id.act_location);
		 actorg=(TextView)findViewById(R.id.act_org);
		 actemail=(TextView)findViewById(R.id.act_email);
		 actqq=(TextView)findViewById(R.id.act_qq);
		 actvalidate=(TextView)findViewById(R.id.act_val);
		 actabstract=(TextView)findViewById(R.id.act_abstracts);
		 actOkLayout=(LinearLayout)findViewById(R.id.act_ok);
		 actOkLayout.setOnClickListener(new actInfoListen());
	}
	class actInfoListen implements OnClickListener{

		public void onClick(View v) {
			// TODO Auto-generated method stub
			//根据useract的结果生成不同的结果...switch...
		}
		
		
		
	}

}
