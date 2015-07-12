package fahem.belili.eventmgr.business.impl;

import java.io.Serializable;
import java.util.List;

import fahem.belili.eventmgr.business.EventService;
import fahem.belili.eventmgr.dao.EventDao;
import fahem.belili.eventmgr.entities.Event;
import fahem.belili.eventmgr.entities.Participant;

public class EventServiceImpl extends GenericServiceImpl<Event, Serializable>implements EventService<Serializable> {

	// TODO inject dependency
	private EventDao<Event> eventDao;

	/*
	 * FR> le constructeur est sans paramère car on sais trés bien qu'il s'agit
	 * de Event
	 */
	public EventServiceImpl() {
		super(Event.class);
	}

	@Override
	public List<Event> allEventsOfParticipant(Participant participant) {
		return eventDao.allEventsOfParticipant(participant);
		// return null;
	}

	public void setEventDao(EventDao<Event> eventDao) {
		this.eventDao = eventDao;
	}

}
