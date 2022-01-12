public class ArrayList {

    int length = x;
    private int[] array = new int[length];

    public int size() {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                size++;
            }
        }
        return size;
    }

    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++)
            if (i != 0) {
                return false;
            }
        return true;
    }

    public int indexOf(int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        return index;
    }

    public int get(int index) {
        return array[index];
    }

    public void set(int index, int number) {
        array[index] = number;
    }


    public boolean contains(int number) {
        for (int i = 0; i < array.length; i++)
            if (i == number)
                return true;
        return false;
    }

    public int lastIndexOf(int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == number)
                index = i;
        return index;
    }
}
