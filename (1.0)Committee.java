public class Committee implements Comparable <Committee> {
  private LIO <Chair> committeeChair;
  private LIO <Delegate> delegatesList;
  private String countriesList[];
  private final int MAX_COUNTRIES;
  
  public Committee() {
    committeChair = new LIO <Chair> ();
    delegatesList = new LIO <Delegate> ();
    countriesList = new String [MAX_COUNTRIES];
  }
}
