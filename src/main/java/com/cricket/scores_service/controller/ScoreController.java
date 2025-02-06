package com.cricket.scores_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.scores_service.dto.ScoresPojo;
import com.cricket.scores_service.entity.Scores;
import com.cricket.scores_service.service.ScoresService;

@RequestMapping("/scores")
@RestController
public class ScoreController {
    @Autowired
    ScoresService scoresService;

    @RequestMapping()
    public ResponseEntity<Scores> createScores(@RequestBody Scores newScore){
        return new ResponseEntity<Scores>(scoresService.createScores(newScore),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Scores> getById(@PathVariable int id){
        return new ResponseEntity<Scores>(scoresService.getById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Scores>> getAllScores(){
        return new ResponseEntity<List<Scores>>(scoresService.getAllScores(),HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Scores> updateScores(@RequestBody Scores updateScore){
    	return new ResponseEntity<Scores>(scoresService.updateScores(updateScore),HttpStatus.OK);
    }
}