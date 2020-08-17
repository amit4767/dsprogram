package com.testcompany.ds.day6;


import java.util.*;

public class FootballSelection
{
    public static void main(String[] args)
    {
        List<List<String>> input = inputSetup();
        System.out.println(getSelectionStatus(input));
    }

    private static List<List<String>> getSelectionStatus(List<List<String>> applications)
    {
        List<List<String>> result = new ArrayList<>();
        List<PlayerProfile> allPlayer = new ArrayList<>();
        List<PlayerProfile> strikers = new ArrayList<>();
        List<PlayerProfile> defenders = new ArrayList<>();
        List<PlayerProfile> midfielders = new ArrayList<>();
        List<PlayerProfile> rejected = new ArrayList<>();
        if (applications == null || applications.size() < 2)
        {
            return new ArrayList<>();
        }

        for (List<String> properties : applications)
        {
            String playerName = properties.get(0);
            Float height = Float.valueOf(properties.get(1));
            Float bmi = Float.valueOf(properties.get(2));
            int scores = Integer.parseInt(properties.get(3));
            int defender = Integer.parseInt(properties.get(4));

            PlayerProfile playerProfile = new PlayerProfile(playerName, height, bmi, scores, defender, true);

            if (height >= 5.8 && bmi < 23)
            {
                if (scores >= 50 && defender >= 30)
                {
                    playerProfile.setType(PlayerProfile.Type.MIDFIELDER);
                    midfielders.add(playerProfile);
                }else if (scores >= 50)
                {
                    playerProfile.setType(PlayerProfile.Type.STRIKER);
                    strikers.add(playerProfile);
                }
                else if (defender >= 30)
                {
                    playerProfile.setType(PlayerProfile.Type.DEFENDER);
                    defenders.add(playerProfile);
                }
                else
                {
                    playerProfile.setSelected(false);
                    rejected.add(playerProfile);
                }
            }
            else
            {
                playerProfile.setSelected(false);
                rejected.add(playerProfile);
            }
        }

        for (PlayerProfile midfielder : midfielders)
        {
            if (defenders.size() < strikers.size())
            {
                midfielder.setType(PlayerProfile.Type.DEFENDER);
                defenders.add(midfielder);
            }
            else
            {
                midfielder.setType(PlayerProfile.Type.STRIKER);
                strikers.add(midfielder);
            }
        }

        int minSelectionCountEachType = Math.min(defenders.size(), strikers.size());

        if (minSelectionCountEachType == defenders.size())
        {
            strikers.sort((Comparator.comparingInt(PlayerProfile::getScores).reversed()));
            for (int i = 0; i < strikers.size(); i++)
            {
                if (i >= minSelectionCountEachType)
                {
                    strikers.get(i).setSelected(false);
                }
            }
        }
        else
        {
            defenders.sort((Comparator.comparingInt(PlayerProfile::getDefender).reversed()));
            for (int i = 0; i < defenders.size(); i++)
            {
                if (i >= minSelectionCountEachType)
                {
                    defenders.get(i).setSelected(false);
                }
            }
        }

        allPlayer.addAll(defenders);
        allPlayer.addAll(strikers);
        allPlayer.addAll(rejected);

        allPlayer.sort((Comparator.comparing(PlayerProfile::getName)));

        for (PlayerProfile playerProfile : allPlayer)
        {
            List<String> innerResult = new ArrayList<>();
            innerResult.add(playerProfile.name);
            if (playerProfile.isSelected())
            {
                innerResult.add("SELECT");
                innerResult.add(playerProfile.type.name());
            }
            else
            {
                innerResult.add("REJECT");
                innerResult.add("NA");
            }
            result.add(innerResult);
        }
        return result;
    }



    private static List<List<String>> inputSetup()
    {

        // [[Boateng, 6.1, 22, 24, 45], [Kaka, 6, 22, 1, 1], [Ramos, 6.3, 22, 67, 70], [Ronaldo, 5.8, 21, 120, 0], [Suarez, 5.9, 20, 100, 1]]
        List<List<String>> input = new ArrayList<>();
        List<String> inputData = new ArrayList<>();
        inputData.add("Boateng");
        inputData.add("6.1");
        inputData.add("22");
        inputData.add("24");
        inputData.add("45");
        input.add(inputData);
        inputData = new ArrayList<>();
        inputData.add("Kaka");
        inputData.add("6");
        inputData.add("22");
        inputData.add("1");
        inputData.add("1");
        input.add(inputData);
   /* inputData = new ArrayList<>();
    inputData.add("Ramos");
    inputData.add("6.3");
    inputData.add("22");
    inputData.add("67");
    inputData.add("70");
    input.add(inputData);*/
        inputData = new ArrayList<>();
        inputData.add("Ronaldo");
        inputData.add("5.8");
        inputData.add("21");
        inputData.add("120");
        inputData.add("0");
        input.add(inputData);
        inputData = new ArrayList<>();
        inputData.add("Suarez");
        inputData.add("5.9");
        inputData.add("20");
        inputData.add("100");
        inputData.add("1");
        input.add(inputData);
        return input;
    }
}

