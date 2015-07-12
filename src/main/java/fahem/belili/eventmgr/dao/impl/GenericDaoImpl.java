package fahem.belili.eventmgr.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import fahem.belili.eventmgr.dao.GenericDao;

public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

	private Class<T> typeDao; // la classe du Dao. example Dao pour Event

	protected EntityManager entityManager;

	public GenericDaoImpl(Class<T> typeDao) {
		super();
		this.typeDao = typeDao;
	}

	@Override
	public PK create(T newInstance) {
		entityManager.persist(typeDao.cast(newInstance));
		/* 
		 * TODO la on pourra jouer avec instance of afin de gérer les cas particuliers.
		 * Dans le cas de Event => maj la table events_participants -recup d'abord le participant puis ...)
		 */
		return null;
	}

	@Override
	public T read(PK id) {
		return entityManager.find(typeDao, id);
	}

	@Override
	public T update(T transientObject) {
		return entityManager.merge(transientObject);
	}

	@Override
	public void delete(T persistentObject) {
		entityManager.remove(persistentObject);
	}

	@Override
	public List<T> readAll() {
		Query query = entityManager.createQuery("select o from "+typeDao.getSimpleName()+" o");
		return query.getResultList();
	}

	/*
	 * TODO a faire spécifique pour chaque entité (non-Javadoc)
	 * selon plusieurs mot clés. on pourra jouer avec instance of afin de gérer les cas particuliers
	 * @see fahem.belili.eventmgr.dao.GenericDao#readByKeyWord(java.util.List)
	 */
	@Override
	public List<T> readByKeyWord(List<String> keyWords) {
		Query query = entityManager.createQuery("select o from "+typeDao.getSimpleName()+" o where o.name like :x");
		query.setParameter("x", "%"+keyWords.get(0)+"%");
		return query.getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


}
