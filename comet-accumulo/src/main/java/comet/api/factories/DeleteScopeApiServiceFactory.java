package comet.api.factories;

import comet.api.DeleteScopeApiService;
import comet.api.impl.DeleteScopeApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-10T21:01:26.756Z")
public class DeleteScopeApiServiceFactory {
    private final static DeleteScopeApiService service = new DeleteScopeApiServiceImpl();

    public static DeleteScopeApiService getDeleteScopeApi() {
        return service;
    }
}
