package net.eurotech.serapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.eurotech.serapi.entity.Documento;

@Repository
public class DocumentoDAOImpl implements DocumentoDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Documento> findAll(){
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Documento> laQuery = currentSession.createQuery("FROM Documento", Documento.class);
		List<Documento> documentos = laQuery.getResultList();
		return documentos;
		
	}
	
	@Override
	public Documento findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Documento documento = currentSession.get(Documento.class, id);
		return documento;
	}
	@Override
	public void save(Documento documento) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(documento);
	}
	
	@Override
	public void deleteById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Documento> laQuery = currentSession.createQuery("DELETE FROM documento WHERE id_documento=:idDocumento");
		laQuery.setParameter("idDocumento", id);
		laQuery.executeUpdate();
	}

	@Override
	public Documento findByHash(String hashId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Documento> laQuery = currentSession.createNativeQuery("SELECT *  FROM Documento WHERE hash_md5 LIKE(:hash_md5) LIMIT 1", Documento.class);
		laQuery.setParameter("hash_md5", hashId);
		return (Documento) laQuery.getSingleResult();
	}
}
