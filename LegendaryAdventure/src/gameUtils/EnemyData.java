package gameUtils;

import java.util.HashMap;

public class EnemyData {

    public static HashMap<Integer, model.Enemy> enemyData() {
        HashMap<Integer, model.Enemy> enemyData = new HashMap<Integer, model.Enemy>() {
            {
                //101 Orc
                put(67 + 50 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(67 + 49 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(67 + 48 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(67 + 47 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(67 + 46 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(67 + 45 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(67 + 44 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(67 + 43 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(68 + 50 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(69 + 50 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(68 + 43 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(69 + 43 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(70 + 43 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(71 + 43 + 101, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));

                //101 Skeleton1 above Orc
                put(75 + 34 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(76 + 34 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(77 + 34 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(78 + 34 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(79 + 34 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(79 + 33 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(79 + 32 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(79 + 31 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(79 + 30 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(75 + 29 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(76 + 29 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(77 + 29 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(78 + 29 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(79 + 29 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(75 + 30 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));

                //101 Skeleton2 above Skeleton 1
                put(69 + 26 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(70 + 26 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(71 + 26 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(72 + 26 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(69 + 25 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(69 + 24 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(69 + 23 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(69 + 22 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));

                //101 Skeleton3 near Watermonster
                put(48 + 82 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(47 + 82 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(46 + 82 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(45 + 82 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(45 + 81 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(45 + 80 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(45 + 79 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(46 + 77 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(47 + 77 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(48 + 77 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(49 + 77 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(46 + 76 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(47 + 76 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(48 + 76 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(49 + 76 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(49 + 78 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(49 + 79 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));

                //101 Skeleton4 left corner of the map above Wolfs 5, 6, 7
                put(19 + 58 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(19 + 57 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(19 + 56 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(19 + 55 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(19 + 54 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(18 + 54 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(17 + 54 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(16 + 54 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(15 + 54 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(18 + 55 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(17 + 55 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(16 + 55 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(15 + 55 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(15 + 56 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(15 + 57 + 101, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));

                //101 Wolf1 on top of map
                put(49 + 8 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(50 + 8 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(51 + 8 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(52 + 8 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(52 + 7 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(49 + 7 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(48 + 7 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(48 + 6 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(48 + 5 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(48 + 4 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(49 + 4 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(50 + 4 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(51 + 4 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //101 Wolf2 below Wolf1
                put(41 + 13 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(41 + 14 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(40 + 14 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(39 + 14 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(38 + 14 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(38 + 13 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(37 + 13 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(37 + 12 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(37 + 11 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(37 + 10 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(38 + 10 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(39 + 10 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(37 + 9 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(38 + 9 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(39 + 9 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //101 Wolf3 below Wolf2
                put(41 + 15 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(42 + 15 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(43 + 15 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(41 + 16 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(42 + 16 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(43 + 16 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(41 + 17 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(41 + 18 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(41 + 19 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(42 + 19 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(42 + 20 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(43 + 20 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(44 + 20 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(45 + 20 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //101 Wolf4 below Wolf3
                put(50 + 25 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(51 + 25 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(52 + 25 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(53 + 25 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(54 + 25 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(50 + 26 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(51 + 26 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(52 + 26 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(53 + 26 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(54 + 26 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(54 + 27 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(50 + 27 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(50 + 28 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(50 + 29 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(51 + 29 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(51 + 30 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(52 + 30 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //101 Wolf5 below Skeleton4
                put(15 + 71 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(15 + 72 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(15 + 73 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //101 Wolf6 below Wolf5
                put(18 + 74 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(19 + 74 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(20 + 74 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(21 + 74 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(18 + 73 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(21 + 75 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(21 + 76 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(21 + 77 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(21 + 78 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(20 + 78 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //101 Wolf7 near Wolf6 on the right side
                put(28 + 75 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(28 + 76 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(28 + 77 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(28 + 78 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(29 + 78 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(29 + 79 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(30 + 79 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(31 + 79 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(32 + 79 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(32 + 78 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(32 + 77 + 101, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //101 Watermonster bottom of map near the fire
                put(62 + 95 + 101, new model.Enemy("Watermonster", 2, 10, 50, 10, 40, 10, 20, 15, 10, 5, 10, 15, 30, 15, 40, "Watermonster.png"));
                put(61 + 95 + 101, new model.Enemy("Watermonster", 2, 10, 50, 10, 40, 10, 20, 15, 10, 5, 10, 15, 30, 15, 40, "Watermonster.png"));
                put(60 + 95 + 101, new model.Enemy("Watermonster", 2, 10, 50, 10, 40, 10, 20, 15, 10, 5, 10, 15, 30, 15, 40, "Watermonster.png"));
                put(59 + 95 + 101, new model.Enemy("Watermonster", 2, 10, 50, 10, 40, 10, 20, 15, 10, 5, 10, 15, 30, 15, 40, "Watermonster.png"));
                put(62 + 94 + 101, new model.Enemy("Watermonster", 2, 10, 50, 10, 40, 10, 20, 15, 10, 5, 10, 15, 30, 15, 40, "Watermonster.png"));
                put(61 + 94 + 101, new model.Enemy("Watermonster", 2, 10, 50, 10, 40, 10, 20, 15, 10, 5, 10, 15, 30, 15, 40, "Watermonster.png"));
                put(60 + 94 + 101, new model.Enemy("Watermonster", 2, 10, 50, 10, 40, 10, 20, 15, 10, 5, 10, 15, 30, 15, 40, "Watermonster.png"));
                put(59 + 94 + 101, new model.Enemy("Watermonster", 2, 10, 50, 10, 40, 10, 20, 15, 10, 5, 10, 15, 30, 15, 40, "Watermonster.png"));

                //103 Forest creature on the top lef corner of the map
                put(7 + 3 + 103, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(6 + 3 + 103, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(5 + 3 + 103, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(4 + 3 + 103, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));

                //103 Orc1 top of the map
                put(27 + 7 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(26 + 7 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(25 + 7 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(24 + 7 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(24 + 6 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(24 + 5 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(24 + 4 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(28 + 4 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));

                //103 Orc2 on center of the map
                put(55 + 36 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(55 + 35 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(55 + 34 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(55 + 33 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(55 + 32 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(55 + 31 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(54 + 36 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(53 + 36 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(51 + 36 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(51 + 35 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(51 + 34 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(51 + 33 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(51 + 32 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(51 + 31 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(51 + 30 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(52 + 31 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(53 + 31 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(54 + 31 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(55 + 30 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(52 + 30 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(53 + 30 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(54 + 30 + 103, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));

                //103 Monster1 top right corner of the map
                put(89 + 11 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(88 + 11 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(87 + 11 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(86 + 11 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(86 + 10 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(86 + 9 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(86 + 8 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));

                //103 Monster2 below Monster1
                put(93 + 36 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(92 + 36 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(91 + 36 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(90 + 36 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(89 + 36 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(89 + 35 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(89 + 34 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(89 + 33 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(89 + 32 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(89 + 31 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(90 + 31 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(90 + 32 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(91 + 32 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(92 + 32 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(93 + 32 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));

                //103 Monster3 right bottom corner of the map
                put(70 + 81 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(70 + 82 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(70 + 83 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(71 + 81 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(72 + 81 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(73 + 81 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(74 + 81 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(71 + 82 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(72 + 82 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(73 + 82 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(74 + 82 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(74 + 83 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(74 + 84 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(74 + 85 + 103, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));

                //103 Skeleton
                put(31 + 56 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(30 + 56 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(29 + 56 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(28 + 56 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(27 + 56 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(27 + 55 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(27 + 54 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(27 + 53 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(27 + 52 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(27 + 51 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(27 + 50 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(31 + 55 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(31 + 54 + 103, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));

                //103 Wolf1 left bottom corner of the map
                put(30 + 86 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(31 + 86 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(32 + 86 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(32 + 85 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(32 + 84 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(32 + 83 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(32 + 82 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(31 + 83 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(31 + 82 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(31 + 81 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(30 + 82 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(29 + 82 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(28 + 82 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(30 + 81 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(29 + 81 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(28 + 81 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(28 + 83 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(28 + 84 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(28 + 85 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //103 Wolf2 near Wolf1 on rihgt
                put(20 + 85 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(20 + 84 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(20 + 83 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(20 + 82 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(19 + 83 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(19 + 82 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(19 + 81 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(18 + 81 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(17 + 81 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(16 + 81 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(18 + 82 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(17 + 82 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(16 + 82 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(16 + 83 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(16 + 84 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(16 + 85 + 103, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //105 Orc1 right bottom corner of the map
                put(79 + 92 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(79 + 91 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(79 + 90 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(79 + 89 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(79 + 88 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(79 + 87 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(80 + 87 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(81 + 87 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(82 + 87 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(83 + 87 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(80 + 88 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(81 + 88 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(82 + 88 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(83 + 88 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(83 + 89 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(83 + 90 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(83 + 91 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(83 + 92 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));

                //105 Orc2 right top corner of the map
                put(91 + 11 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(90 + 11 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(89 + 11 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(88 + 11 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(91 + 10 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(90 + 10 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(89 + 10 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(88 + 10 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(88 + 12 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(88 + 13 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(88 + 14 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(88 + 15 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(88 + 16 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(89 + 16 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(90 + 16 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(91 + 16 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(92 + 16 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(92 + 15 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(92 + 14 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(92 + 13 + 105, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));

                //105 Skeleton1 above Orc2
                put(75 + 45 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(76 + 45 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(76 + 44 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(76 + 43 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(76 + 42 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(76 + 41 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(76 + 40 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(75 + 41 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(74 + 41 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(75 + 40 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(74 + 40 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(73 + 41 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(73 + 40 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));

                //105 Skeleton2 left bottom corner
                put(7 + 83 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(7 + 84 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(7 + 85 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(6 + 85 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(6 + 86 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(5 + 86 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(4 + 86 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(3 + 86 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(3 + 85 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(3 + 84 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));
                put(3 + 83 + 105, new model.Enemy("Skeleton", 2, 15, 80, 5, 30, 10, 20, 10, 5, 10, 10, 10, 20, 10, 30, "Skeleton.png"));

                //105 Wolf1 below Skeleton1
                put(93 + 64 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(92 + 64 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(91 + 64 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(90 + 64 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(90 + 63 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(90 + 62 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(90 + 61 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(90 + 60 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(91 + 60 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(92 + 60 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(91 + 61 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(92 + 61 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //105 Wolf2 below Wolf1
                put(86 + 68 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(85 + 68 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(84 + 68 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(83 + 68 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(83 + 67 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(83 + 66 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(83 + 65 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(83 + 64 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(83 + 63 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(86 + 64 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(85 + 64 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(84 + 64 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(86 + 63 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(85 + 63 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(84 + 63 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(86 + 65 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //105 Wolf3 below Wolf2
                put(92 + 72 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(93 + 72 + 105, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //105 Monster
                put(73 + 73 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(72 + 73 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(71 + 73 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(73 + 72 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(72 + 72 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(71 + 72 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(71 + 74 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(71 + 75 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(71 + 76 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(72 + 76 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(72 + 77 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(73 + 77 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(74 + 77 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(75 + 77 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(76 + 77 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(76 + 76 + 105, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));

                //106 Orc1 right bottom corner of the map
                put(94 + 89 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(93 + 89 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(92 + 89 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(91 + 89 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(90 + 89 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(90 + 88 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(90 + 87 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(90 + 86 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(90 + 85 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(90 + 84 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(90 + 83 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(91 + 83 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(92 + 83 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(93 + 83 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(94 + 83 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(91 + 84 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(92 + 84 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(93 + 84 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(94 + 84 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(94 + 85 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(94 + 86 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(94 + 87 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(94 + 88 + 106, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));

                //106 Wolf1 left top corner of the map
                put(11 + 4 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(11 + 5 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(10 + 5 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(9 + 5 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(8 + 5 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //106 Wolf2 right side of Wolf1
                put(17 + 4 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(17 + 5 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(18 + 5 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(19 + 5 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //106 Wolf3 above Dragon
                put(6 + 23 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(6 + 22 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(4 + 20 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(5 + 20 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(4 + 19 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(5 + 19 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //106 Wolf4 below Dragon
                put(5 + 60 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(6 + 60 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(7 + 60 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(7 + 59 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(7 + 58 + 106, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //106 Forest creature1 near Wolf4
                put(26 + 64 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(26 + 65 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(26 + 66 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(25 + 66 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(24 + 66 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(23 + 66 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(22 + 66 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(22 + 65 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(22 + 64 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(22 + 63 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(22 + 62 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(22 + 61 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));

                //106 Forest creature2 near Monster
                put(75 + 43 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(75 + 44 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(75 + 45 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(74 + 45 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(73 + 45 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(72 + 45 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(71 + 45 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(71 + 44 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));
                put(71 + 43 + 106, new model.Enemy("Forest creature", 2, 15, 40, 0, 0, 10, 20, 15, 10, 15, 10, 10, 30, 10, 25, "Forest creature.png"));

                //106 Monster
                put(94 + 43 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(93 + 43 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(92 + 43 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(92 + 42 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(91 + 42 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(91 + 41 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(91 + 40 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(93 + 39 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(94 + 39 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(93 + 38 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(94 + 38 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(73 + 77 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(74 + 77 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(75 + 77 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(76 + 77 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));
                put(76 + 76 + 106, new model.Enemy("Monster", 4, 50, 100, 0, 0, 25, 45, 25, 15, 20, 25, 30, 15, 20, 60, "Monster.png"));

                //106 Dragon
                put(17 + 42 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(17 + 43 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(17 + 44 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(18 + 44 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(18 + 45 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(18 + 46 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(18 + 47 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(18 + 48 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(17 + 48 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(16 + 48 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(15 + 48 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(14 + 48 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(14 + 47 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(13 + 47 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(12 + 47 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(11 + 47 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(10 + 47 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(9 + 47 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(9 + 46 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(9 + 45 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(9 + 44 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(9 + 43 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(10 + 44 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(10 + 43 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(10 + 40 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(11 + 40 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(12 + 40 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(13 + 40 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(14 + 40 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(10 + 39 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(11 + 39 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(12 + 39 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(13 + 39 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));
                put(14 + 39 + 106, new model.Enemy("Black Dragon", 10, 90, 200, 0, 0, 40, 60, 40, 30, 60, 45, 60, 40, 50, 120, "Black Dragon.png"));

                //107 Daemon1 left top corner of the map
                put(6 + 2 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));
                put(6 + 3 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));
                put(2 + 4 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));
                put(1 + 4 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));
                put(1 + 3 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));
                put(1 + 2 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));

                //107 Daemon2 right top corner of the map
                put(44 + 2 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));
                put(44 + 3 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));
                put(47 + 4 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));

                //107 Daemon3 middle right of the map
                put(47 + 16 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));
                put(47 + 15 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));
                put(45 + 18 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));
                put(47 + 21 + 107, new model.Enemy("Daemon", 5, 80, 120, 70, 100, 25, 35, 25, 20, 40, 35, 40, 35, 35, 70, "Daemon.png"));

                //107 Boss of Daemons center of the map
                put(26 + 15 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(26 + 16 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(27 + 15 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(27 + 16 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(27 + 17 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(27 + 18 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(27 + 19 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(26 + 19 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(25 + 19 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(24 + 19 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(23 + 19 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(22 + 19 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(22 + 18 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(22 + 17 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(21 + 17 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(21 + 16 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(21 + 15 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(24 + 13 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(25 + 13 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(24 + 12 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));
                put(25 + 12 + 107, new model.Enemy("Boss of Daemons", 7, 80, 130, 70, 110, 30, 40, 30, 25, 45, 40, 50, 40, 40, 100, "Boss of Daemons.png"));

                //107 Mutant1 left corner of the map
                put(1 + 29 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(1 + 28 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(1 + 27 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(2 + 28 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(2 + 27 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(5 + 30 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(1 + 33 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(2 + 33 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(3 + 33 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));

                //107 Mutant2 right corner of the map
                put(47 + 41 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(47 + 40 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(45 + 42 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(45 + 43 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(45 + 44 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(45 + 45 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(45 + 46 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));
                put(47 + 46 + 107, new model.Enemy("Mutant", 4, 50, 90, 35, 60, 20, 30, 20, 15, 30, 25, 35, 50, 25, 45, "Mutant.png"));

                //108 Orc
                put(5 + 59 + 108, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(6 + 59 + 108, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(7 + 59 + 108, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(8 + 59 + 108, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(8 + 58 + 108, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(8 + 60 + 108, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(8 + 61 + 108, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(8 + 62 + 108, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(8 + 63 + 108, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));
                put(8 + 64 + 108, new model.Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png"));

                //108 Wolf1 left top corner of the map
                put(13 + 5 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(14 + 5 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(15 + 5 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(16 + 5 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(17 + 5 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(17 + 6 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(17 + 7 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(17 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(16 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(15 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(14 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(13 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(13 + 7 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(13 + 6 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //108 Wolf2 right side of Wolf1
                put(20 + 6 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(20 + 7 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(20 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(21 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(22 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(23 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(24 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(24 + 7 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //108 Wolf3 left side and below Wolf1
                put(10 + 8 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(10 + 9 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(10 + 10 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(10 + 11 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(10 + 12 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(9 + 12 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(8 + 12 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(7 + 12 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //108 Wolf4 below Orc
                put(7 + 79 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(8 + 79 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(7 + 80 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(8 + 80 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(8 + 81 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(9 + 80 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(9 + 81 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(9 + 82 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(9 + 83 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(9 + 84 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(8 + 84 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(7 + 84 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));

                //108 Wolf5 below Wolf4
                put(8 + 86 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(9 + 86 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(10 + 86 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(11 + 86 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(8 + 87 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(9 + 87 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(10 + 87 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(11 + 87 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(11 + 88 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(11 + 89 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
                put(11 + 90 + 108, new model.Enemy("Wolf", 1, 5, 20, 0, 0, 5, 10, 5, 5, 10, 5, 5, 20, 5, 10, "Wolf.png"));
            }
        };
        return enemyData;
    }
}
