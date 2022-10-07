/**
 * 
 */
package net.eurotech.serapi.service;

import java.util.List;

import net.eurotech.serapi.entity.Documento;

/**
 * @author cfuente
 *
 */
public interface DocumentoService {
	
	public List<Documento> findAll();
	public Documento findById(int id);
	public void save(Documento documento);
	public void deleteById(int id);

}
