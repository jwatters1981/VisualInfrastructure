package com.watters.infrastructure.service;

import com.watters.VisualInfrastructureApplicationTests;
import com.watters.infrastructure.model.Database;
import com.watters.infrastructure.model.DatabaseSID;
import com.watters.infrastructure.model.DatabaseServer;
import com.watters.infrastructure.model.Environment;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by johnwatters on 07/05/2016.
 */
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class })
public class EnvironmentServiceTest extends VisualInfrastructureApplicationTests {

    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private DatabaseService databaseService;

    @Test
    @Rollback(false)
    @Transactional
    public void saveEnvironment() throws Exception {

        Environment environment = new Environment("env1");
        environment = environmentService.saveEnvironment(environment);
        System.err.println(environment.getId());
        Assert.assertNotNull(environment.getId());
        DatabaseServer databaseServer = new DatabaseServer();
        databaseServer.setEnvironment(environment);
        databaseServer.setName("10g");
        databaseServer = databaseService.saveDatabaseServer(databaseServer);

        //create a db
        Database database = new Database();
        database.setName("MEWWEWEWE");
        database.setDatabaseServer(databaseServer);
        database = databaseService.saveDatabase(database);

        //create a db instance
        DatabaseSID databaseSID = new DatabaseSID();
        databaseSID.setName("UDXA1");
        databaseSID.setDatabase(database);
        databaseService.saveDatabaseSID(databaseSID);
        List<DatabaseServer> databaseServerForEnvironment = environmentService.getDatabaseServerForEnvironment(environment.getId());
        Assert.assertFalse("size should be >0 ", databaseServerForEnvironment.isEmpty());
        String name = databaseServerForEnvironment.get(0).getDatabases().get(0).getDatabaseSIDs().get(0).getName();
        System.err.println(name);
    }

}