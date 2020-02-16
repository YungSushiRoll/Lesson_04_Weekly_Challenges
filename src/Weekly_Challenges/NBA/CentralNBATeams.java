package Weekly_Challenges.NBA;

public enum CentralNBATeams {
    BULLS("Chicago Bulls","Bulls","CHI"),
    CAVALIERS("Cleveland Cavaliers","Cavaliers","CLE"),
    PISTONS("Detroit Pistons","Pistons","DET"),
    PACERS("Indiana Pacers","Pacers","IND"),
    BUCKS("Milwaukee Bucks","Bucks","MIL");

    private String fullTeamName;
    private String teamName;
    private String city;

    CentralNBATeams(String fullTeamName, String teamName, String city){
        this.fullTeamName = fullTeamName;
        this.teamName = teamName;
        this.city = city;
    }

    public String getFullTeamName() {
        return fullTeamName;
    }

    public String getTeamName(){
        return teamName;
    }

    public String getCity(){
        return city;
    }
}
