
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0,2,5,3,7,8,4};     
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
      birdsPerDay[birdsPerDay.length-1] = birdsPerDay[birdsPerDay.length-1] +1;
        System.out.println(getToday());    
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length;i++){
            if (birdsPerDay[i] == 0){
                return true;
            }
        } return false;
        
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
         for (int i = 0; i < numberOfDays && i < birdsPerDay.length;i++){
             sum = sum + birdsPerDay[i]; 
         }
         return sum;    
    }

    public int getBusyDays() {
        int CPT =0;
        for (int i = 0; i < birdsPerDay.length;i++){
            if (birdsPerDay[i]>=5){
                CPT = CPT +1;  
            }
        }
       return CPT; 
    }
}
