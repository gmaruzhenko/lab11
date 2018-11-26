package formula;

public class Not implements Formula{

    Formula value;

    public Not(Formula value){
        this.value=value;
    }
    public boolean evaluate() {
        return !value.evaluate();
    }

    @Override
    public String toString(){return "-"+value.toString();}
}
