/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatorprogram;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class CalculatorProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner I=new Scanner(System.in);
        int j=1;
        do{
        System.out.println("Enter any two numbers:");
        int firstnum=I.nextInt();
        int secondnum=I.nextInt();
        System.out.println("Enter an operator(+,-,/,*)");
        char operator=I.next().charAt(0);
        int result = 0;
        switch(operator)
        {
            case'+':
            {
                result=firstnum+secondnum;
                break;
            }
            case'-':
            {
                result=firstnum-secondnum;
                break;
            }
            case'/':
            {
                result=firstnum/secondnum;
                break;
            }
            case'*':
            {
                result=firstnum*secondnum;
                break;
            }
            default:
            { 
                System.out.println("Error!The operator is not correct");
            } 
        }
        System.out.println(result); 
         j=I.nextInt();
        }while(j==1);
    }
        
}//main end
     
    