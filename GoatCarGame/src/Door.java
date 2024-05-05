public class Door {
    private boolean hasCar;
    private int num;
    public Door(boolean c, int n){
        hasCar = c;
        num = n;
    }
    public boolean getHasCar(){
        return hasCar;
    }
    public int getNum(){
        return num;
    }
    public void setHasCar(boolean b){
        hasCar = b;
    }
    public void setNum(int n){
        num = n;
    }
    public String toString(){
        if(hasCar)
            return "Door "+num+" has a car";
        else
            return "Door "+num+" has a goat";
    }
}
