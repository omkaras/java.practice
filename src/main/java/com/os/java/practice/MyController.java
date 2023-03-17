package com.os.java.practice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("data")
public class MyController {


    private DataToUse dataToUse;

    public MyController(DataToUse dataToUse) {
        this.dataToUse = dataToUse;
    }

    @GetMapping("/api")
    public List<APIInfo> getData(){
        return dataToUse.getApiInfos();
    }
}
