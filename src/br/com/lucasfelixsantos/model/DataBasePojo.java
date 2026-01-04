package br.com.lucasfelixsantos.model;

public class DataBasePojo {
    private String dataBaseUrl;
    private String dataBaseUser;
    private String dataBasePassword;

    public DataBasePojo(String dataBaseUrl, String dataBaseUser, String dataBasePassword) {
        this.dataBaseUrl = dataBaseUrl;
        this.dataBaseUser = dataBaseUser;
        this.dataBasePassword = dataBasePassword;
    }

    public String getDataBaseUrl() { return dataBaseUrl; }
    public String getDataBaseUser() { return dataBaseUser; }
    public String getDataBasePassword() { return dataBasePassword; }
}