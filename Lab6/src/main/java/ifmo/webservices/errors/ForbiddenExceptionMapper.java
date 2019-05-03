package ifmo.webservices.errors;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ForbiddenExceptionMapper implements ExceptionMapper<IllegalYearException> {
    @Override
    public Response toResponse(IllegalYearException e) {
        return Response.status(Status.FORBIDDEN).entity(e.getMessage()).build();
    }
}