package com.mac190.reviewfinal;

import java.util.ArrayList;

public class SoccerGame extends Game implements Mergeable{
    private String refereeName;

    public SoccerGame(){
        super();
        maxSubs = 5;
        numPlayers = 11;
        refereeName = "N/A";
    }
    public SoccerGame(String tA, String tB, String ref){
        super();
        maxSubs = 5;
        numPlayers = 11;
        refereeName = ref;
        this.setTeamA(tA);
        this.setTeamB(tB);
    }
    public SoccerGame(String tA, String tB, int np, int mS, String ref)throws GameDataException {
        super(tA, tB, np, mS);
        refereeName = ref;
        this.setTeamA(tA);
        this.setTeamB(tB);
    }
    public SoccerGame(SoccerGame G){
        this(G.getTeamA(), G.getTeamB(), G.getRefereeName());
    }
    @Override
    public void teamAScored(int points) {
        scoreA++;
    }

    @Override
    public void teamBScored(int points) {
        scoreB++;
    }

    @Override
    public void substituteA(int num) {
        if(num > 3){
            throw new IllegalArgumentException("Cannot substotute more than 3 at a time");
        }
        if(this.getSubsA() + num > maxSubs){
            throw new IllegalArgumentException("Cannot substitute more than 5 palyers");
        }
        subsA += num;
    }

    @Override
    public void substituteB(int num) {
        if(num > 3){
            throw new IllegalArgumentException("Cannot substotute more than 3 at a time");
        }
        if(this.getSubsB() + num > maxSubs){
            throw new IllegalArgumentException("Cannot substitute more than 5 palyers");
        }
        subsB += num;
    }

    public String getRefereeName() {
        return refereeName;
    }

    public void setRefereeName(String refereeName) {
        this.refereeName = refereeName;
    }

    @Override
    public Mergeable merge(Mergeable other) {
        if(other.getClass() != this.getClass()){
            throw new IllegalArgumentException("Can only merge soccer games");
        }
        String tA = this.getTeamA();
        if(!this.getTeamA().equals(((SoccerGame) other).getTeamA())) {
            tA = "MergedA";
        }
        String tB = this.getTeamB();
        if(!this.getTeamB().equals(((SoccerGame) other).getTeamB())) {
            tB = "MergedB";
        }
        int subA = Math.min(maxSubs, this.subsA + ((SoccerGame) other).subsA);
        int subB = Math.min(maxSubs, this.subsB + ((SoccerGame) other).subsB);
        int scA = (this.scoreA + ((SoccerGame) other).scoreA)/2;
        int scB = (this.scoreB + ((SoccerGame) other).scoreB)/2;
        SoccerGame S = new SoccerGame(tA, tB, this.getRefereeName() + ((SoccerGame) other).refereeName);
        S.subsA = subA;
        S.scoreA = scA;
        S.subsB = subB;
        S.scoreB = scB;
        return S;
    }
}
