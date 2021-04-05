package com.safre.coppel.springbase.controllador;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;

/**
 * @author christopher J. Siverio 01/12/2020 Afore Coppel
 */
@RestController
@RequestMapping("/hola")
public class ExampleController {


	@GetMapping(value = "/mundo",  produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject findByCLV(HttpServletResponse servletResponse) {

		JSONObject jsonObject = new JSONObject();

		servletResponse.setStatus(HttpServletResponse.SC_OK);
		jsonObject.put("status", HttpServletResponse.SC_OK);
		jsonObject.put("result", "Hola Mundo");

		return jsonObject;
	}

}
