import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class EmailCopy{
  
  public static void main(int argv, String[] args) {
    String myString = "";
    int need = 0;
    need = args[0];
    String name = args[1];
    String place = args[2];
    switch(need) {
      case 1: myString = "Trying to get an arrival time to see if " + name + " made it into " + place + "?\n\n Thank you,\n";
              break;
      case 2: myString = "Trying to get an update to see if " + name + " got loaded over in " + place + "? If so, could I get the departure time, current temps, and seal number please.\n\n Thank you,\n";
              break;
      case 3:  myString = "Trying to get an update to see if " + name + " was unloaded in " + place + "? If so, could I get the departure time, and did they have clean bills or lumper fees?\n\n Thank you,\n";
               break;
      default: myString = "Invalid";
               break;
    }
    StringSelection stringSelection = new StringSelection(myString);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
  }
}
