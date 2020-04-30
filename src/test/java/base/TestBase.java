package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import static common.Constants.*;

/**
 * Base Clase
 */
public class TestBase {

    public static RequestSpecification reqSpec;
    public static Logger log = Logger.getLogger("devpinoyLogger");

    /**
     *
     * @return
     * @throws IOException
     */
    public RequestSpecification requestSpesification() throws IOException {

        if(reqSpec==null) {
            PropertyConfigurator.configure(LOG4J);
            PrintStream apilogs = new PrintStream(new FileOutputStream("apilogs.txt"));

            reqSpec = new RequestSpecBuilder().setBaseUri(getKeyValue("BaseURI"))
                    .addQueryParam("key", "qaclick123")
                    .addFilter(RequestLoggingFilter.logRequestTo(apilogs))
                    .setContentType(ContentType.JSON).build();
            log.info("API Request Specification created");
            return reqSpec;
        }
        return reqSpec;
    }

    /**
     *
     * @param key
     * @return
     * @throws IOException
     */
    public static String getKeyValue(String key) throws IOException
    {
        Properties prop =new Properties();
        FileInputStream fis =new FileInputStream(CONFIG_FILE);
        prop.load(fis);
        log.debug("Config file loaded !!!");
        return prop.getProperty(key);

    }

    /**
     *
     * @param response
     * @param key
     * @return
     */
    public String getJsonPath(Response response, String key)
    {
        String resp=response.asString();
        JsonPath   js = new JsonPath(resp);
        return js.get(key).toString();
    }
}
