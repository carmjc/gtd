package net.carmgate.gtd.jpa.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(name = "STUFF_GEN", table = "Stuff", pkColumnName = "id")
public class Stuff implements Serializable {

	@Id
	@SequenceGenerator(name = "STUFF_SEQ_GEN", sequenceName = "STUFF_SEQ")
	private int id;
	private String name;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(joinColumns=@JoinColumn(name="stuffId"), inverseJoinColumns=@JoinColumn(name="tagId"))
	@OrderBy("name ASC")
	private Set<Tag> tags;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	} 
}
