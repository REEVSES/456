package com.test.dao;
public class companyMemberDao{
    private String ID;
    private String USERNAME;
    private String USERID;
    private String PASSWORD;
    private String SEX;
    private String PHONENUMBER;
    private String DEPARTMENT;
    private String DEPARTMENTID;
    private String SECTOR;
    private String SECTORID;
    private String OPTION1;
    private String OPTION2;
    private String OPTION3;
    private String OPTION4;

    @Override
    public String toString() {
        return "companyMemberDao{" +
                "ID='" + ID + '\'' +
                ", USERNAME='" + USERNAME + '\'' +
                ", USERID='" + USERID + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", SEX='" + SEX + '\'' +
                ", PHONENUMBER='" + PHONENUMBER + '\'' +
                ", DEPARTMENT='" + DEPARTMENT + '\'' +
                ", DEPARTMENTID='" + DEPARTMENTID + '\'' +
                ", SECTOR='" + SECTOR + '\'' +
                ", SECTORID='" + SECTORID + '\'' +
                ", OPTION1='" + OPTION1 + '\'' +
                ", OPTION2='" + OPTION2 + '\'' +
                ", OPTION3='" + OPTION3 + '\'' +
                ", OPTION4='" + OPTION4 + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getPHONENUMBER() {
        return PHONENUMBER;
    }

    public void setPHONENUMBER(String PHONENUMBER) {
        this.PHONENUMBER = PHONENUMBER;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public String getDEPARTMENTID() {
        return DEPARTMENTID;
    }

    public void setDEPARTMENTID(String DEPARTMENTID) {
        this.DEPARTMENTID = DEPARTMENTID;
    }

    public String getSECTOR() {
        return SECTOR;
    }

    public void setSECTOR(String SECTOR) {
        this.SECTOR = SECTOR;
    }

    public String getSECTORID() {
        return SECTORID;
    }

    public void setSECTORID(String SECTORID) {
        this.SECTORID = SECTORID;
    }

    public String getOPTION1() {
        return OPTION1;
    }

    public void setOPTION1(String OPTION1) {
        this.OPTION1 = OPTION1;
    }

    public String getOPTION2() {
        return OPTION2;
    }

    public void setOPTION2(String OPTION2) {
        this.OPTION2 = OPTION2;
    }

    public String getOPTION3() {
        return OPTION3;
    }

    public void setOPTION3(String OPTION3) {
        this.OPTION3 = OPTION3;
    }

    public String getOPTION4() {
        return OPTION4;
    }

    public void setOPTION4(String OPTION4) {
        this.OPTION4 = OPTION4;
    }
}
