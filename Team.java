 class Team {
    private String teamName;
    private int numberOfPlayers;
    private Coach coach;

    public Team(String teamName, int numberOfPlayers, Coach coach) {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
        this.coach = coach;
    }

    public void displayTeamInfo() {
        System.out.println("Команда: " + teamName);
        System.out.println("Кількість гравців: " + numberOfPlayers);
        System.out.println("Тренер: " + coach.getName());
    }

    public void performActionWithTeam(Team otherTeam) {
        // Виклик методу із переданого екземпляра класу
        otherTeam.displayTeamInfo();
        // Виклик змінної із переданого екземпляра класу
        System.out.println("Інша команда: " + otherTeam.teamName);
    }

    // Новий метод, який повертає об'єкт Team з новими значеннями
    public static Team updateTeamInfo(Team team, String newName, int newPlayerCount) {
        team.teamName = newName;
        team.numberOfPlayers = newPlayerCount;
        return team;
    }

     public String getTeamName() {
         return teamName;
     }

     public int getNumberOfPlayers() {
         return numberOfPlayers;
     }

     public Coach getCoach() {
         return coach;
     }

     public void setTeamName(String teamName) {
         this.teamName = teamName;
     }

     public void setNumberOfPlayers(int numberOfPlayers) {
         this.numberOfPlayers = numberOfPlayers;
     }

     public void setCoach(Coach coach) {
         this.coach = coach;
     }
 }
