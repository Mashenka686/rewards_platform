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
	private List<QMADModelToCreate> QMAD;
	private List<QMXRModelToCreate> QMXR;

	 private static FileWriter fileWriter;
	 
	 void createMockModelQMPA(List<String> header, String fileName, int numberOfRows){
		try {
			QMPA = new ArrayList<QMPAModelToCreate>();

			int n = numberOfRows;
			for (int i = 0; i < n; i++) {
				QMPA.add(new QMPAModelToCreate());
			}
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
	 void createMockModelQMXR(List<String> header, String fileName, int numberOfRows){
			try {
				QMXR = new ArrayList<QMXRModelToCreate>();

				int n = numberOfRows;
				for (int i = 0; i < n; i++) {
					QMXR.add(new QMXRModelToCreate());
				}
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
	 void createMockModelQMAD(List<String> header, String fileName, int numberOfRows){
			try {
				QMAD = new ArrayList<QMADModelToCreate>();

				int n = numberOfRows;
				for (int i = 0; i < n; i++) {
					QMAD.add(new QMADModelToCreate());
				}
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
			
		CreateNewMockCSVFile create = new CreateNewMockCSVFile();
		create.createMockModelQMPA(Header.getQMPAHeader(), "BratanItIsWorking", 100);
		
	}
}
