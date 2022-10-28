import java.util.*;

class Eye{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>10)
        {
            System.exit(0);
        }
        int age,firQueue=0,secQueue=0;
        while(n>0){
            age = sc.nextInt();
            if(age<10 && age>100){
                System.out.println("INVALID OUTPUT");
                System.exit(0);
            }
            if(age>60 && secQueue<6){
                secQueue++;
            }
            firQueue++;
            n--;
        }
        System.out.println("FIRST QUEUE : "+ firQueue*15);
        System.out.println("SECOND QUEUE : "+ secQueue*15);
    }
}