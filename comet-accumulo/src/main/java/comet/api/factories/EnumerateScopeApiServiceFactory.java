package comet.api.factories;

import comet.api.EnumerateScopeApiService;
import comet.api.impl.EnumerateScopeApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-10T21:01:26.756Z")
public class EnumerateScopeApiServiceFactory {
    private final static EnumerateScopeApiService service = new EnumerateScopeApiServiceImpl();

    public static EnumerateScopeApiService getEnumerateScopeApi() {
        return service;
    }
}
