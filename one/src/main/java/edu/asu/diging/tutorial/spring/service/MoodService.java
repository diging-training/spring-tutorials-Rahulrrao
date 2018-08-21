package edu.asu.diging.tutorial.spring.service;

import edu.asu.diging.tutorial.spring.domain.Mood;

public interface MoodService {
	public Mood getCurrentMood();
	public Mood getReason(String mood);
}
