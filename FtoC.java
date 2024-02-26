class FtoC extends ConsoleProgram {

  /**
  * A program FtoC.java that lets you enter a degree measure in Fahrenheit, and that prints the result in celsius degree measure
  * @author: H. Rahukulan
  */
  
  public void run() {
    
    // Declare Variables
    double dblfah;
    double dblcel;

    // Asked user for information
    dblfah = readDouble("Enter fahrenheit: ");

    // Processing
    dblcel = 5.0 / 9.0 * (dblfah - 32);

    // Output
    System.out.println("Celcius: " + dblcel);
  }
}
