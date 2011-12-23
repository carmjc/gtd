package net.carmgate.gtd.services;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.carmgate.gtd.jpa.beans.Stuff;

import org.springframework.stereotype.Service;

@Service
public class StuffService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Collection<Stuff> getStuffs() {
		Query q = entityManager.createQuery("from Stuff");
		return q.getResultList();
	}
}
