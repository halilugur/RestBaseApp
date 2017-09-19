package webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Halil
 */
@Path("/service")
public class service {

    /**
     * @Path -> Metoda erişimi sağlar. URL = /service/text
     * @GET -> Oluşacak olan HTTP isteği
     * @Produces -> TEXT tipinde dönüş değeri sağlar.
     * @return 
     */
    @Path("/text")
    @GET
    @Produces(MediaType.TEXT_PLAIN) //response type , text
    public String sayTextHello() {
        return "Hello Restful..";
    }

    /**
     * @Path -> Metoda erişimi sağlar. URL = /service/xml
     * @GET -> Oluşacak olan HTTP isteği
     * @Produces -> XML tipinde dönüş değeri sağlar.
     * @return 
     */
    @Path("/xml")
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        final StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\"?>");
        builder.append("<hello> Hello Restful.. </hello>");
        return builder.toString();
    }

    /**
     * @Path -> Metoda erişimi sağlar. URL = /service/html
     * @GET -> Oluşacak olan HTTP isteği.
     * @Produces -> HTML tipinde dönüş değeri sağlar.
     * @return 
     */
    @Path("/html")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        final StringBuilder builder = new StringBuilder();
        builder.append("<html> <title> Yeni Servise Hoşgeldiniz <b>RESTFULL</b> </title> ");
        return builder.toString();
    }

    /**
     * @Path -> Metoda erişimi sağlar. URL = /service/json
     * @GET -> Oluşacak olan HTTP isteği.
     * @Produces -> JSON tipinde dönüş değeri sağlar.
     * @return 
     */
    @Path("/json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayJsonHello() {
        final StringBuilder builder = new StringBuilder();
        builder.append("{ \"name\" : \"halil\" , ");
        builder.append(" \"surname\" : \"ugur\" }");
        return builder.toString();
    }
}
