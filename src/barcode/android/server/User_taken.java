package barcode.android.server;

import android.provider.ContactsContract.Contacts.Data;

public class User_taken 
{
	String access_takon;
	String uid;
	Data access_date;
	public String getAccess_takon() {
		return access_takon;
	}
	public void setAccess_takon(String access_takon) {
		this.access_takon = access_takon;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Data getAccess_date() {
		return access_date;
	}
	public void setAccess_date(Data access_date) {
		this.access_date = access_date;
	}
}
