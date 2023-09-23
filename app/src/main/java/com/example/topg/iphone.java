package com.example.topg;

public class iphone<string> {
    private string type;
    private int imageId;

    public final static iphone[]iphones ={
            new iphone( "Apple iPhone 14 ",R.drawable.iphone14),
            new iphone( "Apple iPhone 13 Pro Max ",R.drawable.iphone13promax),
            new iphone( "Apple iPhone 13 ", R.drawable.iphone13),
            new iphone( "Apple iPhone 12 Pro", R.drawable.iphone12pro),
            new iphone( "Apple iPhone 12 ", R.drawable.iphone12),
            new iphone( "Apple iPhone 11 Pro ", R.drawable.iphone11pro),
            new iphone( "Apple iPhone 11 ", R.drawable.iphone11),
            new iphone( "Apple iPhone XS Max", R.drawable.iphonexsmax),
            new iphone( "Apple iPhone X ", R.drawable.iphonex),
    };

    public iphone(string type, int imageId) {
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


