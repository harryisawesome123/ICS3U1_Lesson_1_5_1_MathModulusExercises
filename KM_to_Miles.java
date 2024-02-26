class KM_to_Miles extends ConsoleProgram {

    /**
  * Description
  * @author:
  */

  public void run() {
    double dblkm;
    double dblm;

    dblkm = readDouble("How many km?: ");

    dblm = dblkm * 0.621371;

    System.out.println("In miles it is: " + dblm);
  }
    
}
