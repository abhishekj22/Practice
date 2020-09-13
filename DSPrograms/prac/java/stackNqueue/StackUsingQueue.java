import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue{
    public static void main(String[] args) {
        /*
        CostlyPush.push(10);
        CostlyPush.push(20);
        System.out.println(CostlyPush.pop());
        CostlyPush.push(30);
        CostlyPush.push(40);
        System.out.println(CostlyPush.pop());
        System.out.println(CostlyPush.pop());
        */
        CostlyPop.push(10);
        CostlyPop.push(20);
        System.out.println(CostlyPop.pop());
        CostlyPop.push(30);
        CostlyPop.push(40);
        System.out.println(CostlyPop.pop());
        System.out.println(CostlyPop.pop());
    }

    private static class CostlyPush{
        static Queue<Integer> mainQ = new LinkedList<>();
        static Queue<Integer> tempQ = new LinkedList<>();

        public static void push(int data) {
            if(!mainQ.isEmpty()){
                while(!mainQ.isEmpty()){
                    tempQ.add(mainQ.poll());
                }
            }
            mainQ.add(data);
            if(!tempQ.isEmpty()){
                while(!tempQ.isEmpty()){
                    mainQ.add(tempQ.poll());
                }
            }
        }

        public static int pop() {
            return mainQ.poll();
        }
    }

    private static class CostlyPop{
        static Queue<Integer> mainQ = new LinkedList<>();
        static Queue<Integer> tempQ = new LinkedList<>();

        public static void push(int data) {
            mainQ.add(data);
        }

        public static int pop() {
            if(!mainQ.isEmpty()){
                while(!mainQ.isEmpty()){
                    tempQ.add(mainQ.poll());
                }
            }
            int res = tempQ.poll();
            if(!tempQ.isEmpty()){
                while(!tempQ.isEmpty()){
                    mainQ.add(tempQ.poll());
                }
            }
            return res;
        }
    }
}