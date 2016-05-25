package com.watters.infrastructure.service;

import com.watters.infrastructure.controller.EnvBean;
import com.watters.infrastructure.model.DatabaseServer;
import com.watters.infrastructure.model.Environment;
import com.watters.infrastructure.repository.EnvironmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by johnwatters on 07/05/2016.
 */
@Service
public class EnvironmentService {

    @Autowired
    private EnvironmentRepository environmentRepository;

    @Transactional
    public Environment saveEnvironment(Environment environment)
    {
        return environmentRepository.save(environment);
    }

//    @Transactional
//    public List<DatabaseServer> getDatabaseServerForEnvironment(long envId)
//    {
//        List<DatabaseServer> databaseServers = environmentRepository.findOne(envId).getDatabaseServers();
//        databaseServers.size();
//        return databaseServers;
//    }

    @Transactional
    public Iterable<Environment> getAllEnvironments() {
        return environmentRepository.findAll();
    }
}
