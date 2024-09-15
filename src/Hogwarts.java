public abstract class Hogwarts {
    protected String name;
    protected int magicPower;
    protected int spellDistance;

    public Hogwarts(String name, int magicPower, int spellDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.spellDistance = spellDistance;
    }

    public void printInfoOfStudents() {
        System.out.println("Имя: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + spellDistance);
        System.out.println("Качества: " + getTraits());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getSpellDistance() {
        return spellDistance;
    }

    //Абстрактные методы для суммы качеств
    protected abstract String getTraits();

    protected abstract int getTraitsScore();
}
