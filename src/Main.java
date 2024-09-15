public class Main {
    public static void main(String[] args) {
// Создание студентов
        Hogwarts harry = new Gryffindor("Гарри Поттер");
        Hogwarts hermione = new Gryffindor("Гермиона Грейнджер");
        Hogwarts ron = new Gryffindor("Рон Уизли");

        Hogwarts draco = new Slytherin("Драко Малфой");
        Hogwarts graham = new Slytherin("Грэхэм Монтегю");
        Hogwarts gregory = new Slytherin("Грегори Гойл");

        Hogwarts zacharias = new Hufflepuff("Захария Смит");
        Hogwarts cedric = new Hufflepuff("Седрик Диггори");
        Hogwarts justin = new Hufflepuff("Джастин Финч-Флетчли");

        Hogwarts zhou = new Ravenclaw("Чжоу Чанг");
        Hogwarts padma = new Ravenclaw("Падма Патил");
        Hogwarts marcus = new Ravenclaw("Маркус Белби");

        // Вывод информации о студентах
        harry.printInfoOfStudents();
        hermione.printInfoOfStudents();
        ron.printInfoOfStudents();
        draco.printInfoOfStudents();
        graham.printInfoOfStudents();
        gregory.printInfoOfStudents();
        zacharias.printInfoOfStudents();
        cedric.printInfoOfStudents();
        justin.printInfoOfStudents();
        zhou.printInfoOfStudents();
        padma.printInfoOfStudents();
        marcus.printInfoOfStudents();

        // Сравнение студентов одного факультета
        Gryffindor.compareStudents(harry, hermione);
        Slytherin.compareStudents(draco, graham);
        Hufflepuff.compareStudents(zacharias, cedric);
        Ravenclaw.compareStudents(zhou, padma);

        // Сравнение студентов по силе магии и расстоянию трансгрессии
        compareStudentsByMagic(harry, draco);
    }

    //Метода сравнения студентов по силе магии
    public static void compareStudentsByMagic(Hogwarts student1, Hogwarts student2) {
        System.out.println("Сравнение студентов по силе магии и расстоянию трансгрессии:");
        System.out.println(student1.getName() + " (Сила магии: " + student1.getMagicPower() +
                ", Расстояние трансгрессии: " + student1.getSpellDistance() + ")");
        System.out.println(student2.getName() + " (Сила магии: " + student2.getMagicPower() +
                ", Расстояние трансгрессии: " + student2.getSpellDistance() + ")");

        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println(student1.getName() + " сильнее по магии.");
        } else if (student1.getMagicPower() < student2.getMagicPower()) {
            System.out.println(student2.getName() + " сильнее по магии.");
        } else {
            System.out.println("Оба студента имеют одинаковую силу магии.");
        }

        if (student1.getSpellDistance() > student2.getSpellDistance()) {
            System.out.println(student1.getName() + " может трансгрессировать дальше.");
        } else if (student1.getSpellDistance() < student2.getSpellDistance()) {
            System.out.println(student2.getName() + " может трансгрессировать дальше.");
        } else {
            System.out.println("Оба студента могут трансгрессировать на одинаковое расстояние.");
        }
    }
}