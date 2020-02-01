package com.hamendi;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.hamendi.ByeWs")
public class ByeWsImpl implements ByeWs {

    @WebMethod
    public String getByeMsg() {
        String msg = "Bye!";
        System.out.println(msg);
        return msg;
    }
}
