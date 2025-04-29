package starPrints;

class StarPattern134 {
  public static void main(String[] args) {
    int star=0,space=3;
    for(int i=1;i<=5;i++){
      if(i<=3){
        star++;
        space--;}
      else{
        star--;
        space++;
      }
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=star;j++){
        System.out.print("*");
      }
      if(i==1||i==5){
        for(int j=1;j<=4;j++){
          System.out.print(" ");
        }}
      else{
        for(int j =1;j<=3;j++){
        System.out.print("*");}
      }
        for(int j=1;j<=star;j++){
          System.out.println("*");
        }
      System.out.println();
      }

  }
}
