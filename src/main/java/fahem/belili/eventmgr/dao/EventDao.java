package fahem.belili.eventmgr.dao;

import java.io.Serializable;
import java.util.List;

import fahem.belili.eventmgr.entities.Event;
import fahem.belili.eventmgr.entities.Participant;

/* sp�cifique DAO
 * Dans le but de pouvoir r�cup�rer la liste des events d'un participant(User)
 */
public interface EventDao <PK extends Serializable> extends GenericDao<Event, PK> {
	
	List<Event> allEventsOfParticipant(Participant participant);
	
}
