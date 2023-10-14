package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static final String configurationFile = System.getProperty("user.dir")+"/src/main/resources/configurationFile.properties";

    public static Properties setConfiguration() throws IOException {
        Properties configProperties = new Properties();
        FileInputStream inputStream = new FileInputStream(configurationFile);
        configProperties.load(inputStream);
        return configProperties;
    }

}
