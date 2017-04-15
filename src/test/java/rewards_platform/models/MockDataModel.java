package rewards_platform.models;

public class MockDataModel {

	private String cms_id;
	private String id;
	private String ts2_id;
	private String lms_id;
	private String rewards_balance;
	private String status;
	private String enroll_date;
	private String cancel_date;
	
	public MockDataModel(String[] mockData, String sheetName) {
		
			sheetName=sheetName.toUpperCase().trim();
			
			switch (sheetName) {
				case "QMPA":
					setId(mockData[0]);
					setLms_id(mockData[1]);
					setRewards_balance(mockData[2]);
					break;
				case "CREFX":
					setId(mockData[0]);
					setCms_id(mockData[1]);
					setTs2_id(mockData[2]);
					break;
				case "QMAD":
					setId(mockData[0]);
					setLms_id(mockData[1]);
					setCms_id(mockData[2]);
					setStatus(mockData[3]);
					setEnroll_date(mockData[4]);
					setCancel_date(mockData[5]);
					break;
				default:
					System.out.println("No such template exist, you need to create new one!");
					break;
			}
	}

	public String getCms_id() {
		return cms_id;
	}

	public void setCms_id(String cms_id) {
		this.cms_id = cms_id;
	}

	public String getTs2_id() {
		return ts2_id;
	}

	public void setTs2_id(String ts2_id) {
		this.ts2_id = ts2_id;
	}


	public String getLms_id() {
		return lms_id;
	}

	public void setLms_id(String lms_id) {
		this.lms_id = lms_id;
	}

	public String getRewards_balance() {
		return rewards_balance;
	}

	public void setRewards_balance(String rewards_balance) {
		this.rewards_balance = rewards_balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	

	public String getEnroll_date() {
		return enroll_date;
	}

	public void setEnroll_date(String enroll_date) {
		this.enroll_date = enroll_date;
	}

	public String getCancel_date() {
		return cancel_date;
	}

	public void setCancel_date(String cancel_date) {
		this.cancel_date = cancel_date;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
