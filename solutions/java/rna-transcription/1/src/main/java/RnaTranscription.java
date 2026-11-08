class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStand = "";
        for ( int i = 0;i< dnaStrand.length();i++){
            if (dnaStrand.charAt(i)== 'G'){
                rnaStand+= 'C';
            }else if (dnaStrand.charAt(i)== 'C'){
                rnaStand+= 'G';    
            }else if (dnaStrand.charAt(i)== 'A'){
                rnaStand+= 'U';
        }else  {
                rnaStand+= 'A';       
    }
        }
        return rnaStand ; 
    }
            

}
