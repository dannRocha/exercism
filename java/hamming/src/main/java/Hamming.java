
public class Hamming{

  private int distance;
        
  private void checkThereIsIllegalArgument(String left, String right){

    if(left.isEmpty())
      throw new IllegalArgumentException("left strand must not be empty.");
    else if(right.isEmpty())
      throw new IllegalArgumentException("right strand must not be empty.");
    else if(left.length() != right.length())
      throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
      
  }
        
  public Hamming(String leftStrand, String rightStrand) {
        
    if( leftStrand.isEmpty() && rightStrand.isEmpty() || leftStrand.equals(rightStrand))
      return;

    checkThereIsIllegalArgument(leftStrand, rightStrand);
                 
    String[] leftStrandArray = leftStrand.split("");
    String[] rightStrandArray = rightStrand.split("");

    for(int i = 0; i < leftStrandArray.length; i++){
        if(!leftStrandArray[i].equals(rightStrandArray[i])){
            distance++;
        }
    }			 
  }

  public int getHammingDistance() {
    return distance;
  }
}
