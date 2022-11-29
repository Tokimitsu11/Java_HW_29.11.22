

public abstract class Main {
    public static void main(String[] args) {

Time(22, 40);
        System.out.println(add(18, 33));

//        5*) добавить в класс функцию для вывода свойств класса. вызвать ее в методе main (по типу sum или sub)

        assembler.printOut();

//        4*) добавить геттеры и сеттеры и продемонстрировать их работу

        System.out.println(assembler.getSlots() + " " + assembler.getSpeed() + " " + assembler.getAvailability() );
        assembler.setAvailability("Not available");
        System.out.println(assembler.getAvailability());
    }

//1)                                                                     создать процедуру

    public static void Time(int hour, int minute) {
        System.out.println(hour + " : " + minute);
     }

//2)                                                                     создать функцию

public static int add(int x, int y) {
        return x+y;
}


//3)                                                                     создать класс

static assembler assembler = new assembler(23, "Available", "AstraNetAssemblers",
        325.6);
}