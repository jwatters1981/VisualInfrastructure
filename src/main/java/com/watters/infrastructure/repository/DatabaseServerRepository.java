package com.watters.infrastructure.repository;

import com.watters.infrastructure.model.DatabaseServer;
import com.watters.infrastructure.model.Server;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by johnwatters on 07/05/2016.
 */
public interface DatabaseServerRepository extends CrudRepository<DatabaseServer, Long> {
    Iterable<Server> findByEnvironmentId(Long envId);
}
