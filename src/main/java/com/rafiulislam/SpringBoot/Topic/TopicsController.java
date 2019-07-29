package com.rafiulislam.SpringBoot.Topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@Autowired
	private TopicService topicService;

	@GetMapping("/topics")
	public List<Topics> showTopics() {

		return topicService.getAllTopics();
	}

	@GetMapping(value = "/topics/{id}")
	public Optional<Topics> showTopicindividual(@PathVariable("id") String id) {

		return topicService.getIndividualTopic(id);
	}

	@PostMapping("/topics")
	public Topics postTopicindividual(@RequestBody Topics topicRepo) {

		topicService.addTopic(topicRepo);
		return topicRepo;
	}

	@PutMapping("/topics/{id}")
	public Topics updateTopicindividual(@PathVariable("id") String id, @RequestBody Topics topicRepo) {

		topicService.updateTopic(id, topicRepo);
		return topicRepo;
	}

	@DeleteMapping("/topics/{id}")
	public String deleteTopicindividual(@PathVariable("id") String id) {

		topicService.deleteTopic(id);
		return "Deleted";
	}

}
