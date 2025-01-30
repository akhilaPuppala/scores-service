package com.cricket.scores_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.cricket.scores_service.dto.LiveScore;
import com.cricket.scores_service.dto.MatchSetup;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ScoresService {
    
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @KafkaListener(topics = "match-setup", groupId = "score-group")
    public void consumeMatchSetup(MatchSetup matchSetup) {
        System.out.println("Received Match Setup: " + matchSetup);
        // Initialize score tracking logic here
    }

    @KafkaListener(topics = "live-scores", groupId = "score-group")
    public void consumeLiveScores(String liveScore) {
        System.out.println("Received Live Score Update: " + liveScore);
        // Update score based on the incoming data
    }
}
