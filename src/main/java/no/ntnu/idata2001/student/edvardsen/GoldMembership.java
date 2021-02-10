package no.ntnu.idata2001.student.edvardsen;

import java.lang.Math;

public class GoldMembership extends Membership
{
    private final float POINTS_SCALING_FACTOR_LEVEL_1 = 1.3f;
    private final float POINTS_SCALING_FACTOR_LEVEL_2 = 1.5f;

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints)
    {
        int newBonusPointBalance = 0;

        if (bonusPointBalance < 90000)
        {
            newBonusPointBalance = bonusPointBalance + Math.round(newPoints * POINTS_SCALING_FACTOR_LEVEL_1);
        }
        else if (bonusPointBalance >= 90000)
        {
            newBonusPointBalance = bonusPointBalance + Math.round(newPoints * POINTS_SCALING_FACTOR_LEVEL_2);
        }

        return newBonusPointBalance;
    }

    @Override
    public String getMembershipName()
    {
        return "Gold";
    }
}
