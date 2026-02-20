package com.mac190.reviewfinal;

public class GameTester {
        public static void main(String[] args) {
            SoccerGame match1 = new SoccerGame("Lions", "Tigers", "Ref A");
            System.out.println("match1: " + match1);
            SoccerGame match2 = new SoccerGame("Lions", "Tigers", "Ref B");
            System.out.println("match2: " + match2);
            SoccerGame mergedMatch = (SoccerGame) match1.merge(match2); // (1) merge match1 and match2
            System.out.println("Merged Match: " + mergedMatch);
            BasketballGame b1 = null, b2 = null;
            try {
                b1 = new BasketballGame("Team A", "Team B", 90, 85, true);
                System.out.println("B1: " + b1);
                b2 = new BasketballGame("Team X", "Team Y", 100, 95, false);
                System.out.println("B2: " + b2);
                BasketballGame finalGame = (BasketballGame) b1.merge(b2); // (2) merge b1 and b2
                System.out.println("FinalG: " + finalGame);
            } catch (IllegalArgumentException e) { // (3) catch the right exception
                System.out.println("Caught a problem merging basketball games.");
            } catch(GameDataException e){
                System.out.println("Caught GameEzception: " + e.getMessage());
            }

            try {
                Mergeable errorTest = match1.merge(b1); // (4) illegal merge
            } catch (IllegalArgumentException e) {
                System.out.println("Caught illegal merge.  " + e.getMessage());
            }

            try {
                SoccerGame bad = new SoccerGame("A", "B", -5, 11, "Ref"); // (5) bad constructor
            } catch (GameDataException e) {
                System.out.println("Caught bad game data. " + e.getMessage());
            }


        }

}
