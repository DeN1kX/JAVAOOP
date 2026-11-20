package block_1_4;

public class Main {
    public static void main(String[] args) {
        //1.4.1
        Point p1 = new Point(3, 5);
        Point p2 = new Point(25, 6);
        Point p3 = new Point(7, 8);


        //1.4.2
        Line l1 = new Line(1, 3, 23, 8);
        Line l2 = new Line(5,10,25,10);
        Line l3 = new Line(l1.start, l2.end);

        //1.4.3
        Polyline pl = new Polyline(new Point[]{p1,p2,p3});

        //1.4.4
        House h1 = new House(2);
        House h2 = new House(35);
        House h3 = new House(91);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        //1.4.5
        Name n1 = new Name("Клеопатра");
        Name n2 = new Name("Александр", "Сергеевич", "Пушкин");
        Name n3 = new Name("Владимир", "Маяковский");
        Name n4 = new Name("Христофор", "Бонифатьевич");

        //1.4.6
        People people1 = new People("Лев");
        People people2 = new People(people1, new Name("Пушкин Сергей"));
        People people3 = new People(people2, "Александр");

        //1.4.7
        Student vas = new Student("Вася", 3,4,5);
        Student max = new Student("Макс");

        //1.4.8

        City c = new City("C");
        City b = new City("B",c);
        City f = new City("F",b);
        City e = new City("E",f);
        City d = new City("D",e);
        City a = new City("A", b,f,d);
        System.out.println(a);


    }
}
