package com.company;

public class Village implements Printable{
    private int Hocage;
    private String HocageName;
    public Village (int Hocage,String HocageName){
        this.HocageName = HocageName;
        this.Hocage = Hocage;

    }

    public String getHocageName() {
        return HocageName;
    }

    public void setHocageName(String hocageName) {
        HocageName = hocageName;
    }

    public void setHocage(int hocage) {
        Hocage = hocage;
    }

    public int getHocage() {
        return Hocage;
    }

    @Override
    public void print() {

    }
}
