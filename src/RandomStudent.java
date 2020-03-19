import java.util.Random;

public class RandomStudent {
    public static void main(String[] args) {
        String[] students = new String[]{"Ashot", "Vardan", "Hovhannes", "Karen", "Raf", "Razmik", "Tatev", "Vahan", "Ghukasyan Hamo", "Anna", "Aram", "Armine", "Arsen", "Gevorg", "Georgi", "Hamo Ghazoyan", "Lavrent", "Shaqe"};
        int number = getRandomNumberInRange(0, students.length - 1);
        System.out.println(students[number]);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
