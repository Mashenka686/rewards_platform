@id_Test
Feature: Validate id

#Scenario:
# 	Given As an Automation tester I should be able to open "QMAD" file from "./src/test/resources/rewards_platform/test_data/MockData-QMAD.csv"
# 	Then The file should contain lms_id data
# 	And lms_id should be in the following format xxxxxxxx-xxxx-xxxx-xxxxxxxxxxxx
# 	And cms_id should be in the following format xxxxxxxx-xxxx-xxxx-xxxxxxxxxxxx
 
#Scenario:
# 	Given As an Automation tester I should be able to open "QMPA" file from "./src/test/resources/rewards_platform/test_data/MockData-QMPA.csv"
# 	Then The file should contain lms_id data
# 	And lms_id should be in the following format xxxxxxxx-xxxx-xxxx-xxxxxxxxxxxx	

 #Scenario:
 #   Given As an Automation tester I should be able to open "QMPA" file from "./src/test/resources/rewards_platform/test_data/MockData-QMPA.csv"
 #	Then The file should contain lms_id data
 #	And lms_id should contain only letters, numbers or highfin symbol
 	
# Scenario:
#    Given As an Automation tester I should be able to open "QMPA" file from "./src/test/resources/rewards_platform/test_data/MockData-QMPA.csv"
# 	Then The file should contain lms_id data
# 	And lms_id should be unique for each row
 	
 Scenario:
    Given As an Automation tester I should be able to open "QMPA" file from "./src/test/resources/rewards_platform/test_data/MockData-QMPA.csv"
 	Then The file should contain lms_id data
 	And lms_id should not contain null