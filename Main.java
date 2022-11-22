abstract class CaffineBeverage {
  final void prepare() {  // template method
    boilWater();  // concrete
    brew();  // primitive
    pourInCup();
    if (customerWantsCondiments()) // hook
      addCondiments();
  }
  abstract void brew();
  abstract void addCondiments();
  void boilWater()  { System.out.println("Boiling water...");  } 
  void pourInCup()  { System.out.println("Pouring into a cup."); }
  boolean customerWantsCondiments() { return true; }
}

class Coffee extends CaffineBeverage {
  void brew() { System.out.println("Brew using drip filter."); }
  void addCondiments() { System.out.println("Adding sugar and milk."); }
  @Override
  boolean customerWantsCondiments() {
    System.out.println("Do you want condiments? Y/N");
    Scanner sc = new Scanner(System.in);
    String ans = sc.nextLine();

    return ans.equals("Y");
  }
}

class Tea extends CaffineBeverage {
  void brew() { System.out.println("Steeping the tea...");  }
  void addCondiments() { System.out.println("Adding a twist of lemon.");  }
}
