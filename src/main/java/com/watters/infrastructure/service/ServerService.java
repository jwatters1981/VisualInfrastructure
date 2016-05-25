package com.watters.infrastructure.service;

import com.watters.infrastructure.model.Server;
import com.watters.infrastructure.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by johnwatters on 25/05/2016.
 */
@Service
public class ServerService {

    @Autowired
    private ServerRepository serverRepository;

    public Iterable<Server> getAllServersForEnvironment(Long envId)
    {
        return serverRepository.findByEnvironmentId(envId);
    }
}
