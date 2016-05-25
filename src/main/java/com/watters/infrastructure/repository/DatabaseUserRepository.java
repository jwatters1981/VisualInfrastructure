package com.watters.infrastructure.repository;

import com.watters.infrastructure.model.DatabaseUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by johnwatters on 07/05/2016.
 */
public interface DatabaseUserRepository extends CrudRepository<DatabaseUser, Long> {
}
