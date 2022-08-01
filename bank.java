import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class bank {
    public static void main(String[] args) {

        int option;
        String Name;
        int Id;
        boolean isbank = false;
        int loop = 1;
        int choice;

        Scanner my1 = new Scanner(System.in);
        Scanner my2 = new Scanner(System.in);
        class1 myc1obj1 = new class1();
        class2 myc2obj2 = new class2();
        class3 myc3obj3 = new class3();
        class4 myc4obj4 = new class4();
        System.out.println(myc4obj4.method5());
        class5 myc5obj5 = new class5();
        class6 myc6obj6 = new class6();
        class7 myc7obj7 = new class7();
        class8 myc8obj8 = new class8();
        class9 myc9obj9 = new class9();

        while(loop != -1)
        {
        
            Name = myc1obj1.get1();
            Id = myc1obj1.get2();

            Scanner myobj1 = new Scanner(System.in);

            System.out.println("Enter your option: ");
            System.out.println("1) Create new account ");
            System.out.println("2) Pay utility bills ");
            System.out.println("3) Basic banking ");
            
            option = myobj1.nextInt();

            switch(option)
            {
                case 1:
                myc1obj1.method1();
                isbank = true;
                break;

                case 2:
                if(isbank == false)
                {
                    System.out.println("CREATE A BANK ACCOUNT FIRST");
                }
                else 
                {
                    myc2obj2.method2();
                    myc3obj3.method3();
                    myc4obj4.method4();
                    myc5obj5.method6();
                    myc6obj6.method7();
                    myc7obj7.method8();
                    myc8obj8.method9();
                }
                break;

                case 3:
                if(isbank == false)
                {
                    System.out.println("CREATE A BANK ACCOUNT FIRST");
                }
                else 
                {
                    System.out.println("Enter your choice: ");
                    System.out.println("1 for depositing money");
                    System.out.println("2 for withdrawing money");
                    choice = my2.nextInt();

                    if(choice == 1)
                    {
                        myc9obj9.method10();
                    }
                    else if(choice == 2)
                    {

                    }
                    else 
                    {
                        System.out.println("Invalid input");
                    }
                }
                break;

                default:
                System.out.println("Invalid input!");
            }

            System.out.println("Do you want to continue?");
            loop = my1.nextInt();
        }
    }
}

class class1 // create account
{
    Scanner myobj2 = new Scanner(System.in);

    private String name;
    private int id;

    public void method1()
    {
        int balance = 25000;
        System.out.println("Enter your name: ");
        name = myobj2.nextLine();
        System.out.println("Enter your id: ");
        id = myobj2.nextInt();
    }

    //  public class1(String Name, int identity) // constructor
    //  {
    //      name = Name;
    //      id = identity;
    //  }

    public String get1()
    {
        return name;
    }

    public int get2()
    {
        return id;
    }

    // public void set1(String NAME, int ID)
    // {
    //     name = NAME;
    //     id = ID;
    // }
}

class class2 // display menu
{
    public void method2()
    {
        System.out.println("Which bill do you want to pay?");
        System.out.println("1) Electricity");
        System.out.println("2) Water");
        System.out.println("3) Gas");
        System.out.println("4) Internet");
    }
}

class class3 // switch case in menu
{
    public void method3()
    {
        int option;

        Scanner myobj3 = new Scanner(System.in);
        option = myobj3.nextInt();

            switch(option)
            {
                case 1:
                System.out.println("Electricity bill...");
                break;

                case 2:
                System.out.println("Water bill...");
                break;

                case 3:
                System.out.println("Gas bill...");
                break;

                case 4:
                System.out.println("Internet bill...");
                break;

                default:
                System.out.println("Invalid input!");
                break;
            }
        }
}

class class4 // calculations
{
    Double balance = 25000.000;

    public void method4()
    {
        Double bill;

        Scanner myobj4 = new Scanner(System.in);

        System.out.println("Enter the amount of your bill: ");
        bill = myobj4.nextDouble();

        balance = balance - bill;
        System.out.println("Your remaining balance is: " + balance);
    }
    public Double method5()
    {
        return balance;
    }
}

class class5 extends class4 // Electricity
{
    public void method6()
    {

    }
}

class class6 extends class5 // Water
{
    public void method7()
    {

    }
}

class class7 extends class6 // gas
{
    public void method8()
    {

    }
}

class class8 extends class7 // internet
{
    public void method9()
    {

    }
}

class class9 // deposit
{
    public void method10()
    {
        Scanner my3 = new Scanner(System.in);
        class4 obj = new class4();

        Double dep;
        Double add = obj.method5();;
        System.out.println("How much money do you want to deposit?");
        dep = my3.nextDouble();

        if(dep % 500 != 0)
        {
            System.out.println("Sorry your money can not be deposited as you can only deposit multiples of 500");
        }
        else
        {
            if(dep <= 5000)
            {
                dep = dep - 0.05*dep;
                System.out.println("Your money after deduction: " + dep);
                add = add + dep;
                System.out.println("Your total money: " + add);
            }
            else if(dep <= 15000 && dep > 5000)
            {
                dep = dep - 0.025*dep;
                System.out.println("Your money after deduction: " + dep);
                add = add + dep;
                System.out.println("Your total money: " + add);
            }
            else
            {
                add = add + dep;
                System.out.println("No deduction");
                System.out.println("Your total money: " + add);
            }
        }
    }   
}