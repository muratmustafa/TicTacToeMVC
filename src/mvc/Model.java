package mvc;

public class Model {

    private int value1;
    private int value2;
    
    public Model() {
    }
    
    public void setValues(int i, int j){
        value1 = i;
        value2 = j;
    }
    
    public int getValue1(){
        return value1;
    }
    
    public int getValue2(){
        return value2;
    }
}
