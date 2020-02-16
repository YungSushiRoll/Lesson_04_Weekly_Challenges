package Weekly_Challenges.NBA;

import Weekly_Challenges.NBA.CentralNBATeams;

import java.util.Scanner;

public class NBADriver {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your favorite Central Division NBA team");
        String favoriteTeam = keyboard.nextLine();
        boolean notFound = true;

        for (CentralNBATeams teams : CentralNBATeams.values()) {
            if (favoriteTeam.substring(0,3).equalsIgnoreCase(teams.getFullTeamName().substring(0,3))){
                favoriteTeam = teams.getFullTeamName();
                notFound = false;
            }
            if (favoriteTeam.substring(0,3).equalsIgnoreCase(teams.getTeamName().substring(0,3))){
                favoriteTeam = teams.getFullTeamName();
                notFound = false;
            }
        }
        if (notFound)
        {
            System.out.println("Sorry, that's a lovely team but, I don't think that they are in the Central Division.");
        } else {
            System.out.println("Ah, it seems that your favorite Central NBA team is the " + favoriteTeam);
        }
    }
}