package com.company;

public class HiddenFog extends Village implements  Printable{
    private int genin;
    private int choonin;
    private int joonin;

    public HiddenFog(String HocageName, int Hocage,int joonin,int choonin,int genin) {
        super(Hocage, HocageName);
        this.joonin= joonin;
        this.choonin=choonin;
        this.genin=genin;


    }

    @Override
    public void print() {
        System.out.println  ("in the Village Fog there are "+getHocage() + " hocage name is "+getHocageName()+" and "+ joonin+" joonin and "+ choonin+" choonin and "+ genin +"genin") ;

    }
}
