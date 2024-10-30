class TreeArray {

    int arr[];

    TreeArray(int level) {
        int size = (int) Math.pow(2, level);

        arr = new int[size];

    }

    public void insertRoot(int parent) {
        if (arr[1] == 0) {
            arr[1] = parent;
        } else {
            System.out.println("root alredy present");
        }
    }

    public void insert(int parent, int child) {

        int index = search(parent);

        if (index == 0) {
            System.out.println("parent is not present");
            return;
        }

        else if (arr[index * 2] == 0) {
            arr[index * 2] = child;
        } else if (arr[(index * 2) + 1] == 0) {
            arr[(index * 2) + 1] = child;
        } else {
            System.out.println("Both are filled");
            return;
        }

    }

    public int search(int parent) {
        for (int i = 1; i < arr.length; i++) {
            if (parent == arr[i]) {
                return i;
            }
        }
        return 0;
    }

    public void traverse() {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
    }

    public void delete(int parent) {
        int index = search(parent);
        if (index == 0) {
            System.out.println("not found");
            return;
        } else {
            int left = arr[index * 2];
            int right = arr[(index * 2) + 1];

            if (left == 0 && right == 0) {
                arr[index] = 0;
            }

            else if (left == 0 || right == 0) {
                if (left != 0) {
                    arr[index] = left;
                    arr[index * 2] = 0;
                } else {
                    arr[index] = right;
                    arr[index * 2 + 1] = 0;
                }
            } else {

                int succerider = succer(index);
                int temp = arr[index];
                arr[index] = arr[succerider];
                arr[succerider] = temp;
                delete(arr[index]);
                ;
            }
        }

    }

}

public class BInaryTreeArray {
    public static void main(String[] args) {

        TreeArray tree = new TreeArray(4);
        tree.insertRoot(1);
        tree.insert(1, 2);
        tree.insert(1, 3);
        tree.insert(2, 4);
        tree.insert(2, 5);
        tree.insert(4, 8);
        tree.insert(5, 10);
        tree.insert(3, 6);
        tree.insert(3, 5);
        tree.delete(5);

        tree.traverse();

    }
}
