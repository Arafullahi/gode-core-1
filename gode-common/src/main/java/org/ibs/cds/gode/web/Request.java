package org.ibs.cds.gode.web;

import lombok.Setter;
import org.ibs.cds.gode.web.context.RequestContext;

public class Request<Data> implements WebMessage<Data, RequestContext> {

    private @Setter Data data;
    private @Setter RequestContext context;

    @Override
    public Data getData() {
        return this.data;
    }

    @Override
    public RequestContext getContext() {
        return this.context;
    }
}
