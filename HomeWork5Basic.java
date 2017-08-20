/**
* Java. Level 1. Lesson 5. 
* Создать класс "Сотрудник" с полями: ФиО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников
* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
* @author Slava Bugakov
* @version dated Aug 9, 2017
*/
import java.util.Arrays;
class HomeWork5Basic{
    public static void main(String[] args){
       Employee[] emp = new Employee[5];
       emp[0] = new Employee("Ivanov Ivan","Engineer","ivan@corp.com","892312312",30000,25);
       emp[1] = new Employee("Petrov Petr","Manager","peter@corp.com","892312312",40000,45);
       emp[2] = new Employee("Ivanov Petr","Cheef Engineer","cheef@corp.com","892312312",40000,40);
       emp[3] = new Employee("Sidorov Sidor","Director","sidor@corp.com","892312312",300000,55);
       emp[4] = new Employee("Sidorov Ivan","Assosiee","sivan@corp.com","892312312",30000,20);
       
       for(int i=0;i<emp.length;i++){
           if(emp[i].getAge()>40)
               System.out.println(i+1+" "+emp[i].toString());
        }
    }
}

class Employee{
    private String name;
    private String position;
    private String mailbox;
    private String phonenumber;
    private int salary;
    private int age;

    Employee(String name, String position, String mailbox, String phonenumber ,int salary,int age){
        this.name=name;
        this.position=position;
        this.mailbox=mailbox;
        this.phonenumber=phonenumber;
        this.salary=salary;
        this.age=age;
    }

    public int getAge(){
        return age;
    }
    
    @Override
    public String toString(){
         return name+", "+position+", "+mailbox+", "+phonenumber+", "+salary+", "+age;
    }
}