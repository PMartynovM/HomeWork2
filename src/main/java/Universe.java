public class Universe {
    public static void main(String[] args) {
        long ageUniverse = 13000000000L; // для себя запомнить, что очень длинные числа принимаются с "L" в конце
        long ageHumans = 100000;
        long humansAreOnTheScaleOfTheUniverse = ageUniverse / ageHumans;
        System.out.println("Вселенная старше человечества в " + humansAreOnTheScaleOfTheUniverse + " раз");
    }
}

