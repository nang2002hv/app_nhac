package com.tinamusic.mapper;

import java.util.Collection;
import java.util.List;

public interface BaseMapstruct <Q, E, P> {

    E requestToEntity(Q request);

    P entityToResponse(E entity);

    List<E> requestsToEntities(Collection<Q> requests);

    List<P> entitiesToResponses(Collection<E> entities);
}
