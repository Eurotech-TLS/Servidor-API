/**
 * 
 */
package net.eurotech.serapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.eurotech.serapi.dao.DocumentoDAO;
import net.eurotech.serapi.entity.Documento;

/**
 * @author cfuente
 *
 */
@Service
public class DocumentoServiceImpl implements DocumentoService{
	
	@Autowired
	private DocumentoDAO documentoDAO;
	
	@Override
	public List<Documento> findAll() {
		List<Documento> documentos = documentoDAO.findAll();
		return documentos;
	}
	
	@Override
	public Documento findById(int id) {
		Documento documento = documentoDAO.findById(id);
		return documento;
	}
	
	@Override
	public void save(Documento evidencia) {
		documentoDAO.save(evidencia);
	}
	
	@Override 
	public void deleteById(int id) {
		documentoDAO.deleteById(id);
	}

}
