class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblfah;
    double dblcel;

    dblfah = readDouble("Enter fahrenheit: ");

    dblcel = 5.0 / 9.0 * (dblfah - 32);

    System.out.println("Celcius: " + dblcel);
  }
}
