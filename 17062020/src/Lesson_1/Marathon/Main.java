package Lesson_1.Marathon;

/*1. Разобраться с имеющимся кодом;
2. Добавить класс Team, который будет содержать: название команды, done
массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать),
метод для вывода информации о членах команды прошедших дистанцию, done
метод вывода информации обо всех членах команды  done
3. Добавить класс Course (полоса препя тствий), в котором будут находиться: массив препятствий,
метод который будет просить команду пройти всю полосу;*/

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Human("Арнольд")};
        Team team = new Team("Dream Team", competitors);
        team.info(team);

        Obstacle[] obstacles = {new Cross(80), new Water(5), new Wall(1), new Cross(120)};
        Course course = new Course(obstacles);

        course.doIt(team);

        team.showResults(team);

    }
}