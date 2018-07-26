package com.test.dao;

public class User {
    private int uid;
    private int id;
    private String userid;
    private String username;
    private int onwork;
    private int whzid;
    private int leve;
    private int whz;
    private int onwh;
    private String userpwd;
    private String whz_qx;
    private String depet;
    private String team;
    private String fullpartname;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", id=" + id +
                ", userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", onwork=" + onwork +
                ", whzid=" + whzid +
                ", leve=" + leve +
                ", whz=" + whz +
                ", onwh=" + onwh +
                ", userpwd='" + userpwd + '\'' +
                ", whz_qx='" + whz_qx + '\'' +
                ", depet='" + depet + '\'' +
                ", team='" + team + '\'' +
                ", fullpartname='" + fullpartname + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getOnwork() {
        return onwork;
    }

    public void setOnwork(int onwork) {
        this.onwork = onwork;
    }

    public int getWhzid() {
        return whzid;
    }

    public void setWhzid(int whzid) {
        this.whzid = whzid;
    }

    public int getLeve() {
        return leve;
    }

    public void setLeve(int leve) {
        this.leve = leve;
    }

    public int getWhz() {
        return whz;
    }

    public void setWhz(int whz) {
        this.whz = whz;
    }

    public int getOnwh() {
        return onwh;
    }

    public void setOnwh(int onwh) {
        this.onwh = onwh;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getWhz_qx() {
        return whz_qx;
    }

    public void setWhz_qx(String whz_qx) {
        this.whz_qx = whz_qx;
    }

    public String getDepet() {
        return depet;
    }

    public void setDepet(String depet) {
        this.depet = depet;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFullpartname() {
        return fullpartname;
    }

    public void setFullpartname(String fullpartname) {
        this.fullpartname = fullpartname;
    }
}
