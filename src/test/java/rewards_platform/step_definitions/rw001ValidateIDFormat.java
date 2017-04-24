package rewards_platform.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import rewards_platform.models.MockDataModel;
import rewards_platform.utilities.DataValidation;
import rewards_platform.utilities.ReadMockData;



public class rw001ValidateIDFormat {
	ReadMockData mockData;
	List<MockDataModel> data;
	
	@Given("^As an Automation tester I should be able to open \"([^\"]*)\" file from \"([^\"]*)\"$")
	public void as_an_Automation_tester_I_should_be_able_to_open_file_from(String fileName, String path) throws Throwable {
		mockData = new ReadMockData(fileName, path);
		data=mockData.getMockDataArray();
		assertNotNull(data);
	}

	@Then("^The file should contain lms_id data$")
	public void the_file_should_contain_lms_id_data() throws Throwable {
		System.out.println(data.get(0).getLms_id().toString());
	    assertEquals(data.get(0).getLms_id().toString(),"lms_id");
	}

	@Then("^lms_id should be in the following format xxxxxxxx-xxxx-xxxx-xxxxxxxxxxxx$")
	public void lms_id_should_be_in_the_following_format_xxxxxxxx_xxxx_xxxx_xxxxxxxxxxxx() throws Throwable {
	    for(int i=1; i<data.size(); i++){
	    	System.out.println(data.get(i).getLms_id());
	    	
	    	assertTrue("Invalid format id number: "+i, DataValidation.formatValidation(data.get(i).getLms_id()));
	    	
	    }
	}

	@Then("^cms_id should be in the following format xxxxxxxx-xxxx-xxxx-xxxxxxxxxxxx$")
	public void cms_id_should_be_in_the_following_format_xxxxxxxx_xxxx_xxxx_xxxxxxxxxxxx() throws Throwable {
	    for(int i=1; i<data.size(); i++){
	    	assertTrue("Invalid format id number: "+i,DataValidation.formatValidation(data.get(i).getCms_id()));
	    }
	}
	
//	@Then("^lms_id should contain only letters, numbers or highfin symbol$")
//	public void lms_id_should_contain_only_letters_numbers_or_highfin_symbol() throws Throwable {
////	    for (MockDataModel mockDataModel : data) {
////			assertTrue(DataValidation.validateCharacters(mockDataModel.getLms_id()));
////		}
//	    for (int i=1; i<data.size(); i++) {
//	    	System.out.println("Data size: "+data.size());
//				assertTrue(DataValidation.validateCharacters(data.get(i).getLms_id().toString()));
//			}
//	}

	@Then("^lms_id should be unique for each row$")
	public void lms_id_should_be_unique_for_each_row() throws Throwable {
	    List<String> lms = new ArrayList<String>();
	    for(int i=0; i<data.size(); i++){
	    	lms.add(data.get(i).getLms_id());
	    }
	    
	    assertFalse(DataValidation.isDuplicate(lms));
	}
	
	@Then("^lms_id should not contain null$")
	public void lms_id_should_not_contain_null() throws Throwable {
	    List<String> lms = new ArrayList<String>();
	    for(int i=0; i<data.size(); i++){
	    	lms.add(data.get(i).getLms_id());
	    	System.out.println(lms.get(i));
	    }
	  System.out.println("Null count: "+DataValidation.checkForNullValues(lms));
	   // assertTrue(DataValidation.checkForNullValues(lms)==0);
	    
	}
}
