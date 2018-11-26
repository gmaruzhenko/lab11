package formula;

public class Or implements Formula {
    Formula left;
    Formula right;

    public Or(Formula left, Formula right) {
        this.left = left;
        this.right = right;
    }

    public boolean evaluate() {
        return left.evaluate() || right.evaluate();
    }

    @Override
    public String toString(){return left.toString()+" | "+right.toString();}
}
