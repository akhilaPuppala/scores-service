package com.cricket.scores_service.entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scores {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id; // Primary Key

    @Column(name="game_total_over")
    private int gameTotalOvers;
    
    @Column(name="striker_runs")
    private int strikerRuns;

    @Column(name="wide_ball")
    private int wideBall;

    @Column(name="game_wickets")
    private int gameWickets;

    @Column(name="game_ball_no")
    private int gameBallNo;

    @Column(name="striker_player_id")
    private int strikerPlayerId;

    @Column(name="non_striker_player_id")
    private int nonStrikerPlayerId;

    @Column(name="bowler_id")
    private int bowlerId;

    
    
   
    
}
