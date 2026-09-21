import java.awt.Desktop;
import java.net.URI;
public class start
{
    public start()
    {
        double age;
        String Name;
        String answer;
        age = EinAusgabe.ganzzahlEingabe("Sachma Dein Alter (in Jahren)");
        Name = EinAusgabe.textEingabe("NAME");
        answer = "Du bist gut genug";
        if (age>=18)
           {
               EinAusgabe.benachrichtige("", answer);
               try {
               String url = "https://youtu.be/0GnA8VYOfko";
               Desktop desktop = Desktop.getDesktop();
               
               // Prüfen, ob das Öffnen unterstützt wird
               if (Desktop.isDesktopSupported() && desktop.isSupported(Desktop.Action.BROWSE)) {
                desktop.browse(new URI(url));
               }
           }
           catch (Exception e) {
            e.printStackTrace();
           }
           }
        else
        {
            EinAusgabe.benachrichtige("","Du bist zu Jung");
        }
    }
}