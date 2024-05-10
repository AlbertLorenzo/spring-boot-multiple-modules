package com.manager.common.infraestructure.messaging;

public interface RequestProcessor<Q extends Request<R>, R> {
    @SuppressWarnings("unused")
    R process(final Q request);
}

