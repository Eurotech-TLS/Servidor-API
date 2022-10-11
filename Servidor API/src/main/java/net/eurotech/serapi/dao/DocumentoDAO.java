/**
 * 
 */
package net.eurotech.serapi.dao;

import java.util.List;

import net.eurotech.serapi.entity.Documento;

/**
 * @author cfuente
 *
 */
public interface DocumentoDAO {
	
	public List<Documento> findAll();
	
	public Documento findById(int id);
	
	public void save(Documento documento);
	
	public void deleteById(int id);
	
	public Documento findByHash(String hashId);


}
