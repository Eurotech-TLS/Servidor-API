/**
 * 
 */
package net.eurotech.serapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.eurotech.serapi.dao.EvidenciaDAO;
import net.eurotech.serapi.entity.Evidencia;

/**
 * @author cfuente
 *
 */
@Service
public class EvidenciaServiceImpl implements EvidenciaService{
	
	@Autowired
	private EvidenciaDAO evidenciaDAO;
	
	@Override
	public List<Evidencia> findAll() {
		List<Evidencia> evidencias = evidenciaDAO.findAll();
		return evidencias;
	}
	
	@Override
	public Evidencia findById(int id) {
		Evidencia evidencia = evidenciaDAO.findById(id);
		return evidencia;
	}
	
	@Override
	public void save(Evidencia evidencia) {
		evidenciaDAO.save(evidencia);
	}
	
	@Override 
	public void deleteById(int id) {
		evidenciaDAO.deleteById(id);
	}

}
