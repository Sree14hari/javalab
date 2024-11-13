import java.util.Scanner;
class employe{
    String name;
    int empno;
    Scanner s=new Scanner(System.in);
    void getvalue(){
        System.out.println("enter the name and emplyee no");
        name=s.nextLine();
        empno=s.nextInt();
    }
    void display(){
        System.out.println("emplyee name:"+name+"\nemployee id:"+empno);
    }

}
class manager extends employe{
    double salary;
    String department;
    Scanner obj=new Scanner(System.in);
    employe e=new employe();
    void getvalue(){
        e.getvalue();
        System.out.println("enter salary and department");
        salary=obj.nextDouble();
        department=obj.nextLine();
        department=obj.nextLine();

    }
    void display(){
        e.display();
        System.out.println("salary:"+salary+"\ndepartment:"+department);
    }
}
class officer extends employe{
    double salary;
    String department;
    Scanner obj=new Scanner(System.in);
    employe e=new employe();

    void getvalue(){
        e.getvalue();
        System.out.println("enter salary and department");
        salary=obj.nextDouble();
        obj.nextLine();
        department=obj.nextLine();

    }
    void display(){
        e.display();
        System.out.println("salary:"+salary+"\ndepartment:"+department);
    }
}
class inheritance{
    public static void main(String[] args) {
        manager m=new manager();
        officer o=new officer();
        m.getvalue();
        o.getvalue();
        m.display();
        o.display();
    }
}

