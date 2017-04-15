package rewards_platform.utilities;

import java.util.*;
import java.io.*;

public class CreateCSVFile {

	public static void main(String[] args) {
		
		String mockData_QMPA = "MockData-QMPA";
		String mockData_CRefX = "MockData-CRefX";
		String mockData_QMAD = "MockData-QMAD";

		String idHeader = "id";
		String cms_idHeader = "cms_id";
		String ts2_idHeader = "ts2_id";
		String rewards_balance = "rewards_balance";
		String lms_id = "lms_id";
		String enroll_date = "enroll_date";
		String cancel_date = "cancel_date";
		String status = "status";
		FileWriter fileWriter;
		try {

			// header
			List<String> headerQMPA = CreateMockData.createHeader(idHeader, lms_id, rewards_balance);
			List<String> headerCRefX = CreateMockData.createHeader(idHeader, cms_idHeader, ts2_idHeader);
			List<String> headerQMAD = CreateMockData.createHeader(idHeader, lms_id, cms_idHeader, status, enroll_date,
					cancel_date);
			// header

			List<CreateMockData> CRefX = new ArrayList<CreateMockData>();
			List<CreateMockData> QMPA = new ArrayList<CreateMockData>();
			List<CreateMockData> QMAD = new ArrayList<CreateMockData>();
			
			// to create as many rows as you want!
			int n = 900;
			for (int i = 0; i < n; i++) {
				CRefX.add(new CreateMockData("MOCKDATA-CREFX"));
				QMPA.add(new CreateMockData("MOCKDATA-QMPA"));
				QMAD.add(new CreateMockData("MOCKDATA-QMAD"));
			}
			
			
		
	//mockData_CRefX file
				fileWriter = new FileWriter("src//data/" + mockData_CRefX + ".csv");
				// add header
				CSVUtils.writeLine(fileWriter, headerCRefX, ',', '"');

				// to print rows
				int i = 1;
				for (CreateMockData mockData : CRefX) {
					List<String> mockDataS = new ArrayList<String>();
					mockDataS.add(String.valueOf(i));
					mockDataS.add(mockData.getCms_id());
					mockDataS.add(mockData.getTs2_id());
					CSVUtils.writeLine(fileWriter, mockDataS, ',', '"');
					i++;
					System.out.println(CreateMockData.isDuplicate(mockDataS));
				}
				List<String> mockDataBeta = new ArrayList<String>();
				mockDataBeta.add("mouse");
				mockDataBeta.add("dog");
				mockDataBeta.add("dog");
				System.out.println("Beta: "+CreateMockData.isDuplicate(mockDataBeta));
				
				fileWriter.flush();
				fileWriter.close();

	//mockData_QMAD			
				fileWriter = new FileWriter("src//data/" + mockData_QMAD + ".csv");
				// add header
				CSVUtils.writeLine(fileWriter, headerQMAD, ',', '"');

				// to print rows
				i = 1;
				for(int k=0; k<QMAD.size(); k++){
					List<String> mockDataS = new ArrayList<String>();
					mockDataS.add(String.valueOf(i));
					mockDataS.add(QMAD.get(k).getLms_id());
					mockDataS.add(CRefX.get(k).getCms_id());
					mockDataS.add(QMAD.get(k).getStatus());
					mockDataS.add(QMAD.get(k).getEnroll_date());
					mockDataS.add(QMAD.get(k).getCancel_date());
					CSVUtils.writeLine(fileWriter, mockDataS, ',', '"');
					i++;
				}
				
				fileWriter.flush();
				fileWriter.close();

//mockData_QMPA			
				fileWriter = new FileWriter("src//data/" + mockData_QMPA + ".csv");
				// add header
				CSVUtils.writeLine(fileWriter, headerQMPA, ',', '"');

				// to print rows
				i = 1;
				for(int k=0; k<QMPA.size(); k++){
					List<String> mockDataS = new ArrayList<String>();
					mockDataS.add(String.valueOf(i));
					mockDataS.add(QMAD.get(k).getLms_id());
					mockDataS.add(String.valueOf(QMPA.get(k).getRewards_balance()));

					CSVUtils.writeLine(fileWriter, mockDataS, ',', '"');
					i++;
				}
		
			fileWriter.flush();
			fileWriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
