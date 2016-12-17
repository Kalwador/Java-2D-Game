package model;

public class Quest {
    
    public static int questNumber = 0; //ilość questów w grze
    
    int questID; // klucz główny 
    String questName; //nazwa wyświetlana w oknie Quests
    int stage; //aktualna faza questa
    String[] stagePhase = new String[20]; //maksymalna ilość faz questu

    public Quest(int questID, String questName, int stage, String[] stagePhase) {
        this.questID = questID;
        this.questName = questName;
        this.stage = stage;
        this.stagePhase = stagePhase;
    }

    public static void loadQuestList(){
        //tutaj wczytywane będą quest do kolekcji quest z GameStatus
        //będa one typu Quest, pola zdefiniowane powyżej 
        //wczytywanie z osobnej bazy lub txt lub klasy
        int questID;
        int stage;
    }
    
}
