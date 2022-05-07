import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion.MinimumInArray;

public class MinInt implements MinimumInArray {

    public static void main(String[] numbers) {
        int[] arr = {24, 52, 74, 9, 34, 23, 64, 34};
        MinInt minInt = new MinInt();
        System.out.println("Minimum is: " + minInt.findMin(arr));
    }

    /**
     * Function to find the minimum number from the array provided
     * @param array
     * @return
     */
    public int findMin(int[] array) {

        int arrayLength = array.length;
        return findMinAux(arrayLength,array);
    }

    /**
     * Basically an "Auxiliary" function which is basically the brain of findMin()
     * @param length
     * @param arr
     * @return
     */
    public int findMinAux(int length, int[] arr){
        if(length == 1){
            return arr[0];
        } else{
            //Main recursion command
            return Math.min(arr[length-1],findMinAux(length-1,arr));
        }
    }
}