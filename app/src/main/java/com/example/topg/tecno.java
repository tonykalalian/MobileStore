package com.example.topg;

public class tecno<string> {
    private string type;
    private int imageId;


    public  static tecno[]techno ={
            new tecno( "Techno Camon 18 Premier",R.drawable.tecnocamon18premier),
            new tecno( "Techno Camon 19 Pro ",R.drawable.tecnocamon19pro),
            new tecno( "Techno Pova 2",R.drawable.tecnopova2),
            new tecno( "Techno Spark 6",R.drawable.tecnospark6),
            new tecno( "Techno Pova 1",R.drawable.tecnopova),
            new tecno( "Techno Spark 9",R.drawable.tecnospark9),
            new tecno( "Techno Spark Go",R.drawable.tecnosparkkgo),



    };

    public tecno(string type, int imageId) {
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
