package vtb.baranovdv;
//Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
//Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.
public class AbsHuman {
    public static void main(String[] args) {
        White white1 = new White("Егор");
        Black black1 = new Black("Мамба");
        System.out.println("Меня зовут " + black1.getName());
        black1.running();
        System.out.println("Меня зовут " + white1.getName());
        white1.swimming();
    }
}

abstract class Human implements Running, Swimming{
    String name;

    public String getName() {
        return name;
    }
}

interface Running  {

    public default void running() {
        System.out.println("Я буду бегать с понедельника!");
    }
    public void running1();
}

interface Swimming  {

    public default void swimming() {
        System.out.println("Я плаваю, как дельфин!");
    }
    public void swimming1();
}

class White extends Human {

    White(String name) {
        this.name = name;
    }

    @Override
    public void running1() {

    }

    @Override
    public void swimming1() {

    }

}
class Black extends Human{

    Black(String name) {
        this.name = name;
    }

    @Override
    public void running1() {

    }

    @Override
    public void swimming1() {

    }

    }



