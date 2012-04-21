package barcode.android.internet;

import java.util.Date;

import barcode.android.model.ActivityStatus;
import barcode.android.util.Result;

public interface ActivityInternet {
	public Result postActivity(int firstOrg, int secondOrg,
			int thirdOrg, boolean firstEnsure, boolean secondEnsure,
			boolean thirdEnsure, Date validity, int location, String abstracts,
			Date actDate, String url, String email, ActivityStatus status)
			throws Exception;

	public Result deleteActivity(int id, String token) throws Exception;

	public Result getActivity(int id);

	public Result putActivity(int id, int firstOrg, int secondOrg,
			int thirdOrg, boolean firstEnsure, boolean secondEnsure,
			boolean thirdEnsure, Date validity, int location, String abstracts,
			Date actDate, String url, String email, ActivityStatus status)
			throws Exception;

	public Result getUserAct(int id, String uid, String token)
			throws Exception;

	public Result putUserAct(int id, String uid, String token,
			ActivityStatus status) throws Exception;

	public Result postUserAct(int id, String token) throws Exception;

	public Result getUserActs(int id) throws Exception;
}
