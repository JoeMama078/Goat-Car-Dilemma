public class Main{

    public Main(){
        System.out.println("GoatCar Game!");

        Doors d1 = new Doors();
        System.out.println(d1+"\n");

        int repetitions = 1000;
        int winCounter = 0;
        int switchWinCounter = 0;

        //stay
        for(int i = 0; i < repetitions; i++){
            Doors d = new Doors();
            int choice = (int)(Math.random()*3);
            if(choice == 0){
                if(d.getD1().getHasCar())
                    winCounter++;
            }
            if(choice == 1){
                if(d.getD1().getHasCar())
                    winCounter++;
            }
            if(choice == 2){
                if(d.getD1().getHasCar())
                    winCounter++;
            }
        }
        System.out.println("Player won "+winCounter+" times out of "+repetitions+" times without switching!");
        System.out.println("Player had "+(winCounter/(double)repetitions)*100+"% chance of winning without switching\n");

        //switch
        for(int j = 0; j < repetitions; j++){
            Doors doors = new Doors();
            int choice = (int)(Math.random()*3);
            int reveal = doors.eliminate(choice);
            if(reveal != doors.getD1().getNum() && choice != doors.getD1().getNum())
                choice = 1;
            else if(reveal != doors.getD2().getNum() && choice != doors.getD2().getNum())
                choice = 2;
            else
                choice = 3;

            if(choice == 1){
                if(doors.getD1().getHasCar())
                    switchWinCounter++;
            }
            else if(choice == 2){
                if(doors.getD2().getHasCar())
                    switchWinCounter++;
            }
           else{
                if(doors.getD3().getHasCar())
                    switchWinCounter++;
            }
        }
        System.out.println("Player won "+switchWinCounter+" times out of "+repetitions+" times when switching!");
        System.out.println("Player had "+(switchWinCounter/(double)repetitions)*100+"% chance of winning when switching");
    }

    public static void main(String[]args){
        Main  m = new Main();
    }
}