package com.watters.infrastructure.controller;

import com.google.common.collect.Lists;
import com.watters.infrastructure.model.Server;
import com.watters.infrastructure.service.DatabaseService;
import com.watters.infrastructure.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by johnwatters on 25/05/2016.
 */
@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(value = "/servers")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @Autowired
    private DatabaseService databaseService;

    @RequestMapping("/{ENV_ID}/DBServer")
    public @ResponseBody List<ServerDTO> list(@PathVariable("ENV_ID") Long envId, @PathVariable( value = "TYPE") String type)
    {
        List<ServerDTO> serverDTOs = new ArrayList<ServerDTO>();

            List<Server> servers = Lists.newArrayList(databaseService.getDatabasesInEnvironment(envId));
            for (Server server: servers) {
                serverDTOs.add(new ServerDTO(server));
            }
            return serverDTOs;
    }


    @RequestMapping("/{ENV_ID}")
    public @ResponseBody List<ServerDTO> list(@PathVariable("ENV_ID") Long envId)
    {
        List<Server> servers = Lists.newArrayList(serverService.getAllServersForEnvironment(envId));
        List<ServerDTO> serverDTOs = new ArrayList<ServerDTO>();
        for (Server server: servers) {
            serverDTOs.add(new ServerDTO(server));
        }
        return serverDTOs;
    }


}
