package rewards_platform.models;


import java.util.*;


public class QMPAModelToCreate {
	
	public List<String> getQMPA(){
		List<String> mockData = new ArrayList<String>();
		mockData.add(getQMPA_RECORD());
		mockData.add(getQMPA_KEY());
		mockData.add(getQMPA_KEY_ORG_ACCT());
		mockData.add(getQMPA_ORG());
		mockData.add(getQMPA_ACCT());
		mockData.add(getQMPA_SCHEME_ID());
		mockData.add(getQMPA_ADD_STATUS());
		mockData.add(getQMPA_INT_STATUS());
		mockData.add(getQMPA_LAST_MAINT_OPER());
		mockData.add(getQMPA_LAST_MAINT_DATE());
		mockData.add(getQMPA_SERVICE_FLAG());
		mockData.add(getQMPA_AUTO_DISB_FLAG());	
		mockData.add(getQMPA_AUTO_DISB_LAST_DATE());
		mockData.add(getQMPA_AUTO_DISB_ACCT());
		mockData.add(getQMPA_BLOCK_CODE_1());
		mockData.add(getQMPA_ROLLUP_LAST_DATE());
		mockData.add(getQMPA_OUTSTANDING_REDEMPTION());
		mockData.add(getQMPA_ACTV_LAST_DATE());
		mockData.add(getQMPA_ACTV_NEXT_DATE());
		mockData.add(getQMPA_CTD());
		mockData.add(getFILLER_REDEFINES_QMPA_CTD());
		mockData.add(getQMPA_CTD_PTS_EARNED());
		mockData.add(getQMPA_CTD_PTS_BOUGHT());
		mockData.add(getQMPA_CTD_PTS_BONUS());
		mockData.add(getQMPA_CTD_PTS_REDEEMED());
		mockData.add(getQMPA_CTD_PTS_CLOSED());
		mockData.add(getQMPA_CTD_PTS_EXPIRED());
		mockData.add(getQMPA_CTD_PTS_ADJUST_IN());
		mockData.add(getQMPA_CTD_PTS_ADJUST_OUT());
		mockData.add(getQMPA_CLEAR_CTD_FLAG());
		mockData.add(getQMPA_CTD_SPEND_EARNED());
		mockData.add(getQMPA_LTD());
		mockData.add(getFILLER_REDEFINES_QMPA_LTD());
		mockData.add(getQMPA_LTD_PTS_EARNED());
		mockData.add(getQMPA_LTD_PTS_BOUGHT());
		mockData.add(getQMPA_LTD_PTS_BONUS());
		mockData.add(getQMPA_LTD_PTS_REDEEMED());
		mockData.add(getQMPA_LTD_PTS_CLOSED());
		mockData.add(getQMPA_LTD_PTS_EXPIRED());
		mockData.add(getQMPA_LTD_PTS_ADJUST_IN());
		mockData.add(getQMPA_LTD_PTS_ADJUST_OUT());
		mockData.add(getQMPA_YTD_SPEND_EARNED());
		mockData.add(getQMPA_LTD_PTS_DISBURSED());
		mockData.add(getQMPA_STMT_DTLS());
		mockData.add(getQMPA_STMT_MONTH_FREQ());
		mockData.add(getQMPA_STMT_DAY_OF_MONTH());
		mockData.add(getQMPA_LAST_STMT_DATE());
		mockData.add(getQMPA_NEXT_STMT_DATE());
		mockData.add(getQMPA_DATE_OPENED());
		mockData.add(getQMPA_DATE_LAST_ACTIVE());
		mockData.add(getQMPA_FIRST_USAGE_SWITCH());
		mockData.add(getQMPA_ACCT_OPEN_SWITCH());
		mockData.add(getQMPA_BLOCK_CODE_MODE());
		mockData.add(getQMPA_DELINQUENCY_MODE());
		mockData.add(getQMPA_DISBURSE_PACKET_POINTS());
		mockData.add(getQMPA_AUTO_DISB_FREQ());
		mockData.add(getQMPA_AUTO_DISB_DAY_OF_MONTH());
		mockData.add(getQMPA_AUTO_DISB_IND());
		mockData.add(getQMPA_PREV_STMT_MONTH_FREQ());
		mockData.add(getQMPA_AUTO_DISB_DBA_NAME());
		mockData.add(getQMPA_STATUS_CHANGE_DATE());
		mockData.add(getQMPA_START_DISBURSE_DATE());
		mockData.add(getQMPA_REWARDS_CATEGORY());
		mockData.add(getQMPA_AUTO_DISB_THRESHOLD());
		mockData.add(getQMPA_ENROLLMENT_CHANNEL());
		mockData.add(getQMPA_PURGE_DATE());
		mockData.add(getQMPA_WAIVE_MEMB_FEE());
		mockData.add(getQMPA_DEFER_MEMB_FEE_DTE());
		mockData.add(getQMPA_NEXT_MEMB_FEE_DTE());
		mockData.add(getQMPA_NEXT_MEMB_FEE_AMT());
		mockData.add(getQMPA_REDMPT_CHNL_CT());
		mockData.add(getQMPA_AR_OPEN_DATE());
		mockData.add(getQMPA_ENROLL_CHNL_SWITCH());
		mockData.add(getQMPA_MTD());
		mockData.add(getFILLER_REDEFINES_QMPA_MTD());
		mockData.add(getQMPA_MTD_PTS_EARNED());
		mockData.add(getQMPA_MTD_PTS_BOUGHT());
		mockData.add(getQMPA_MTD_PTS_BONUS());
		mockData.add(getQMPA_MTD_PTS_REDEEMED());
		mockData.add(getQMPA_MTD_PTS_CLOSED());
		mockData.add(getQMPA_MTD_PTS_EXPIRED());
		mockData.add(getQMPA_MTD_PTS_ADJUST_IN());
		mockData.add(getQMPA_MTD_PTS_ADJUST_OUT());
		mockData.add(getQMPA_CLEAR_MTD_FLAG());
		mockData.add(getQMPA_CLEAR_YTD_FLAG());
		mockData.add(getQMPA_NEXT_ANNIV_DATE());
		mockData.add(getQMPA_TODAY_HH_ACTIVITY());
		mockData.add(getQMPA_LTD_PTS_TOTAL());
		mockData.add(getQMPA_LMS_FIRST_USAGE_SWITCH());
		mockData.add(getQMPA_HI_XFR_STATUS());
		mockData.add(getQMPA_HI_XFR_OUT_DATE());
		mockData.add(getQMPA_HI_HSBC_AREA());
		mockData.add(getQMPA_HI_GLOBAL_AREA_1());
		mockData.add(getQMPA_FEE_FLAG());
		mockData.add(getQMPA_GLBL_SEC_WI_MEMB_FLAG());
		mockData.add(getQMPA_GLBL_AUT_WI_MEMB_FLAG());
		mockData.add(getQMPA_GLBL_ROLLED_MEM_FEE_AMT());
		mockData.add(getQMPA_GLBL_SEC_CARD_COUNT());
		mockData.add(getQMPA_GLBL_AUTH_CARD_COUNT());
		mockData.add(getQMPA_GLBL_MEMB_ID());
		mockData.add(getQMPA_GLBL_DISB_POINTS());
		mockData.add(getQMPA_HI_MAX_DISB_THRESHOLD());
		mockData.add(getQMPA_GLBL_AUTO_DISB_PROD());
		mockData.add(getQMPA_HI_AUTO_DISB_PNTS_FWD());
		mockData.add(getQMPA_HI_CLEAR_AD_FLAG());
		mockData.add(getFILLER());
		mockData.add(getQMPA_HI_DE_ENROLL_CHANNEL());
		mockData.add(getQMPA_HI_TYPE_OF_DISBURSE_IND());
		mockData.add(getQMPA_HI_PROC_REDEMPTION_IND());
		mockData.add(getQMPA_HI_GLOBAL_FILLER_1());
		mockData.add(getQMPA_HI_REGIONAL_AREA_1());
		mockData.add(getQMPA_HI_REGIONAL_FILLER_1());
		mockData.add(getQMPA_HI_BUS_UNIT_AREA_1());
		mockData.add(getQMPA_HI_BUS_UNIT_FILLER_1());
		
		
		return mockData;
	}
	
	public QMPAModelToCreate(String string) {
	
			setQMPA_RECORD(newId());
			setQMPA_KEY(newId());
			setQMPA_KEY_ORG_ACCT(newId());
			setQMPA_ORG(newId());
			setQMPA_ACCT(string);
			setQMPA_SCHEME_ID(newId());
			setQMPA_ADD_STATUS(newId());
			setQMPA_INT_STATUS(newId());
			setQMPA_LAST_MAINT_OPER(newId());
			setQMPA_LAST_MAINT_DATE(newId());
			setQMPA_SERVICE_FLAG(newId());
			setQMPA_AUTO_DISB_FLAG(newId());
			setQMPA_AUTO_DISB_LAST_DATE(newId());
			setQMPA_AUTO_DISB_ACCT(newId());
			setQMPA_BLOCK_CODE_1(newId());
			setQMPA_ROLLUP_LAST_DATE(newId());
			setQMPA_OUTSTANDING_REDEMPTION(newId());
			setQMPA_ACTV_LAST_DATE(newId());
			setQMPA_ACTV_NEXT_DATE(newId());
			setQMPA_CTD(newId());
		    setFILLER_REDEFINES_QMPA_CTD(newId());
		    setQMPA_CTD_PTS_EARNED(generateRandomNumber());
		    setQMPA_CTD_PTS_BOUGHT(generateRandomNumber());
		    setQMPA_CTD_PTS_BONUS(generateRandomNumber());
		    setQMPA_CTD_PTS_REDEEMED(generateRandomNumber());
		    setQMPA_CTD_PTS_CLOSED(generateRandomNumber());
		    setQMPA_CTD_PTS_EXPIRED(generateRandomNumber());
		    setQMPA_CTD_PTS_ADJUST_IN(generateRandomNumber());
		    setQMPA_CTD_PTS_ADJUST_OUT(generateRandomNumber());
		    setQMPA_CLEAR_CTD_FLAG(newId());
		    setQMPA_CTD_SPEND_EARNED(newId());
		    setQMPA_LTD(newId());
		    setFILLER_REDEFINES_QMPA_LTD(newId());
		    setQMPA_LTD_PTS_EARNED(generateRandomNumber());
		    setQMPA_LTD_PTS_BOUGHT(generateRandomNumber());
		    setQMPA_LTD_PTS_BONUS(generateRandomNumber());
		    setQMPA_LTD_PTS_REDEEMED(generateRandomNumber());
		    setQMPA_LTD_PTS_CLOSED(generateRandomNumber());
		    setQMPA_LTD_PTS_EXPIRED(generateRandomNumber());
		    setQMPA_LTD_PTS_ADJUST_IN(generateRandomNumber());
		    setQMPA_LTD_PTS_ADJUST_OUT(generateRandomNumber());
		    setQMPA_YTD_SPEND_EARNED(newId());
		    setQMPA_LTD_PTS_DISBURSED(newId());
		    setQMPA_STMT_DTLS(newId());
		    setQMPA_STMT_MONTH_FREQ(newId());
		    setQMPA_STMT_DAY_OF_MONTH(newId());
		    setQMPA_LAST_STMT_DATE(generateDateWithLowerUpperBound(2017,2000));
		    setQMPA_NEXT_STMT_DATE(generateDateWithLowerUpperBound(2017,2000));
		    setQMPA_DATE_OPENED(newId());
		    setQMPA_DATE_LAST_ACTIVE(newId());
		    setQMPA_FIRST_USAGE_SWITCH(newId());
		    setQMPA_ACCT_OPEN_SWITCH(newId());
		    setQMPA_BLOCK_CODE_MODE(newId());
		    setQMPA_DELINQUENCY_MODE(newId());
		    setQMPA_DISBURSE_PACKET_POINTS(newId());
		    setQMPA_AUTO_DISB_FREQ(newId());
		    setQMPA_AUTO_DISB_DAY_OF_MONTH(newId());
		    setQMPA_AUTO_DISB_IND(newId());
		    setQMPA_PREV_STMT_MONTH_FREQ(newId());
		    setQMPA_AUTO_DISB_DBA_NAME(newId());
		    setQMPA_STATUS_CHANGE_DATE(generateDateWithLowerUpperBound(2017,2000));
		    setQMPA_START_DISBURSE_DATE(generateDateWithLowerUpperBound(2017,2000));
		    setQMPA_REWARDS_CATEGORY(newId());
		    setQMPA_AUTO_DISB_THRESHOLD(newId());
		    setQMPA_ENROLLMENT_CHANNEL(newId());
		    setQMPA_PURGE_DATE(newId());
		    setQMPA_WAIVE_MEMB_FEE(newId());
		    setQMPA_DEFER_MEMB_FEE_DTE(newId());
		    setQMPA_NEXT_MEMB_FEE_DTE(newId());
		    setQMPA_NEXT_MEMB_FEE_AMT(newId());
		    setQMPA_REDMPT_CHNL_CT(newId());
		    setQMPA_AR_OPEN_DATE(generateDateWithLowerUpperBound(2017,2000));
		    setQMPA_ENROLL_CHNL_SWITCH(newId());
		    setQMPA_MTD(newId());
		    setFILLER_REDEFINES_QMPA_MTD(newId());
		    setQMPA_MTD_PTS_EARNED(generateRandomNumber());
		    setQMPA_MTD_PTS_BOUGHT(generateRandomNumber());
		    setQMPA_MTD_PTS_BONUS(generateRandomNumber());
		    setQMPA_MTD_PTS_REDEEMED(generateRandomNumber());
		    setQMPA_MTD_PTS_CLOSED(generateRandomNumber());
		    setQMPA_MTD_PTS_EXPIRED(generateRandomNumber());
		    setQMPA_MTD_PTS_ADJUST_IN(generateRandomNumber());
		    setQMPA_MTD_PTS_ADJUST_OUT(generateRandomNumber());
		    setQMPA_CLEAR_MTD_FLAG(newId());
		    setQMPA_CLEAR_YTD_FLAG(newId());
		    setQMPA_NEXT_ANNIV_DATE(generateDateWithLowerUpperBound(2017,2000));
		    setQMPA_TODAY_HH_ACTIVITY(newId());
		    setQMPA_LTD_PTS_TOTAL(newId());
		    setQMPA_LMS_FIRST_USAGE_SWITCH(newId());
		    setQMPA_HI_XFR_STATUS(newId());
		    setQMPA_HI_XFR_OUT_DATE(generateDateWithLowerUpperBound(2017,2000));
		    setQMPA_HI_HSBC_AREA(newId());
		    setQMPA_HI_GLOBAL_AREA_1(newId());
		    setQMPA_FEE_FLAG(newId());
		    setQMPA_GLBL_SEC_WI_MEMB_FLAG(newId());
		    setQMPA_GLBL_AUT_WI_MEMB_FLAG(newId());
		    setQMPA_GLBL_ROLLED_MEM_FEE_AMT(newId());
		    setQMPA_GLBL_SEC_CARD_COUNT(newId());
		    setQMPA_GLBL_AUTH_CARD_COUNT(newId());
		    setQMPA_GLBL_MEMB_ID(newId());
		    setQMPA_GLBL_DISB_POINTS(newId());
		    setQMPA_HI_MAX_DISB_THRESHOLD(newId());
		    setQMPA_GLBL_AUTO_DISB_PROD(newId());
		    setQMPA_HI_AUTO_DISB_PNTS_FWD(newId());
		    setQMPA_HI_CLEAR_AD_FLAG(newId());
		    setFILLER(newId());
		    setQMPA_HI_DE_ENROLL_CHANNEL(newId());
		    setQMPA_HI_TYPE_OF_DISBURSE_IND(newId());
		    setQMPA_HI_PROC_REDEMPTION_IND(newId());
		    setQMPA_HI_GLOBAL_FILLER_1(newId());
		    setQMPA_HI_REGIONAL_AREA_1(newId());
		    setQMPA_HI_REGIONAL_FILLER_1(newId());
		    setQMPA_HI_BUS_UNIT_AREA_1(newId());
		    setQMPA_HI_BUS_UNIT_FILLER_1(newId());
		    
	}
	
	//QMPA data
	private String QMPA_RECORD;
	private String QMPA_KEY;
	private String QMPA_KEY_ORG_ACCT;
	private String QMPA_ORG;
	private String QMPA_ACCT;
	private String QMPA_SCHEME_ID;
	private String QMPA_ADD_STATUS;
	private String QMPA_INT_STATUS;
	private String QMPA_LAST_MAINT_OPER;
	private String QMPA_LAST_MAINT_DATE;
	private String QMPA_SERVICE_FLAG;
	private String QMPA_AUTO_DISB_FLAG;
	private String QMPA_AUTO_DISB_LAST_DATE;
	private String QMPA_AUTO_DISB_ACCT; 
	private String QMPA_BLOCK_CODE_1;
	private String QMPA_ROLLUP_LAST_DATE;
	private String QMPA_OUTSTANDING_REDEMPTION;
	private String QMPA_ACTV_LAST_DATE;
	private String QMPA_ACTV_NEXT_DATE;
	private String QMPA_CTD;
	private String FILLER_REDEFINES_QMPA_CTD;
	private String QMPA_CTD_PTS_EARNED;
	private String QMPA_CTD_PTS_BOUGHT;
	private String QMPA_CTD_PTS_BONUS;
	private String QMPA_CTD_PTS_REDEEMED;
	private String QMPA_CTD_PTS_CLOSED;
	private String QMPA_CTD_PTS_EXPIRED;
	private String QMPA_CTD_PTS_ADJUST_IN;
	private String QMPA_CTD_PTS_ADJUST_OUT;
	private String QMPA_CLEAR_CTD_FLAG;
	private String QMPA_CTD_SPEND_EARNED;
	private String QMPA_LTD;
	private String FILLER_REDEFINES_QMPA_LTD;
	private String QMPA_LTD_PTS_EARNED;
	private String QMPA_LTD_PTS_BOUGHT;
	private String QMPA_LTD_PTS_BONUS;
	private String QMPA_LTD_PTS_REDEEMED;
	private String QMPA_LTD_PTS_CLOSED;
	private String QMPA_LTD_PTS_EXPIRED;
	private String QMPA_LTD_PTS_ADJUST_IN;
	private String QMPA_LTD_PTS_ADJUST_OUT;
	private String QMPA_YTD_SPEND_EARNED;
	private String QMPA_LTD_PTS_DISBURSED;
	private String QMPA_STMT_DTLS;
	private String QMPA_STMT_MONTH_FREQ;
	private String QMPA_STMT_DAY_OF_MONTH;
	private String QMPA_LAST_STMT_DATE;
	private String QMPA_NEXT_STMT_DATE;
	private String QMPA_DATE_OPENED;
	private String QMPA_DATE_LAST_ACTIVE;
	private String QMPA_FIRST_USAGE_SWITCH;
	private String QMPA_ACCT_OPEN_SWITCH;
	private String QMPA_BLOCK_CODE_MODE;
	private String QMPA_DELINQUENCY_MODE;
	private String QMPA_DISBURSE_PACKET_POINTS;
	private String QMPA_AUTO_DISB_FREQ;
	private String QMPA_AUTO_DISB_DAY_OF_MONTH;
	private String QMPA_AUTO_DISB_IND;
	private String QMPA_PREV_STMT_MONTH_FREQ;
	private String QMPA_AUTO_DISB_DBA_NAME;
	private String QMPA_STATUS_CHANGE_DATE;
	private String QMPA_START_DISBURSE_DATE;
	private String QMPA_REWARDS_CATEGORY;
	private String QMPA_AUTO_DISB_THRESHOLD;
	private String QMPA_ENROLLMENT_CHANNEL;
	private String QMPA_PURGE_DATE;
	private String QMPA_WAIVE_MEMB_FEE;
	private String QMPA_DEFER_MEMB_FEE_DTE;
	private String QMPA_NEXT_MEMB_FEE_DTE;
	private String QMPA_NEXT_MEMB_FEE_AMT;
	private String QMPA_REDMPT_CHNL_CT;
	private String QMPA_AR_OPEN_DATE;
	private String QMPA_ENROLL_CHNL_SWITCH;
	private String QMPA_MTD;
	private String FILLER_REDEFINES_QMPA_MTD;
	private String QMPA_MTD_PTS_EARNED;
	private String QMPA_MTD_PTS_BOUGHT;
	private String QMPA_MTD_PTS_BONUS;
	private String QMPA_MTD_PTS_REDEEMED;
	private String QMPA_MTD_PTS_CLOSED;
	private String QMPA_MTD_PTS_EXPIRED;
	private String QMPA_MTD_PTS_ADJUST_IN;
	private String QMPA_MTD_PTS_ADJUST_OUT;
	private String QMPA_CLEAR_MTD_FLAG;
	private String QMPA_CLEAR_YTD_FLAG;
	private String QMPA_NEXT_ANNIV_DATE;
	private String QMPA_TODAY_HH_ACTIVITY;
	private String QMPA_LTD_PTS_TOTAL;
	private String QMPA_LMS_FIRST_USAGE_SWITCH;
	private String QMPA_HI_XFR_STATUS;
	private String QMPA_HI_XFR_OUT_DATE;
	private String QMPA_HI_HSBC_AREA;
	private String QMPA_HI_GLOBAL_AREA_1;
	private String QMPA_FEE_FLAG;
	private String QMPA_GLBL_SEC_WI_MEMB_FLAG;
	private String QMPA_GLBL_AUT_WI_MEMB_FLAG;
	private String QMPA_GLBL_ROLLED_MEM_FEE_AMT;
	private String QMPA_GLBL_SEC_CARD_COUNT;
	private String QMPA_GLBL_AUTH_CARD_COUNT;
	private String QMPA_GLBL_MEMB_ID;
	private String QMPA_GLBL_DISB_POINTS;
	private String QMPA_HI_MAX_DISB_THRESHOLD;
	private String QMPA_GLBL_AUTO_DISB_PROD;
	private String QMPA_HI_AUTO_DISB_PNTS_FWD;
	private String QMPA_HI_CLEAR_AD_FLAG;
	private String FILLER;
	private String QMPA_HI_DE_ENROLL_CHANNEL;
	private String QMPA_HI_TYPE_OF_DISBURSE_IND;
	private String QMPA_HI_PROC_REDEMPTION_IND;
	private String QMPA_HI_GLOBAL_FILLER_1;
	private String QMPA_HI_REGIONAL_AREA_1;
	private String QMPA_HI_REGIONAL_FILLER_1;
	private String QMPA_HI_BUS_UNIT_AREA_1;
	private String QMPA_HI_BUS_UNIT_FILLER_1;
		

		// to generate new id
		public static String newId() {
			UUID uuid = UUID.randomUUID();
			return uuid.toString();
		}
		
		public String generateRandomNumber(){
			 
					
			Integer number =(int) (1+(Math.random()*(1001-2)+1));
					return number.toString();
		}
		public static String generateDateWithLowerUpperBound(int maxYear, int minYear){

			return String.valueOf((int)(1+((Math.random()*(12-2)+1))))+"/"+String.valueOf((int)(1+((Math.random()*(30-2)+1))))+"/"+String.valueOf((int)(minYear+((Math.random())*((maxYear-minYear)+1))));

			}
		
		public String getQMPA_RECORD() {
			return QMPA_RECORD;
		}

		public void setQMPA_RECORD(String qMPA_RECORD) {
			QMPA_RECORD = qMPA_RECORD;
		}

		public String getQMPA_KEY() {
			return QMPA_KEY;
		}

		public void setQMPA_KEY(String qMPA_KEY) {
			QMPA_KEY = qMPA_KEY;
		}

		public String getQMPA_KEY_ORG_ACCT() {
			return QMPA_KEY_ORG_ACCT;
		}

		public void setQMPA_KEY_ORG_ACCT(String qMPA_KEY_ORG_ACCT) {
			QMPA_KEY_ORG_ACCT = qMPA_KEY_ORG_ACCT;
		}

		public String getQMPA_ORG() {
			return QMPA_ORG;
		}

		public void setQMPA_ORG(String qMPA_ORG) {
			QMPA_ORG = qMPA_ORG;
		}

		public String getQMPA_ACCT() {
			return QMPA_ACCT;
		}

		public void setQMPA_ACCT(String qMPA_ACCT) {
			QMPA_ACCT = qMPA_ACCT;
		}

		public String getQMPA_SCHEME_ID() {
			return QMPA_SCHEME_ID;
		}

		public void setQMPA_SCHEME_ID(String qMPA_SCHEME_ID) {
			QMPA_SCHEME_ID = qMPA_SCHEME_ID;
		}

		public String getQMPA_ADD_STATUS() {
			return QMPA_ADD_STATUS;
		}

		public void setQMPA_ADD_STATUS(String qMPA_ADD_STATUS) {
			QMPA_ADD_STATUS = qMPA_ADD_STATUS;
		}

		public String getQMPA_INT_STATUS() {
			return QMPA_INT_STATUS;
		}

		public void setQMPA_INT_STATUS(String qMPA_INT_STATUS) {
			QMPA_INT_STATUS = qMPA_INT_STATUS;
		}

		public String getQMPA_LAST_MAINT_OPER() {
			return QMPA_LAST_MAINT_OPER;
		}

		public void setQMPA_LAST_MAINT_OPER(String qMPA_LAST_MAINT_OPER) {
			QMPA_LAST_MAINT_OPER = qMPA_LAST_MAINT_OPER;
		}

		public String getQMPA_LAST_MAINT_DATE() {
			return QMPA_LAST_MAINT_DATE;
		}

		public void setQMPA_LAST_MAINT_DATE(String qMPA_LAST_MAINT_DATE) {
			QMPA_LAST_MAINT_DATE = qMPA_LAST_MAINT_DATE;
		}

		public String getQMPA_SERVICE_FLAG() {
			return QMPA_SERVICE_FLAG;
		}

		public void setQMPA_SERVICE_FLAG(String qMPA_SERVICE_FLAG) {
			QMPA_SERVICE_FLAG = qMPA_SERVICE_FLAG;
		}

		public String getQMPA_AUTO_DISB_FLAG() {
			return QMPA_AUTO_DISB_FLAG;
		}

		public void setQMPA_AUTO_DISB_FLAG(String qMPA_AUTO_DISB_FLAG) {
			QMPA_AUTO_DISB_FLAG = qMPA_AUTO_DISB_FLAG;
		}

		public String getQMPA_AUTO_DISB_LAST_DATE() {
			return QMPA_AUTO_DISB_LAST_DATE;
		}

		public void setQMPA_AUTO_DISB_LAST_DATE(String qMPA_AUTO_DISB_LAST_DATE) {
			QMPA_AUTO_DISB_LAST_DATE = qMPA_AUTO_DISB_LAST_DATE;
		}

		public String getQMPA_AUTO_DISB_ACCT() {
			return QMPA_AUTO_DISB_ACCT;
		}

		public void setQMPA_AUTO_DISB_ACCT(String qMPA_AUTO_DISB_ACCT) {
			QMPA_AUTO_DISB_ACCT = qMPA_AUTO_DISB_ACCT;
		}

		public String getQMPA_BLOCK_CODE_1() {
			return QMPA_BLOCK_CODE_1;
		}

		public void setQMPA_BLOCK_CODE_1(String qMPA_BLOCK_CODE_1) {
			QMPA_BLOCK_CODE_1 = qMPA_BLOCK_CODE_1;
		}

		public String getQMPA_ROLLUP_LAST_DATE() {
			return QMPA_ROLLUP_LAST_DATE;
		}

		public void setQMPA_ROLLUP_LAST_DATE(String qMPA_ROLLUP_LAST_DATE) {
			QMPA_ROLLUP_LAST_DATE = qMPA_ROLLUP_LAST_DATE;
		}

		public String getQMPA_OUTSTANDING_REDEMPTION() {
			return QMPA_OUTSTANDING_REDEMPTION;
		}

		public void setQMPA_OUTSTANDING_REDEMPTION(String qMPA_OUTSTANDING_REDEMPTION) {
			QMPA_OUTSTANDING_REDEMPTION = qMPA_OUTSTANDING_REDEMPTION;
		}

		public String getQMPA_ACTV_LAST_DATE() {
			return QMPA_ACTV_LAST_DATE;
		}

		public void setQMPA_ACTV_LAST_DATE(String qMPA_ACTV_LAST_DATE) {
			QMPA_ACTV_LAST_DATE = qMPA_ACTV_LAST_DATE;
		}

		public String getQMPA_ACTV_NEXT_DATE() {
			return QMPA_ACTV_NEXT_DATE;
		}

		public void setQMPA_ACTV_NEXT_DATE(String qMPA_ACTV_NEXT_DATE) {
			QMPA_ACTV_NEXT_DATE = qMPA_ACTV_NEXT_DATE;
		}

		public String getQMPA_CTD() {
			return QMPA_CTD;
		}

		public void setQMPA_CTD(String qMPA_CTD) {
			QMPA_CTD = qMPA_CTD;
		}

		public String getFILLER_REDEFINES_QMPA_CTD() {
			return FILLER_REDEFINES_QMPA_CTD;
		}

		public void setFILLER_REDEFINES_QMPA_CTD(String fILLER_REDEFINES_QMPA_CTD) {
			FILLER_REDEFINES_QMPA_CTD = fILLER_REDEFINES_QMPA_CTD;
		}

		public String getQMPA_CTD_PTS_EARNED() {
			return QMPA_CTD_PTS_EARNED;
		}

		public void setQMPA_CTD_PTS_EARNED(String qMPA_CTD_PTS_EARNED) {
			QMPA_CTD_PTS_EARNED = qMPA_CTD_PTS_EARNED;
		}

		public String getQMPA_CTD_PTS_BOUGHT() {
			return QMPA_CTD_PTS_BOUGHT;
		}

		public void setQMPA_CTD_PTS_BOUGHT(String qMPA_CTD_PTS_BOUGHT) {
			QMPA_CTD_PTS_BOUGHT = qMPA_CTD_PTS_BOUGHT;
		}

		public String getQMPA_CTD_PTS_BONUS() {
			return QMPA_CTD_PTS_BONUS;
		}

		public void setQMPA_CTD_PTS_BONUS(String qMPA_CTD_PTS_BONUS) {
			QMPA_CTD_PTS_BONUS = qMPA_CTD_PTS_BONUS;
		}

		public String getQMPA_CTD_PTS_REDEEMED() {
			return QMPA_CTD_PTS_REDEEMED;
		}

		public void setQMPA_CTD_PTS_REDEEMED(String qMPA_CTD_PTS_REDEEMED) {
			QMPA_CTD_PTS_REDEEMED = qMPA_CTD_PTS_REDEEMED;
		}

		public String getQMPA_CTD_PTS_CLOSED() {
			return QMPA_CTD_PTS_CLOSED;
		}

		public void setQMPA_CTD_PTS_CLOSED(String qMPA_CTD_PTS_CLOSED) {
			QMPA_CTD_PTS_CLOSED = qMPA_CTD_PTS_CLOSED;
		}

		public String getQMPA_CTD_PTS_EXPIRED() {
			return QMPA_CTD_PTS_EXPIRED;
		}

		public void setQMPA_CTD_PTS_EXPIRED(String qMPA_CTD_PTS_EXPIRED) {
			QMPA_CTD_PTS_EXPIRED = qMPA_CTD_PTS_EXPIRED;
		}

		public String getQMPA_CTD_PTS_ADJUST_IN() {
			return QMPA_CTD_PTS_ADJUST_IN;
		}

		public void setQMPA_CTD_PTS_ADJUST_IN(String qMPA_CTD_PTS_ADJUST_IN) {
			QMPA_CTD_PTS_ADJUST_IN = qMPA_CTD_PTS_ADJUST_IN;
		}

		public String getQMPA_CTD_PTS_ADJUST_OUT() {
			return QMPA_CTD_PTS_ADJUST_OUT;
		}

		public void setQMPA_CTD_PTS_ADJUST_OUT(String qMPA_CTD_PTS_ADJUST_OUT) {
			QMPA_CTD_PTS_ADJUST_OUT = qMPA_CTD_PTS_ADJUST_OUT;
		}

		public String getQMPA_CLEAR_CTD_FLAG() {
			return QMPA_CLEAR_CTD_FLAG;
		}

		public void setQMPA_CLEAR_CTD_FLAG(String qMPA_CLEAR_CTD_FLAG) {
			QMPA_CLEAR_CTD_FLAG = qMPA_CLEAR_CTD_FLAG;
		}

		public String getQMPA_CTD_SPEND_EARNED() {
			return QMPA_CTD_SPEND_EARNED;
		}

		public void setQMPA_CTD_SPEND_EARNED(String qMPA_CTD_SPEND_EARNED) {
			QMPA_CTD_SPEND_EARNED = qMPA_CTD_SPEND_EARNED;
		}

		public String getQMPA_LTD() {
			return QMPA_LTD;
		}

		public void setQMPA_LTD(String qMPA_LTD) {
			QMPA_LTD = qMPA_LTD;
		}

		public String getFILLER_REDEFINES_QMPA_LTD() {
			return FILLER_REDEFINES_QMPA_LTD;
		}

		public void setFILLER_REDEFINES_QMPA_LTD(String fILLER_REDEFINES_QMPA_LTD) {
			FILLER_REDEFINES_QMPA_LTD = fILLER_REDEFINES_QMPA_LTD;
		}

		public String getQMPA_LTD_PTS_EARNED() {
			return QMPA_LTD_PTS_EARNED;
		}

		public void setQMPA_LTD_PTS_EARNED(String qMPA_LTD_PTS_EARNED) {
			QMPA_LTD_PTS_EARNED = qMPA_LTD_PTS_EARNED;
		}

		public String getQMPA_LTD_PTS_BOUGHT() {
			return QMPA_LTD_PTS_BOUGHT;
		}

		public void setQMPA_LTD_PTS_BOUGHT(String qMPA_LTD_PTS_BOUGHT) {
			QMPA_LTD_PTS_BOUGHT = qMPA_LTD_PTS_BOUGHT;
		}

		public String getQMPA_LTD_PTS_BONUS() {
			return QMPA_LTD_PTS_BONUS;
		}

		public void setQMPA_LTD_PTS_BONUS(String qMPA_LTD_PTS_BONUS) {
			QMPA_LTD_PTS_BONUS = qMPA_LTD_PTS_BONUS;
		}

		public String getQMPA_LTD_PTS_REDEEMED() {
			return QMPA_LTD_PTS_REDEEMED;
		}

		public void setQMPA_LTD_PTS_REDEEMED(String qMPA_LTD_PTS_REDEEMED) {
			QMPA_LTD_PTS_REDEEMED = qMPA_LTD_PTS_REDEEMED;
		}

		public String getQMPA_LTD_PTS_CLOSED() {
			return QMPA_LTD_PTS_CLOSED;
		}

		public void setQMPA_LTD_PTS_CLOSED(String qMPA_LTD_PTS_CLOSED) {
			QMPA_LTD_PTS_CLOSED = qMPA_LTD_PTS_CLOSED;
		}

		public String getQMPA_LTD_PTS_EXPIRED() {
			return QMPA_LTD_PTS_EXPIRED;
		}

		public void setQMPA_LTD_PTS_EXPIRED(String qMPA_LTD_PTS_EXPIRED) {
			QMPA_LTD_PTS_EXPIRED = qMPA_LTD_PTS_EXPIRED;
		}

		public String getQMPA_LTD_PTS_ADJUST_IN() {
			return QMPA_LTD_PTS_ADJUST_IN;
		}

		public void setQMPA_LTD_PTS_ADJUST_IN(String qMPA_LTD_PTS_ADJUST_IN) {
			QMPA_LTD_PTS_ADJUST_IN = qMPA_LTD_PTS_ADJUST_IN;
		}

		public String getQMPA_LTD_PTS_ADJUST_OUT() {
			return QMPA_LTD_PTS_ADJUST_OUT;
		}

		public void setQMPA_LTD_PTS_ADJUST_OUT(String qMPA_LTD_PTS_ADJUST_OUT) {
			QMPA_LTD_PTS_ADJUST_OUT = qMPA_LTD_PTS_ADJUST_OUT;
		}

		public String getQMPA_YTD_SPEND_EARNED() {
			return QMPA_YTD_SPEND_EARNED;
		}

		public void setQMPA_YTD_SPEND_EARNED(String qMPA_YTD_SPEND_EARNED) {
			QMPA_YTD_SPEND_EARNED = qMPA_YTD_SPEND_EARNED;
		}

		public String getQMPA_LTD_PTS_DISBURSED() {
			return QMPA_LTD_PTS_DISBURSED;
		}

		public void setQMPA_LTD_PTS_DISBURSED(String qMPA_LTD_PTS_DISBURSED) {
			QMPA_LTD_PTS_DISBURSED = qMPA_LTD_PTS_DISBURSED;
		}

		public String getQMPA_STMT_DTLS() {
			return QMPA_STMT_DTLS;
		}

		public void setQMPA_STMT_DTLS(String qMPA_STMT_DTLS) {
			QMPA_STMT_DTLS = qMPA_STMT_DTLS;
		}

		public String getQMPA_STMT_MONTH_FREQ() {
			return QMPA_STMT_MONTH_FREQ;
		}

		public void setQMPA_STMT_MONTH_FREQ(String qMPA_STMT_MONTH_FREQ) {
			QMPA_STMT_MONTH_FREQ = qMPA_STMT_MONTH_FREQ;
		}

		public String getQMPA_STMT_DAY_OF_MONTH() {
			return QMPA_STMT_DAY_OF_MONTH;
		}

		public void setQMPA_STMT_DAY_OF_MONTH(String qMPA_STMT_DAY_OF_MONTH) {
			QMPA_STMT_DAY_OF_MONTH = qMPA_STMT_DAY_OF_MONTH;
		}

		public String getQMPA_LAST_STMT_DATE() {
			return QMPA_LAST_STMT_DATE;
		}

		public void setQMPA_LAST_STMT_DATE(String qMPA_LAST_STMT_DATE) {
			QMPA_LAST_STMT_DATE = qMPA_LAST_STMT_DATE;
		}

		public String getQMPA_NEXT_STMT_DATE() {
			return QMPA_NEXT_STMT_DATE;
		}

		public void setQMPA_NEXT_STMT_DATE(String qMPA_NEXT_STMT_DATE) {
			QMPA_NEXT_STMT_DATE = qMPA_NEXT_STMT_DATE;
		}

		public String getQMPA_DATE_OPENED() {
			return QMPA_DATE_OPENED;
		}

		public void setQMPA_DATE_OPENED(String qMPA_DATE_OPENED) {
			QMPA_DATE_OPENED = qMPA_DATE_OPENED;
		}

		public String getQMPA_DATE_LAST_ACTIVE() {
			return QMPA_DATE_LAST_ACTIVE;
		}

		public void setQMPA_DATE_LAST_ACTIVE(String qMPA_DATE_LAST_ACTIVE) {
			QMPA_DATE_LAST_ACTIVE = qMPA_DATE_LAST_ACTIVE;
		}

		public String getQMPA_FIRST_USAGE_SWITCH() {
			return QMPA_FIRST_USAGE_SWITCH;
		}

		public void setQMPA_FIRST_USAGE_SWITCH(String qMPA_FIRST_USAGE_SWITCH) {
			QMPA_FIRST_USAGE_SWITCH = qMPA_FIRST_USAGE_SWITCH;
		}

		public String getQMPA_ACCT_OPEN_SWITCH() {
			return QMPA_ACCT_OPEN_SWITCH;
		}

		public void setQMPA_ACCT_OPEN_SWITCH(String qMPA_ACCT_OPEN_SWITCH) {
			QMPA_ACCT_OPEN_SWITCH = qMPA_ACCT_OPEN_SWITCH;
		}

		public String getQMPA_BLOCK_CODE_MODE() {
			return QMPA_BLOCK_CODE_MODE;
		}

		public void setQMPA_BLOCK_CODE_MODE(String qMPA_BLOCK_CODE_MODE) {
			QMPA_BLOCK_CODE_MODE = qMPA_BLOCK_CODE_MODE;
		}

		public String getQMPA_DELINQUENCY_MODE() {
			return QMPA_DELINQUENCY_MODE;
		}

		public void setQMPA_DELINQUENCY_MODE(String qMPA_DELINQUENCY_MODE) {
			QMPA_DELINQUENCY_MODE = qMPA_DELINQUENCY_MODE;
		}

		public String getQMPA_DISBURSE_PACKET_POINTS() {
			return QMPA_DISBURSE_PACKET_POINTS;
		}

		public void setQMPA_DISBURSE_PACKET_POINTS(String qMPA_DISBURSE_PACKET_POINTS) {
			QMPA_DISBURSE_PACKET_POINTS = qMPA_DISBURSE_PACKET_POINTS;
		}

		public String getQMPA_AUTO_DISB_FREQ() {
			return QMPA_AUTO_DISB_FREQ;
		}

		public void setQMPA_AUTO_DISB_FREQ(String qMPA_AUTO_DISB_FREQ) {
			QMPA_AUTO_DISB_FREQ = qMPA_AUTO_DISB_FREQ;
		}

		public String getQMPA_AUTO_DISB_DAY_OF_MONTH() {
			return QMPA_AUTO_DISB_DAY_OF_MONTH;
		}

		public void setQMPA_AUTO_DISB_DAY_OF_MONTH(String qMPA_AUTO_DISB_DAY_OF_MONTH) {
			QMPA_AUTO_DISB_DAY_OF_MONTH = qMPA_AUTO_DISB_DAY_OF_MONTH;
		}

		public String getQMPA_AUTO_DISB_IND() {
			return QMPA_AUTO_DISB_IND;
		}

		public void setQMPA_AUTO_DISB_IND(String qMPA_AUTO_DISB_IND) {
			QMPA_AUTO_DISB_IND = qMPA_AUTO_DISB_IND;
		}

		public String getQMPA_PREV_STMT_MONTH_FREQ() {
			return QMPA_PREV_STMT_MONTH_FREQ;
		}

		public void setQMPA_PREV_STMT_MONTH_FREQ(String qMPA_PREV_STMT_MONTH_FREQ) {
			QMPA_PREV_STMT_MONTH_FREQ = qMPA_PREV_STMT_MONTH_FREQ;
		}

		public String getQMPA_AUTO_DISB_DBA_NAME() {
			return QMPA_AUTO_DISB_DBA_NAME;
		}

		public void setQMPA_AUTO_DISB_DBA_NAME(String qMPA_AUTO_DISB_DBA_NAME) {
			QMPA_AUTO_DISB_DBA_NAME = qMPA_AUTO_DISB_DBA_NAME;
		}

		public String getQMPA_STATUS_CHANGE_DATE() {
			return QMPA_STATUS_CHANGE_DATE;
		}

		public void setQMPA_STATUS_CHANGE_DATE(String qMPA_STATUS_CHANGE_DATE) {
			QMPA_STATUS_CHANGE_DATE = qMPA_STATUS_CHANGE_DATE;
		}

		public String getQMPA_START_DISBURSE_DATE() {
			return QMPA_START_DISBURSE_DATE;
		}

		public void setQMPA_START_DISBURSE_DATE(String qMPA_START_DISBURSE_DATE) {
			QMPA_START_DISBURSE_DATE = qMPA_START_DISBURSE_DATE;
		}

		public String getQMPA_REWARDS_CATEGORY() {
			return QMPA_REWARDS_CATEGORY;
		}

		public void setQMPA_REWARDS_CATEGORY(String qMPA_REWARDS_CATEGORY) {
			QMPA_REWARDS_CATEGORY = qMPA_REWARDS_CATEGORY;
		}

		public String getQMPA_AUTO_DISB_THRESHOLD() {
			return QMPA_AUTO_DISB_THRESHOLD;
		}

		public void setQMPA_AUTO_DISB_THRESHOLD(String qMPA_AUTO_DISB_THRESHOLD) {
			QMPA_AUTO_DISB_THRESHOLD = qMPA_AUTO_DISB_THRESHOLD;
		}

		public String getQMPA_ENROLLMENT_CHANNEL() {
			return QMPA_ENROLLMENT_CHANNEL;
		}

		public void setQMPA_ENROLLMENT_CHANNEL(String qMPA_ENROLLMENT_CHANNEL) {
			QMPA_ENROLLMENT_CHANNEL = qMPA_ENROLLMENT_CHANNEL;
		}

		public String getQMPA_PURGE_DATE() {
			return QMPA_PURGE_DATE;
		}

		public void setQMPA_PURGE_DATE(String qMPA_PURGE_DATE) {
			QMPA_PURGE_DATE = qMPA_PURGE_DATE;
		}

		public String getQMPA_WAIVE_MEMB_FEE() {
			return QMPA_WAIVE_MEMB_FEE;
		}

		public void setQMPA_WAIVE_MEMB_FEE(String qMPA_WAIVE_MEMB_FEE) {
			QMPA_WAIVE_MEMB_FEE = qMPA_WAIVE_MEMB_FEE;
		}

		public String getQMPA_DEFER_MEMB_FEE_DTE() {
			return QMPA_DEFER_MEMB_FEE_DTE;
		}

		public void setQMPA_DEFER_MEMB_FEE_DTE(String qMPA_DEFER_MEMB_FEE_DTE) {
			QMPA_DEFER_MEMB_FEE_DTE = qMPA_DEFER_MEMB_FEE_DTE;
		}

		public String getQMPA_NEXT_MEMB_FEE_DTE() {
			return QMPA_NEXT_MEMB_FEE_DTE;
		}

		public void setQMPA_NEXT_MEMB_FEE_DTE(String qMPA_NEXT_MEMB_FEE_DTE) {
			QMPA_NEXT_MEMB_FEE_DTE = qMPA_NEXT_MEMB_FEE_DTE;
		}

		public String getQMPA_NEXT_MEMB_FEE_AMT() {
			return QMPA_NEXT_MEMB_FEE_AMT;
		}

		public void setQMPA_NEXT_MEMB_FEE_AMT(String qMPA_NEXT_MEMB_FEE_AMT) {
			QMPA_NEXT_MEMB_FEE_AMT = qMPA_NEXT_MEMB_FEE_AMT;
		}

		public String getQMPA_REDMPT_CHNL_CT() {
			return QMPA_REDMPT_CHNL_CT;
		}

		public void setQMPA_REDMPT_CHNL_CT(String qMPA_REDMPT_CHNL_CT) {
			QMPA_REDMPT_CHNL_CT = qMPA_REDMPT_CHNL_CT;
		}

		public String getQMPA_AR_OPEN_DATE() {
			return QMPA_AR_OPEN_DATE;
		}

		public void setQMPA_AR_OPEN_DATE(String qMPA_AR_OPEN_DATE) {
			QMPA_AR_OPEN_DATE = qMPA_AR_OPEN_DATE;
		}

		public String getQMPA_ENROLL_CHNL_SWITCH() {
			return QMPA_ENROLL_CHNL_SWITCH;
		}

		public void setQMPA_ENROLL_CHNL_SWITCH(String qMPA_ENROLL_CHNL_SWITCH) {
			QMPA_ENROLL_CHNL_SWITCH = qMPA_ENROLL_CHNL_SWITCH;
		}

		public String getQMPA_MTD() {
			return QMPA_MTD;
		}

		public void setQMPA_MTD(String qMPA_MTD) {
			QMPA_MTD = qMPA_MTD;
		}

		public String getFILLER_REDEFINES_QMPA_MTD() {
			return FILLER_REDEFINES_QMPA_MTD;
		}

		public void setFILLER_REDEFINES_QMPA_MTD(String fILLER_REDEFINES_QMPA_MTD) {
			FILLER_REDEFINES_QMPA_MTD = fILLER_REDEFINES_QMPA_MTD;
		}

		public String getQMPA_MTD_PTS_EARNED() {
			return QMPA_MTD_PTS_EARNED;
		}

		public void setQMPA_MTD_PTS_EARNED(String qMPA_MTD_PTS_EARNED) {
			QMPA_MTD_PTS_EARNED = qMPA_MTD_PTS_EARNED;
		}

		public String getQMPA_MTD_PTS_BOUGHT() {
			return QMPA_MTD_PTS_BOUGHT;
		}

		public void setQMPA_MTD_PTS_BOUGHT(String qMPA_MTD_PTS_BOUGHT) {
			QMPA_MTD_PTS_BOUGHT = qMPA_MTD_PTS_BOUGHT;
		}

		public String getQMPA_MTD_PTS_BONUS() {
			return QMPA_MTD_PTS_BONUS;
		}

		public void setQMPA_MTD_PTS_BONUS(String qMPA_MTD_PTS_BONUS) {
			QMPA_MTD_PTS_BONUS = qMPA_MTD_PTS_BONUS;
		}

		public String getQMPA_MTD_PTS_REDEEMED() {
			return QMPA_MTD_PTS_REDEEMED;
		}

		public void setQMPA_MTD_PTS_REDEEMED(String qMPA_MTD_PTS_REDEEMED) {
			QMPA_MTD_PTS_REDEEMED = qMPA_MTD_PTS_REDEEMED;
		}

		public String getQMPA_MTD_PTS_CLOSED() {
			return QMPA_MTD_PTS_CLOSED;
		}

		public void setQMPA_MTD_PTS_CLOSED(String qMPA_MTD_PTS_CLOSED) {
			QMPA_MTD_PTS_CLOSED = qMPA_MTD_PTS_CLOSED;
		}

		public String getQMPA_MTD_PTS_EXPIRED() {
			return QMPA_MTD_PTS_EXPIRED;
		}

		public void setQMPA_MTD_PTS_EXPIRED(String qMPA_MTD_PTS_EXPIRED) {
			QMPA_MTD_PTS_EXPIRED = qMPA_MTD_PTS_EXPIRED;
		}

		public String getQMPA_MTD_PTS_ADJUST_IN() {
			return QMPA_MTD_PTS_ADJUST_IN;
		}

		public void setQMPA_MTD_PTS_ADJUST_IN(String qMPA_MTD_PTS_ADJUST_IN) {
			QMPA_MTD_PTS_ADJUST_IN = qMPA_MTD_PTS_ADJUST_IN;
		}

		public String getQMPA_MTD_PTS_ADJUST_OUT() {
			return QMPA_MTD_PTS_ADJUST_OUT;
		}

		public void setQMPA_MTD_PTS_ADJUST_OUT(String qMPA_MTD_PTS_ADJUST_OUT) {
			QMPA_MTD_PTS_ADJUST_OUT = qMPA_MTD_PTS_ADJUST_OUT;
		}

		public String getQMPA_CLEAR_MTD_FLAG() {
			return QMPA_CLEAR_MTD_FLAG;
		}

		public void setQMPA_CLEAR_MTD_FLAG(String qMPA_CLEAR_MTD_FLAG) {
			QMPA_CLEAR_MTD_FLAG = qMPA_CLEAR_MTD_FLAG;
		}

		public String getQMPA_CLEAR_YTD_FLAG() {
			return QMPA_CLEAR_YTD_FLAG;
		}

		public void setQMPA_CLEAR_YTD_FLAG(String qMPA_CLEAR_YTD_FLAG) {
			QMPA_CLEAR_YTD_FLAG = qMPA_CLEAR_YTD_FLAG;
		}

		public String getQMPA_NEXT_ANNIV_DATE() {
			return QMPA_NEXT_ANNIV_DATE;
		}

		public void setQMPA_NEXT_ANNIV_DATE(String qMPA_NEXT_ANNIV_DATE) {
			QMPA_NEXT_ANNIV_DATE = qMPA_NEXT_ANNIV_DATE;
		}

		public String getQMPA_TODAY_HH_ACTIVITY() {
			return QMPA_TODAY_HH_ACTIVITY;
		}

		public void setQMPA_TODAY_HH_ACTIVITY(String qMPA_TODAY_HH_ACTIVITY) {
			QMPA_TODAY_HH_ACTIVITY = qMPA_TODAY_HH_ACTIVITY;
		}

		public String getQMPA_LTD_PTS_TOTAL() {
			return QMPA_LTD_PTS_TOTAL;
		}

		public void setQMPA_LTD_PTS_TOTAL(String qMPA_LTD_PTS_TOTAL) {
			QMPA_LTD_PTS_TOTAL = qMPA_LTD_PTS_TOTAL;
		}

		public String getQMPA_LMS_FIRST_USAGE_SWITCH() {
			return QMPA_LMS_FIRST_USAGE_SWITCH;
		}

		public void setQMPA_LMS_FIRST_USAGE_SWITCH(String qMPA_LMS_FIRST_USAGE_SWITCH) {
			QMPA_LMS_FIRST_USAGE_SWITCH = qMPA_LMS_FIRST_USAGE_SWITCH;
		}

		public String getQMPA_HI_XFR_STATUS() {
			return QMPA_HI_XFR_STATUS;
		}

		public void setQMPA_HI_XFR_STATUS(String qMPA_HI_XFR_STATUS) {
			QMPA_HI_XFR_STATUS = qMPA_HI_XFR_STATUS;
		}

		public String getQMPA_HI_XFR_OUT_DATE() {
			return QMPA_HI_XFR_OUT_DATE;
		}

		public void setQMPA_HI_XFR_OUT_DATE(String qMPA_HI_XFR_OUT_DATE) {
			QMPA_HI_XFR_OUT_DATE = qMPA_HI_XFR_OUT_DATE;
		}

		public String getQMPA_HI_HSBC_AREA() {
			return QMPA_HI_HSBC_AREA;
		}

		public void setQMPA_HI_HSBC_AREA(String qMPA_HI_HSBC_AREA) {
			QMPA_HI_HSBC_AREA = qMPA_HI_HSBC_AREA;
		}

		public String getQMPA_HI_GLOBAL_AREA_1() {
			return QMPA_HI_GLOBAL_AREA_1;
		}

		public void setQMPA_HI_GLOBAL_AREA_1(String qMPA_HI_GLOBAL_AREA_1) {
			QMPA_HI_GLOBAL_AREA_1 = qMPA_HI_GLOBAL_AREA_1;
		}

		public String getQMPA_FEE_FLAG() {
			return QMPA_FEE_FLAG;
		}

		public void setQMPA_FEE_FLAG(String qMPA_FEE_FLAG) {
			QMPA_FEE_FLAG = qMPA_FEE_FLAG;
		}

		public String getQMPA_GLBL_SEC_WI_MEMB_FLAG() {
			return QMPA_GLBL_SEC_WI_MEMB_FLAG;
		}

		public void setQMPA_GLBL_SEC_WI_MEMB_FLAG(String qMPA_GLBL_SEC_WI_MEMB_FLAG) {
			QMPA_GLBL_SEC_WI_MEMB_FLAG = qMPA_GLBL_SEC_WI_MEMB_FLAG;
		}

		public String getQMPA_GLBL_AUT_WI_MEMB_FLAG() {
			return QMPA_GLBL_AUT_WI_MEMB_FLAG;
		}

		public void setQMPA_GLBL_AUT_WI_MEMB_FLAG(String qMPA_GLBL_AUT_WI_MEMB_FLAG) {
			QMPA_GLBL_AUT_WI_MEMB_FLAG = qMPA_GLBL_AUT_WI_MEMB_FLAG;
		}

		public String getQMPA_GLBL_ROLLED_MEM_FEE_AMT() {
			return QMPA_GLBL_ROLLED_MEM_FEE_AMT;
		}

		public void setQMPA_GLBL_ROLLED_MEM_FEE_AMT(String qMPA_GLBL_ROLLED_MEM_FEE_AMT) {
			QMPA_GLBL_ROLLED_MEM_FEE_AMT = qMPA_GLBL_ROLLED_MEM_FEE_AMT;
		}

		public String getQMPA_GLBL_SEC_CARD_COUNT() {
			return QMPA_GLBL_SEC_CARD_COUNT;
		}

		public void setQMPA_GLBL_SEC_CARD_COUNT(String qMPA_GLBL_SEC_CARD_COUNT) {
			QMPA_GLBL_SEC_CARD_COUNT = qMPA_GLBL_SEC_CARD_COUNT;
		}

		public String getQMPA_GLBL_AUTH_CARD_COUNT() {
			return QMPA_GLBL_AUTH_CARD_COUNT;
		}

		public void setQMPA_GLBL_AUTH_CARD_COUNT(String qMPA_GLBL_AUTH_CARD_COUNT) {
			QMPA_GLBL_AUTH_CARD_COUNT = qMPA_GLBL_AUTH_CARD_COUNT;
		}

		public String getQMPA_GLBL_MEMB_ID() {
			return QMPA_GLBL_MEMB_ID;
		}

		public void setQMPA_GLBL_MEMB_ID(String qMPA_GLBL_MEMB_ID) {
			QMPA_GLBL_MEMB_ID = qMPA_GLBL_MEMB_ID;
		}

		public String getQMPA_GLBL_DISB_POINTS() {
			return QMPA_GLBL_DISB_POINTS;
		}

		public void setQMPA_GLBL_DISB_POINTS(String qMPA_GLBL_DISB_POINTS) {
			QMPA_GLBL_DISB_POINTS = qMPA_GLBL_DISB_POINTS;
		}

		public String getQMPA_HI_MAX_DISB_THRESHOLD() {
			return QMPA_HI_MAX_DISB_THRESHOLD;
		}

		public void setQMPA_HI_MAX_DISB_THRESHOLD(String qMPA_HI_MAX_DISB_THRESHOLD) {
			QMPA_HI_MAX_DISB_THRESHOLD = qMPA_HI_MAX_DISB_THRESHOLD;
		}

		public String getQMPA_GLBL_AUTO_DISB_PROD() {
			return QMPA_GLBL_AUTO_DISB_PROD;
		}

		public void setQMPA_GLBL_AUTO_DISB_PROD(String qMPA_GLBL_AUTO_DISB_PROD) {
			QMPA_GLBL_AUTO_DISB_PROD = qMPA_GLBL_AUTO_DISB_PROD;
		}

		public String getQMPA_HI_AUTO_DISB_PNTS_FWD() {
			return QMPA_HI_AUTO_DISB_PNTS_FWD;
		}

		public void setQMPA_HI_AUTO_DISB_PNTS_FWD(String qMPA_HI_AUTO_DISB_PNTS_FWD) {
			QMPA_HI_AUTO_DISB_PNTS_FWD = qMPA_HI_AUTO_DISB_PNTS_FWD;
		}

		public String getQMPA_HI_CLEAR_AD_FLAG() {
			return QMPA_HI_CLEAR_AD_FLAG;
		}

		public void setQMPA_HI_CLEAR_AD_FLAG(String qMPA_HI_CLEAR_AD_FLAG) {
			QMPA_HI_CLEAR_AD_FLAG = qMPA_HI_CLEAR_AD_FLAG;
		}

		public String getFILLER() {
			return FILLER;
		}

		public void setFILLER(String fILLER) {
			FILLER = fILLER;
		}

		public String getQMPA_HI_DE_ENROLL_CHANNEL() {
			return QMPA_HI_DE_ENROLL_CHANNEL;
		}

		public void setQMPA_HI_DE_ENROLL_CHANNEL(String qMPA_HI_DE_ENROLL_CHANNEL) {
			QMPA_HI_DE_ENROLL_CHANNEL = qMPA_HI_DE_ENROLL_CHANNEL;
		}

		public String getQMPA_HI_TYPE_OF_DISBURSE_IND() {
			return QMPA_HI_TYPE_OF_DISBURSE_IND;
		}

		public void setQMPA_HI_TYPE_OF_DISBURSE_IND(String qMPA_HI_TYPE_OF_DISBURSE_IND) {
			QMPA_HI_TYPE_OF_DISBURSE_IND = qMPA_HI_TYPE_OF_DISBURSE_IND;
		}

		public String getQMPA_HI_PROC_REDEMPTION_IND() {
			return QMPA_HI_PROC_REDEMPTION_IND;
		}

		public void setQMPA_HI_PROC_REDEMPTION_IND(String qMPA_HI_PROC_REDEMPTION_IND) {
			QMPA_HI_PROC_REDEMPTION_IND = qMPA_HI_PROC_REDEMPTION_IND;
		}

		public String getQMPA_HI_GLOBAL_FILLER_1() {
			return QMPA_HI_GLOBAL_FILLER_1;
		}

		public void setQMPA_HI_GLOBAL_FILLER_1(String qMPA_HI_GLOBAL_FILLER_1) {
			QMPA_HI_GLOBAL_FILLER_1 = qMPA_HI_GLOBAL_FILLER_1;
		}

		public String getQMPA_HI_REGIONAL_AREA_1() {
			return QMPA_HI_REGIONAL_AREA_1;
		}

		public void setQMPA_HI_REGIONAL_AREA_1(String qMPA_HI_REGIONAL_AREA_1) {
			QMPA_HI_REGIONAL_AREA_1 = qMPA_HI_REGIONAL_AREA_1;
		}

		public String getQMPA_HI_REGIONAL_FILLER_1() {
			return QMPA_HI_REGIONAL_FILLER_1;
		}

		public void setQMPA_HI_REGIONAL_FILLER_1(String qMPA_HI_REGIONAL_FILLER_1) {
			QMPA_HI_REGIONAL_FILLER_1 = qMPA_HI_REGIONAL_FILLER_1;
		}

		public String getQMPA_HI_BUS_UNIT_AREA_1() {
			return QMPA_HI_BUS_UNIT_AREA_1;
		}

		public void setQMPA_HI_BUS_UNIT_AREA_1(String qMPA_HI_BUS_UNIT_AREA_1) {
			QMPA_HI_BUS_UNIT_AREA_1 = qMPA_HI_BUS_UNIT_AREA_1;
		}

		public String getQMPA_HI_BUS_UNIT_FILLER_1() {
			return QMPA_HI_BUS_UNIT_FILLER_1;
		}

		public void setQMPA_HI_BUS_UNIT_FILLER_1(String qMPA_HI_BUS_UNIT_FILLER_1) {
			QMPA_HI_BUS_UNIT_FILLER_1 = qMPA_HI_BUS_UNIT_FILLER_1;
		}

	
		

	
	
}


