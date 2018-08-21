package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodServiceImpl {
	
	List<String> moods;
	Map<String, String> reason;
	Random rand;
	
	@PostConstruct
	public void init() {
		moods = new ArrayList<>();
		moods.add("happy");
		moods.add("sad");
		moods.add("angry");
		moods.add("awesome");
		
		rand = new Random();
		
		reason = new HashMap<>();
		reason.put("sad", "because it didn't catch any mice today");
		reason.put("happy", "because it caught a mice today");
		reason.put("angry", "because catalina broke his heart");
		reason.put("awesome", "because it caught 2 mouses today");
	}
	
	public Mood getCurrentMood() {
        int random = rand.nextInt(moods.size());
        return new Mood(moods.get(random));
    }
	
	public Mood getReason(String mood) {
		return new Mood(reason.get(mood));
	}

}
