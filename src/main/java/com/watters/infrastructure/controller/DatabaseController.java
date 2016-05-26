package com.watters.infrastructure.controller;

import com.google.common.collect.Lists;
import com.watters.infrastructure.model.Database;
import com.watters.infrastructure.model.Server;
import com.watters.infrastructure.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnwatters on 26/05/2016.
 */
@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(value = "/databases")
public class DatabaseController {

    @Autowired
    private DatabaseService databaseService;

    @RequestMapping("/{ENV_ID}/DBServer/{DB_SERVER_ID}/Databases")
    public @ResponseBody
    List<DatabaseDTO> list(@PathVariable("ENV_ID") Long envId, @PathVariable("DB_SERVER_ID") Long dbServerId)
    {
        List<DatabaseDTO> databaseDTOs = new ArrayList<DatabaseDTO>();

        List<Database> databases = Lists.newArrayList(databaseService.getDatabaseByServer(dbServerId));
        for (Database database: databases) {
            databaseDTOs.add(new DatabaseDTO(database));
        }
        return databaseDTOs;
    }
}
