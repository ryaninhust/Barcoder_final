package barcode.android.internet.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import com.google.gson.Gson;
import barcode.android.internet.AccountInternet;
import barcode.android.server.UserHubUtil;
import barcode.android.util.Result;

public class AccountInternetImpl extends BaseInternetImpl implements
		AccountInternet {
	/**
	 * 返回值中存放UserHubUtil
	 */
	public Result check(String uid, String name) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("name", name));

		Result res = executeGetConnection("check/" + uid, params);
		Gson gson = new Gson();
		UserHubUtil user = gson.fromJson((String) res.getValue(),
				UserHubUtil.class);
		res.setValue(user);

		return res;
	}

	/**
	 * 返回值中存放String类型的token
	 */
	public Result login(String uid, String password) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("password", password));

		return executeGetConnection(uid, params);
	}

	public Result changePassword(String uid, String password,
			String token) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("password", password));
		params.add(new BasicNameValuePair("token", token));

		return executePostConnection(uid, params);
	}

	public Result signUp(String uid, String password) throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("uid", uid));
		params.add(new BasicNameValuePair("password", password));

		return executePostConnection("", params);
	}

	@Override
	protected String getResourcePrefix() {
		return "account/";
	}

}
