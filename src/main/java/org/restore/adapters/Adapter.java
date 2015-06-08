package org.restore.adapters;

import org.restore.queries.Query;
import org.restore.queries.Response;

/**
 * @author ben
 * @version 1.0
 */
public interface Adapter {

    public Response send(Query query);

}
