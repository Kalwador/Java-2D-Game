package gameUtils;

public class LocationName {

    private static String[]  lokalization = {
        "Dom na Farmie",
        "Rodzinna Farma",
        "Przejscie przez Las",
        "Miasto",
        "Farma Gunara",
        "Tartak",
        "Cmentarz pod miastem",
        "Wies"
    };
    
    public static String getLokalization(int index){
        switch (index) {
            case 100: return lokalization[0];
            case 101: return lokalization[1];
            case 102: return lokalization[1];
            case 103: return lokalization[2];
            case 104: return lokalization[3];
            case 105: return lokalization[4];
            case 106: return lokalization[5];
            case 107: return lokalization[6];
            case 108: return lokalization[7];
        }
        return "Brak lokalizacji";
    }
    
}
