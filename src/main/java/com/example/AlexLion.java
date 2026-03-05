package com.example;

import java.util.List;

public class AlexLion extends Lion {

    public AlexLion() throws Exception {
        super("Самец", new Predator() {
            @Override
            public List<String> eatMeat() {
                return List.of("Животные", "Птицы", "Рыба");
            }

            @Override
            public int getKittens() {
                return 0;
            }
        });
            }


        public List<String> getFriends() {
            return List.of("Мартин", "Глория", "Мелман");
        }

        public String getPlaceOfLiving () {
            return "New York ZOO";

        }
    }
