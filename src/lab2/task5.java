package lab2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иван", 30);
        Person person2 = new Person("Мария", 25);

        displayPersonInfo(person1);
        displayPersonInfo(person2);
    }

    public static void displayPersonInfo(Person person) {
        System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
    }
}
