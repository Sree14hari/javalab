import java.util.Scanner;

class account{
    String name,type;
    int acno;
    double balance;
    void account(String n,int ac,double bal){
        name=n;
        acno=ac;
        balance=bal;
    }
        

}
class CurrentAccount extends account{
    Scanner in=new Scanner(System.in);
    public void getvalues(){
        System.out.println("enter name,acno,balance");
        name=in.nextLine();
        acno=in.nextInt();
        balance=in.nextDouble();
        type="current";
    }
    public void deposit(int m){
        balance+=m;
    }
    public void withdraw(int m){
        balance-=m;
    }
    public void display(){
        System.out.println("name="+name+"account no="+acno+"type="+type+"balance="+balance);
    }
}

class SavingAccount extends account{
    Scanner in=new Scanner(System.in);
    public void getvalues(){
        System.out.println("enter name,acno,balance");
        name=in.nextLine();
        acno=in.nextInt();
        balance=in.nextDouble();
        type="saving";
    }
    public void deposit(int m){
        balance+=m;
    }
    public void withdraw(){
        System.out.println("cant withdraw from savings account");
    }
    public void display(){
        System.out.println("name="+name+"account no="+acno+"type="+type+"balance="+balance);
    }
}
class bank{
    public static void main(String[] args) {
        account a=new account();
        Scanner obj=new Scanner(System.in);
        System.out.println("enter choice \n1.current account\n2.savings account");
        int ch=obj.nextInt();
        if(ch==1){
            CurrentAccount ca=new CurrentAccount();
            ca.getvalues();
            System.out.println("enter your choice \n1.deposit\n2.withdraw");
            int cho=obj.nextInt();
            if(cho==1){
                System.out.println("enter amount to be deposited");
                int m=obj.nextInt();
                ca.deposit(m);
                ca.display();
            }
            else{
                System.out.println("enter amount to be withdraed");
                int ml=obj.nextInt();
                ca.withdraw(ml);
                ca.display();
            }
        }
        else if(ch==2){
            SavingAccount sa=new SavingAccount();
            sa.getvalues();
            System.out.println("enter your choice \n1.deposit\n2.withdraw");
            int cho=obj.nextInt();
            if(cho==1){
                System.out.println("enter amount to be deposited");
                int m=obj.nextInt();
                sa.deposit(m);
                sa.display();
            }
            else{
                sa.withdraw();
                sa.display();
            }
        }
        else{
            System.out.println("wrong choice ");
        }

    }
}