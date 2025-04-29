package starPrints;

class CharPattern{
public static void main(String[] args) {
  for(char ch='a';ch<='e';ch++){
    for(char CH='A';CH<='E';CH++){
      if(ch==CH){
        System.out.print("@");
      }
      else{
        System.out.print(CH);
      }
    }
      System.out.println();

  }
  }
}
