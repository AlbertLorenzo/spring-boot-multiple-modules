package com.manager.common.infraestructure.messaging;

public interface ActionProcessor<A extends Action<R>, R> {
    @SuppressWarnings("unused")
    R process(final A action);
}
