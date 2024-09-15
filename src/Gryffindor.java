import java.util.Random;

public class Gryffindor extends Hogwarts {
    private static final Random random = new Random();

    public Gryffindor(String name) {
        super(name, random.nextInt(101), random.nextInt(101));
    }

    @Override
    protected String getTraits() {
        return "Благородство: " + random.nextInt(101) + ", Честь: " + random.nextInt(101) +
                ", Храбрость: " + random.nextInt(101);
    }

    //Метода для сравнения студентов одного факультета
    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int total1 = student1.getMagicPower() + student1.getTraitsScore();
        int total2 = student2.getMagicPower() + student2.getTraitsScore();

        System.out.println("Сравнение студентов Гриффиндора:");
        if (total1 > total2) {
            System.out.println(student1.getName() + " лучший гриффиндорец чем " + student2.getName());
        } else if (total1 < total2) {
            System.out.println(student2.getName() + " лучший гриффиндорец чем " + student1.getName());
        } else {
            System.out.println("Оба студента равны.");
        }
    }

    protected int getTraitsScore() {
        return random.nextInt(101) + random.nextInt(101)
                + random.nextInt(101); // Сумма баллов по качествам
    }
}

