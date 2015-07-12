package fahem.belili.eventmgr.business;

import java.io.Serializable;
import java.util.List;

import fahem.belili.eventmgr.entities.Event;
import fahem.belili.eventmgr.entities.Participant;

/* sp�cifique DAO
 * Dans le but de pouvoir r�cup�rer la liste des events d'un participant(User)
 */
public interface EventService <PK extends Serializable> extends GenericService<Event, PK> {
	
	List<Event> allEventsOfParticipant(Participant participant);
	
}
