package barcode.android.service;

import java.util.List;

import barcode.android.model.Activity;
import barcode.android.model.UserInfo;
import barcode.android.util.Result;

public interface UserInfoService {
	/**
	 * 判断是否存在学号为uid，姓名为name的学生
	 * @return 存在则返回true，否则返回false
	 * @throws Exception 
	 */
	public Result verifyUserValid(String uid, String name) throws Exception;
	
	/**
	 * 获取未读信息数
	 */
	public int getUnreadMessageNumber();
	
	/**
	 * 获取用户最近的三个活动。如果没有三个则按实际数目返回
	 */
	public List<Activity> getNearlyActivities();
	
	/**
	 * 获取热门活动
	 */
	public List<Activity> getHotActivities();
	
	/**
	 * 获取管理的组织的数目
	 */
	public int getAdminOrganizationNumber();
	
	/**
	 * 获取管理的所有组织的未读信息数目
	 */
	public int getOrganizationUnreadMessageNumber();
	
	/**
	 * 获取管理的所有组织最近的三个活动
	 */
	public List<Activity> getOrganizationNearlyActivities();
	
	/**
	 * 获取用户信息
	 */
	public UserInfo getUserInfo();

	/**
	 * 更新用户信息
	 */
	public boolean updateUpserInfo();
}
