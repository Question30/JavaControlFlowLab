import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Task1
        int x = 7;
        x = 15;
        if(x < 10){
            System.out.println("Less than 10");
        }

        //Task 2
        x = 7;
        if(x < 10){
            System.out.println("Less than 10");
        }else {
            System.out.println("Greater than 10");
        }

        //Task 3
        x = 50;
        if(x < 10){
            System.out.println("Less than 10");
        }else if (x > 10 && x < 20){
            System.out.println("Between 10 and 20");
        }
        else {
            System.out.println("Greater than or equal to 20");
        }

        //Task 4
        x = 5;
        if(x > 10 && x < 20){
            System.out.println("In range");
        }else{
            System.out.println("Out of range");
        }

        //Task 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade 0 - 100 : ");
        int grade = scanner.nextInt();

        if(grade >= 90 && grade <= 100){
            System.out.println("Grade : A");
        }else if(grade >= 80 && grade <= 89){
            System.out.println("Grade : B");
        }else if(grade >= 70 && grade <= 79){
            System.out.println("Grade : C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Grade : D");
        }else if(grade < 60 && grade >= 0){
            System.out.println("Grade: F");
        }else{
            System.out.println("Score out of range");
        }

        //Task 6
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number 1-7");
        int day = scanner1.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of range");
                break;
        }

        //Task 7
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter filling status: (ex. Single, Married, Head)");
        String status = scanner2.nextLine();
        if(status.equals("Married")){
            System.out.println("Are you filling Jointly or Separate");
            status = scanner2.nextLine();
        }

        status = status.toLowerCase();
        System.out.println("What is your yearly income?");
        int income = scanner2.nextInt();

        if(status.equals("single")){
            if(income >= 0 && income <= 8350){
                System.out.println("Your tax rate is 10%");
            }else if(income >= 8351 && income <= 33950){
                System.out.println("Your tax rate is 15%");
            }else if(income >= 33951 && income <= 82250){
                System.out.println("Your tax rate is 25%");
            }else if (income >= 82251 && income <= 171550){
                System.out.println("Your tax rate is 28%");
            }else if(income >= 171551 && income <= 372950){
                System.out.println("Your tax rate is 33%");
            }else if(income > 372951){
                System.out.println("Your tax rate is 35%");
            }else{
                System.out.println("Out of range");
            }
        }else if(status.equals("jointly")){
            if(income >= 0 && income <= 16700){
                System.out.println("Your tax rate is 10%");
            }else if(income >= 16701 && income <= 67900){
                System.out.println("Your tax rate is 15%");
            }else if(income >= 67901 && income <= 137050){
                System.out.println("Your tax rate is 25%");
            }else if (income >= 137051 && income <= 208850){
                System.out.println("Your tax rate is 28%");
            }else if(income >= 208851 && income <= 372950){
                System.out.println("Your tax rate is 33%");
            }else if(income > 372951){
                System.out.println("Your tax rate is 35%");
            }else{
                System.out.println("Out of range");
            }
        } else if (status.equals("separate")) {
            if(income >= 0 && income <= 8350){
                System.out.println("Your tax rate is 10%");
            }else if(income >= 8351 && income <= 33950){
                System.out.println("Your tax rate is 15%");
            }else if(income >= 33951 && income <= 68525){
                System.out.println("Your tax rate is 25%");
            }else if (income >= 68526 && income <= 104425){
                System.out.println("Your tax rate is 28%");
            }else if(income >= 104426 && income <= 186475){
                System.out.println("Your tax rate is 33%");
            }else if(income > 186475){
                System.out.println("Your tax rate is 35%");
            }else{
                System.out.println("Out of range");
            }
        } else if (status.equals("head")) {
            if(income >= 0 && income <= 11950){
                System.out.println("Your tax rate is 10%");
            }else if(income >= 11951 && income <= 45500){
                System.out.println("Your tax rate is 15%");
            }else if(income >= 45501 && income <= 117450){
                System.out.println("Your tax rate is 25%");
            }else if (income >= 117451 && income <= 190200){
                System.out.println("Your tax rate is 28%");
            }else if(income >= 190201 && income <= 372950){
                System.out.println("Your tax rate is 33%");
            }else if(income > 372951){
                System.out.println("Your tax rate is 35%");
            }else{
                System.out.println("Out of range");
            }
        }else{
            System.out.println("Not valid filling status");
        }

    }


}