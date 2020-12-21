package vtb.baranovdv;
//1. Написать абстрактный класс Animal с абстрактным методом getName.
//Сделать несколько классов животных, наследников Animal. Метод getName должен выводит название каждого животного.
//2. Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу. Добавить классам животных
//из предыдущего задания имплементацию этих интерфейсов.
//Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).
public class AbsAnimal {

    public static void main(String[] args) {
    Cat cat1 = new Cat("Барсик");
    Bird bird1 = new Bird("Кеша");
    Duck duck1 = new Duck("Анжела");
    System.out.println("Меня зовут " + cat1.getName());
    cat1.run();
    cat1.swim();
    System.out.println("Меня зовут " + bird1.getName());
    bird1.fly();
    System.out.println("Меня зовут " + duck1.getName());
    duck1.run();
    duck1.fly();
    duck1.swim();
    }
}

abstract class Animal {

    String name;

    public String getName() {
        return name;
    }
}

class Cat extends Animal implements Run, Swim{

    Cat(String name) {
        this.name = name;
    }
}

class Bird extends Animal implements Fly{

    Bird(String name) {
        this.name = name;
    }

}

class Duck extends Animal implements Run, Swim, Fly{

    Duck(String name) {
        this.name = name;
    }
}

interface Fly  {

    public default void fly() {
        System.out.println("Я могу летать");
    }
}

interface Run  {

      public default void run() {
          System.out.println("Я могу бегать");
    }
}

interface Swim {

    public default void swim() {
        System.out.println("Я могу плавать");
    }
}