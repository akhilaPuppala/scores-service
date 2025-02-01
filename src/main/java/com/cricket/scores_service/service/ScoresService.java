package com.cricket.scores_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.cricket.scores_service.dto.LiveScore;
import com.cricket.scores_service.dto.MatchSetup;
import com.cricket.scores_service.entity.Scores;
import com.cricket.scores_service.repository.ScoreRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ScoresService {
    
    @Autowired
    ScoreRepository scoreRepository;

    public Scores createScores(Scores score){
        return scoreRepository.save(score);
    }
    // private SimpMessagingTemplate messagingTemplate;

    // @KafkaListener(topics = "match-setup", groupId = "score-group")
    // public void consumeMatchSetup(MatchSetup matchSetup) {
    //     System.out.println("Received Match Setup: " + matchSetup);
    //     // Initialize score tracking logic here
    // }

    // @KafkaListener(topics = "live-scores", groupId = "score-group")
    // public void consumeLiveScores(String liveScore) {
    //     System.out.println("Received Live Score Update: " + liveScore);
    //     // Update score based on the incoming data
    // }
    public Scores getById(int id){
        return scoreRepository.findById(id).orElse(null);
    }
    public List<Scores> getAllScores(){
        return scoreRepository.findAll();
    }

}
