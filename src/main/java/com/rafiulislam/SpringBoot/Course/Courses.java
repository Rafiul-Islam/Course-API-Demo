package com.rafiulislam.SpringBoot.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.rafiulislam.SpringBoot.Topic.Topics;

@Entity
public class Courses {

	@Id
	private String id;
	private String name;
	private String discussions;

	@ManyToOne
	private Topics topics;

	public Courses() {

	}

	public Courses(String id, String name, String discussions, String topicsId) {
		this.id = id;
		this.name = name;
		this.discussions = discussions;
		this.topics = new Topics(topicsId, "", "");
	}

	public Topics getTopics() {
		return topics;
	}

	public void setTopics(Topics topics) {
		this.topics = topics;
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
