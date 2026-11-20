public class Name {
    String surname;
    String firstname;
    String patronymic;

    public  String toString(){
        String result = "";
        if (surname != null){
            result += surname + " ";
        }if (firstname != null){
            result += firstname + " ";
        }if (patronymic != null){
            result += patronymic + " ";
        }return result.trim();
    }
}
