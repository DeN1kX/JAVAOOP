package block_1_3;

public class Employee {
    String name;
    Department department;

    public String toString(){
        if(department == null){
            return name + " Не работает ни в одном отделе ";
        }if (department.boss == this){
            return name + " начальник отдела " + department.name;
        }if(department.name == null){
            return name + " работает в отделе без названия ";
        }if(department.boss == null){
            return  name + " работает в отделе " + department.name;
        }return name + " работает в отделе " + department.name + " начальник которого " + department.boss.name;
}
