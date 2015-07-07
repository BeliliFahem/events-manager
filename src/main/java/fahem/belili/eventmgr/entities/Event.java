package fahem.belili.eventmgr.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="events")
public class Event implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	@Size(min=3, max=25)
	private String title;
	
	private String summary;
	
	// date de l'event
	@NotEmpty
	private Date date;
	
	// card
	@ManyToMany
	private Collection<Participant> participants;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(long id, String title, String summary, Date date) {
		super();
		this.title = title;
		this.summary = summary;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Collection<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(Collection<Participant> participants) {
		this.participants = participants;
	}
	
	

}
