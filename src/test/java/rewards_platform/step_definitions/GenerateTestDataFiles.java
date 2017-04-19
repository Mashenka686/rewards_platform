package rewards_platform.step_definitions;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.en.Given;
import rewards_platform.models.QMADModelToCreate;
import rewards_platform.models.QMPAModelToCreate;
import rewards_platform.utilities.CreateNewMockCSVFile;
import rewards_platform.utilities.CreateNewMockCSVFileNiceTextEditorFormat;
import rewards_platform.utilities.DataValidation;
import rewards_platform.utilities.Header;

public class GenerateTestDataFiles {
	List<String> header;
	CreateNewMockCSVFile newFiles;
	CreateNewMockCSVFileNiceTextEditorFormat newTextFiles;

	@Given("^As an Automation Engineer I should be able to create the header for my file$")
	public void as_an_Automation_Engineer_I_should_be_able_to_create_the_header_for_my_file() throws Throwable {
		header = Header.getQMPAHeader();
	}

	@Given("^I should be able to generate (\\d+) rows for the \"([^\"]*)\" file$")
	public void i_should_be_able_to_generate_rows_for_the_file(int numberOfRows, String fileName) throws Throwable {
		newFiles = new CreateNewMockCSVFile(numberOfRows, fileName);
		
	}
	
	@Given("^Account ID in both QMPA and QMAD should be the same$")
	public void account_ID_in_both_QMPA_and_QMAD_should_be_the_same() throws Throwable {
		List<String> idFromQMPA = new ArrayList<String>();
		List<String> idFromQMAD = new ArrayList<String>();
		List<QMADModelToCreate> QMAD=newFiles.getQMAD();
		List<QMPAModelToCreate> QMPA=newFiles.getQMPA();
		for (int i=0; i<QMAD.size(); i++) {
			idFromQMPA.add(QMPA.get(i).getQMPA_ACCT());
			System.out.println(QMPA.get(i).getQMPA_ACCT());
			idFromQMAD.add(QMAD.get(i).getQMAD_ACCT());
			System.out.println(QMAD.get(i).getQMAD_ACCT());
		}
		assertTrue(DataValidation.containsAllIDs(idFromQMPA, idFromQMAD));
	}
	
	@Given("^I should be able to generate (\\d+) rows for the \"([^\"]*)\" file that will look nice when open as Text Editor$")
	public void i_should_be_able_to_generate_rows_for_the_file_that_will_look_nice_when_open_as_Text_Editor(int numberOfRows, String fileName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		newTextFiles = new CreateNewMockCSVFileNiceTextEditorFormat(numberOfRows, fileName);
	}
}
