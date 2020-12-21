package vtb.baranovdv;
//Написать абстрактный класс Animal с абстрактным методом getName.
//Сделать несколько классов животных, наследников Animal. Метод getName должен выводит название каждого животного.

public class AbsAnimal {

    public static void main(String[] args) {
    Cat cat1 = new Cat("Барсик");
    Dog dog1 = new Dog("Шарик");
    Rat rat1 = new Rat("Лариска");
    System.out.println(cat1.getName());
    System.out.println(dog1.getName());
    System.out.println(rat1.getName());
    }
}

abstract class Animal {

    String name;

    public String getName() {
        return name;
    }
}

class Cat extends Animal {

    Cat(String name) {
        this.name = name;
    }
}

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
    }
}

class Rat extends Animal {

    Rat(String name) {
        this.name = name;
    }
}