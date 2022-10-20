package com.example.myapplication;

public class Thongtin {

        private String ten;
        private String ngaythang;
        private int hinh;

        public Thongtin(String ten, String ngaythang, int hinh) {
            this.ten = ten;
            this.ngaythang = ngaythang;
            this.hinh = hinh;
        }

        public String getten() {
            return ten;
        }

        public void setten(String ten) {
            this.ten = ten;
        }

        public String getngaythang() {
            return ngaythang;
        }

        public void setngaythang(String ngaythang) {
            this.ngaythang = ngaythang;
        }

        public int getHinh() {
            return hinh;
        }

        public void setHinh(int hinh) {
            this.hinh = hinh;
        }


}
