package net.carmgate.gtd.jpa.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	@Id
	private int id;
	private String name;
	
	@ManyToMany(mappedBy="tags")
	private Set<Stuff> stuffs;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Set<Stuff> getStuffs() {
		return stuffs;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStuffs(Set<Stuff> stuffs) {
		this.stuffs = stuffs;
	}
}
