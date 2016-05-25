package com.watters.infrastructure.repository;

import com.watters.infrastructure.model.Server;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by johnwatters on 25/05/2016.
 */
public interface ServerRepository  extends CrudRepository<Server, Long>{
    Iterable<Server> findByEnvironmentId(Long envId);
}
