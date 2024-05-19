package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormClienteController {
	@GetMapping("/formulario")
	public String getFormCliente() {
		return "form-cliente";
	}
	
}
