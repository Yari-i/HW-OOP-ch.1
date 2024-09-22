import java.util.Random;

public class Ravenclaw extends Hogwarts {
    private static final Random random = new Random();

    public Ravenclaw(String name) {
        super(name, random.nextInt(101), random.nextInt(101));
    }

    @Override
    protected String getTraits() {
        return "Ум: " + random.nextInt(101) + ", Мудрость: " + random.nextInt(101) +
                ", Острота ума: " + random.nextInt(101) + ", Творчество: " + random.nextInt(101);
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int total1 = student1.getMagicPower() + student1.getTraitsScore();
        int total2 = student2.getMagicPower() + student2.getTraitsScore();

        System.out.println("Сравнение студентов Когтеврана:");
        if (total1 > total2) {
            System.out.println(student1.getName() + " лучший когтевранец чем " + student2.getName());
        } else if (total1 < total2) {
            System.out.println(student2.getName() + " лучший когтевранец чем " + student1.getName());
        } else {
            System.out.println("Оба студента равны.");
        }
    }

    protected int getTraitsScore() {
        return random.nextInt(101) + random.nextInt(101) + random.nextInt(101)
                + random.nextInt(101); // Сумма баллов по качествам
    }
}
