class KM_to_Miles extends ConsoleProgram {

    /**
  * A program Km_to_Miles.java  that lets you enter a distance in kilometers and that converts it into miles
  * @author: H. Rahukulan
  */

  public void run() {

    // Declared Variables
    double dblkm;
    double dblm;

    // Asked user for information
    dblkm = readDouble("How many km?: ");

    // Processing
    dblm = dblkm * 0.621371;

    // Output
    System.out.println("In miles it is: " + dblm);
  }
    
}
