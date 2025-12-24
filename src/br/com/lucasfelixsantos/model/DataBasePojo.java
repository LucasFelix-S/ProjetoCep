package br.com.lucasfelixsantos.model;

public class DataBasePojo {
    private String DataBaseUrl;
    private String DataBaseUser;
    private String DataBasePassword;

    public void setDataBaseUrl(String DataBaseUrl) { this.DataBaseUrl = DataBaseUrl; }
    public void setDataBaseUser(String DataBaseUser) { this.DataBaseUser = DataBaseUser; }
    public void setDataBasePassword(String DataBasePassword) { this.DataBasePassword = DataBasePassword; }

    public String getDataBaseUrl() { return DataBaseUrl; }
    public String getDataBaseUser() { return DataBaseUser; }
    public String getDataBasePassword() { return DataBasePassword; }
}