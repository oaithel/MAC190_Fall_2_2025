package com.mac190.reviewfinal;

import java.util.Objects;

abstract class Game {
    private String teamA, teamB;
    protected int scoreA, scoreB;
    protected int  subsA, subsB;
    protected int maxSubs, numPlayers;

    //default constructor
    public Game(){
        teamA = teamB = "N/A";
        scoreA = scoreB = numPlayers = subsA = subsB = maxSubs = 0;
    }
    public Game(String tA, String tB, int nP, int mS) throws GameDataException{
        teamA = tA;
                teamB = tB;
        scoreA = scoreB = 0;
        if(nP <= 0){
            throw new GameDataException("Number of player should be more than 1");
        }
        numPlayers = nP;
        subsA = subsB = 0;
        maxSubs = mS;
    }

    public String getTeamA() {
        return teamA;
    }
    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }
    public String getTeamB() {
        return teamB;
    }
    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }
    public int getNumPlayers() {
        return numPlayers;
    }
    public int getSubsA() {
        return subsA;
    }
    public int getSubsB() {
        return subsB;
    }
    public int getMaxSubs() {
        return maxSubs;
    }
    public int getScoreA() {
        return scoreA;
    }
    public int getScoreB() {
        return scoreB;
    }

    @Override
    public String toString() {
        return "Game{" +
                "teamA='" + teamA + '\'' +
                ", teamB='" + teamB + '\'' +
                ", scoreA=" + scoreA +
                ", scoreB=" + scoreB +
                ", numPlayers=" + numPlayers +
                ", subsA=" + subsA +
                ", subsB=" + subsB +
                ", maxSubs=" + maxSubs +
                '}';
    }
    public boolean equals(Game g) {
        if (this == g) return true;
        return scoreA == g.scoreA && scoreB == g.scoreB && numPlayers == g.numPlayers && subsA == g.subsA
                && subsB == g.subsB && maxSubs == g.maxSubs &&
                Objects.equals(teamA, g.teamA) && Objects.equals(teamB, g.teamB);
    }

    public abstract void teamAScored(int points);
    public abstract void teamBScored(int points);
    public abstract void substituteA(int num);
    public abstract void substituteB(int num);
    public String whoIsWinning(){
        if(this.getScoreA() > this.getScoreB()){
            return teamA;
        }else if(this.getScoreA() < this.getScoreB()){
            return teamB;
        }else{
            return "Draw";
        }
    }
}
