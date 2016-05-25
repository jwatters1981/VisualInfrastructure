package com.watters.infrastructure.repository;

import com.watters.infrastructure.model.Environment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by johnwatters on 07/05/2016.
 */
public interface EnvironmentRepository extends CrudRepository<Environment,Long> {
}
