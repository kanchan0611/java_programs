class Father {  protected Father(String str) {   System.out.println("Created a Father " +str);  } } class Child1 extends Father {  private Child1() {   System.out.println("Inside child");  }  public static void main(String args[]) {   super("Hi");   new Child1();  } }