package android.razaiqbal.com.razaiqbal_1202152163_modul3;

/**
 * Created by devaliamesha on 23/02/18.
 */

public class Water {

    private  String title;
    private String info;
    private final int imageResource;

    static final String TITLE_KEY = "Title";
    static final String IMAGE_KEY = "ImageResource";


    public Water(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }
    String getTitle() {
        return title;
    }

    String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }

    }


