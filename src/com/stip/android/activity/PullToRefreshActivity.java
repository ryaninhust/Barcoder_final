//package com.stip.android.activity;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//
//import android.app.ListActivity;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.view.animation.AlphaAnimation;
//import android.view.animation.Animation;
//import android.view.animation.AnimationSet;
//import android.view.animation.LayoutAnimationController;
//import android.view.animation.TranslateAnimation;
//import android.widget.ArrayAdapter;
//
//import com.markupartist.android.widget.PullToRefreshListView;
//import com.markupartist.android.widget.PullToRefreshListView.OnRefreshListener;
//
//public class PullToRefreshActivity extends ListActivity {    
//    private LinkedList<String> mListItems;
//
//    
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.acititieslist);
//         
//        
//        
//        AnimationSet set = new AnimationSet(true);
//
//        Animation animation = new AlphaAnimation(0.0f, 1.0f);
//        animation.setDuration(50);
//        set.addAnimation(animation);
//
//        animation = new TranslateAnimation(
//            Animation.RELATIVE_TO_SELF, 0.0f,Animation.RELATIVE_TO_SELF, 0.0f,
//            Animation.RELATIVE_TO_SELF, -1.0f,Animation.RELATIVE_TO_SELF, 0.0f
//        );
//        animation.setDuration(1000);
//        set.addAnimation(animation);
//
//        LayoutAnimationController controller = new LayoutAnimationController(set, 0.5f);
//        ((PullToRefreshListView) getListView()).setLayoutAnimation(controller);
//        // Set a listener to be invoked when the list should be refreshed.
//        ((PullToRefreshListView) getListView()).setOnRefreshListener(new OnRefreshListener() {
////            @Override
//            public void onRefresh() {
//                // Do work to refresh the list here.
//                new GetDataTask().execute();
//            }
//        });
//
//        mListItems = new LinkedList<String>();
//        mListItems.addAll(Arrays.asList(mStrings));
//
////        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice
////               , mListItems);
////        
//        HelloAdapter helloAdapter=new HelloAdapter(mListItems,PullToRefreshActivity.this);
////        
//        setListAdapter(helloAdapter);
//    }
//
//    private class GetDataTask extends AsyncTask<Void, Void, String[]> {
//
//        @Override
//        protected String[] doInBackground(Void... params) {
//            // Simulates a background job.
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                ;
//            }
//            return mStrings;
//        }
//
//        @Override
//        protected void onPostExecute(String[] result) {
//            mListItems.addFirst("Added after refresh...");
//
//            // Call onRefreshComplete when the list has been refreshed.
//            ((PullToRefreshListView) getListView()).onRefreshComplete();
//
//            super.onPostExecute(result);
//        }
//    }
//
//    private String[] mStrings = {
//            "Abbaye desdasdasdasdasdasdasdasdasdasdasd Bellocsdasdasdasdasdasdasdasdsadgjhgjggjgjhbjhbbnjhjhhyyuyyyytgytgyguygyguguyguguguguguyg", "Abbaye du Mont des Cats", "Abertam",
//            "Abondance", "Ackawi", "Acorn", "Adelost", "Affidelice au Chablis",
//            "Afuega'l Pitu", "Airag", "Airedale", "Aisy Cendre",
//            "Allgauer Emmentaler"};
//}
