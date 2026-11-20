package block_1_4;

public class People {
    Name name;
    People father;

    People(Name name, People father){
        this.name = name;
        this.father = father;
    }
    People(String name){
        this(new Name(name), null);
    }
    People(Name name){
        this.name = name;
    }
    People(People father, String name){
        this(new Name(name), father);
    }
    People(People father, Name name){
        this.father = father;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name=" + name +
                ", father=" + father +
                '}';
    }
}
