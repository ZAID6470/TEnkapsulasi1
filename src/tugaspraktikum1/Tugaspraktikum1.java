/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum1;

/**
 *
 * @author MOKLET-2
 */
public class Tugaspraktikum1 {
    
    public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangbaru;

    public Tugaspraktikum1(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    
    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Berat Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
            counter++;
        }
    }

    public void getpenumpang(int password) {
        if (password == 11) {
            System.out.println("Password Benar");

        } else {
            System.out.println("Password Salah");
        }

    }

    public double getAverage() {
        double average;
        return penumpang / counter;

    }

    public void cetakpenumpang() {
        System.out.println("Berat Penumpang Bus = " + penumpang);
        System.out.println("Maksimum berat penumpang = " + maxpenumpang);

    }
    
}
