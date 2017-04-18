package rewards_platform.utilities;

import java.util.*;

import rewards_platform.models.QMADModelToCreate;
import rewards_platform.models.QMPAModelToCreate;
import rewards_platform.models.QMXRModelToCreate;

import java.io.*;
/**
 * This class will generate new csv file with headers and random ID for each column with n numbers of rows */

public class CreateNewMockCSVFile {
	
	private List<QMPAModelToCreate> QMPA;
	public List<QMPAModelToCreate> getQMPA() {
		return QMPA;
	}
	public List<QMADModelToCreate> getQMAD() {
		return QMAD;
	}
	public List<QMXRModelToCreate> getQMXR() {
		return QMXR;
	}

	private List<QMADModelToCreate> QMAD;
	private List<QMXRModelToCreate> QMXR;

	 private static FileWriter fileWriter;
	 
	 
	 public void generateRows(int numberOfRows){
		 
			QMPA = new ArrayList<QMPAModelToCreate>();
			QMXR = new ArrayList<QMXRModelToCreate>();
			QMAD = new ArrayList<QMADModelToCreate>();
			for (int i = 0; i < numberOfRows; i++) {
				QMAD.add(new QMADModelToCreate());
			}
			for (int i = 0; i < numberOfRows; i++) {
				QMPA.add(new QMPAModelToCreate(QMAD.get(i).getQMAD_ACCT()));
				QMXR.add(new QMXRModelToCreate());
			
			}
			

	 }
	 public CreateNewMockCSVFile(int numberOfRows, String fileName){	 
		 generateRows(numberOfRows);		
		 createMockModelQMAD(Header.getQMADHeader(), fileName+"QMAD");
		 createMockModelQMPA(Header.getQMPAHeader(),fileName+"QMPA", numberOfRows);
		 createMockModelQMXR(Header.getQMXRHeader(), fileName+"QMXR");	 
	 }
	 
	 public void createMockModelQMPA(List<String> header, String fileName, int numberOfRows){
		try {
				fileWriter = new FileWriter("./src/test/resources/rewards_platform/test_data/"+fileName+".csv");
				CSVUtils.writeLine(fileWriter, header, ',', '"');
				
					
					for (QMPAModelToCreate mockData : QMPA) {
						List<String> mockDataS = new ArrayList<String>();
						mockDataS=mockData.getQMPA();
						
					CSVUtils.writeLine(fileWriter, mockDataS, ',', '"');
				}
			
				fileWriter.flush();
				fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 void createMockModelQMXR(List<String> header, String fileName){
			try {

					fileWriter = new FileWriter("./src/test/resources/rewards_platform/test_data/"+fileName+".csv");
					CSVUtils.writeLine(fileWriter, header, ',', '"');

					for (QMXRModelToCreate mockData : QMXR) {
						List<String> mockDataS = new ArrayList<String>();
						mockDataS=mockData.getQMXR();
						CSVUtils.writeLine(fileWriter, mockDataS, ',', '"');
					}
				
					fileWriter.flush();
					fileWriter.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 void createMockModelQMAD(List<String> header, String fileName){
			try {

					fileWriter = new FileWriter("./src/test/resources/rewards_platform/test_data/"+fileName+".csv");
					CSVUtils.writeLine(fileWriter, header, ',', '"');

					for (QMADModelToCreate mockData : QMAD) {
						List<String> mockDataS = new ArrayList<String>();
						mockDataS=mockData.getQMAD();
						CSVUtils.writeLine(fileWriter, mockDataS, ',', '"');
					}
				
					fileWriter.flush();
					fileWriter.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	public static void main(String[] args) {
			
		CreateNewMockCSVFile create = new CreateNewMockCSVFile(10, "TestData02");
		
		
	}
}
