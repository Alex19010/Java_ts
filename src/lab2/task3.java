package lab2;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Барон", "Лабрадор");
        Dog dog2 = new Dog("Багира", "Хаски");

        System.out.println("Исходные значения:");
        displayDogInfo("Собака 1", dog1);
        displayDogInfo("Собака 2", dog2);

        dog1.setName("Рекс");
        dog2.setBreed("Ратвейлер");

        System.out.println("\nОбновленные значения:");
        displayDogInfo("Собака 1", dog1);
        displayDogInfo("Собака 2", dog2);
    }

    public static void displayDogInfo(String dogName, Dog dog) {
        System.out.println(dogName + ":");
        System.out.println("Имя: " + dog.getName());
        System.out.println("Порода: " + dog.getBreed());
    }
}
