package rewards_platform.models;

import java.util.ArrayList;

import java.util.List;

import java.util.UUID;



public class QMPBModelToCreate {


public List<String> getQMPB(){

List<String> mockData = new ArrayList<String>();

mockData.add(getQMPB_RECORD());

mockData.add(getQMPB_KEY());

mockData.add(getQMPB_SHORT_KEY());

mockData.add(getQMPB_ORG());

mockData.add(getQMPB_ACCT());

mockData.add(getQMPB_SCHEME_ID());

mockData.add(getQMPB_GROUP());

mockData.add(getQMPB_TYPE());

mockData.add(getQMPB_END_DATE());

mockData.add(getQMPB_DETAILS());

mockData.add(getQMPB_POINTS());

mockData.add(getQMPB_SPEND());


return mockData;

}



public QMPBModelToCreate() {

setQMPB_RECORD(newId());

setQMPB_KEY(newId());

setQMPB_SHORT_KEY(newId());

setQMPB_ORG(newId());

setQMPB_ACCT(newId());

setQMPB_SCHEME_ID(newId());

setQMPB_GROUP(newId());

setQMPB_TYPE(newId());

setQMPB_END_DATE(generateDateWithLowerUpperBound(2017,2000));

setQMPB_DETAILS(newId());

setQMPB_POINTS(generateRandomNumber());

setQMPB_SPEND(generateRandomNumber());

}


//QMPB Data

private String QMPB_RECORD;

private String QMPB_KEY;

private String QMPB_SHORT_KEY;

private String QMPB_ORG;

private String QMPB_ACCT;

private String QMPB_SCHEME_ID;

private String QMPB_GROUP;

private String QMPB_TYPE;

private String QMPB_END_DATE;

private String QMPB_DETAILS;

private String QMPB_POINTS;

private String QMPB_SPEND;


public static String newId() {

UUID uuid = UUID.randomUUID();

return uuid.toString();

}


public static String generateDateWithLowerUpperBound(int maxYear, int minYear){



return String.valueOf((int)(1+((Math.random()*(12-2)+1))))+"/"+String.valueOf((int)(1+((Math.random()*(30-2)+1))))+"/"+String.valueOf((int)(minYear+((Math.random())*((maxYear-minYear)+1))));



}




public String generateRandomNumber(){

 

Integer number =(int) (1+(Math.random()*(1001-2)+1));

return number.toString();

}




public String getQMPB_RECORD() {

return QMPB_RECORD;

}

public void setQMPB_RECORD(String qMPB_RECORD) {

QMPB_RECORD = qMPB_RECORD;

}

public String getQMPB_KEY() {

return QMPB_KEY;

}

public void setQMPB_KEY(String qMPB_KEY) {

QMPB_KEY = qMPB_KEY;

}

public String getQMPB_SHORT_KEY() {

return QMPB_SHORT_KEY;

}

public void setQMPB_SHORT_KEY(String qMPB_SHORT_KEY) {

QMPB_SHORT_KEY = qMPB_SHORT_KEY;

}

public String getQMPB_ORG() {

return QMPB_ORG;

}

public void setQMPB_ORG(String qMPB_ORG) {

QMPB_ORG = qMPB_ORG;

}

public String getQMPB_ACCT() {

return QMPB_ACCT;

}

public void setQMPB_ACCT(String qMPB_ACCT) {

QMPB_ACCT = qMPB_ACCT;

}

public String getQMPB_SCHEME_ID() {

return QMPB_SCHEME_ID;

}

public void setQMPB_SCHEME_ID(String qMPB_SCHEME_ID) {

QMPB_SCHEME_ID = qMPB_SCHEME_ID;

}

public String getQMPB_GROUP() {

return QMPB_GROUP;

}

public void setQMPB_GROUP(String qMPB_GROUP) {

QMPB_GROUP = qMPB_GROUP;

}

public String getQMPB_TYPE() {

return QMPB_TYPE;

}

public void setQMPB_TYPE(String qMPB_TYPE) {

QMPB_TYPE = qMPB_TYPE;

}

public String getQMPB_END_DATE() {

return QMPB_END_DATE;

}

public void setQMPB_END_DATE(String qMPB_END_DATE) {

QMPB_END_DATE = qMPB_END_DATE;

}

public String getQMPB_DETAILS() {

return QMPB_DETAILS;

}

public void setQMPB_DETAILS(String qMPB_DETAILS) {

QMPB_DETAILS = qMPB_DETAILS;

}

public String getQMPB_POINTS() {

return QMPB_POINTS;

}

public void setQMPB_POINTS(String qMPB_POINTS) {

QMPB_POINTS = qMPB_POINTS;

}

public String getQMPB_SPEND() {

return QMPB_SPEND;

}

public void setQMPB_SPEND(String qMPB_SPEND) {

QMPB_SPEND = qMPB_SPEND;

}


}