public class Employee {
    String name;
    Departament departament;

    public String toString(){
        if(departament == null) {
            return name + " Не работает ни в одном отделе";
        }if(departament.name == null){
            return name + " Работает в отделе без названия";
        }if(departament.boss == this){
            return name + " начальник отдела " + departament.name;
        }if(departament.boss == null){
            return name + " работает в отделе " + departament.name;
        }return name + " работает в отделе " + departament.name + " начальник которого " + departament.boss.name;
    }
}
