import java.util.Scanner;
public class StManipulation {
    public static void main(String args[]) {
        int n;
       
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("\nSELECT OPTION \n1.STRING LENGTH \n2.STRING CONCATANATION \n3.STRING EQUAL \n4.STRING COPY \n5.EXIT");
        n = sc.nextInt();
        switch(n)
        {
        case 1:System.out.print("Enter String:");
                String s1=sc.next();
                int len=s1.length();
                System.out.print("String Length is:"+len);
                break;
        case 2:System.out.print("Enter String1:");
                String s2=sc.next();
                System.out.print("Enter String2:");
                String s3=sc.next();
                String con=s2+s3;
                System.out.println("String Concatanation is: "+con);
                String st=s2.concat(s3);
                System.out.println("String Concatanation Using library function is:"+st);
                break;
        case 3:System.out.print("Enter String1:");
               String st1=sc.next();
               System.out.print("Enter String2:");
               String st2=sc.next();
               if(st1.equals(st2))
        {
              System.out.print(" STRINGS ARE EQUAL");
       
        }
               else
          System.out.print("STRINGS ARE NOT EQUAL ");
        break;
        case 4:System.out.print("Enter String1:");
               String st3=sc.next();
               System.out.print("Enter String2:");
               String st4=sc.next();
               st4=st3;
               System.out.print("STRING COPIED IS:"+st4);
               break;
        case 5:System.out.print("EXIT");
               return;
        }
      }
    }
}