package com.hamendi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWs {

    @WebMethod
    String getHelloMsg(@WebParam(name = "name") String name);

}
