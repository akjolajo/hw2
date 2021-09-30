package com.company;

public class HiddenSheet extends Village implements Printable{
    private int genin;
    private int choonin;
    private int joonin;

    public HiddenSheet (String HocageName ,int Hocage,int joonin,int choonin,int genin){
        super(Hocage, HocageName);
        this.genin = genin;
        this.choonin = choonin;
        this.joonin = joonin;
    }
    @Override
    public void print() {
        System.out.println("in the Village Sheet there are "+getHocage() + " hocage name is "+getHocageName()+ " and"+ joonin+" joonin and "+ choonin+" choonin and "+ genin +"genin");

    }
}
