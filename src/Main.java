/***
 * Балык, Попугай, мышык жана ит деген класс тузунуз.
 * Алардын свойстваларын ойлоп табыныз.
 * Бир канча объектилерин тузуп жана аларга маанилерин бериниз.
 * Аларды консольго чыгарыныз.
 * Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек.
 */
public class Main {

    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.setName("понго");
        System.out.println("мышыктын аты?" +  cat.getName());
        cat.setAge(3);
        System.out.println("мышыктын жашы" + cat.getAge());
        cat.setColor("black");
        System.out.println("мышыктын тусу" + cat.getColor());
        cat.setTeeth(10);
        System.out.println("мышыктын канча тиши бар?" + cat.getTeeth());


        Dog dog=new Dog();
        dog.setName("Рембо");
        System.out.println("кучуктун аты?  "  + dog.getName());
        dog.setAge(9);
        System.out.println("кучуктун жашы?" + dog.getAge());
        dog.setColor("коричневая");
        System.out.println("кучуктуун цвети" + dog.getColor());
        dog.setTeeth(15);
        System.out.println("кучуктун тиши канча?" + dog.getTeeth());

        Parrot parrot=new Parrot();
        parrot.setName("луна");
        System.out.println("аты ким?"  + parrot.getName());
        parrot.setAge(4 );
        System.out.println("попугайдын жашы?"  + parrot.getAge());
        parrot.setColor("зеленый");
        System.out.println("попугайдын тусу?"  + parrot.getColor());

        Fish fish=new Fish();
        fish.setName("Гу-гу");
        System.out.println("балыктын аты ким?"  + parrot.getName());
        fish.setAge(1);
        System.out.println("балык канча жашта?"  + parrot.getAge());
        fish.setTeeth(5);
}
}
