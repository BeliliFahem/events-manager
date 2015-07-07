package fahem.belili.eventmgr.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;

@Entity
@Table(name="users")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private long id;
	
	private String name;
	private String password;
	private boolean activated;
	
	// card 
	@OneToMany
	@JoinColumn(name="userID")
	private Collection<Role> roles;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String password, boolean activated, Collection<Role> roles) {
		super();
		this.name = name;
		this.password = password;
		this.activated = activated;
		this.roles = roles;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
	
	
	
}
