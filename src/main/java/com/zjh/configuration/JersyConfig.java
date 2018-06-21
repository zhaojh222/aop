package com.zjh.configuration;

import com.zjh.controller.RestfulService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by jiazhao on 4/11/18.
 */

@Component
public class JersyConfig extends ResourceConfig {

    @PostConstruct
    public void addEndpoint(){
        register(RestfulService.class);
    }
}
