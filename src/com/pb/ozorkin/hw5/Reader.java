package com.pb.ozorkin.hw5;

public class Reader {
   private String fio;
   private int nomer;
   private String department;
   private int birthsday;
   private int phone;

 public Reader() {

 }
    public Reader(String fio, int nomer, String department, int birthsday, int phone) {
         this.fio=fio;
        this.nomer = nomer;
        this.department = department;
        this.birthsday = birthsday;
        this.phone = phone;
    }
    public String getInfo() {
    String info = " " + getFio() + " " +  getNomer() + " " +  getDepartment() + " " +  getBirthsday() + " " +  getPhone();
    return info;
    }


   public void  setFio(String fio) {
   this.fio=fio;
   }

  public String getFio() {
      return fio;}


   public int getNomer() {
      return nomer;
   }

   public String getDepartment() {
      return department;
   }

   public int getBirthsday() {
      return birthsday;
   }

   public int getPhone() {
      return phone;
   }


}
