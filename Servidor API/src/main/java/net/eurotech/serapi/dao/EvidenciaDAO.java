/**
 * 
 */
package net.eurotech.serapi.dao;

import java.util.List;

import net.eurotech.serapi.entity.Evidencia;

/**
 * @author Carlos
 *
 */
public interface EvidenciaDAO {
	
	public List<Evidencia> findAll();
	
	public Evidencia findById(int id);
	
	public void save(Evidencia evidencia);
	
	public void deleteById(int id);

}
