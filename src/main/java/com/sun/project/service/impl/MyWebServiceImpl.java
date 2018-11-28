/**
 * 
 */
package com.sun.project.service.impl;

import javax.jws.WebService;

import com.sun.project.service.MyWebService;


/**
 * @author sunchangjunn
 * 2018年11月27日下午6:01:56
 */
@WebService(name = "ctms",
portName = "ctms",
serviceName = "CSPResponseService", 
targetNamespace = "iptv", 
wsdlLocation = "classpath:hndx-callback.wsdl")
public class MyWebServiceImpl implements MyWebService {


	public void ResultNotify(String CSPID, String LSPID, String CorrelateID, int CmdResult, String ResultFileURL) {
		// TODO Auto-generated method stub
		
	}
	


}
