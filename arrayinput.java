import java.util.*;
public class arrayinput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int array[] = new int[n];
        for(int i =0;i <n;i++){
            array[i] = input.nextInt();
        }
        input.close();
        for(int j =0;j<array.length;j++){
            System.out.println(array[j]);
        }
    }
}
