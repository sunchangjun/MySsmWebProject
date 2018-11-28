/**
 * 
 */
package com.sun.project.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


/**
 * @author sunchangjunn
 * 2018年11月27日下午6:01:10
 */
@WebService(targetNamespace="iptv", name="CSPResponseService", portName="ctms")
public interface MyWebService {
	
    @WebMethod(operationName="ResultNotify", action = "")
    @WebResult(name = "ResultNotifyReturn", targetNamespace = "iptv")
    public void ResultNotify(
            @WebParam(name = "CSPID", targetNamespace = "iptv") String CSPID,
            @WebParam(name = "LSPID", targetNamespace = "iptv") String LSPID,
            @WebParam(name = "CorrelateID", targetNamespace = "iptv") String CorrelateID,
            @WebParam(name = "CmdResult", targetNamespace = "iptv") int CmdResult,
            @WebParam(name = "ResultFileURL", targetNamespace = "iptv") String ResultFileURL
    );

}
