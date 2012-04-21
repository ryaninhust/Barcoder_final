package barcode.android.internet.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import barcode.android.internet.ActivityInternet;
import barcode.android.model.Activity;
import barcode.android.model.ActivityStatus;
import barcode.android.util.Result;

public class ActivityInternetImpl extends BaseInternetImpl implements
		ActivityInternet {
	private static SimpleDateFormat df = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	public Result postActivity(int firstOrg, int secondOrg,
			int thirdOrg, boolean firstEnsure, boolean secondEnsure,
			boolean thirdEnsure, Date validity, int location, String abstracts,
			Date actDate, String url, String email, ActivityStatus status)
			throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("forg", Integer.toString(firstOrg)));
		params.add(new BasicNameValuePair("sorg", Integer.toString(secondOrg)));
		params.add(new BasicNameValuePair("torh", Integer.toString(thirdOrg)));
		params.add(new BasicNameValuePair("fe", firstEnsure ? "1" : "0"));
		params.add(new BasicNameValuePair("se", secondEnsure ? "1" : "0"));
		params.add(new BasicNameValuePair("te", thirdEnsure ? "1" : "0"));
		params.add(new BasicNameValuePair("val", df.format(validity)));
		params.add(new BasicNameValuePair("loc", Integer.toString(location)));
		params.add(new BasicNameValuePair("abs", abstracts));
		params.add(new BasicNameValuePair("actdate", df.format(actDate)));
		params.add(new BasicNameValuePair("url", url));
		params.add(new BasicNameValuePair("email", email));
		params.add(new BasicNameValuePair("status", Integer.toString(Activity.getStatusNumber(status))));

		return executePostConnection("", params);
	}

	public Result deleteActivity(int id, String token) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Result getActivity(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result putActivity(int id, int firstOrg, int secondOrg,
			int thirdOrg, boolean firstEnsure, boolean secondEnsure,
			boolean thirdEnsure, Date validity, int location, String abstracts,
			Date actDate, String url, String email, ActivityStatus status)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Result getUserAct(int id, String uid, String token)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Result putUserAct(int id, String uid, String token,
			ActivityStatus status) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Result postUserAct(int id, String token) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Result getUserActs(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getResourcePrefix() {
		return "activity/";
	}

}
