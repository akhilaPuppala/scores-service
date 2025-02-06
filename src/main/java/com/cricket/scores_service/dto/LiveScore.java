package com.cricket.scores_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LiveScore {
	    private int runs;
	    private String extraType; // e.g., wide, no-ball
	    private boolean isWicket;
	}

