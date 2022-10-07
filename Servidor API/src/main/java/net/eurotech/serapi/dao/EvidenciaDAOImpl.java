package net.eurotech.serapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.eurotech.serapi.entity.Evidencia;

@Repository
public class EvidenciaDAOImpl implements EvidenciaDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Evidencia> findAll(){
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Evidencia> laQuery = currentSession.createQuery("FROM Evidencia", Evidencia.class);
		List<Evidencia> evidencias = laQuery.getResultList();
		return evidencias;
		
	}
	
	@Override
	public Evidencia findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Evidencia evidencia = currentSession.get(Evidencia.class, id);
		return evidencia;
	}
	@Override
	public void save(Evidencia evidencia) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(evidencia);
	}
	
	@Override
	public void deleteById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Evidencia> laQuery = currentSession.createQuery("DELETE FROM evidencia WHERE id_evidencia=:idEvidencia");
		laQuery.setParameter("idEvidencia", id);
		laQuery.executeUpdate();
	}
}

