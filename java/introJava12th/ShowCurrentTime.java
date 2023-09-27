public class ShowCurrentTime {
  public static void main(String[] args) {

    // get millis time from UNIX epoch
    long milliTime = System.currentTimeMillis();

    // Get totalSeconds by currentTimeMillis divide 1000
    int totalSeconds = (int) milliTime / 1000;

    // seconds current by totalSeconds % 60
    int seconds = totalSeconds % 60;

    // totalMinutes current by totalSeconds / 60
    int totalMinutes = totalSeconds / 60;

    // seconds current by totalSeconds % 60
    int minutes = totalMinutes % 60;

    // hours current by totalMinutes / 60
    int hours = totalMinutes / 60;
    System.out.println(
        milliTime
            + " currentTimeMillis "
            + hours
            + " hours "
            + minutes
            + " minutes "
            + seconds
            + " seconds ");
  }
}
