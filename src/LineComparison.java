public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        int x1 = (int) Math.floor(Math.random()*10);
        int y1 = (int) Math.floor(Math.random()*10);
        int x2 = (int) Math.floor(Math.random()*10);
        int y2 = (int) Math.floor(Math.random()*10);
        System.out.println("Generated co-ordinates are: ("+x1+","+y1+") ("+x2+","+y2+")");
        double lenOfLine = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
        System.out.println("Length of line: "+lenOfLine);
    }
}
