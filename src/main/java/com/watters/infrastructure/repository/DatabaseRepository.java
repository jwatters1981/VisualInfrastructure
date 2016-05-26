package com.watters.infrastructure.repository;

import com.watters.infrastructure.model.Database;
import com.watters.infrastructure.model.Server;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

/**
 * Created by johnwatters on 06/05/2016.
 */
@Repository
public interface DatabaseRepository extends CrudRepository<Database,Long> {
    Iterable<Database> findByDatabaseServerId(Long dbId);
}
