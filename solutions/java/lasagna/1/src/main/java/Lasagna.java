public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int Time){
        return expectedMinutesInOven() - Time; 
    }
    public int preparationTimeInMinutes(int Layers){
        return Layers*2;
    }
    public int totalTimeInMinutes(int Layers, int Minutes){
        return preparationTimeInMinutes(Layers) + Minutes;
    }


}
