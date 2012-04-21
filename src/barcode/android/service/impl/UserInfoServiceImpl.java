package barcode.android.service.impl;

import java.util.List;

import barcode.android.internet.AccountInternet;
import barcode.android.internet.impl.AccountInternetImpl;
import barcode.android.model.Activity;
import barcode.android.model.UserInfo;
import barcode.android.service.UserInfoService;
import barcode.android.util.Result;
import barcode.android.util.ResultType;

public class UserInfoServiceImpl extends BaseServiceImpl implements
		UserInfoService {
	private AccountInternet anet = new AccountInternetImpl();

	public Result verifyUserValid(String uid, String name) throws Exception {
		Result res = new Result();

		Result resCheck = anet.check(uid, name);
		if (resCheck.getType() != ResultType.Success)
			res.setType(ResultType.InternetError);
		else
			res = resCheck;

		return res;
	}

	public Result signUp(String uid, String password) throws Exception {
		Result res = new Result();
		
		Result resSignUp = anet.signUp(uid, password);
		if(resSignUp.getType() != ResultType.Success)
			res.setType(ResultType.InternetError);
		else
			res = resSignUp;
		
		return res;
	}

	public int getUnreadMessageNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Activity> getNearlyActivities() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Activity> getHotActivities() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAdminOrganizationNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getOrganizationUnreadMessageNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Activity> getOrganizationNearlyActivities() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserInfo getUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateUpserInfo() {
		// TODO Auto-generated method stub
		return false;
	}

}
