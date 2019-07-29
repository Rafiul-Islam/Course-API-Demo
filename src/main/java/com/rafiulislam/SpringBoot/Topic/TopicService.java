package com.rafiulislam.SpringBoot.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	private List<Topics> topics = new ArrayList<>(Arrays.asList(new Topics("101", "Test", "Java"),
			new Topics("102", "Test2", "Spring"), new Topics("103", "Test3", "Spring Boot")));

	public List<Topics> getAllTopics() {

		List<Topics> topics = new ArrayList<Topics>();
		topicRepository.findAll().forEach(topics::add);

		return topics;
	}

	public Optional<Topics> getIndividualTopic(String id) {
		return topicRepository.findById(id);
	}

	public void addTopic(Topics topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

	public void updateTopic(String id, Topics topicRepo) {
		topicRepository.save(topicRepo);
	}
}
