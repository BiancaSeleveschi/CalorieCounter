package Proiect;
import static java.util.Collections.list;

public class ProductCatalog {
    Product[] productList = new Product[MAX_PRODUSE];
    private static final int MAX_PRODUSE = 100;
    int productListLength = productList.length;
    int numberOfProducts;

    public ProductCatalog() {
    }

    public void printProducts() {
        for (int i = 0; i < productList.length; i++) {
            System.out.println(productList[i]);
        }
    }

    public boolean addProduct(Product product) {
        if (productListLength > MAX_PRODUSE) {
            return false;
        }

        for (int i = 0; i < productList.length; i++) {

            if (productList[i] == product) {
                return false;
            } else {
                productList[i] = product;
                System.out.println(productList[i]);
                break;
            }
        }
        productList[numberOfProducts++] = product;
        return true;
    }

    public Product getProductByName(String productName) {
        for (int i = 0; i < productList.length; i++) {
            if (productList[i].productName == productName) {
                return productList[i];
            }
        }
        return null;
    }

    public void deleteProduct(String productName) {
        int removedIdx = getProductIndex(productName);
        System.arraycopy(productList, removedIdx + 1, productList, removedIdx, productList.length - 1 - removedIdx);
    }

    private int getProductIndex(String productName) {
        for (int i = 0; i < productList.length; i++) {
            if (productList[i].productName.equals(productName)) {
                return i;
            }
        }
        return -1;
    }
}


