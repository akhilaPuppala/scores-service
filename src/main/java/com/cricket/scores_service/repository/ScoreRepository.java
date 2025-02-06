package com.cricket.scores_service.repository;

import org.springframework.stereotype.Repository;
import com.cricket.scores_service.entity.Scores;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ScoreRepository extends JpaRepository<Scores,Integer>{
    
}
