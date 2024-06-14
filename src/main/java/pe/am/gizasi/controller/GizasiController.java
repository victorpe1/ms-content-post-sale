package pe.am.gizasi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GizasiController {
	

	@PostMapping("/listCliente")
	public String clientes() {
		return "Te entrego tus clientes";
	}
	
}
