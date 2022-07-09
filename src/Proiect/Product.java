package Proiect;

public class Product {

    String productName;
    int grameGrasimi;
    int grameCarbohidrati;
    int grameProteine;
    int totalCalorii;

    public Product() {
    }

    public Product(String productName, int grameGrasimi, int grameCarbohidrati, int grameProteine) {
        this.productName = productName;
        this.grameGrasimi = grameGrasimi;
        this.grameCarbohidrati = grameCarbohidrati;
        this.grameProteine = grameProteine;
        this.totalCalorii = computeCalories(grameGrasimi, grameCarbohidrati, grameProteine);
    }

    // Metoda accepta ca si parametrii numarul de grame de grasimi, numarul de grame de carbohidrati si numarul de grame de proteine
    public int computeCalories(int grameGrasimi, int grameCarbohidrati, int grameProteine) {
        int totalCalorii = (grameGrasimi * 9) + (grameCarbohidrati * 4) + (grameProteine * 4);
        return totalCalorii;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", grameGrasimi=" + grameGrasimi +
                ", grameCarbohidrati=" + grameCarbohidrati +
                ", grameProteine=" + grameProteine +
                ", totalCalorii=" + totalCalorii +
                '}';
    }
}
