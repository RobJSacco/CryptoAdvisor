package cryptoadvisor;

import java.io.IOException;
import cryptoadvisor.fearindex.getFear;

public class main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    try {
      getFear.GetFear();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
