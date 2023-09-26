package app;

public class Concurrent extends Thread {
  public void run2() {
    try {
      Thread.sleep(3000);
      System.out.println("Thread run");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    while (!interrupted()) {
      // ...
    }
    System.out.println("Thread end");
  }
}
