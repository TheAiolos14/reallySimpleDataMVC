package com.miniMadrid.demo.miniMadrid.api;

import com.miniMadrid.demo.miniMadrid.entity.Data;
import com.miniMadrid.demo.miniMadrid.service.DataService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DataController {

    private DataService dataService;

    @RequestMapping(
            value = "/api/data",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Data findById(@RequestBody Data data){
        return (Data) dataService.findById(data);
    }

}
