package fahem.belili.eventmgr.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import fahem.belili.eventmgr.dao.EventDao;
import fahem.belili.eventmgr.entities.Event;
import fahem.belili.eventmgr.entities.Participant;

public class EventDaoImpl extends GenericDaoImpl<Event, Serializable> implements EventDao<Serializable> {

	/*
	 *  FR> le constructeur est sans paramère car on sais trés bien qu'il s'agit de Event 
	 */
	public EventDaoImpl() {
		super(Event.class);
	}

	@Override
	public List<Event> allEventsOfParticipant(Participant participant) {
		Query query = entityManager.createQuery("select p from participants p");
		return query.getResultList();
	}
}
