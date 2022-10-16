import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String>originalSet = new ArrayList<String>();
    ArrayList<String>subset = new ArrayList<String>();
    
    System.out.println("Welcome to this program");
    System.out.println("Please, enter the original set");
    System.out.println("How many elements your original set has?");
    int numElements = scan.nextInt();

    for(int i = 0; i<numElements; i++){
      System.out.println("Enter element # "+(i+1));
      String inputOriginal = scan.next();
      originalSet.add(inputOriginal);
    }

    System.out.println("Right! your original set is: "+ originalSet);

    System.out.println("Now, how many elements your subset has?");
    int numElementsSubset = scan.nextInt();

    for(int j = 0; j<numElementsSubset; j++){
      System.out.println("Enter element # "+(j+1));
      String inputSubset = scan.next();
      subset.add(inputSubset);
    }

    System.out.println("Rigth! your subset is: "+subset);
    System.out.println("Is that one a really subset of the original set?");

    int count = 0;
    for(int x = 0; x<numElements; x++){
      for(int y = 0; y<numElementsSubset; y++){
        if(originalSet.get(x).equals(subset.get(y))){
          count++;
        }
      }
    }

    if(count==numElementsSubset){
      System.out.println("IT IS A SUBSET!");
    }else{
      System.out.println("IT IS NOT A SUBSET!");
    }
  }
}