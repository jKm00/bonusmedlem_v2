package no.ntnu.idata2001.student.edvardsen;

public class BasicMembership extends Membership
{
    @Override
    public int registerPoints(int bonusPointBalance, int newPoints)
    {
        int newBonusPointBalance = 0;

        newBonusPointBalance = bonusPointBalance + newPoints;

        return newBonusPointBalance;
    }

    @Override
    public String getMembershipName()
    {
        return "Basic";
    }
}
