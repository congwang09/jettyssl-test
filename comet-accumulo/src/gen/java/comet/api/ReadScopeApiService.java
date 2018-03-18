package comet.api;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import comet.api.*;
import comet.model.*;

import java.util.List;
import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-10T21:01:26.756Z")
public abstract class ReadScopeApiService {
    public abstract Response readScopeGet( @NotNull String contextID, @NotNull String family, @NotNull String key, @NotNull String readToken,SecurityContext securityContext) throws NotFoundException;
}
