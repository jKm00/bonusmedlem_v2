package no.ntnu.idata2001.student.edvardsen;

import java.lang.Math;

public class SilverMembership extends Membership
{
    private final float POINTS_SCALING_FACTOR = 1.2f;

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
