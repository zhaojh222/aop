package com.zjh.controller;

import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jiazhao on 4/11/18.
 */
@Component
@Path("/rest")
public class RestfulService {

    @Path("/test")
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String test(String name){
        return name.toUpperCase();
    }
}
