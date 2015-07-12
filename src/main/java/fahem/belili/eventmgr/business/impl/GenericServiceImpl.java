package fahem.belili.eventmgr.business.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import fahem.belili.eventmgr.business.GenericService;
import fahem.belili.eventmgr.dao.GenericDao;

@Transactional
public class GenericServiceImpl<T, PK extends Serializable> implements GenericService<T, PK> {

	private Class<T> typeDao; // la classe du Dao. example Dao pour Event

	protected GenericDao<T, Serializable> dao;

	public GenericServiceImpl(Class<T> typeDao) {
		super();
		this.setTypeDao(typeDao);
	}

	@Override
	public PK create(T newInstance) {
		System.err.println("create");
		dao.create(newInstance);
		/* 
		 * TODO la on pourra jouer avec instance of afin de gérer les cas particuliers.
		 * Dans le cas de Event => maj la table events_participants -recup d'abord le participant puis ...)
		 */
		return null;
	}

	@Override
	public T read(PK id) {
		return dao.read(id);
	}

	@Override
	public T update(T transientObject) {
		return (T) dao.update(transientObject);
	}

	@Override
	public void delete(T persistentObject) {
		dao.delete(persistentObject);
	}

	@Override
	public List<T> readAll() {
		return dao.readAll();
	}

	/*
	 * TODO a faire spécifique pour chaque entité (non-Javadoc)
	 * selon plusieurs mot clés. on pourra jouer avec instance of afin de gérer les cas particuliers
	 * @see fahem.belili.eventmgr.dao.GenericDao#readByKeyWord(java.util.List)
	 */
	@Override
	public List<T> readByKeyWord(List<String> keyWords) {
		return dao.readByKeyWord(keyWords);
	}

	public GenericDao<T, Serializable> getDao() {
		return dao;
	}

	public void setDao(GenericDao<T, Serializable> dao) {
		this.dao = dao;
	}

	public Class<T> getTypeDao() {
		return typeDao;
	}

	public void setTypeDao(Class<T> typeDao) {
		this.typeDao = typeDao;
	}
}
