package day07_IfStatementsContinue;

public class NetIncomCalc {

    public static void main(String[] args) {

        int salary = 100000;
        boolean isMarried = true;

        double taxRate = 0;


        if (salary >= 130_000) { // if salary is 130k or more, then the tax rate should ne 34%
            taxRate = 0.35;
        }
        if (salary >= 100_000 && salary < 130_000) {  //if salary is between 100k to 130k(excluded) then tax rate should be 30%
            taxRate = 0.3;
        }
        if (salary >= 80_000 && salary < 100_000) {  //if salary is between 80k to 100k(excluded) then tax rate should be 25%
            taxRate = 0.25;
        }
        if (salary < 80_000) {  //if salary is less than 80k, then tax rate should be 20%
            taxRate = 0.2;
        }
        if (isMarried) {  // if the person is married
            taxRate -= 0.05; // tax id reduceed by 5%
        }

        //double netIncome = salary * (1 - taxRate);

        double totalTax = salary * taxRate;
        double netIncome2 = salary-totalTax;

        System.out.println("salary = "+salary);
        System.out.println("totalTax = "+totalTax);
        System.out.println("netIncome = "+netIncome2);



   }

}

/*
9. Create a class named NetIncomeCalc,
Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */