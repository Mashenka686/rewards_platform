package rewards_platform.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CreateMockData {
	private String cms_id;
	private int id;
	private String ts2_id;
	private String lms_id;
	private int rewards_balance;
	private String status;
	private String enroll_date;
	private String cancel_date;
	
	public CreateMockData(String worksheetName) {
		worksheetName=worksheetName.toUpperCase().trim();
		switch (worksheetName) {
		case "MOCKDATA-QMPA":
			setLms_id(newId());
			setRewards_balance(generateBalance());
			break;
		case "MOCKDATA-CREFX":
		   setCms_id(newId());
		   setTs2_id(newId());
		break;
		case "MOCKDATA-QMAD":
			setLms_id(newId());
			setCms_id(newId());
			setStatus(generateStatus());
			setEnroll_date(generateDateWithLowerUpperBound(2010, 2000));
			setCancel_date(generateDateWithLowerUpperBound(2017, 2010));
			break;
		default:
			System.out.println("No such worksheet exist!!!!");
			break;
		}
	}

	//to create header
	public static List<String> createHeader(String id, String id2, String id3){
		List<String> header = new ArrayList<String>();
		header.add(id);
		header.add(id2);
		header.add(id3);
		return header;
	}
	public static List<String> createHeader(String id, String id2, String id3, String id4, String id5, String id6){
		List<String> header = new ArrayList<String>();
		header.add(id);
		header.add(id2);
		header.add(id3);
		header.add(id4);
		header.add(id5);
		header.add(id6);
		return header;
	}

	// to generate new id
	public static String newId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
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

	public int getRewards_balance() {
		return rewards_balance;
	}

	public void setRewards_balance(int rewards_balance) {
		this.rewards_balance = rewards_balance;
	}
	
	public int generateBalance(){
		return (int) (1+(Math.random()*(1001-2)+1));
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static String generateDateWithLowerUpperBound(int maxYear, int minYear){
		return String.valueOf((int)(1+((Math.random()*(12-2)+1))))+"/"+String.valueOf((int)(1+((Math.random()*(30-2)+1))))+"/"+String.valueOf((int)(minYear+((Math.random())*((maxYear-minYear)+1))));
	}
	public static String generateStatus(){
		String[] status = {"Turquoise","Red","Teal","Maroon","Crimson",
				"Orange","Green","Khaki","Fuschia","Puce","Blue","Violet","Aquamarine",
				"Mauv","Goldenrod","Yellow","Indigo","Purple","Pink"};
		int length = status.length;
		int random = (int) (1+(Math.random()*(length-2)+1));
		return status[random];
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
	
	public static boolean isDuplicate(List<String> list){
		String temp=list.get(0);
		int n=0;
		for (String element : list) {
			
			for (int i=0; i<list.size(); i++){
				temp=list.get(i);
				if(n!=i){
			if(element.equals(temp)){
				return true;
			}
				}
			}
			n++;
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
