package barcode.android.model;

import java.util.Calendar;

public class Activity {
	private int id;
	private Organization org1;
	private Organization org2;
	private Organization org3;
	private boolean ensure1;
	private boolean ensure2;
	private boolean ensure3;
	private Calendar validity;
	private Locations location;
	private String abstracts;
	private Calendar actDate;
	private ActivityStatus status;
	
	public static int getStatusNumber(ActivityStatus status) {
		switch (status) {
		case Favorite:
			return 0;
		case Participative:
			return 1;
		case Signed:
			return 2;
		case Finished:
			return 3;
		case Quit:
			return 4;
		default:
			return -1;
		}
	}
	
	public static ActivityStatus getStatus(int num){
		switch (num) {
		case 0:
			return ActivityStatus.Favorite;
		case 1:
			return ActivityStatus.Participative;
		case 2:
			return ActivityStatus.Signed;
		case 3:
			return ActivityStatus.Finished;
		case 4:
			return ActivityStatus.Quit;
		}
		
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Organization getOrg1() {
		return org1;
	}

	public void setOrg1(Organization org1) {
		this.org1 = org1;
	}

	public Organization getOrg2() {
		return org2;
	}

	public void setOrg2(Organization org2) {
		this.org2 = org2;
	}

	public Organization getOrg3() {
		return org3;
	}

	public void setOrg3(Organization org3) {
		this.org3 = org3;
	}

	public boolean isEnsure1() {
		return ensure1;
	}

	public void setEnsure1(boolean ensure1) {
		this.ensure1 = ensure1;
	}

	public boolean isEnsure2() {
		return ensure2;
	}

	public void setEnsure2(boolean ensure2) {
		this.ensure2 = ensure2;
	}

	public boolean isEnsure3() {
		return ensure3;
	}

	public void setEnsure3(boolean ensure3) {
		this.ensure3 = ensure3;
	}

	public Calendar getValidity() {
		return validity;
	}

	public void setValidity(Calendar validity) {
		this.validity = validity;
	}

	public Locations getLocation() {
		return location;
	}

	public void setLocation(Locations location) {
		this.location = location;
	}

	public String getAbstracts() {
		return abstracts;
	}

	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}

	public Calendar getActDate() {
		return actDate;
	}

	public void setActDate(Calendar actDate) {
		this.actDate = actDate;
	}

	public ActivityStatus getStatus() {
		return status;
	}

	public void setStatus(ActivityStatus status) {
		this.status = status;
	}
}
