package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import static common.Constants.*;

/**
 * Test Base Clase
 * your steps file will extend this class
 */
public class TestBase {

    public static RequestSpecification reqSpec;
    public static Logger log = Logger.getLogger("devpinoyLogger");
    public static ResponseSpecification resSpec;
    public static PrintStream apilogs = null;
    public static Response response;
    /**
     *
     * @return
     * @throws IOException
     */
    public RequestSpecification requestSpesification() throws IOException {

        if(reqSpec==null) {
            PropertyConfigurator.configure(LOG4J);

            apilogs = new PrintStream(new FileOutputStream("src/test/resources/logs/restapirequest_response.log"));

            reqSpec = new RequestSpecBuilder().setBaseUri(getKeyValue("BaseURI"))
                    .addFilter(RequestLoggingFilter.logRequestTo(apilogs))
                    .setContentType(ContentType.JSON).addHeader("X-CorrelationId","45677889").build();
            log.info("API Request Specification created");
            return reqSpec;
        }
else
        {
            reqSpec = new RequestSpecBuilder().setBaseUri(getKeyValue("BaseURI"))
                    .addFilter(RequestLoggingFilter.logRequestTo(apilogs))
                    .removeQueryParam("status")
                    .setContentType(ContentType.JSON).build();
            log.info("API Re-Request Specification created");
            return reqSpec;
        }

    }

    /**
     *
     * @return
     * @throws IOException
     */
    public ResponseSpecification responseSpecification() throws IOException {
    resSpec=new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
    return resSpec;
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
        System.out.println(resp);
        log.info("Json "+resp);
        JsonPath   js = new JsonPath(resp);
        return js.get(key).toString();
    }

}
