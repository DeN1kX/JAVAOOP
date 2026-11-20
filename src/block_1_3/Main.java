package block_1_3;

public class Main {
    public static void main(String[] args){
        //1.3.1
        Student s1 = new Student();
        s1.name = "Вася";
        s1.grades = new int[]{3,4,5};

        Student s2 = new Student();
        s2.name = "Петя";
        s2.grades = s1.grades;

        s2.grades[0] = 5;
        System.out.println(s1);
        System.out.println(s2);

        Student s3 = new Student();
        s3.name = "Андрей";
        s3.grades = new int[s1.grades.length];
        for(int i = 0; i < s1.grades.length; i++ ){
            s3.grades[i] = s1.grades[i];
        }s1.grades[0] = 1;
        System.out.println(s1);
        System.out.println(s3);

        //1.3.2
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 5;

        Point p2 = new Point();
        p2.x = 2;
        p2.y = 8;

        Point p3 = new Point();
        p3.x = 5;
        p3.y = 3;

        Line l1 = new Line();
        l1.points = new Point[]{p1, p2, p3};
        System.out.println(l1);

        Point p4 = new Point();
        p4.x = 2;
        p4.y = -5;

        Point p5 = new Point();
        p5.x = 4;
        p5.y = -8;

        Line l2 = new Line();
        l2.points = new Point[]{p1, p4, p5, p3};
        System.out.println(l2);

        p1.x = 10;
        p1.y = 20;
        System.out.println(l1);
        System.out.println(l2);

        //1.3.3

        City a = new City();
        a.name = "A";

        City b = new City();
        b.name = "B";

        City c = new City();
        c.name = "C";

        City d = new City();
        d.name = "D";

        City e = new City();
        e.name = "E";

        City f = new City();
        f.name = "F";

        Road roadAF = new Road();
        roadAF.destination = f;
        roadAF.cost = 1;

        Road roadAB = new Road();
        roadAB.destination = b;
        roadAB.cost = 5;

        Road roadAD = new Road();
        roadAD.destination = d;
        roadAD.cost = 6;

        Road roadDA = new Road();
        roadDA.destination = a;
        roadDA.cost = 6;

        Road roadBA = new Road();
        roadBA.destination = a;
        roadBA.cost = 5;

        Road roadFB = new Road();
        roadFB.destination = b;
        roadFB.cost = 1;

        Road roadFE = new Road();
        roadFE.destination = e;
        roadFE.cost = 2;

        Road roadEF = new Road();
        roadEF.destination = f;
        roadEF.cost = 2;

        Road roadDE = new Road();
        roadDE.destination = e;
        roadDE.cost = 2;

        Road roadDC = new Road();
        roadDC.destination = c;
        roadDC.cost = 4;

        Road roadCD = new Road();
        roadCD.destination = d;
        roadCD.cost = 4;

        Road roadCB = new Road();
        roadCB.destination = b;
        roadDC.cost = 3;

        Road roadBC = new Road();
        roadBC.destination = c;
        roadBC.cost = 3;


        a.roads = new Road[]{roadAB, roadAD, roadAF};
        b.roads = new Road[]{roadBA, roadBC};
        c.roads = new Road[]{roadCB, roadCD};
        d.roads = new Road[]{roadDA, roadDC, roadDE};
        e.roads = new Road[]{roadEF};
        f.roads = new Road[]{roadFB, roadFE};

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //1.3.4
        Employee petrov = new Employee();
        petrov.name = "Петров";

        Employee kozlov = new Employee();
        kozlov.name = "Козлов";

        Employee sidorov = new Employee();
        sidorov.name = "Сидоров";

        Department department = new Department();
        department.name = "IT";
        department.boss = kozlov;

        kozlov.department = department;
        petrov.department = department;
        sidorov.department = department;

        System.out.println(kozlov);
        System.out.println(petrov);
        System.out.println(sidorov);

        department.employees = new Employee[]{petrov, kozlov, sidorov};
        for(Employee employee : petrov.department.employees){
            System.out.println(employee);
        }
    }
}
