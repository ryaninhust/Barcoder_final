package barcode.android.internet.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import barcode.android.internet.OrganizationInternet;
import barcode.android.util.Result;

public class OrganizationInternetImpl extends BaseInternetImpl implements
		OrganizationInternet {

	public Result postOrganization(String token, String name,
			String email, String qq, String phone, String abstracts)
			throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("token", token));
		params.add(new BasicNameValuePair("name", name));
		params.add(new BasicNameValuePair("email", email));
		params.add(new BasicNameValuePair("qq", qq));
		params.add(new BasicNameValuePair("phone", phone));
		params.add(new BasicNameValuePair("abstracts", abstracts));

		return executePostConnection("", params);
	}

	public Result putOrganization(String id, String token, String name,
			String email, String qq, String phone, String abstracts)
			throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("token", token));
		params.add(new BasicNameValuePair("name", name));
		params.add(new BasicNameValuePair("email", email));
		params.add(new BasicNameValuePair("qq", qq));
		params.add(new BasicNameValuePair("phone", phone));
		params.add(new BasicNameValuePair("abstracts", abstracts));

		return executePutConnection(id, params);
	}

	public Result getOrganization(String id) throws Exception {
		return executeGetConnection(id, null);
	}

	public Result deleteOrganization(String id, String token)
			throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("token", token));

		return executeDeleteConnection(id, params);
	}

	public Result getAdmins(String id) throws Exception {
		return executeGetConnection(id + "/admins", null);
	}

	public Result postAdmin(String id, String auid, String token)
			throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("auid", auid));
		params.add(new BasicNameValuePair("token", token));

		return executePostConnection(id + "/admin", params);
	}

	public Result deleteAdmin(String id, String aid, String token)
			throws Exception {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("token", token));

		return executeDeleteConnection(id + "/admin/" + aid, params);
	}

	@Override
	protected String getResourcePrefix() {
		return "org/";
	}
}
