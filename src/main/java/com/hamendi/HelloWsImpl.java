package com.hamendi;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.hamendi.HelloWs")
public class HelloWsImpl implements HelloWs {

    @WebMethod
    public String getHelloMsg(String name) {
        String msg = "Hello " + name + "!";
        System.out.println(msg);
        return msg;
    }

}
