public class Person {
    Name name;
    int height;
    Person father;

//    public  String toString(){
//        return  name +" "+ height;
//    }

    public String toString(){
        String surname = null;
        String firstname = null;
        String patronymic = null;

        if(name != null){
            surname = name.surname;
            firstname = name.firstname;
            patronymic = name.patronymic;
        }
        if(surname == null && father != null && father.name != null){
            surname = father.name.surname;
        }
        if(patronymic == null && father != null && father.name != null && father.name.firstname != null){
            patronymic = father.name.firstname + "ович";
        }
        String result = "";
        if(surname != null){
            result += surname + " ";
        }if(firstname != null){
            result += firstname + " ";
        }if(patronymic != null){
            result += patronymic;
        }return result.trim();
    }
}
