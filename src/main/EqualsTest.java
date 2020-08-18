public class EqualsTest {

  public static void main(String[] args) {
    String test = "test";
    String test2 = "test";
    if (test == test) {
      System.out.println("Taco!");
    }

    if (test == "test"){
      System.out.println("MOAR TACOS");
    }
    if (test == test2){
      System.out.println("ALL THE TACOS");
    }
  }
}
