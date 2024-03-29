package com.rafiulislam.SpringBoot.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {

	@Id
	private String id;
	private String name;
	private String discussions;

	public Topics() {

	}

	public Topics(String id, String name, String discussions) {
		this.id = id;
		this.name = name;
		this.discussions = discussions;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscussions() {
		return discussions;
	}

	public void setDiscussions(String discussions) {
		this.discussions = discussions;
	}

}
