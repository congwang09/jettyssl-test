package comet.api.impl;

import java.util.List;
import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import comet.api.*;
import comet.model.*;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-10T21:01:26.756Z")
public class DeleteScopeApiServiceImpl extends DeleteScopeApiService {
    @Override
    public Response deleteScopeDelete( @NotNull String contextID,  @NotNull String family,  @NotNull String key,  @NotNull String readToken,  @NotNull String writeToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
