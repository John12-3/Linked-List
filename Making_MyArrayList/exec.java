package Making_MyArrayList;

public class exec {

    public static class MyArrayList {
        private static final int DEFAULT_CAPACITY = 5;
        int size;
        int[] data;

        MyArrayList() {
            this(DEFAULT_CAPACITY);
        }

        MyArrayList(int capacity) {
            size = 0;
            data = new int[capacity];
        }

        int get(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Inalid Arguments ");
                return -1;
            } else {
                return data[idx];
            }
        }

        void set(int idx, int val) {
            if (idx < 0 || idx >= size) {
                System.out.println("Inalid Arguments ");
                return;
            } else {
                data[idx] = val;
                size++;
            }
        }

        int size() {
            return size;
        }

        void display() {
            for (int i = 0; i < size; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void add(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid Arguments ");
                return;
            }
            // insert algo
            if(size == data.length)
            {
                int[] ndata = new int[data.length * 2];
                for(int i=0;i<size;i++)
                {
                    ndata[i] = data[i];
                }
                data = ndata;
            }
            for (int i = size; i >= idx + 1; i--) {
                data[i] = data[i - 1];
            }
            data[idx] = val;
            // resize

        }

        void remove(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid Arguments ");
                return;
            }
            // removal algorith

            // resize
        }
    }

    public static void main(String[] args) {

    }

}
