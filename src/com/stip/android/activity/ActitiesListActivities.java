//package com.stip.android.activity;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//
//
//import com.markupartist.android.widget.PullToRefreshListView;
//import com.markupartist.android.widget.PullToRefreshListView.OnRefreshListener;
//
//import android.app.Activity;
//import android.app.ListActivity;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.view.animation.AlphaAnimation;
//import android.view.animation.Animation;
//import android.view.animation.AnimationSet;
//import android.view.animation.LayoutAnimationController;
//import android.view.animation.TranslateAnimation;
//
//public class ActitiesListActivities extends ListActivity {
//	private ArrayList<E> actsArrayList;
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.acititieslist);
//	}
//	@Override
//	protected void onResume() {
//		// TODO Auto-generated method stub
//		super.onResume();
//		 setContentView(R.layout.pull_to_refresh);
//         
//	        
//	        
//	        AnimationSet set = new AnimationSet(true);
//
//	        Animation animation = new AlphaAnimation(0.0f, 1.0f);
//	        animation.setDuration(50);
//	        set.addAnimation(animation);
//
//	        animation = new TranslateAnimation(
//	            Animation.RELATIVE_TO_SELF, 0.0f,Animation.RELATIVE_TO_SELF, 0.0f,
//	            Animation.RELATIVE_TO_SELF, -1.0f,Animation.RELATIVE_TO_SELF, 0.0f
//	        );
//	        animation.setDuration(1000);
//	        set.addAnimation(animation);
//
//	        LayoutAnimationController controller = new LayoutAnimationController(set, 0.5f);
//	        ((PullToRefreshListView) getListView()).setLayoutAnimation(controller);
//	        // Set a listener to be invoked when the list should be refreshed.
//	        ((PullToRefreshListView) getListView()).setOnRefreshListener(new OnRefreshListener() {
////	            @Override
//	            public void onRefresh() {
//	                // Do work to refresh the list here.
//	                new GetDataTask().execute();
//	            }
//	        });
//
//	        
//
////	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice
////	               , mListItems);
////	        
//	        HelloAdapter helloAdapter=new HelloAdapter(mListItems,PullToRefreshActivity.this);
////	        
//	        setListAdapter(helloAdapter);
//	}
//	   private class GetDataTask extends AsyncTask<Void, Void, String[]> {
//
//	        @Override
//	        protected String[] doInBackground(Void... params) {
//	            // Simulates a background job.
//	            try {
//	                Thread.sleep(2000);
//	                //访问接口
//	            } catch (InterruptedException e) {
//	                ;
//	            }
//	            return actsArrayList;
//	        }
//
//	        @Override
//	        protected void onPostExecute(String[] result) {
////	            mListItems.addFirst("Added after refresh...");
////重新读取
//	            // Call onRefreshComplete when the list has been refreshed.
//	            ((PullToRefreshListView) getListView()).onRefreshComplete();
//
//	            super.onPostExecute(result);
//	        }
//	    }
//
//
//}
//
