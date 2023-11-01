public class Way {
    public static void main(String[] args) {
        int distance = 20; // 20 km
        float taxi = 55.8f; // 55.8 km/h
        float timeToWork = distance / taxi;
        float coefficientSlowTime = 1.40f;
        float timeToHome = timeToWork * coefficientSlowTime;

        System.out.println("Дорога на работу обычно занимает " + timeToWork * 60 + " минут");
        System.out.println("Дорога домой обычно занимает " + timeToHome * 60 + " минут");
    }
}