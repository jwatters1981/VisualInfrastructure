package com.watters.infrastructure;

import com.watters.VisualInfrastructureApplication;
import com.watters.infrastructure.model.Database;
import com.watters.infrastructure.model.DatabaseServer;
import com.watters.infrastructure.model.Version;
import com.watters.infrastructure.service.DatabaseService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by johnwatters on 06/05/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = VisualInfrastructureApplication.class)
public class DatabaseServiceTest {

    @Autowired
    private DatabaseService databaseService;

    @Test
    public void testSaveAndGet() {
        Database db = databaseService.saveDatabase(new Database(new Version(),"test2", "test3", new DatabaseServer()));
        Assert.assertNotNull(db.getId());
        db = databaseService.getDatabaseById(db.getId());
        Assert.assertNotNull(db);
    }
}
