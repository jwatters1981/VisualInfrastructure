package com.watters.infrastructure.controller;

import com.watters.infrastructure.model.Environment;
import com.watters.infrastructure.service.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnwatters on 08/05/2016.
 */
@RestController
@RequestMapping(value = "/env")
@CrossOrigin(maxAge = 3600)
public class EnvironmentController {

    @Autowired
    private EnvironmentService environmentService;

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<EnvBean> list() {
        List<EnvBean> envBeans = new ArrayList<EnvBean>();
        Iterable<Environment> environments = environmentService.getAllEnvironments();
        for (Environment env : environments) {
            envBeans.add(new EnvBean(env));
        }
        return envBeans;
    }
}
