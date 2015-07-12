package fahem.belili.eventmgr.business.impl;

import java.io.Serializable;

import fahem.belili.eventmgr.business.AdminService;
import fahem.belili.eventmgr.dao.UserDao;
import fahem.belili.eventmgr.entities.Role;
import fahem.belili.eventmgr.entities.User;

/**
 * CETTE classe et l'interface associé dois etre refaite du fait qu'elle ne
 * respecte pas le principe de l'interfaçage
 * 
 * @author Fahem
 *
 */
public class AdminServiceImpl implements AdminService {

	private UserDao<Serializable> daoUser;

	@Override
	public void setRoleForUser(Role r, User u) {
		daoUser.setRoleForUser(r, u);
	}

	public UserDao<Serializable> getDaoUser() {
		return daoUser;
	}

	public void setDaoUser(UserDao<Serializable> daoUser) {
		this.daoUser = daoUser;
	}

}
