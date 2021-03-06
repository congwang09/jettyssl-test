package comet.api;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.Map;
import java.util.List;
import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import comet.api.NotFoundException;
import comet.api.ReadScopeApiService;
import comet.api.factories.ReadScopeApiServiceFactory;
import comet.model.*;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/readScope")


@io.swagger.annotations.Api(description = "the readScope API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-10T21:01:26.756Z")
public class ReadScopeApi  {
   private final ReadScopeApiService delegate;

   public ReadScopeApi(@Context ServletConfig servletContext) {
      ReadScopeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ReadScopeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ReadScopeApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ReadScopeApiServiceFactory.getReadScopeApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve a value from a named scope within a context.  ", notes = "Retrieve a value from a named scope within a context.  - Operation requires read access  Need to distinguish the following situations: - The scope value is null - The scope existed, but was deleted - The scope never existed (for the period of garbage collection) - Scope visibility doesn’t match ", response = CometResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CometResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = CometResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = CometResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = CometResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = CometResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected Error", response = CometResponse.class) })
    public Response readScopeGet(@ApiParam(value = "",required=true) @QueryParam("contextID") String contextID
,@ApiParam(value = "",required=true) @QueryParam("family") String family
,@ApiParam(value = "",required=true) @QueryParam("Key") String key
,@ApiParam(value = "",required=true) @QueryParam("readToken") String readToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.readScopeGet(contextID,family,key,readToken,securityContext);
    }
}
