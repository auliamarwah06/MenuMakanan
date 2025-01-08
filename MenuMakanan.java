/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubesss;

/**
 *
 * @author LENOVO
 */
// Inheritance: Membuat kelas spesifik untuk MenuMakanan
class MenuMakanan extends Menu {

    public MenuMakanan(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void displayMenu() {
        System.out.println("Makanan: " + nama + ", Harga: Rp " + harga);
    }
}


