import java.util.*;

class Bus{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int[] path = {800,600,750,900,1400,1200,1100,1500};
        String[] BusStop = {"TH","GA","IC","HA","TE","LU","NI","CA"};
        String source = sc.next().toUpperCase();
        String dest = sc.next().toUpperCase();
        if(source.length()!=2 || dest.length()!=2){
            System.out.println("INVALID INPUT");
        }
        else{
            getFare(source,dest);
        }

    }

    static int getFare(String source, String dest){
        int dist_travel = 0;

        return 1;
    }
}