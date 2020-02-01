package com.hamendi;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ByeWs {

    @WebMethod
    String getByeMsg();

}
