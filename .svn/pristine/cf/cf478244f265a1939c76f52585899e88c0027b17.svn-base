package com.stip.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EnsureInfoActivity extends Activity {
    private TextView uidTextView=null;
    private TextView nameTextView=null;
    private TextView deparmenTextView=null;
    private TextView majorTextView=null;
    private TextView classTextView=null;
    private RelativeLayout okLinearLayout=null;
    private LinearLayout backLinearLayout=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ensureinfo);
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setContentView(R.layout.ensureinfo);
		uidTextView=(TextView)findViewById(R.id.ensure_label_uid);
		nameTextView=(TextView)findViewById(R.id.ensure_label_name);
		deparmenTextView=(TextView)findViewById(R.id.ensure_label_department);	
		majorTextView=(TextView)findViewById(R.id.ensure_label_major);
		classTextView=(TextView)findViewById(R.id.ensure_label_class);
		okLinearLayout=(RelativeLayout)findViewById(R.id.ensure_button);
		backLinearLayout=(LinearLayout)findViewById(R.id.ensure_back);
		okLinearLayout.setOnClickListener(new ensureOnclick());
		backLinearLayout.setOnClickListener(new ensureOnclick());
	}
	class ensureOnclick implements OnClickListener{

		
			// TODO Auto-generated method stub
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.setBackgroundColor(Color.WHITE);
			switch (v.getId()) {
			case R.id.ensure_back:
				
//				startActivity(new Intent(EnsureInfoActivity.this, LgoinActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
//				overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
				finish();
				break;

			default:
				
				//传递 学号继续
				startActivity(new Intent(EnsureInfoActivity.this, EnsureInfoActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
				overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				break;
		}
		
		
		
	}

}
}
