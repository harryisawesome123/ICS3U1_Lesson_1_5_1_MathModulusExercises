class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblRad;
    double dblCir;

    dblRad = readDouble("What is the radius of the circle? ");

    dblCir = (Math.PI * dblRad * 2);

    System.out.println("The circumference of the circle is: " + dblCir);
  }
}