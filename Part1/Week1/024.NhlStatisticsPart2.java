
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints();
        NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals(); 
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                // Ask the user first which player's statistics are needed and then print them.
                System.out.println("Which player's statistics are needed?");
                String player = reader.nextLine();
                //NHLStatistics.sortByPoints();
                NHLStatistics.searchByPlayer(player);
                
                
            } else if (command.equals("club")) {
                // Ask the user first which club's statistics are needed and then print them.
                System.out.println("Which club's statistics are needed?");
                String club = reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(club);
                
                
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
            }

        }
    }
}
