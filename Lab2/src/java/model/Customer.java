/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Customer {
    private int id;
    private String tenThueBao;
    private String soST;
    private String diaChi;

    public Customer() {
    }

    public Customer(int id, String tenThueBao, String soST, String diaChi) {
        this.id = id;
        this.tenThueBao = tenThueBao;
        this.soST = soST;
        this.diaChi = diaChi;
    }

    public int getId() {
        return id;
    }

    public String getTenThueBao() {
        return tenThueBao;
    }

    public String getSoST() {
        return soST;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTenThueBao(String tenThueBao) {
        this.tenThueBao = tenThueBao;
    }

    public void setSoST(String soST) {
        this.soST = soST;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
