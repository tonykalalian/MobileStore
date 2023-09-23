package com.example.topg;

public class tablet<string> {
    private string type;
    private int imageId;

    public final static tablet[]tablets ={
            new tablet( "Apple Ipad 11 Pro",R.drawable.ipad11pro),
            new tablet( "Apple Ipad 9",R.drawable.ipad9),
            new tablet( "Samsung Galaxy Tab A7",R.drawable.samsunggalaxytaba7),
            new tablet( "Samsung Galaxy Tab S7",R.drawable.galaxytabs7),
            new tablet( "Google Pixel Slate ",R.drawable.googlepixelslate),

    };

    public tablet(string type, int imageId) {
        this.type = type;
        this.imageId=imageId;
    }

    public string getType() {
        return type;
    }

    public int getImageId() {
        return imageId;
    }

    @Override
    public String toString() {
        return type +"";
    }
}


