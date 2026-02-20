package com.mac190.reviewfinal;

public class BasketballGame extends Game implements Mergeable{
    private boolean overTime;

    public BasketballGame(){
        super();
        maxSubs = 7;
        numPlayers = 5;
        overTime = false;
    }
    public BasketballGame(String tA, String tB, boolean ot){
        super();
        this.setTeamA(tA);
        this.setTeamB(tB);
        maxSubs = 7;
        numPlayers = 5;
        overTime = ot;
    }
    public BasketballGame(String tA, String tB, int scA, int scB, boolean ot) throws GameDataException{
        super(tA, tB, 5, 7);
        scoreA = scA;
        scoreB = scB;
        overTime = ot;
    }
    public BasketballGame(BasketballGame G){
        this(G.getTeamA(), G.getTeamB(), G.getOverTime());
    }

    public boolean getOverTime() {
        return overTime;
    }
    public void setOverTime(boolean overTime) {
        this.overTime = overTime;
    }
    @Override
    public void teamAScored(int points) {
        if(points > 3){
            throw new IllegalArgumentException("Cannot score that much!!");
        }
        scoreA += points;
    }

    @Override
    public void teamBScored(int points) {
        if(points > 3){
            throw new IllegalArgumentException("Cannot score that much!!");
        }
        scoreB += points;
    }

    @Override
    public void substituteA(int num) {
        if(this.getSubsA() + num > maxSubs){
            throw new IllegalArgumentException("Cannot substitute more than 7 palyers");
        }
        subsA += num;
    }

    @Override
    public void substituteB(int num) {
        if(this.getSubsB() + num > maxSubs){
            throw new IllegalArgumentException("Cannot substitute more than 7 palyers");
        }
        subsB += num;
    }

    @Override
    public Mergeable merge(Mergeable other) {
        if(other.getClass() != this.getClass()){
            throw new IllegalArgumentException("Can only merge basketBall games");
        }
        boolean ot = false;
        if(this.getOverTime() || ((BasketballGame) other).getOverTime()){
            ot = true;
        }
        String tA = this.getTeamA();
        if(!this.getTeamA().equals(((BasketballGame) other).getTeamA())) {
            tA = "CombinedA";
        }
        String tB = this.getTeamB();
        if(!this.getTeamB().equals(((BasketballGame) other).getTeamB())) {
            tB = "CombinedB";
        }
        int subA = Math.min(maxSubs, this.subsA + ((BasketballGame) other).subsA);
        int subB = Math.min(maxSubs, this.subsB + ((BasketballGame) other).subsB);
        int scA = (this.scoreA + ((BasketballGame) other).scoreA);
        int scB = (this.scoreB + ((BasketballGame) other).scoreB);
        BasketballGame S = new BasketballGame(tA, tB, ot );
        S.subsA = subA;
        S.scoreA = scA;
        S.subsB = subB;
        S.scoreB = scB;
        return S;
    }
}
