package rewards_platform.step_definitions;

import java.util.List;

import cucumber.api.java.en.Given;
import rewards_platform.utilities.CreateNewMockCSVFile;
import rewards_platform.utilities.Header;

public class GenerateQMPAFile {
	List<String> header;


	@Given("^As an Automation Engineer I should be able to create the header for my file$")
	public void as_an_Automation_Engineer_I_should_be_able_to_create_the_header_for_my_file() throws Throwable {
		header = Header.getQMPAHeader();
	}

	@Given("^I should be able to generate (\\d+) rows for the \"([^\"]*)\" file$")
	public void i_should_be_able_to_generate_rows_for_the_file(int numberOfRows, String fileName) throws Throwable {
		CreateNewMockCSVFile create = new CreateNewMockCSVFile();
		create.createMockModelQMPA(header, fileName, numberOfRows);
	}
}
