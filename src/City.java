public class City {
       public static int number = 8;
    public int [] streetID;
    public String [] streetNumber;


    /*City (String districtName, int n){
        super(districtName);
        number=n;
    }*/

  //  public City() {
  //  }

    public City(int n) {
        number=n;
        streetID = new int[n];
        streetNumber = new String[n];
    }

    public static void main(String[] args) {
        City city1 = new City(6);
        City city2 = new City(3);

    }
}


