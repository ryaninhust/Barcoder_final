package barcode.android.internet.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import barcode.android.internet.UserInternet;
import barcode.android.util.Result;

public class UserInternetImpl extends BaseInternetImpl implements UserInternet {

	public Result postUserInfo(String token, String email, String qq,
			String phone, String abstracts, String dorm) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("token", token));
		params.add(new BasicNameValuePair("email", email));
		params.add(new BasicNameValuePair("qq", qq));
		params.add(new BasicNameValuePair("phone", phone));
		params.add(new BasicNameValuePair("abstracts", abstracts));
		params.add(new BasicNameValuePair("dorm", dorm));

		return executePostConnection("", params);
	}

	public Result getOrganizations(String uid, String token)
			throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("token", token));

		return executeGetConnection(uid + "/orgs", params);
	}

	public Result getUserActs(String uid) throws Exception {

		return executeGetConnection(uid + "activities", null);
	}

	public Result getUserInfo(String uid, String token)
			throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("token", token));

		return executeGetConnection(uid, params);
	}

	public Result putUserInfo(String uid, String token, String email,
			String qq, String phone, String abstracts, String dorm)
			throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("uid", uid));
		params.add(new BasicNameValuePair("token", token));
		params.add(new BasicNameValuePair("email", email));
		params.add(new BasicNameValuePair("qq", qq));
		params.add(new BasicNameValuePair("phone", phone));
		params.add(new BasicNameValuePair("abstracts", abstracts));
		params.add(new BasicNameValuePair("dorm", dorm));

		return executePutConnection("", params);
	}

	@Override
	protected String getResourcePrefix() {
		return "user/";
	}

}
