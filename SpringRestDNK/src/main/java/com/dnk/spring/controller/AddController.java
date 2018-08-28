package com.dnk.spring.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dnk.spring.controller.utill.AddUtill;
import com.dnk.spring.model.Add;;

/**
 * Handles requests for the adds service.
 */
@Controller
public class AddController {
	
	private static final Logger logger = LoggerFactory.getLogger(AddController.class);
	
	//Map to store Adds
	Map<Integer, Add> empData = new HashMap<Integer, Add>();
	
	@RequestMapping(value = DNKRestURIConstants.GET_ADDS, method = RequestMethod.GET)
	public @ResponseBody List<Add> getAdds(@PathVariable("type") String type,@PathVariable("start") int start,@PathVariable("length") int length,@PathVariable("id") String addId) {
		
		logger.info("Start getAdds");
		 
		AddUtill addUtill=new  AddUtill();
		
		return addUtill.getAdds(start, length, type, addId);
		
		
	}
	
	@RequestMapping(value = DNKRestURIConstants.GET_ADD, method = RequestMethod.GET)
	public @ResponseBody Add getEmployee(@PathVariable("type") String type,@PathVariable("id") String addId) {
		logger.info("Start getEmployee. ID="+addId);
		
		return empData.get(addId);
	}
	
	@RequestMapping(value = DNKRestURIConstants.GET_ALL_EMP, method = RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmployees() {
		logger.info("Start getAllEmployees.");
		List<Employee> emps = new ArrayList<Employee>();
		Set<Integer> empIdKeys = empData.keySet();
		for(Integer i : empIdKeys){
			emps.add(empData.get(i));
		}
		return emps;
	}
	
	@RequestMapping(value = DNKRestURIConstants.CREATE_EMP, method = RequestMethod.POST)
	public @ResponseBody Employee createEmployee(@RequestBody Employee emp) {
		logger.info("Start createEmployee.");
		emp.setCreatedDate(new Date());
		empData.put(emp.getId(), emp);
		return emp;
	}
	
	@RequestMapping(value = DNKRestURIConstants.DELETE_EMP, method = RequestMethod.PUT)
	public @ResponseBody Employee deleteEmployee(@PathVariable("id") int empId) {
		logger.info("Start deleteEmployee.");
		Employee emp = empData.get(empId);
		empData.remove(empId);
		return emp;
	}
	
}
