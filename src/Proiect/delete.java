package Proiect;

public class delete {
    public static void main(String[] args) {
        int array[] = {1,3,6};
        deleteProduct(array, 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public static void deleteProduct(int productList[],int removedIdx) {
        System.arraycopy(productList, removedIdx + 1, productList, removedIdx, productList.length - 1 - removedIdx);

    }
}
