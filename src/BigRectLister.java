import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static ArrayList<Object> collect(ArrayList<Object> rect, Filter f) {
        ArrayList<Object> rectangles = new ArrayList<Object>();

        for(Object rectangle : rect){
            if(f.accept(rectangle)){
                rectangles.add(rectangle);
            }
        }
        return rectangles;
    }

    public static void main(String[] args) {
        ArrayList<Object> rects = new ArrayList<Object>();
        rects.add(new Rectangle(5, 10)); //30
        rects.add(new Rectangle(3, 4)); //14
        rects.add(new Rectangle(1, 2)); //6
        rects.add(new Rectangle(2, 1)); //6
        rects.add(new Rectangle(1, 10)); //20
        rects.add(new Rectangle(2, 2)); //8
        rects.add(new Rectangle(3, 5)); //16
        rects.add(new Rectangle(2, 1)); //4
        rects.add(new Rectangle(3, 1)); //6
        rects.add(new Rectangle(4, 4)); //16

        rects = collect(rects, new BigRectangleFilter());
        System.out.println(rects);
    }
}
