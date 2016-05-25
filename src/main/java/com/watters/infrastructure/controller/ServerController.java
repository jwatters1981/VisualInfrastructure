package com.watters.infrastructure.controller;

import com.watters.infrastructure.model.Server;
import com.watters.infrastructure.service.DatabaseService;
import com.watters.infrastructure.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by johnwatters on 25/05/2016.
 */
@RestController
@CrossOrigin(origins = "http://localhost:8000", maxAge = 3600)
@RequestMapping(value = "/server")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @Autowired
    private DatabaseService databaseService;

    @RequestMapping("/list/{ENV_ID}/{TYPE}")
    public @ResponseBody Iterable<Server> list(@PathVariable("ENV_ID") Long envId, @PathVariable( value = "TYPE") String type)
    {
        if(type.equalsIgnoreCase("db"))
        {
            return databaseService.getDatabasesInEnvironment(envId);
        }
        return serverService.getAllServersForEnvironment(envId);
    }

    @RequestMapping("/list/{ENV_ID}")
    public @ResponseBody Iterable<Server> list(@PathVariable("ENV_ID") Long envId)
    {
        return serverService.getAllServersForEnvironment(envId);
    }
}
