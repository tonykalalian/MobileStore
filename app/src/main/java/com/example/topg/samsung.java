package com.example.topg;

public class samsung<string> {
    private string type;
    private int imageId;

    public  static samsung[]samsungs ={
            new samsung( "Samsung Galaxy Note20 Ultra ",R.drawable.samsunggalaxynote20ultra),
            new samsung( "Samsung Galaxy S22 Ultra ",R.drawable.samsunggalaxys22ultra),
            new samsung( "Samsung Galaxy A72",R.drawable.samsunggalaxya72),
            new samsung( "Samsung Galaxy Z Flip 4 5G",R.drawable.samsungzflip4),
            new samsung( "Samsung Galaxy Z Fold 2",R.drawable.zfold),
            new samsung( "Samsung Galaxy A32",R.drawable.samsunga32),
            new samsung( "Samsung Galaxy S21 Ultra",R.drawable.samsunggalaxys21ultra),
    };

    public samsung(string type, int imageId) {
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

