package rewards_platform.step_definitions;

import cucumber.api.java.en.Given;
import rewards_platform.utilities.CreateMockDataCSV_02;


public class GenerateFourTestDataFilesStepDefs {
	CreateMockDataCSV_02 newTextFiles;
	@Given("^As an Automation Engineer I should be able to create the header for all four files$")
	public void as_an_Automation_Engineer_I_should_be_able_to_create_the_header_for_all_four_files() throws Throwable {
	    //
	}

	@Given("^I should be able to generate (\\d+) rows for each  \"([^\"]*)\" file that will look nice when open as Text Editor$")
	public void i_should_be_able_to_generate_rows_for_each_file_that_will_look_nice_when_open_as_Text_Editor(int numberOfRows, String fileName) throws Throwable {
		newTextFiles = new CreateMockDataCSV_02(numberOfRows,fileName);
	}
}
