 class Coach {
    private String name;
    private int experienceYears;



     public Coach(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }



    private String performActionWithCoach(Coach otherCoach) {
        // Виклик методу із переданого екземпляра класу
        //System.out.println("Інший тренер: " + otherCoach.getName());
        // Виклик змінної із переданого екземпляра класу
        //System.out.println("Тривалість досвіду: " + otherCoach.experienceYears + " років");
    String s;

        return s="Інший тренер: "+otherCoach.getName()+"\nТривалість досвіду: " + otherCoach.experienceYears + " років";
     }

    // Новий метод, який повертає об'єкт Coach з новими значеннями
    private static Coach updateCoachInfo(Coach coach, String newName, int newExperienceYears) {
        coach.name = newName;
        coach.experienceYears = newExperienceYears;
        return coach;
    }

    public String getPerformActionWithCoach(Coach otherCoach){
         return performActionWithCoach(otherCoach);
    }
    public int getExperienceYears() {
         return experienceYears;
     }
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setExperienceYears(int experienceYears) {
         this.experienceYears = experienceYears;
     }
}