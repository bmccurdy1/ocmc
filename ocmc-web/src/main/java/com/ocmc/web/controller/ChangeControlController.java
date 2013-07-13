package com.ocmc.web.controller;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ocmc.web.PriorityService;
import com.ocmc.web.PriorityService_Service;

import beans.ws.ocmc.com.PriorityCollectionType;
import beans.ws.ocmc.com.PriorityType;

@Controller
@RequestMapping("/changeControl")
public class ChangeControlController {
    private static final QName SERVICE_NAME = new QName("com.ocmc.ws.services", "PriorityService");
    private PriorityService port;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getAllPriorities(ModelMap model){
		initService();
		beans.ws.ocmc.com.PriorityCollectionType priorityCollection = port.getAllPriorities();
		List<PriorityType> p = (List)priorityCollection.getPriorities().getPriority();
		model.addAttribute("priorities", p);
		
		return "index";
	}
	
	private void initService(){
		URL wsdlURL = PriorityService_Service.WSDL_LOCATION; 
      
        PriorityService_Service ss = new PriorityService_Service(wsdlURL, SERVICE_NAME);
        port = ss.getPriorityServiceImplPort();
	}
	

}
