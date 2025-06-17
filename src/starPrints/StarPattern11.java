package starPrints;

class StarPattern12{
  public static void main(String[] args) {
    int star=0,space=3;
    for(int i=1;i<=5;i++){
      if(i<=3){star++;
      space--;}
      else{
        star++;
        space-=2;
      }
      for(int j=1;j<=star;j++){
        System.out.print("*");
      }
      for(int k=1;k<=space;k++){
        System.out.print(" ");
      }
      if(i==2|i==3|i==4){
      for(int j=1;j<=3;j++){
        System.out.print("*");
      }}
      System.out.println();
    }
  }
}
