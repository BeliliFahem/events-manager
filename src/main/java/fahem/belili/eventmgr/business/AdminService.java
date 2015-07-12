package fahem.belili.eventmgr.business;

import fahem.belili.eventmgr.entities.Role;
import fahem.belili.eventmgr.entities.User;

/**
 * Gestion des User et des Roles
 * 
 * @author Fahem
 *
 */
public interface AdminService {

	void setRoleForUser(Role r, User u);

	// USER : sont generique (Crud

	
	// ROLE : sont generique (Crud

}