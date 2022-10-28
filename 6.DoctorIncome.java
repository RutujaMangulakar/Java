import java.util.*;

class Doctor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age, income=0,limit=0;
        //last element isnot considered else enter enter to break input
        while(sc.hasNextInt() && limit!=20){
            age = sc.nextInt();
            
            if(age<0 || age>120){
                System.out.println("INVALID INPUT");
                continue;
            }
            if(age <18){
                income +=200;
            }
            else if(age>17 && age<=40){
                income +=400;
            }
            else{
                income +=300;
            }
            limit++;
        }
        System.out.println(income+" INR");
    }
}