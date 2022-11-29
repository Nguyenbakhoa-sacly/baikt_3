package com.example.bai_kt3;

public class model {
    String tenngonngu;
    int icon;

    public model(String tenngonngu, int icon) {
        this.tenngonngu = tenngonngu;
        this.icon = icon;
    }

    public String getTenngonngu() {
        return tenngonngu;
    }

    public void setTenngonngu(String tenngonngu) {
        this.tenngonngu = tenngonngu;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
