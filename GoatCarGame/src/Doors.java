import java.util.ArrayList;

public class Doors {
    private Door D1;
    private Door D2;
    private Door D3;
    public Doors(){
        int r = (int)(Math.random()*3);
        if(r == 0) {
            D1 = new Door(true,1);
            D2 = new Door(false,2);
            D3 = new Door(false,3);
        }
        else if(r == 1) {
            D1 = new Door(false,1);
            D2 = new Door(true,2);
            D3 = new Door(false,3);
        }
        else  if(r ==  2) {
            D1 = new Door(false,1);
            D2 = new Door(false,2);
            D3 = new Door(true,3);
        }
    }
    public Door getD1(){
        return D1;
    }
    public Door getD2(){
        return D2;
    }
    public Door getD3(){
        return D3;
    }

    public String  toString(){
        return D1+", "+D2+", "+D3;
    }

    public int eliminate(int d){
        if(d == 1){
            if(D2.getHasCar())
                return 3;
            else if(D3.getHasCar())
                return 2;
            else
                if((int)(Math.random()*2) == 0)
                    return 2;
                else
                    return 3;
        }
        else if(d == 2){
            if(D1.getHasCar())
                return 3;
            else if(D3.getHasCar())
                return 1;
            else
            if((int)(Math.random()*2) == 0)
                return 1;
            else
                return 3;
        }
        else{
            if(D1.getHasCar())
                return 2;
            else if(D2.getHasCar())
                return 1;
            else
            if((int)(Math.random()*2) == 0)
                return 1;
            else
                return 2;
        }
    }
}
