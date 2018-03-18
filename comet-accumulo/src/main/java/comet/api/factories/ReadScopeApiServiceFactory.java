package comet.api.factories;

import comet.api.ReadScopeApiService;
import comet.api.impl.ReadScopeApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-10T21:01:26.756Z")
public class ReadScopeApiServiceFactory {
    private final static ReadScopeApiService service = new ReadScopeApiServiceImpl();

    public static ReadScopeApiService getReadScopeApi() {
        return service;
    }
}
