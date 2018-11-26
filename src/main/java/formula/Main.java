package formula;

public class Main {
    public static void main(String[] args) {
        //Formula f = FormulaFactory.parse("T & F & T");
        //System.out.println(f + " = " + f.evaluate());

        Formula f = FormulaFactory.parse("true & false & T");
        System.out.println(f + " = " + f.evaluate());
    }
}
