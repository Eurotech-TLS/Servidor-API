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

import net.eurotech.serapi.entity.Documento;
import net.eurotech.serapi.service.DocumentoService;

/**
 * @author Carlos
 *
 */
@RestController
@RequestMapping("/documento")
public class DocumentoRestControler {
	
	//Inyectar el servicio correspondiente:
	@Autowired
	private DocumentoService documentoService;
	
	//Método para el GET /documento/all:
	@GetMapping("/all")
	public List<Documento> findAll(){
		// Todos los documentos:
		return documentoService.findAll();
	}

	// Método GET + id de documento /documento/{id}:
	@GetMapping("/documento/{documentoId}")
	public Documento getDocumento(@PathVariable int documentoId) {
		Documento documento = documentoService.findById(documentoId);
		if(documento == null) {
			throw new RuntimeException("El Documento no se ha encontrado");
		}
		return documento;
	}
	
	// Método POST /documento
	@PostMapping("/evidencia")
	public Documento addDocumento(@RequestBody Documento documento) {
//		documento.setId_documento(0);
//		documentoService.save(documento);
		return(documento);
		
	}
	
	// Método PUT /documento
	@PutMapping("/documento")
	public Documento updateDocumento(@RequestBody Documento documento) {
//		documentoService.save(documento);
		return documento;
	}
	
	//Método DELETE /api/evidencia/{id}
	@DeleteMapping
	public String deleteDocumento(@PathVariable int documentoId) {
		
		// Se busca y si existe se borra:
//		Documento documento = documentoService.findById(documentoId);
//		if(documento == null) {
//			throw new RuntimeException("El documento no se ha encontrado");
//		}
//		documentoService.deleteById(documentoId);
		return "La operación no está permitida";
	}
}
