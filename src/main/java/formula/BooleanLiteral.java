package formula;

public class BooleanLiteral implements Formula {

    private boolean value;

    public BooleanLiteral(boolean value) {
        this.value = value;
    }

    public boolean evaluate() {
        return this.value;
    }

    @Override
    public String toString(){
        if(value)
            return "True";
        else
            return "False";}

}
