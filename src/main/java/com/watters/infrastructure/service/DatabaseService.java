package com.watters.infrastructure.service;

import com.watters.infrastructure.model.*;
import com.watters.infrastructure.repository.DatabaseRepository;
import com.watters.infrastructure.repository.DatabaseSIDRepository;
import com.watters.infrastructure.repository.DatabaseServerRepository;
import com.watters.infrastructure.repository.DatabaseUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by johnwatters on 06/05/2016.
 */
@Service
public class DatabaseService {

    @Autowired
    private DatabaseRepository databaseRepository;

    @Autowired
    private DatabaseSIDRepository databaseSIDRepository;

    @Autowired
    private DatabaseServerRepository databaseServerRepository;

    @Autowired
    private DatabaseUserRepository databaseUserRepository;

    @Transactional
    public DatabaseUser saveDatabaseUser(DatabaseUser databaseUser) {
        return databaseUserRepository.save(databaseUser);
    }

    @Transactional
    public DatabaseServer saveDatabaseServer(DatabaseServer databaseServer) {
        return databaseServerRepository.save(databaseServer);
    }

    @Transactional
    public DatabaseSID saveDatabaseSID(DatabaseSID databaseSID) {
        return databaseSIDRepository.save(databaseSID);
    }

    @Transactional
    public Database getDatabaseById(long id) {
        return databaseRepository.findOne(id);
    }

    @Transactional
    public Database saveDatabase(Database database) {
        return databaseRepository.save(database);
    }


    public Iterable<Server> getDatabasesInEnvironment(Long envId) {
        return databaseServerRepository.findByEnvironmentId(envId);
    }
}