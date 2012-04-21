package barcode.android.internet.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;
import barcode.android.internet.BaseInternet;
import barcode.android.util.Result;
import barcode.android.util.ResultType;

public abstract class BaseInternetImpl implements BaseInternet {

	private static final String TAG = "BaseInternetImpl";

	private static final String HOST = "222.20.90.24";
	private static final int PORT = 8080;
	private static final String PATH_PREFIX = "barcoder/";
	private static final String ENCODING = "UTF-8";

	public Result executeGetConnection(String method,
			List<NameValuePair> parameters) throws Exception {
		return executeConnection(method, ConnectionType.Get, parameters);
	}

	public Result executePostConnection(String method,
			List<NameValuePair> parameters) throws Exception {
		return executeConnection(method, ConnectionType.Post, parameters);
	}

	public Result executePutConnection(String method,
			List<NameValuePair> parameters) throws Exception {
		return executeConnection(method, ConnectionType.Put, parameters);
	}

	public Result executeDeleteConnection(String method,
			List<NameValuePair> parameters) throws Exception {
		return executeConnection(method, ConnectionType.Delete, parameters);
	}

	private Result executeConnection(String method,
			ConnectionType type, List<NameValuePair> parameters)
			throws Exception {
		HttpClient client = new DefaultHttpClient();
		HttpResponse response = client.execute(getConnection(method, type,
				parameters));

		int statusCode = response.getStatusLine().getStatusCode();

		Log.d(this.getClass().getSimpleName(), type.toString() + ":"
				+ statusCode);

		Result res = new Result();
		res.setValue("");
		switch (statusCode) {
		case 200:
			InputStream is = response.getEntity().getContent();
			String value = read(is);
			res.setValue(value);

			Log.d(this.getClass().getSimpleName(), value);

			res.setType(ResultType.Success);
			break;
		default:
			res.setType(ResultType.UnknowError);
			break;
		}

		return res;
	}

	private HttpRequestBase getConnection(String method, ConnectionType type,
			List<NameValuePair> parameters) throws Exception {
		URI uri = getURI(method, parameters);

		Log.d(TAG, uri.toString());

		HttpRequestBase request = null;
		switch (type) {
		case Get:
			request = new HttpGet(uri);
			break;
		case Post:
			request = new HttpPost(uri);
			break;
		case Put:
			request = new HttpPut(uri);
			break;
		case Delete:
			request = new HttpDelete(uri);
			break;
		}
		if (null != request)
			request.setHeader("Accept", "application/json");
		return request;
	}

	protected String read(InputStream instream) {
		StringBuilder sb = null;
		try {
			sb = new StringBuilder();
			BufferedReader r = new BufferedReader(new InputStreamReader(
					instream));
			for (String line = r.readLine(); line != null; line = r.readLine()) {
				sb.append(line);
			}

			instream.close();

		} catch (IOException e) {
		}
		return sb.toString();

	}

	private URI getURI(String method, List<NameValuePair> parameters)
			throws URISyntaxException {
		if (null == parameters)
			parameters = new ArrayList<NameValuePair>();
		return URIUtils.createURI("http", HOST, PORT, PATH_PREFIX
				+ getResourcePrefix() + method,
				URLEncodedUtils.format(parameters, ENCODING), null);
	}

	/**
	 * 获得资源前缀
	 */
	protected abstract String getResourcePrefix();

	private enum ConnectionType {
		Get, Post, Put, Delete
	}
}
