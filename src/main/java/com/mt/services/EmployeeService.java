package com.mt.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@Controller
@RequestMapping("/employee")
public class EmployeeService {

	
	@RequestMapping(value = "/getEmployeeDetails", method = RequestMethod.GET)
	@ResponseBody
	String uploadImage(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws JSONException, UnknownHostException {

		JSONObject js = new JSONObject();
		js.put("Name", "Mithun Technologies");
		js.put("Calling Name", "Mithun");
		js.put("DOB", "08-Nov-2011");
		js.put("Hobbies", "Reading Technical Blogs,Teaching, Helping to Poor People..");
		js.put("Places he like", "His native place");
		js.put("Machine IP", Inet4Address.getLocalHost().getHostAddress());
		return js.toString();
	}

}
