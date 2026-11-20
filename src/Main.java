public class Main {
    static void main(String[] args) {
        //1.2.1
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 3;

        Point p2 = new Point();
        p2.x = 23;
        p2.y = 8;

        Line l1 = new Line();
        l1.start = p1;
        l1.end = p2;

        Point p3 = new Point();
        p3.x = 5;
        p3.y = 10;

        Point p4 = new Point();
        p4.x = 25;
        p4.y = 10;

        Line l2 = new Line();
        l2.start = p3;
        l2.end = p4;

        Line l3 = new Line();
        l3.start = l1.start;
        l3.end = l2.end;
        System.out.println(l3);

        l1.start.x = 100;
        l2.end.y = 200;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        l1.start = new Point();
        l1.start.x = 26;
        l1.start.y = 52;
        System.out.println(l1);
        System.out.println(l3);

        //1.2.2
        Name name1 = new Name();
        name1.firstname = "Клеопатра";

        Person person1 = new Person();
        person1.name = name1;
        person1.height = 152;

        System.out.println(person1);

        Name name2 = new Name();
        name2.surname = "Пушкин";
        name2.firstname = "Александр";
        name2.patronymic = "Сергеевич";

        Person person2 = new Person();
        person2.name = name2;
        person2.height = 167;

        System.out.println(person2);

        Name name3 = new Name();
        name3.surname = "Маяковский";
        name3.firstname = "Владимир";

        Person person3 = new Person();
        person3.name = name3;
        person3.height = 189;

        System.out.println(person3);

        //1.2.3
        Name n1 = new Name();
        n1.surname = "Чудов";
        n1.firstname = "Иван";

        Person Ivan = new Person();
        Ivan. name = n1;

        Name n2 = new Name();
        n2.surname = "Чудов";
        n2.firstname = "Петр";

        Person Petr = new Person();
        Petr. name = n2;

        Petr.father = Ivan;

        Name n3 = new Name();
        n3.firstname = "Борис";
        Person Boris = new Person();
        Boris.name = n3;
        Boris.father = Petr;

        System.out.println(Ivan);
        System.out.println(Petr);
        System.out.println(Boris);

        //1.2.4
        Employee petrov = new Employee();
        petrov.name = "Петров";

        Employee kozlov = new Employee();
        kozlov.name = "Козлов";

        Employee sidirova = new Employee();
        sidirova.name = "Сидорова";

        Departament dep = new Departament();
        dep.name = "IT";
        dep.boss = kozlov;
        petrov.departament = dep;
        kozlov.departament = dep;
        sidirova.departament = dep;

        System.out.println(kozlov);
        System.out.println(petrov);
        System.out.println(sidirova);

    }
}
