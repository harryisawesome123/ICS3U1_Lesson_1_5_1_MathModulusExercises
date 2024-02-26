class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    int inthours;
    int intanswer;
    int intremaininghours;
    int inttotalhoursinday;

    inthours = readInt("What is the amount of hours? ");

    intanswer = inthours / 24;
    inttotalhoursinday = intanswer * 24;
    intremaininghours = inthours - inttotalhoursinday;

    System.out.println("The number of days and hours is " + intanswer + " days and " + intremaininghours + " hours.");
  }
}