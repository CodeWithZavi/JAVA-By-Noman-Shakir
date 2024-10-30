public class CircularQueueBYown {

    static class quArray {

        static int arr[];
        static int size;
        static int rear;
        static int front;

        quArray(int n) {
            arr = new int[n]; // give size to array
            size = n;
            rear = -1; // -1 index pa ha 0 se phale
            front = -1;
        }

        public static boolean IsEmpty() {
            return rear == -1 && front == -1; // when queue is empty
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void Add(int data) // OR enque
        {
            if (isFull()) {
                System.out.println("queue is Full");
                return;
            }

            // when add first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size; // shift last to again first and go on
            arr[rear] = data; // us place pa value
        }

        public static int Remove() // dequeue
        {
            if (IsEmpty()) {
                System.out.println("queue is Empty");
                return Integer.MIN_VALUE; // or return -1
            }

            int result = arr[front]; // extract value from 0 index

            // implemrnt in big o 1

            // last element
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;

            }
            return result;

        }

        public static int peak() // front
        {
            if (IsEmpty()) {
                System.out.println("queue is Empty");
                return Integer.MIN_VALUE; // or return -1
            }
            return arr[front]; // OR front value
        }
    }

    public static void main(String[] args) {

        quArray q = new quArray(3);
        q.Add(2);
        q.Add(4);
        q.Add(6);

        System.out.println(q.Remove());
        q.Add(10);
        System.out.println(q.Remove());
        q.Add(12);

        q.Remove(); // extract 6

        while (!q.IsEmpty()) {
            System.out.println(q.peak());
            q.Remove();
        }

    }
}
