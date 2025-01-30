package com.cricket.scores_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchSetup {
    private String matchType;
    private String striker;
    private String nonStriker;
    private String bowler;
}