package starPrints;

class CharPattern2{
public static void main(String[] args) {
  for(char ch='a';ch<='e';ch++){
    for(int i=1;i<=5;i++){
      if(ch==i){
        System.out.print("@");
      }
      else{
        System.out.print(i);
      }
    }
      System.out.println();

  }
  }
}
