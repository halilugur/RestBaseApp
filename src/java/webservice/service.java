/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    @Path("/text") // response olarak text return eden method icin path yolu , /hello/text
    @GET // http method type
    @Produces(MediaType.TEXT_PLAIN) //response type , text
    public String sayTextHello() {
        return "Hello Restful..";
    }

    @Path("/xml") // response olarak text return eden method icin path yolu , /hello/xml
    @GET // http method type
    @Produces(MediaType.TEXT_XML) // response type , xml
    public String sayXMLHello() {
        final StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\"?>");
        builder.append("<hello> Hello Restful.. </hello>");
        return builder.toString();
    }

    @Path("/html") // response olarak text return eden method icin path yolu , /hello/html
    @GET // http method type
    @Produces(MediaType.TEXT_HTML) // response type , html
    public String sayHtmlHello() {
        final StringBuilder builder = new StringBuilder();
        builder.append("<html> <title> Hello Restful.. </title> ");
        builder.append("<body> <h2> Hello Restful.. </h2> </body> </html>");
        return builder.toString();
    }

    @Path("/json") // response olarak text return eden method icin path yolu , /hello/html
    @GET // http method type
    @Produces(MediaType.APPLICATION_JSON) // respnse type , html
    public String sayJsonHello() {
        final StringBuilder builder = new StringBuilder();
        builder.append("{ \"name\" : \"halil\" , ");
        builder.append(" \"surname\" : \"ugur\" }");
        return builder.toString();
    }
}
