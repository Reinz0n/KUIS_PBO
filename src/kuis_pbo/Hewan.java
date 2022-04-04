
package kuis_pbo;

public class Hewan implements Animal{
    protected String nama, jenis, suara;
    
    public Hewan(String nama, String jenis, String suara){
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    @Override
    public String getName() {
        return nama;
    }

    @Override
    public String getType() {
        return jenis;
    }

    @Override
    public void makeSound() {
        System.out.println(suara);
    }
    
    public void printAnimal(Animal animal){
        System.out.print(animal.getName() + " adalah " + animal.getType() + " dengan bunyi "); animal.makeSound();
    }
}
