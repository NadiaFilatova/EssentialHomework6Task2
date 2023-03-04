package homework;

//Створіть проект за допомогою IntelliJ IDEA. Створіть перерахунковий тип (enum) Animals,
// що містить конструктор, який повинен набувати цілого числа (вік тварини),
// і містити перевантажений метод toString(), який повинен повертати назву екземпляра та вік тварини.
public enum Animals {
    CAT(1),
    DOG(13),
    COW(56),
    RABBIT(25);
    private final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + " , " + age;
    }
}
