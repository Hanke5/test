
public class start
{
    public start()
    {
        double age;
        String Name;
        String answer;
        date Geburtsdatum;
        Geburtsdatum = EinAusgabe;
        age = EinAusgabe.ganzzahlEingabe("Sachma Dein Alter (in Jahren)");
        Name = EinAusgabe.textEingabe("NAME");
        answer = "Du heisst "+Name+" und dein Alter ist "+age / 2+" zwei Jahres Schritte";
        EinAusgabe.benachrichtige("", answer);
    }
}