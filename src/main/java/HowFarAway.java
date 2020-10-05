import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the latitude of the starting location: ");
      double latitude = scanner.nextDouble();

      System.out.print("Enter the longitude of the starting location: ");
      double longitude = scanner.nextDouble();

      GeoLocation geoA = new GeoLocation(latitude, longitude);

      System.out.print("Enter the latitude of the ending location: ");
      latitude = scanner.nextDouble();

      System.out.print("Enter the longitude of the ending location: ");
      longitude = scanner.nextDouble();

      GeoLocation geoB = new GeoLocation(latitude, longitude);

      System.out.print("The distance is " + geoA.distanceFrom(geoB) + " miles");
    }
}