import java.util.Arrays;

public class arraysum {

    public static int sumarray(int array[]){
        if(array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }
        int loop[] = Arrays.copyOfRange(array, 1, array.length);
        int addthem = sumarray(loop);
        return array[0]+addthem;
        
    }
    public static void main(String[] args){
        int array[] = {1,2,3,4,5};
        System.out.println(sumarray(array));

    }
}
