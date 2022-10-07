/**
 * 
 */
package net.eurotech.serapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.eurotech.serapi.entity.Evidencia;
import net.eurotech.serapi.service.EvidenciaService;

/**
 * @author cfuente
 *
 */
@RestController
@RequestMapping("/api")
public class EvidenciaRestControler {
	
	//Inyectar el servicio correspondiente:
	@Autowired
	private EvidenciaService evidenciaService;
	
	//Método para el GET /api/evidencia:
	@GetMapping("/evidencia")
	public List<Evidencia> findAll(){
		// Todas las evidencias:
		return evidenciaService.findAll();
	}

	// Método GET + id de evidencia /api/evidencia/{id}:
	@GetMapping("/evidencia/{evidenciaId}")
	public Evidencia getEvidencia(@PathVariable int evidenciaId) {
		Evidencia evidencia = evidenciaService.findById(evidenciaId);
		if(evidencia == null) {
			throw new RuntimeException("La Evidencia no se ha encontrado");
		}
		return evidencia;
	}
	
	// Método POST /api/evidencia
	@PostMapping("/evidencia")
	public Evidencia addEvidencia(@RequestBody Evidencia evidencia) {
		evidencia.setId_evidencia(0);
		evidenciaService.save(evidencia);
		return(evidencia);
	}
	
	// Método PUT /api/evidencia
	@PutMapping("/evidencia")
	public Evidencia updateEvidencia(@RequestBody Evidencia evidencia) {
//		evidenciaService.save(evidencia);
		return evidencia;
	}
	
	//Método DELETE /api/evidencia/{id}
	@DeleteMapping
	public String deleteEvidencia(@PathVariable int evidenciaId) {
		
		// Se busca y si existe se borra:
//		Evidencia evidencia = evidenciaService.findById(evidenciaId);
//		if(evidencia == null) {
//			throw new RuntimeException("La Evidencia no se ha encontrado");
//		}
//		evidenciaService.deleteById(evidenciaId);
		return "La operación no está permitida";
	}
}
