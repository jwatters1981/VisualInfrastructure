package com.watters.infrastructure.repository;

import com.watters.infrastructure.model.Database;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by johnwatters on 06/05/2016.
 */
@Repository
public interface DatabaseRepository extends CrudRepository<Database,Long> {
}
