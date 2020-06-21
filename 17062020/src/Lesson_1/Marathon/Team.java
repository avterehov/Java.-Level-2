package Lesson_1.Marathon;

public class Team{

    String name;
    Competitor[] competitors;

    public Team (String name, Competitor[] competitors){

    this.name = name;
    this.competitors = competitors;

    }

    public void showResults(Team t){
        System.out.println("Дистанцию прошли:");
        for (Competitor c : competitors){
            if (c.isOnDistance()){
                c.printName();
            }
        }
        System.out.println();

    }

    public void info ( Team t ){
        System.out.println("Информация о членах команды " + t.name + ":");
        System.out.println();
        for (Competitor c : competitors) {
            c.info();

    }
        System.out.println();

    }




}
