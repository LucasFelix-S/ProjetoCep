package br.com.lucasfelixsantos.controller;
import br.com.lucasfelixsantos.model.DataBasePojo;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {
    public static DataBasePojo readingPropertiesFile() {
        try{
            InputStream inputStream = ReadPropertiesFile.class
                    .getClassLoader()
                    .getResourceAsStream("database.properties");

            Properties properties = new Properties();
            properties.load(inputStream);

            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");

            return new DataBasePojo(url, user, password);
        } catch(Exception e) {
            System.err.println("Error -> " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}