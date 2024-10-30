import java.util.ArrayList;

public class StackArrylist {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        // functions

        public boolean isEmpty() {
            return list.size() == 0;
        }

        // add
        public void push(int data) {
            list.add(data); // at last index
        }

        // get and delete
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);  // store last index value in top  cuz its on the top of the stack
            list.remove(list.size() - 1);
            return top;
        }

        // get
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1); // from the last index
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(10);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
