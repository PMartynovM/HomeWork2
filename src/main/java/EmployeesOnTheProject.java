public class EmployeesOnTheProject {
    public static void main(String[] args) {
        int programmers = 99;
        int testers = 2;
        int specialists = 1;
        int testersForProgrammers = testers * programmers;
        int specialistsForProgrammers = specialists * programmers;
        int employeesAll = programmers + testersForProgrammers + specialistsForProgrammers;

        System.out.println(testersForProgrammers + " тестировщиков необходимо");
        System.out.println(specialistsForProgrammers + " специалистов на проекте");
        System.out.println(employeesAll + " всего ребятушек на проекте");

    }
}
