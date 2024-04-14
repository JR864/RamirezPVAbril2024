package ar.edu.unju.edm.pv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class InicioController {
	@GetMapping("/inicio")
	public String getIndexPage(Model model) {
		return "index";
	}
}
