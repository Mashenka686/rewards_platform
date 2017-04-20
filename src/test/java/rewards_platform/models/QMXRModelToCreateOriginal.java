package rewards_platform.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QMXRModelToCreateOriginal {
	
	public List<String> getQMXR(){
		List<String> mockData = new ArrayList<String>();
		mockData.add(getQMXR_RECORD());
		mockData.add(getQMXR_KEY());
		mockData.add(getQMXR_AR_KEY());
		mockData.add(getQMXR_KEY_CMS_REDEFINES_QMXR_AR_KEY());
		mockData.add(getQMXR_SOURCE());
		mockData.add(getQMXR_CMS_ORG());
		mockData.add(getQMXR_CMS_ACCT_NBR());
		mockData.add(getFILLER5());
		mockData.add(getQMXR_LMS_KEY());
		mockData.add(getQMXR_ORG());
		mockData.add(getQMXR_ACC());
		mockData.add(getQMXR_ADD_STATUS());	
		mockData.add(getQMXR_INT_STATUS());
		mockData.add(getQMXR_LAST_MAINT_OPER());
		mockData.add(getQMXR_LAST_MAINT_DATE());
		mockData.add(getQMXR_HI_HSBC_AREA());
		mockData.add(getQMXR_HI_GLOBAL_AREA_1());
		mockData.add(getQMXR_HI_GLOBAL_FILLER_1());
		mockData.add(getQMXR_HI_BUS_UNIT_AREA_1());
		mockData.add(getQMXR_HI_BUS_UNIT_FILLER_1());
		mockData.add(getQMXR_HI_REGIONAL_AREA_1());
		mockData.add(getQMXR_HI_REGIONAL_FILLER_1());
		
		
		return mockData;
	}

	
	public QMXRModelToCreateOriginal(String string) {
		
		setQMXR_RECORD(newId());
		setQMXR_KEY(newId());
		setQMXR_AR_KEY(newId());
		setQMXR_KEY_CMS_REDEFINES_QMXR_AR_KEY(newId());
		setQMXR_SOURCE(newId());
		setQMXR_CMS_ORG(newId());
		//setQMXR_CMS_ACCT_NBR(newId());
		setQMXR_CMS_ACCT_NBR(string);
		setFILLER5(newId());
		setQMXR_LMS_KEY(newId());
		setQMXR_ORG(newId());
		setQMXR_ACC(newId());
		setQMXR_ADD_STATUS(newId());
		setQMXR_INT_STATUS(newId());
		setQMXR_LAST_MAINT_OPER(newId());
		setQMXR_LAST_MAINT_DATE(newId());
		setQMXR_HI_HSBC_AREA(newId());
		setQMXR_HI_GLOBAL_AREA_1(newId());
		setQMXR_HI_GLOBAL_FILLER_1(newId());
		setQMXR_HI_BUS_UNIT_AREA_1(newId());
		setQMXR_HI_BUS_UNIT_FILLER_1(newId());
		setQMXR_HI_REGIONAL_AREA_1(newId());
		setQMXR_HI_REGIONAL_FILLER_1(newId());
	}
		
		//QMXR Data
		private String QMXR_RECORD;  
		private String QMXR_KEY;                           
		private String QMXR_AR_KEY;                       
		private String QMXR_KEY_CMS_REDEFINES_QMXR_AR_KEY;
		private String QMXR_SOURCE;                      
		private String QMXR_CMS_ORG;                     
		private String QMXR_CMS_ACCT_NBR;                
		private String FILLER5;                           
		private String QMXR_LMS_KEY;                      
		private String QMXR_ORG;                         
		private String QMXR_ACC;                        
		private String QMXR_ADD_STATUS;            
		private String QMXR_INT_STATUS;            
		private String QMXR_LAST_MAINT_OPER;       
		private String QMXR_LAST_MAINT_DATE;       
		private String QMXR_HI_HSBC_AREA;          
		private String QMXR_HI_GLOBAL_AREA_1;     
		private String QMXR_HI_GLOBAL_FILLER_1;  
		private String QMXR_HI_BUS_UNIT_AREA_1;  
		private String QMXR_HI_BUS_UNIT_FILLER_1;
		private String QMXR_HI_REGIONAL_AREA_1;   
		private String QMXR_HI_REGIONAL_FILLER_1;
		
		
		public static String newId() {
			UUID uuid = UUID.randomUUID();
			return uuid.toString();
		}
		
		
		
		public String getQMXR_RECORD() {
			return QMXR_RECORD;
		}
		public void setQMXR_RECORD(String qMXR_RECORD) {
			QMXR_RECORD = qMXR_RECORD;
		}
		public String getQMXR_KEY() {
			return QMXR_KEY;
		}
		public void setQMXR_KEY(String qMXR_KEY) {
			QMXR_KEY = qMXR_KEY;
		}
		public String getQMXR_AR_KEY() {
			return QMXR_AR_KEY;
		}
		public void setQMXR_AR_KEY(String qMXR_AR_KEY) {
			QMXR_AR_KEY = qMXR_AR_KEY;
		}
		public String getQMXR_KEY_CMS_REDEFINES_QMXR_AR_KEY() {
			return QMXR_KEY_CMS_REDEFINES_QMXR_AR_KEY;
		}
		public void setQMXR_KEY_CMS_REDEFINES_QMXR_AR_KEY(String qMXR_KEY_CMS_REDEFINES_QMXR_AR_KEY) {
			QMXR_KEY_CMS_REDEFINES_QMXR_AR_KEY = qMXR_KEY_CMS_REDEFINES_QMXR_AR_KEY;
		}
		public String getQMXR_SOURCE() {
			return QMXR_SOURCE;
		}
		public void setQMXR_SOURCE(String qMXR_SOURCE) {
			QMXR_SOURCE = qMXR_SOURCE;
		}
		public String getQMXR_CMS_ORG() {
			return QMXR_CMS_ORG;
		}
		public void setQMXR_CMS_ORG(String qMXR_CMS_ORG) {
			QMXR_CMS_ORG = qMXR_CMS_ORG;
		}
		public String getQMXR_CMS_ACCT_NBR() {
			return QMXR_CMS_ACCT_NBR;
		}
		public void setQMXR_CMS_ACCT_NBR(String qMXR_CMS_ACCT_NBR) {
			QMXR_CMS_ACCT_NBR = qMXR_CMS_ACCT_NBR;
		}
		public String getFILLER5() {
			return FILLER5;
		}
		public void setFILLER5(String fILLER5) {
			FILLER5 = fILLER5;
		}
		public String getQMXR_LMS_KEY() {
			return QMXR_LMS_KEY;
		}
		public void setQMXR_LMS_KEY(String qMXR_LMS_KEY) {
			QMXR_LMS_KEY = qMXR_LMS_KEY;
		}
		public String getQMXR_ORG() {
			return QMXR_ORG;
		}
		public void setQMXR_ORG(String qMXR_ORG) {
			QMXR_ORG = qMXR_ORG;
		}
		public String getQMXR_ACC() {
			return QMXR_ACC;
		}
		public void setQMXR_ACC(String qMXR_ACC) {
			QMXR_ACC = qMXR_ACC;
		}
		public String getQMXR_ADD_STATUS() {
			return QMXR_ADD_STATUS;
		}
		public void setQMXR_ADD_STATUS(String qMXR_ADD_STATUS) {
			QMXR_ADD_STATUS = qMXR_ADD_STATUS;
		}
		public String getQMXR_INT_STATUS() {
			return QMXR_INT_STATUS;
		}
		public void setQMXR_INT_STATUS(String qMXR_INT_STATUS) {
			QMXR_INT_STATUS = qMXR_INT_STATUS;
		}
		public String getQMXR_LAST_MAINT_OPER() {
			return QMXR_LAST_MAINT_OPER;
		}
		public void setQMXR_LAST_MAINT_OPER(String qMXR_LAST_MAINT_OPER) {
			QMXR_LAST_MAINT_OPER = qMXR_LAST_MAINT_OPER;
		}
		public String getQMXR_LAST_MAINT_DATE() {
			return QMXR_LAST_MAINT_DATE;
		}
		public void setQMXR_LAST_MAINT_DATE(String qMXR_LAST_MAINT_DATE) {
			QMXR_LAST_MAINT_DATE = qMXR_LAST_MAINT_DATE;
		}
		public String getQMXR_HI_HSBC_AREA() {
			return QMXR_HI_HSBC_AREA;
		}
		public void setQMXR_HI_HSBC_AREA(String qMXR_HI_HSBC_AREA) {
			QMXR_HI_HSBC_AREA = qMXR_HI_HSBC_AREA;
		}
		public String getQMXR_HI_GLOBAL_AREA_1() {
			return QMXR_HI_GLOBAL_AREA_1;
		}
		public void setQMXR_HI_GLOBAL_AREA_1(String qMXR_HI_GLOBAL_AREA_1) {
			QMXR_HI_GLOBAL_AREA_1 = qMXR_HI_GLOBAL_AREA_1;
		}
		public String getQMXR_HI_GLOBAL_FILLER_1() {
			return QMXR_HI_GLOBAL_FILLER_1;
		}
		public void setQMXR_HI_GLOBAL_FILLER_1(String qMXR_HI_GLOBAL_FILLER_1) {
			QMXR_HI_GLOBAL_FILLER_1 = qMXR_HI_GLOBAL_FILLER_1;
		}
		public String getQMXR_HI_BUS_UNIT_AREA_1() {
			return QMXR_HI_BUS_UNIT_AREA_1;
		}
		public void setQMXR_HI_BUS_UNIT_AREA_1(String qMXR_HI_BUS_UNIT_AREA_1) {
			QMXR_HI_BUS_UNIT_AREA_1 = qMXR_HI_BUS_UNIT_AREA_1;
		}
		public String getQMXR_HI_BUS_UNIT_FILLER_1() {
			return QMXR_HI_BUS_UNIT_FILLER_1;
		}
		public void setQMXR_HI_BUS_UNIT_FILLER_1(String qMXR_HI_BUS_UNIT_FILLER_1) {
			QMXR_HI_BUS_UNIT_FILLER_1 = qMXR_HI_BUS_UNIT_FILLER_1;
		}
		public String getQMXR_HI_REGIONAL_AREA_1() {
			return QMXR_HI_REGIONAL_AREA_1;
		}
		public void setQMXR_HI_REGIONAL_AREA_1(String qMXR_HI_REGIONAL_AREA_1) {
			QMXR_HI_REGIONAL_AREA_1 = qMXR_HI_REGIONAL_AREA_1;
		}
		public String getQMXR_HI_REGIONAL_FILLER_1() {
			return QMXR_HI_REGIONAL_FILLER_1;
		}
		public void setQMXR_HI_REGIONAL_FILLER_1(String qMXR_HI_REGIONAL_FILLER_1) {
			QMXR_HI_REGIONAL_FILLER_1 = qMXR_HI_REGIONAL_FILLER_1;
		}

		
		
	

}
