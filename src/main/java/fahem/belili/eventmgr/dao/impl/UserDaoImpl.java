package fahem.belili.eventmgr.dao.impl;

import java.io.Serializable;

import fahem.belili.eventmgr.dao.UserDao;
import fahem.belili.eventmgr.entities.Role;
import fahem.belili.eventmgr.entities.User;

public class UserDaoImpl extends GenericDaoImpl<User, Serializable> implements UserDao<Serializable> {

	public UserDaoImpl() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setRoleForUser(Role r, User u) {
		u.getRoles().add(r);
		entityManager.merge(u);
	}

}
