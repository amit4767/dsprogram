package com.testcompany.ds.day6;


public class PlayerProfile {

    public String name;
    public Float height;
    public Float bmi;
    public int scores;
    public int defender;
    public Type type;
    public boolean isSelected;

    enum Type
    {
        DEFENDER,
        STRIKER,
        MIDFIELDER
    }

    PlayerProfile(String name, Float height, Float bmi, int scores, int defender, boolean isSelected)
    {
        this.name = name;
        this.height = height;
        this.bmi = bmi;
        this.scores = scores;
        this.defender = defender;
        this.isSelected = isSelected;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Float getHeight()
    {
        return height;
    }

    public void setHeight(Float height)
    {
        this.height = height;
    }

    public Float getBmi()
    {
        return bmi;
    }

    public void setBmi(Float bmi)
    {
        this.bmi = bmi;
    }

    public int getScores()
    {
        return scores;
    }

    public void setScores(int scores)
    {
        this.scores = scores;
    }

    public int getDefender()
    {
        return defender;
    }

    public void setDefender(int defender)
    {
        this.defender = defender;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }

    public boolean isSelected()
    {
        return isSelected;
    }

    public void setSelected(boolean selected)
    {
        isSelected = selected;
    }
}
