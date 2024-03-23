import java.util.*;





public class max {
    public static void swap(int[] array,int i_one, int i_two){
        int temp = array[i_one];
        array[i_one] = array[i_two];
        array[i_two] = temp;
    }

    public static void bs(int array[]){
        for(int i =0;i<array.length;i++){
              for(int j =0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    swap(array, j, j+1);
                };
            };
        };
    };

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i] = input.nextInt();
        }
        input.close();
        bs(array);
        System.out.println(array[array.length-1]);
    }    

    
}
