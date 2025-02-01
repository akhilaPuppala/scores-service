package com.cricket.scores_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoresPojo {
      private int id; // Primary Key
    private int gameTotalOvers;
    private int strikerRuns;
    private int wideBall;
    private int gameWickets;
    private int gameBallNo;
    TeamPlayersPojo gameStrikerPlayer;
    TeamPlayersPojo NonStrikerPlayer;
    TeamPlayersPojo bowler;
}
