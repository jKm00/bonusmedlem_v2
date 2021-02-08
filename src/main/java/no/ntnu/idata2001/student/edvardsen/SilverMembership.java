package no.ntnu.idata2001.student.edvardsen;

import java.lang.Math;

public class SilverMembership extends Member
{
    private final float POINTS_SCALING_FACTOR = 1.2f;

    /**
     * Creates an object of membership
     *
     * @param name, name of the member
     * @param age, age of the member
     */
    public SilverMembership(String name, int age)
    {
        super(name, age);
    }

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints)
    {
        int newBonusPointBalance = 0;

        newBonusPointBalance = bonusPointBalance + Math.round(newPoints * POINTS_SCALING_FACTOR);

        return newBonusPointBalance;
    }

    @Override
    public String getMembershipName()
    {
        return "Silver";
    }
}
