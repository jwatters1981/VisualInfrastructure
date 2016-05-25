package com.watters;

import com.watters.infrastructure.model.Database;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by johnwatters on 28/04/2016.
 */
@RequestMapping("/api")
@RestController
public class WidgetController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public
    @ResponseBody
    Database index() {
        Database database = new Database();
        database.setName("Db Name");
        return database;
    }
}
