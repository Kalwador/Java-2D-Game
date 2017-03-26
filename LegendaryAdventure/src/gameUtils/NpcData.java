package gameUtils;

import java.util.HashMap;
import model.Npc;

public class NpcData {

    public static HashMap<Integer, model.Npc> dataSeeder() {
        HashMap<Integer, model.Npc> npc = new HashMap<Integer, model.Npc> (){
            {
                //103
                put(103+62+61,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+16+42,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+6+42,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                //104  
                put(104+18+1,new Npc(104, 18, 13, "Kowal", new String[]{"Hej Ty! "
                    + "Czego potrzebujesz potrzebujesz?"}));
                put(104+48+11,new Npc(104, 48, 11, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+58+37,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));
                put(104+59+35,new Npc(104, 59, 35, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+49+49,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+64+33,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));
                put(104+36+46,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+7+15,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                put(104+19+51,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));
                put(104+45+48,new Npc(104, 45, 48, "Kupiec", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
                put(104+58+48,new Npc(104, 58, 48, "Kupiec", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
                put(104+61+58,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                //105
                put(105+38+56,new Npc(105, 38, 56, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));
                put(105+40+59,new Npc(105, 40, 59, "Farmerka", new String[]{"Jeśli szukasz pracy "
                    + "porozmawiaj z moim mężem."}));
                put(105+43+93,new Npc(105, 43, 93, "Wędrowiec", new String[]{"Uważaj, w pobliżu "
                    + "widziałem jakieś stwory!"}));
                //106
                put(106+34+86,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));
                put(106+68+81,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));
                put(106+41+48,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));
                put(106+39+15,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                put(106+67+12,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));
                //107
                put(107+25+41,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));
                //108
                put(108+43+84,new Npc(108, 43, 84, "Właściciel ziemski", new String[]{"Hej Ty! "
                    + "Bierz ten wóz i do roboty!"}));
                put(108+58+82,new Npc(108, 58, 82, "Właścicielka ziemska", new String[]{"Te wiadro jest "
                    + "zbyt ciężkie."}));
                put(108+69+84,new Npc(108, 69, 84, "Właściciel ziemski", new String[]{"Wszędzie sama "
                    + "konkurencja!"}));
                put(108+21+54,new Npc(108, 21, 54, "Właścicielka ziemska", new String[]{"Hej! Dobrze "
                    + "Cię widzieć. Może potrzebujesz pracy?"}));
                put(108+19+48,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, praca."}));
                put(108+50+34,new Npc(108, 50, 34, "Właściciel ziemski", new String[]{"Uważaj gdzie  "
                    + "leziesz! Gdzieś na zachodzie czają się wilki!"}));
                put(108+64+36,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
            }
        };
        return npc;
    }
}