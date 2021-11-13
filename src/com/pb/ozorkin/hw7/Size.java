package com.pb.ozorkin.hw7;

public enum Size {
    XXS(32,"[Детский размер]"), XS(34, "[Взрослый размер]"),
    S(36,"[Взрослый размер]"), M(38,"[Взрослый размер]"), L(40,"[Взрослый размер]");

    private int euroSize;
    private String description;
    private String enumSize;

     Size (int euroSize, String description) {
        this.euroSize=euroSize;
        this.description=description;

    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getEnumSize () {
        return euroSize + " " + description;
     }


    public String getDescription() {
        return description;
    }

}
