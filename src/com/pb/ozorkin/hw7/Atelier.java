package com.pb.ozorkin.hw7;

public class Atelier  {


    public static void main(String[] args) {
      Pants pants1 = new Pants(Size.XXS,"Black",300);
      Tshirt tshirt1 = new Tshirt(Size.L,"Blue",200);
      Skirt skirt1 = new Skirt(Size.M,"Yellow",150);
      Tie tie1 = new Tie(Size.XS,"Red",50);


      Clothes clothes [] =  {pants1, tshirt1, skirt1, tie1};
      System.out.println("Man clothes");
       dressMan(clothes);

       System.out.println("Man clothes");
       dressWomen(clothes);

    }
     static void dressMan(Clothes[] clothes) {
        for (Clothes nextCloth: clothes) {
            if (nextCloth instanceof ManClothes) {
                ((ManClothes) nextCloth).dressMan();
            }
        }
    }
    static void dressWomen(Clothes[] clothes) {
        for (Clothes nextCloth: clothes) {
            if (nextCloth instanceof WomenClothes) {
                ((WomenClothes) nextCloth).dressWomen();
            }
        }
    }

}
