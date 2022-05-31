import java.util.Objects;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        int x1 = (int) Math.floor(Math.random()*10);
        int y1 = (int) Math.floor(Math.random()*10);
        int x2 = (int) Math.floor(Math.random()*10);
        int y2 = (int) Math.floor(Math.random()*10);

        int x3 = (int) Math.floor(Math.random()*10);
        int y3 = (int) Math.floor(Math.random()*10);
        int x4 = (int) Math.floor(Math.random()*10);
        int y4 = (int) Math.floor(Math.random()*10);

        System.out.println("Generated first co-ordinates are: ("+x1+","+y1+") ("+x2+","+y2+")");
        double lenOfLine1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
        System.out.println("Length of line1: "+lenOfLine1);

        System.out.println("Generated first co-ordinates are: ("+x3+","+y3+") ("+x4+","+y4+")");
        double lenOfLine2 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2) );
        System.out.println("Length of line2: "+lenOfLine2);

        if (Objects.equals(lenOfLine1, lenOfLine2)) {
            System.out.println("Lines are equal.");
        } else {
            System.out.println("Lines are not equal.");
        }
    }
}
