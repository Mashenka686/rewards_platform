package rewards_platform.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import rewards_platform.models.MockDataModel;

public class ReadMockData {

	private String path;
	private String[] sheetData;
	int numberOfLines;
	
	
	private List<MockDataModel> fileDataRead = new ArrayList<MockDataModel>();

	public ReadMockData(String fileName, String path) {
		getDataFromFile(path);
		DataToList(fileName);
	}


	public void getDataFromFile(String path) {
		try {
			sheetData = OpenFile(path);
		} catch (IOException e) {
			System.out.println("Could not open the file.");
			System.out.println(e.getMessage());
		}
	}
	
	public String[] OpenFile(String path) throws IOException {

		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		numberOfLines = readLines(path);
		String[] textData = new String[numberOfLines];
		int i;
		for (i = 0; i < numberOfLines; i++) {
			textData[i] = textReader.readLine();
		}
		textReader.close();
		return textData;
	}
	
	public int readLines(String path) throws IOException {
		FileReader fileToRead = new FileReader(path);
		BufferedReader bf = new BufferedReader(fileToRead);

		int numberOfLines = 0;
		while ((bf.readLine()) != null) {
			numberOfLines++;
		}
		bf.close();
		return numberOfLines;
	}
	
	public void DataToList(String fileName) {
		for (String element : sheetData) {
			String dataRow = element;
			String[] temp = dataRow.split(",");
			
			for (int i=0; i<temp.length; i++) {
				temp[i]=temp[i].replace("\"", "");
			}
			MockDataModel mockData = new MockDataModel(temp, fileName);
			fileDataRead.add(mockData);
		}
	}
	
	public List<MockDataModel> getMockDataArray() {
		return fileDataRead;
	}

	public String[] getSheetData() {
		return sheetData;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
