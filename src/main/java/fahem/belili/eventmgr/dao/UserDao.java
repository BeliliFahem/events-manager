package fahem.belili.eventmgr.dao;

import java.io.Serializable;

import fahem.belili.eventmgr.entities.Event;
import fahem.belili.eventmgr.entities.Role;
import fahem.belili.eventmgr.entities.User;

public interface UserDao <PK extends Serializable> extends GenericDao<User, PK> {
	
	void setRoleForUser(Role r, User u);
	
}
