
package kuis_pbo;

public class Main{
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("m1", "macan", "p");
        Hewan hewan2 = new Hewan("m1", "macan", "pp");
        Hewan hewan3 = new Hewan("k", "kambing", "k");
        Hewan hewan4 = new Hewan("a", "ayam", "a");
        hewan1.printAnimal(hewan1);
        hewan2.printAnimal(hewan2);
        hewan3.printAnimal(hewan3);
        hewan4.printAnimal(hewan4);
    }
}
