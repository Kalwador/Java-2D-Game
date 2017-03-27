package gameUtils;

import java.util.HashMap;
import model.Npc;

public class NpcData {

    public static HashMap<Integer, model.Npc> dataSeeder() {
        HashMap<Integer, model.Npc> npc = new HashMap<Integer, model.Npc> (){
            {
                //map 103
                
                //first encountered person, crossroad
                put(103+62+61,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+61+61,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+60+61,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+59+61,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+59+60,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+59+59,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+59+58,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+59+57,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));          
                put(103+60+57,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+61+57,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+62+57,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+62+58,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+62+59,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                put(103+62+60,new Npc(103, 62, 61, "Uriziel", new String[]{"Witaj "
                    + "Co Cię tutaj sporwadza wędrowcze?"}));
                        
                //citizen next to turret
                put(103+16+39,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+16+40,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+16+41,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+16+42,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+13+40,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+13+41,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+13+42,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+14+42,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+15+42,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+13+39,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+14+39,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));
                put(103+15+39,new Npc(103, 16, 42, "Obywatel", new String[]{"Uważaj! "
                    + "Kolejny szaleniec w mieście!"}));

                //gate guardian
                put(103+5+40,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+6+40,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+5+44,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+4+40,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+4+41,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+4+42,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+4+43,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+4+44,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+6+41,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+6+42,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+6+43,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(103+6+44,new Npc(103, 6, 42, "Strażnik Bramy", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                
                //map 104  
                
                //blacksmith
                put(104+16+11,new Npc(104, 18, 13, "Kowal", new String[]{"Hej Ty! "
                    + "Czego potrzebujesz?"}));
                put(104+17+11,new Npc(104, 18, 13, "Kowal", new String[]{"Hej Ty! "
                    + "Czego potrzebujesz?"}));
                put(104+16+13,new Npc(104, 18, 13, "Kowal", new String[]{"Hej Ty! "
                    + "Czego potrzebujesz?"}));
                put(104+17+13,new Npc(104, 18, 13, "Kowal", new String[]{"Hej Ty! "
                    + "Czego potrzebujesz?"}));
                put(104+18+13,new Npc(104, 18, 13, "Kowal", new String[]{"Hej Ty! "
                    + "Czego potrzebujesz?"}));
                put(104+16+12,new Npc(104, 18, 13, "Kowal", new String[]{"Hej Ty! "
                    + "Czego potrzebujesz?"})); 
                put(104+18+11,new Npc(104, 18, 13, "Kowal", new String[]{"Hej Ty! "
                    + "Czego potrzebujesz?"}));
                put(104+18+12,new Npc(104, 18, 13, "Kowal", new String[]{"Hej Ty! "
                    + "Czego potrzebujesz?"}));
    
                //guardian next to gate
                put(104+48+9,new Npc(104, 48, 11, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+49+9,new Npc(104, 48, 11, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+50+9,new Npc(104, 48, 11, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+48+11,new Npc(104, 48, 11, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+49+11,new Npc(104, 48, 11, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+50+11,new Npc(104, 48, 11, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+48+10,new Npc(104, 48, 11, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+50+10,new Npc(104, 48, 11, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
               
                //guardian next to kid
                put(104+58+34,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));
                put(104+59+34,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));
                put(104+60+34,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));
                put(104+58+37,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));
                put(104+59+37,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));
                put(104+60+37,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));
                put(104+58+35,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));
                put(104+58+36,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));
                put(104+60+35,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));
                put(104+60+36,new Npc(104, 58, 37, "Strażnik", new String[]{
                    "Jeszcze Ciebie tutaj brakowało."}));

                //guardian next to dealers
                put(104+49+46,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+50+46,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+51+46,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+50+49,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+51+49,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+49+47,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+49+48,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+49+49,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+51+47,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));
                put(104+51+48,new Npc(104, 49, 49, "Strażnik", new String[]{"Przestań tak pędzić! "
                    + "Tylko nie pakuj się w kłopoty!"}));

                //kid
                put(104+64+30,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));
                put(104+65+30,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));
                put(104+66+30,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));                
                put(104+64+33,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));
                put(104+65+33,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));
                put(104+66+33,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));
                put(104+64+31,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));
                put(104+64+32,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));
                put(104+66+31,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));
                put(104+66+32,new Npc(104, 64, 33, "Chłopiec", new String[]{"Kiedyś będę strażnikiem"
                    + "I będę nosić taką zbroję jak oni!"}));

                //citizen next to statues
                put(104+34+43,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+35+43,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+36+43,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+37+43,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+34+46,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+35+46,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+36+46,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+37+46,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+34+44,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+34+45,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+37+44,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                put(104+37+45,new Npc(104, 36, 46, "Obywatelka", new String[]{"Odejdź zwyrodnialcze! "
                    + "Zaraz zawołam straż!"}));
                              
                //citizen next to house
                put(104+5+12,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                put(104+6+12,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                put(104+7+12,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                put(104+5+15,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                put(104+6+15,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                put(104+7+15,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                put(104+5+13,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                put(104+5+14,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                put(104+7+13,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                put(104+7+14,new Npc(104, 7, 15, "Obywatelka", new String[]{"Nie masz tu czego szukać "
                    + "Odejdź!"}));
                          
                //lonely dealer
                put(104+17+48,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));
                put(104+18+48,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));
                put(104+19+48,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));
                put(104+17+51,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));
                put(104+18+51,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));
                put(104+19+51,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));    
                put(104+17+49,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));
                put(104+17+50,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));
                put(104+19+49,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));
                put(104+19+50,new Npc(104, 19, 51, "Kupiec", new String[]{"Wyrolowali mnie!"
                    + "Ukradli mi moich klientów!"}));
   
                //baker
                put(104+45+45,new Npc(104, 45, 48, "Piekarz", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
                put(104+46+45,new Npc(104, 45, 48, "Piekarz", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
                put(104+47+45,new Npc(104, 45, 48, "Piekarz", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
                put(104+45+48,new Npc(104, 45, 48, "Piekarz", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
                put(104+46+48,new Npc(104, 45, 48, "Piekarz", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
                put(104+47+48,new Npc(104, 45, 48, "Piekarz", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
                put(104+45+46,new Npc(104, 45, 48, "Piekarz", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
                put(104+45+47,new Npc(104, 45, 48, "Piekarz", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
                put(104+47+46,new Npc(104, 45, 48, "Piekarz", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
                put(104+47+47,new Npc(104, 45, 48, "Piekarz", new String[]{"Podejdź, spróbuj mojego "
                    + "chleba!"}));
               
                //butcher
                put(104+58+45,new Npc(104, 58, 48, "Rzeźnik", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
                put(104+59+45,new Npc(104, 58, 48, "Rzeźnik", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
                put(104+60+45,new Npc(104, 58, 48, "Rzeźnik", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
                put(104+58+48,new Npc(104, 58, 48, "Rzeźnik", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
                put(104+59+48,new Npc(104, 58, 48, "Rzeźnik", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
                put(104+60+48,new Npc(104, 58, 48, "Rzeźnik", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
                put(104+58+46,new Npc(104, 58, 48, "Rzeźnik", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
                put(104+58+47,new Npc(104, 58, 48, "Rzeźnik", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
                put(104+60+46,new Npc(104, 58, 48, "Rzeźnik", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
                put(104+60+47,new Npc(104, 58, 48, "Rzeźnik", new String[]{"Wołowina, wieprzowina, drób "
                    + "niech poczuje to Twój dziub!"}));
               
                //drink dealer
                put(104+59+50,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+60+50,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+61+50,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+59+54,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+60+54,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+61+54,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+59+51,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+59+52,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+59+53,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+61+51,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+61+52,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));
                put(104+61+53,new Npc(104, 61, 58, "Kupiec", new String[]{"Witaj wędrowcze! Na pewno"
                    + " jesteś spragniony. Spróbuj tego!"}));

                //map 105
                
                //farmer
                put(105+40+56,new Npc(105, 40, 56, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));
                put(105+41+56,new Npc(105, 41, 56, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));
                put(105+42+56,new Npc(105, 42, 56, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));
                put(105+40+59,new Npc(105, 40, 59, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));
                put(105+41+59,new Npc(105, 41, 59, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));
                put(105+42+59,new Npc(105, 42, 59, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));
                put(105+40+57,new Npc(105, 40, 57, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));
                put(105+40+58,new Npc(105, 40, 58, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));
                put(105+42+57,new Npc(105, 42, 57, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));
                put(105+42+58,new Npc(105, 42, 58, "Farmer", new String[]{"Witaj! Przydadzą się każde"
                    + " ręce do roboty!"}));

                //wanderer
                put(105+43+93,new Npc(105, 43, 93, "Wędrowiec", new String[]{"Uważaj, w pobliżu "
                    + "widziałem jakieś stwory!"}));
                put(105+44+93,new Npc(105, 43, 93, "Wędrowiec", new String[]{"Uważaj, w pobliżu "
                    + "widziałem jakieś stwory!"}));
                put(105+45+93,new Npc(105, 43, 93, "Wędrowiec", new String[]{"Uważaj, w pobliżu "
                    + "widziałem jakieś stwory!"}));
                put(105+43+95,new Npc(105, 43, 93, "Wędrowiec", new String[]{"Uważaj, w pobliżu "
                    + "widziałem jakieś stwory!"}));
                put(105+44+95,new Npc(105, 43, 93, "Wędrowiec", new String[]{"Uważaj, w pobliżu "
                    + "widziałem jakieś stwory!"}));
                put(105+45+95,new Npc(105, 43, 93, "Wędrowiec", new String[]{"Uważaj, w pobliżu "
                    + "widziałem jakieś stwory!"}));
                put(105+43+94,new Npc(105, 43, 93, "Wędrowiec", new String[]{"Uważaj, w pobliżu "
                    + "widziałem jakieś stwory!"}));
                put(105+45+94,new Npc(105, 43, 93, "Wędrowiec", new String[]{"Uważaj, w pobliżu "
                    + "widziałem jakieś stwory!"}));

                //map 106
                              
                //landowner
                put(106+33+84,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));
                put(106+34+84,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));
                put(106+35+84,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));
                put(106+33+87,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));
                put(106+34+87,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));
                put(106+35+87,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));                               
                put(106+33+85,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));
                put(106+33+86,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));
                put(106+35+85,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));
                put(106+35+86,new Npc(106, 34, 86, "Właściciel ziemski", new String[]{"Pomocy! "
                    + "Bandyci porwali moich pracowników!"}));

                //landowner
                put(106+68+79,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));
                put(106+69+79,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));
                put(106+70+79,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));
                put(106+68+82,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));
                put(106+69+82,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));
                put(106+70+82,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));
                put(106+68+80,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));
                put(106+68+81,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));
                put(106+70+80,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));
                put(106+70+81,new Npc(106, 68, 81, "Właścicielka ziemska", new String[]{"Tutaj gdzieś "
                    + "czai się smok! Ja nie zwariowałam!"}));

                //bandit
                put(106+40+45,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));
                put(106+41+45,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));
                put(106+42+45,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));
                put(106+40+48,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));
                put(106+41+48,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));
                put(106+42+48,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));
                put(106+40+46,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));
                put(106+40+47,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));
                put(106+42+46,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));
                put(106+42+47,new Npc(106, 41, 48, "Bandyta", new String[]{"Jeśli nie odejdziesz "
                    + "to będziesz następny!"}));

                //bandit
                put(106+38+12,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                put(106+39+12,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                put(106+40+12,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                put(106+38+15,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                put(106+39+15,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                put(106+40+15,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                put(106+38+13,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                put(106+38+14,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                put(106+40+13,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                put(106+40+14,new Npc(106, 39, 15, "Bandyta", new String[]{"Czego tutaj szukasz? "
                    + "Lepiej odejdź zanim stracę cierpliwość!"}));
                
                //bandit commander
                put(106+67+9,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));
                put(106+68+9,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));
                put(106+69+9,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));
                put(106+67+12,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));
                put(106+68+12,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));
                put(106+69+12,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));
                put(106+67+10,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));
                put(106+67+11,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));
                put(106+69+10,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));
                put(106+69+11,new Npc(106, 67, 12, "Dowódca bandytów", new String[]{"Wciąż żyjesz? "
                    + "Zadziwiające."}));

                //map 107
                
                //necromancer
                put(107+24+41,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));
                put(107+25+41,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));
                put(107+26+41,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));
                put(107+24+44,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));
                put(107+25+44,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));
                put(107+26+44,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));
                put(107+24+42,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));
                put(107+24+43,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));
                put(107+26+42,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));
                put(107+26+43,new Npc(107, 25, 41, "Nekromanta", new String[]{"Dobrze, że tutaj jesteś. "
                    + "Musimy pozbyć się tych potworów!"}));

                //map 108
                
                //south landowner
                put(108+43+82,new Npc(108, 43, 84, "Właściciel ziemski", new String[]{"Hej Ty! "
                    + "Bierz ten wóz i do roboty!"}));
                put(108+44+82,new Npc(108, 43, 84, "Właściciel ziemski", new String[]{"Hej Ty! "
                    + "Bierz ten wóz i do roboty!"}));
                put(108+45+82,new Npc(108, 43, 84, "Właściciel ziemski", new String[]{"Hej Ty! "
                    + "Bierz ten wóz i do roboty!"}));
                put(108+43+84,new Npc(108, 43, 84, "Właściciel ziemski", new String[]{"Hej Ty! "
                    + "Bierz ten wóz i do roboty!"}));
                put(108+44+84,new Npc(108, 43, 84, "Właściciel ziemski", new String[]{"Hej Ty! "
                    + "Bierz ten wóz i do roboty!"}));
                put(108+45+84,new Npc(108, 43, 84, "Właściciel ziemski", new String[]{"Hej Ty! "
                    + "Bierz ten wóz i do roboty!"}));
                put(108+43+83,new Npc(108, 43, 84, "Właściciel ziemski", new String[]{"Hej Ty! "
                    + "Bierz ten wóz i do roboty!"}));
                put(108+45+83,new Npc(108, 43, 84, "Właściciel ziemski", new String[]{"Hej Ty! "
                    + "Bierz ten wóz i do roboty!"}));

                //south landowner next to well
                put(108+58+80,new Npc(108, 58, 82, "Właścicielka ziemska", new String[]{"Te wiadro jest "
                    + "zbyt ciężkie."}));
                put(108+59+80,new Npc(108, 58, 82, "Właścicielka ziemska", new String[]{"Te wiadro jest "
                    + "zbyt ciężkie."}));
                put(108+60+80,new Npc(108, 58, 82, "Właścicielka ziemska", new String[]{"Te wiadro jest "
                    + "zbyt ciężkie."}));
                put(108+58+82,new Npc(108, 58, 82, "Właścicielka ziemska", new String[]{"Te wiadro jest "
                    + "zbyt ciężkie."}));
                put(108+59+82,new Npc(108, 58, 82, "Właścicielka ziemska", new String[]{"Te wiadro jest "
                    + "zbyt ciężkie."}));
                put(108+60+82,new Npc(108, 58, 82, "Właścicielka ziemska", new String[]{"Te wiadro jest "
                    + "zbyt ciężkie."}));
                put(108+58+81,new Npc(108, 58, 82, "Właścicielka ziemska", new String[]{"Te wiadro jest "
                    + "zbyt ciężkie."}));
                put(108+60+81,new Npc(108, 58, 82, "Właścicielka ziemska", new String[]{"Te wiadro jest "
                    + "zbyt ciężkie."}));
               
                //south-east landowner
                put(108+69+82,new Npc(108, 69, 84, "Właściciel ziemski", new String[]{"Wszędzie sama "
                    + "konkurencja!"}));
                put(108+70+82,new Npc(108, 69, 84, "Właściciel ziemski", new String[]{"Wszędzie sama "
                    + "konkurencja!"}));
                put(108+71+82,new Npc(108, 69, 84, "Właściciel ziemski", new String[]{"Wszędzie sama "
                    + "konkurencja!"}));                                
                put(108+69+84,new Npc(108, 69, 84, "Właściciel ziemski", new String[]{"Wszędzie sama "
                    + "konkurencja!"}));
                put(108+70+84,new Npc(108, 69, 84, "Właściciel ziemski", new String[]{"Wszędzie sama "
                    + "konkurencja!"}));
                put(108+71+84,new Npc(108, 69, 84, "Właściciel ziemski", new String[]{"Wszędzie sama "
                    + "konkurencja!"}));
                put(108+69+83,new Npc(108, 69, 84, "Właściciel ziemski", new String[]{"Wszędzie sama "
                    + "konkurencja!"}));
                put(108+71+83,new Npc(108, 69, 84, "Właściciel ziemski", new String[]{"Wszędzie sama "
                    + "konkurencja!"}));
               
                //west landowner
                put(108+19+45,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, poszukujesz pracy?"}));
                put(108+20+45,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, poszukujesz pracy?"}));
                put(108+21+45,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, poszukujesz pracy?"}));
                put(108+19+48,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, poszukujesz pracy?"}));
                put(108+20+48,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, poszukujesz pracy?"}));
                put(108+21+48,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, poszukujesz pracy?"}));               
                put(108+19+46,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, poszukujesz pracy?"}));
                put(108+19+47,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, poszukujesz pracy?"}));
                put(108+21+46,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, poszukujesz pracy?"}));
                put(108+21+47,new Npc(108, 19, 48, "Właściciel ziemski", new String[]{"Dzień dobry.  "
                    + "Ach tak, poszukujesz pracy?"}));

                //center landowner next to well
                put(108+50+32,new Npc(108, 50, 34, "Właściciel ziemski", new String[]{"Uważaj gdzie  "
                    + "leziesz! Gdzieś na zachodzie czają się wilki!"}));
                put(108+51+32,new Npc(108, 50, 34, "Właściciel ziemski", new String[]{"Uważaj gdzie  "
                    + "leziesz! Gdzieś na zachodzie czają się wilki!"}));
                put(108+52+32,new Npc(108, 50, 34, "Właściciel ziemski", new String[]{"Uważaj gdzie  "
                    + "leziesz! Gdzieś na zachodzie czają się wilki!"}));
                put(108+50+34,new Npc(108, 50, 34, "Właściciel ziemski", new String[]{"Uważaj gdzie  "
                    + "leziesz! Gdzieś na zachodzie czają się wilki!"}));
                put(108+51+34,new Npc(108, 50, 34, "Właściciel ziemski", new String[]{"Uważaj gdzie  "
                    + "leziesz! Gdzieś na zachodzie czają się wilki!"}));
                put(108+52+34,new Npc(108, 50, 34, "Właściciel ziemski", new String[]{"Uważaj gdzie  "
                    + "leziesz! Gdzieś na zachodzie czają się wilki!"}));               
                put(108+50+33,new Npc(108, 50, 34, "Właściciel ziemski", new String[]{"Uważaj gdzie  "
                    + "leziesz! Gdzieś na zachodzie czają się wilki!"}));
                put(108+52+33,new Npc(108, 50, 34, "Właściciel ziemski", new String[]{"Uważaj gdzie  "
                    + "leziesz! Gdzieś na zachodzie czają się wilki!"}));
        
                //center landowner
                put(108+64+33,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
                put(108+65+33,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
                put(108+66+33,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
                put(108+64+36,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
                put(108+65+36,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
                put(108+66+36,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
                put(108+64+34,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
                put(108+64+35,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
                put(108+66+34,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
                put(108+66+35,new Npc(108, 64, 36, "Właściciel ziemski", new String[]{"Weź wybij te "
                    + "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));
            }
        };
        return npc;
    }
}