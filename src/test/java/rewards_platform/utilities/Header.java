package rewards_platform.utilities;

import java.util.ArrayList;
import java.util.List;

public class Header {
	static String path="./src/test/resources/rewards_platform/test_data/LMS File Record Layouts.xlsx";
	static String newPath="./src/test/resources/rewards_platform/test_data/QMPBRL.xlsx";
	static String sheetQMPA="QMPA";
	static String sheetQMAD="QMAD";
	static String sheetQMXR="QMXR";
	static String sheetQMPB="QMPB";
	
	public static List<String> getHeader(String sheet, int size){
		ExcelUtils.openExcelFile(path, sheet);
		List<String> list = new ArrayList<String>();
		for (int i=1; i<size; i++){
		String cell = ExcelUtils.getCellData(i, 1);
		list.add(cell.toString());
		}
		return list;
		
	}
	public static List<String> getQMPBHeader(int size){
		ExcelUtils.openExcelFile(newPath, "Sheet1");
		List<String> list = new ArrayList<String>();
		for (int i=4; i<size; i++){
		  String cell = ExcelUtils.getCellData(i, 4);
		  String fixedWidthCell = String.format("%30s", cell.trim());
		  list.add(fixedWidthCell);
		}
		  return list;
		
	}
	public static List<String> getQMPAHeader(){
		return getHeader(sheetQMPA, 115);
	}
	public static List<String> getQMADHeader(){
		return getHeader(sheetQMAD, 60);
	}
	public static List<String> getQMXRHeader(){
		return getHeader(sheetQMXR, 23);
	}
	public static List<String> getQMPBHeader(){
		return getQMPBHeader(12);
	}
}
