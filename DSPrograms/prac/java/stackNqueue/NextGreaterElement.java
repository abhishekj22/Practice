import java.util.Stack;

/**
 * Find first next greater element than given number in the array
 */
class NextGreaterElement{
    public static void main(String[] args) {
        int arr[] = {13, 7, 6, 12, 10};
        int res = worstCase(arr, 7);
        System.out.println(res);
        res = bestCase(arr, 12);
        System.out.println(res); 
    }

    /*
     * will take O(n^2)
     */
    public static int worstCase(int arr[], int num){
        boolean isNumberFound = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num)
                isNumberFound = true;

            if(isNumberFound){
                for(int j = i; j < arr.length; j++){
                    if(arr[j] > num){
                        return arr[j];
                    }
                }
                return -1;
            }
        }
        return -1;
    }

    public static int bestCase(int arr[], int num) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        int numIndex = -1;
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            if(curr == num){
                numIndex = i;
            }

            if(stack.empty()){
                stack.push(i);
                continue;
            }
           
            if(arr[stack.peek()] < curr){
                while(arr[stack.peek()] < curr){
                    res[stack.pop()] = curr;
                }
                stack.push(i);
            }else{
                stack.push(i);
            }
        }

        for(int i: stack){
            res[i] = -1;
        }

        return numIndex != -1? res[numIndex]: -1;
    }
}