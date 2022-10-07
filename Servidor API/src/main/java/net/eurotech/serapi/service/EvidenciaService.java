/**
 * 
 */
package net.eurotech.serapi.service;

import java.util.List;

import net.eurotech.serapi.entity.Evidencia;

/**
 * @author Carlos
 *
 */
public interface EvidenciaService {
	
	public List<Evidencia> findAll();
	public Evidencia findById(int id);
	public void save(Evidencia evidencia);
	public void deleteById(int id);

}
