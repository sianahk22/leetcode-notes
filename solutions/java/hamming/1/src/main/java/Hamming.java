public class Hamming {
    private String left;
    private String right;
    public Hamming(String leftStrand, String rightStrand) {
       if (leftStrand.length() != rightStrand.length()){
           throw new IllegalArgumentException("strands must be of equal length");
        
    }
    this.left = leftStrand;
    this.right = rightStrand;
    }

    public int getHammingDistance() {
        int distance = 0;
        for (int i = 0; i< right.length(); i++){
            if ( right.charAt(i) != left.charAt(i)){
                distance ++ ;
            }
        }
       return distance ;
    }
}
    
