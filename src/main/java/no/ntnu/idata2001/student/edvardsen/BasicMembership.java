package no.ntnu.idata2001.student.edvardsen;

public class BasicMembership extends Member
{
    /**
     * Creates an object of BasicMembership
     *
     * @param name, name of the member
     * @param age, age of the member
     */
    public BasicMembership(String name, int age)
    {
        super(name, age);
    }

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
