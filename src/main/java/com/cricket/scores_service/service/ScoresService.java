package com.cricket.scores_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
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

    public Scores updateScores(Scores updateScores) {
        // Find the existing score by ID
        Scores existingScore = scoreRepository.findById(updateScores.getId()).orElse(null);

        if (existingScore == null) {
            throw new RuntimeException("Score with ID " + updateScores.getId() + " not found");
        }

        // Update only the necessary fields
        existingScore.setBowlerId(updateScores.getBowlerId());
        existingScore.setGameBallNo(updateScores.getGameBallNo());
        existingScore.setGameTotalOvers(updateScores.getGameTotalOvers());
        existingScore.setGameWickets(updateScores.getGameWickets());
        existingScore.setNonStrikerPlayerId(updateScores.getNonStrikerPlayerId());
        existingScore.setStrikerPlayerId(updateScores.getStrikerPlayerId());
        existingScore.setStrikerRuns(updateScores.getStrikerRuns());
        existingScore.setWideBall(updateScores.getWideBall());

        // Save the updated entity
        return scoreRepository.save(existingScore);
    }
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
