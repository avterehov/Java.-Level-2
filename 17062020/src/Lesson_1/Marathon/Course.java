package Lesson_1.Marathon;

public class Course {

    Obstacle[] course;

    public Course(Obstacle[] course) {

        this.course = course;

    }

    public void doIt(Team t) {

        for (Competitor c : t.competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }

        }
        System.out.println();
    }
}

