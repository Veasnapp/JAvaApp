package exchangemoney;
import java.util.Scanner;
public class ExchangeMoney {
      static void KhmertoDollar(long M){
           long R= M/4129;
           System.out.println("Your exchange "+M+" riel is $"+R);}
      static void DollartoKhmer( long M){
          long D = M*4129;  
          System.out.println("Your exchange $"+M+" is "+D+" riel");}
      static void KhmertoBaht(long M){
          long R1= M/115;
           System.out.println("Your exchange "+M+" riel is "+R1+" Baht");}
      static void BahttoKhmer( long M){
          long D = M*115;  
          System.out.println("Your exchange "+M+" Baht is "+D+" riel");}
                 
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
         while(true) {  
        System.out.print("\nMenu:\n1: To exchange Riel to Dollar\n2: To exchange Dollar to Riel\n3: To exchange Riel to Baht\n4: To exchange Baht to Riel\n5: To Exit\nChoose Your Option: ");
        int a=sc.nextInt();
        if(a== 5){ System.out.println("Thank You for Using Our Service :)"); break;}
        System.out.print("Your money is: ");
        long M=sc.nextLong();
      switch(a){          
          case 1: if(M >4129){KhmertoDollar(M);break;}
          case 2:{DollartoKhmer(M);break;}
          case 3:if(M>115){KhmertoBaht(M);break;}
          case 4:{BahttoKhmer(M);break;}
          default: System.out.println("You must enter number between 1 and 5!!!");;}   
        }
    }
}
