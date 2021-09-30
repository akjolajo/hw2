package com.company;

public class Main {

    public static void main(String[] args) {
        Village[] villages = {creatObjact("HiddenSheet"),creatObjact("HiddenSad"),creatObjact("HiddenFog")};
        for (Village i:villages){
            i.print();
        }


    }
    public static Village creatObjact(String className){
        switch (className){
            case "HiddenSheet":
                HiddenSheet hiddenSheet = new HiddenSheet("Kakashi",1, 29,51,83);
                return hiddenSheet;
            case "HiddenSad":
                HiddenSand hiddenSand = new HiddenSand("Gaara",1,25,45,79);
                return hiddenSand;
            case "HiddenFog":
                HiddenFog hiddenFog = new HiddenFog("Shan Chi",1,22,43,75);
                return hiddenFog;

        }
        return null;
    }
}
