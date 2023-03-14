package com.saiyans.programming.controller;

import java.util.List;

import com.saiyans.programming.entity.Ropa;
import com.saiyans.programming.service.IntRopaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/prendas")
public class RopaController {
 
	@Autowired
	private IntRopaService serviceRopa;
	
	@PostMapping("/guardar")
	public String guardar(@RequestParam("tipo") String tipo,
			              @RequestParam("talla") Integer talla, @RequestParam("precio") Double precio) {
		Ropa p = new Ropa();
		p.setId(serviceRopa.obtenerRopa().size()+1);
		p.setTipo(tipo);
		p.setTalla(talla);
		p.setPrecio(precio);
		serviceRopa.guardar(p);
		return "redirect:/prendas/index";
	}
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Ropa> prendas = serviceRopa.obtenerRopa();
		model.addAttribute("prendas", prendas);
		model.addAttribute("total", serviceRopa.numeroRopa());
		return "prendas/listaRopa";
	}
	
	@GetMapping("/nueva")
	public String nuevaCategoria() {
		return "prendas/listaRopa";
	}
	
	@GetMapping("/eliminar")
	public String eliminarCategoria(@RequestParam("id") int idRopa, RedirectAttributes model) {
		model.addFlashAttribute("msg", "Prenda Eliminada");
		serviceRopa.eliminar(idRopa);
		return "redirect:/prendas/index";
	}
}