package block_1_4;

public class Name {
    String name, surname, patronymic;

    Name(String name){
        this.name = name;
    }
    Name(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    Name(String name, String patronymic, String surname){
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;

    }

    @Override
    public String toString() {
        String result = "";
        if (surname != null) {
            result += surname + " ";
        }
        if (name != null) {
            result += name;
        }
        if (patronymic != null) {
            result += patronymic;
        }
        return result;
    }
}
