import java.util.*;
public class sumofall {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = 0;

        for(int i = 1; i<=n;i++){
            if(i%2==0 && i%2==0){
                s+=i;
            };
        }
        input.close();
        System.out.println(s);
    }
}
