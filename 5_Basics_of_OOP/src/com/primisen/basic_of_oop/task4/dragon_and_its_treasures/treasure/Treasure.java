package com.primisen.basic_of_oop.task4.dragon_and_its_treasures.treasure;

import java.util.Arrays;

public class Treasure {

    private final int treasureNumber = 100;

    private String [] treasureName;
    private int [] treasurePrice;

    public Treasure(){

        treasureName = new String[]{
                "Small gold ingot",
                "Big gold ingot",
                "Mountain stone",
                "Lake stone",
                "Silver ingot",
                "Red diamond",
                "White diamond",
                "Black diamond",
                "Gold ring",
                "Florentine Diamond",
                "Amber Room",
                "Menorah from the Second Temple",
                "Ganj-e Badavard",
                "Heirloom Seal of the Realm",
                "Egill Skallagrímsson's silver",
                "Kusanagi",
                "Crown Jewels of England",
                "Llywelyn's coronet",
                "La Noche Triste treasure",
                "Lost Inca gold",
                "Treasure of Amaro Pargo",
                "Scepter of Dagobert",
                "Oak Island money pit",
                "Treasure of the Esperanza",
                "Treasure of Lima",
                "Confederate gold",
                "Twin Sisters",
                "Tokugawa's buried treasure",
                "Kruger Millions",
                "Crown Jewels of Ireland",
                "The Tsar's Treasure",
                "Lost Imperial Fabergé eggs",
                "The Just Judges",
                "Royal Casket",
                "Sword of Islam",
                "Peking Man",
                "Yamashita's gold",
                "Awa Maru treasure",
                "Nazi gold train",
                "Honjō Masamune",
                "Tucker's Cross",
                "Lufthansa heist",
                "Brink's-Mat robbery",
                "Antwerp Diamond heist",
                "Graff Diamonds robbery",
                "Ivory Coast Crown Jewels",
                "Brussels Airport diamond heist",
                "Hatton Garden safe deposit burglary",
                "Silver Mosaic Earring",
                "Jeweled Silver Monkey",
                "Decorated Gold Ring",
                "Silver Llama",
                "Golden Inca Cup",
                "Silver Turtle",
                "Gold Tairona Pendant",
                "Gold and Turquoise Earring",
                "Silver Inca Figurine",
                "Silver Fish Charm",
                "Gold Frog",
                "Intricate Gold Ring",
                "Patterned Silver Ring",
                "Golden Jaguar",
                "Silver Inca Vessel",
                "Golden Toothpick",
                "Silver Bird Vessel",
                "Silver Inca Earring",
                "Strange Relic",
                "Silver Jaguar",
                "Gold Mosaic Inca Earring",
                "Golden Spoon",
                "Silver Inca Mask",
                "Spanish Silver Coin",
                "Silver Tairona Pendant",
                "Gold Llama",
                "Decorated Silver Ring",
                "Silver Frog",
                "Golden Fish Charm",
                "Jeweled Golden Brooch",
                "Silver Belt Buckle",
                "Spanish Gold Coin",
                "Silver Spanish Chalice",
                "Gold Coatimundi",
                "Golden Turtle",
                "Silver Inca Cup",
                "Jeweled Silver Cross",
                "Gold Spanish Chalice",
                "Silver Toothpick",
                "Silver Coatimuni",
                "Gold Cup and Cover",
                "Golden Inca Vessel",
                "Gold Skull",
                "Silver Snuff Box",
                "Silver Spanish Goblet",
                "Silver Ingot",
                "Gold and Ruby Inca Mask",
                "Gold Inca Figurine",
                "Golden Bird Vessel",
                "Golden Spanish Goblet",
                "Jeweled Golden Cross",
                "Silver Skull",
                "Golden Inca Mask"};

        treasurePrice = new int[]{
                574,
                645,
                65,
                12,
                675,
                978,
                3458,
                6542,
                5432,
                123,
                342,
                799,
                1441,
                123123,
                35,
                4547,
                7800,
                4656,
                2432,
                32,
                345,
                213,
                123,
                123,
                3522,
                235,
                123,
                35,
                64,
                567,
                670,
                90,
                900,
                100,
                500,
                800,
                700,
                400,
                500,
                925,
                645,
                565,
                46887,
                4,
                1,
                5,
                7,
                56984,
                326,
                774,
                94,
                8989,
                654,
                231,
                1200,
                4100,
                794,
                200,
                78,
                651,
                231,
                89,
                700,
                600,
                800,
                300,
                100,
                800,
                8520,
                74410,
                9630,
                9510,
                7530,
                8520,
                850,
                740,
                960,
                780,
                7420,
                120,
                8941,
                74120,
                85214,
                1000,
                100,
                5000,
                500,
                6000,
                8500,
                850,
                820,
                740,
                960,
                8520,
                410,
                520,
                630,
                120,
                230,
                450,
                560
        };
    }

    public String[] getTreasureName() {
        return treasureName;
    }

    public int[] getTreasurePrice() {
        return treasurePrice;
    }

    public int getTreasurePrise() {
        return treasureNumber;
    }

    private int maxPrise() {

        int indexMaxPrise = 0;

        for (int i = 0; i < treasurePrice.length; i++) {

            if (treasurePrice[i] > treasurePrice[indexMaxPrise]) {
                indexMaxPrise = i;
            }
        }
        return indexMaxPrise;
    }

    public void printElementWithMaxPrise(){

        System.out.println("Treasure with max prise: ");
        System.out.println(treasureName[maxPrise()] + ", " +  treasurePrice[maxPrise()]);
    }

    public void searchTreasureSetPrise(int setPrise){

        insertSort();

        int left = 0;

        int right = treasurePrice.length - 1;

        while (left < right) {

            int sum = treasurePrice[left] + treasurePrice[right];

            if (sum == setPrise) {

                printTreasure(left, right);
                left++;
                right--;

            } else {

                if (sum < setPrise) {
                    left++;

                } else {
                    right--;
                }
            }
        }
    }

    private void insertSort() {

        for (int i = 0; i < treasurePrice.length; i++) {

            int indexOfMaxElement = i;

            for (int j = i; j < treasurePrice.length; j++) {

                if (treasurePrice[indexOfMaxElement] > treasurePrice[j]) {
                    indexOfMaxElement = j;
                }
            }

            if (indexOfMaxElement != i) {

                int bufInt = treasurePrice[i];
                treasurePrice[i] = treasurePrice[indexOfMaxElement];
                treasurePrice[indexOfMaxElement] = bufInt;

                String bufString = treasureName[i];
                treasureName[i] = treasureName[indexOfMaxElement];
                treasureName[indexOfMaxElement] = bufString;
            }
        }
    }

    public void printTreasure(){

        for (int i = 0; i < treasureNumber; i++) {

            System.out.printf("%d. %s, %d",i + 1 ,treasureName[i],treasurePrice[i] );
            System.out.println();
        }
    }

    private void printTreasure(int leftIndex, int rightIndex){

        System.out.println(treasureName[leftIndex] + ", " + treasurePrice[leftIndex]);
        System.out.println(treasureName[rightIndex] + ", " + treasurePrice[rightIndex]);
        System.out.println("______________________");
    }
}
