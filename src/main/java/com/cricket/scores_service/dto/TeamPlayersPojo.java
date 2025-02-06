package com.cricket.scores_service.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamPlayersPojo {
    private int playerId; 
    private int playerName;// Foreign Key referencing Players.id
    private int playerRuns;
    private int playerWickets;
    private int playerCatches;
        
    
}
