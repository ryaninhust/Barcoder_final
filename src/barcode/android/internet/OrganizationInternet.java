package barcode.android.internet;

import barcode.android.util.Result;

public interface OrganizationInternet {
	public Result postOrganization(String token, String name,
			String email, String qq, String phone, String abstracts)
			throws Exception;

	public Result putOrganization(String id, String token, String name,
			String email, String qq, String phone, String abstracts)
			throws Exception;

	public Result getOrganization(String id) throws Exception;

	public Result deleteOrganization(String id, String token)
			throws Exception;

	public Result getAdmins(String id) throws Exception;

	public Result postAdmin(String id, String auid, String token)
			throws Exception;

	public Result deleteAdmin(String id, String aid, String token)
			throws Exception;
}
