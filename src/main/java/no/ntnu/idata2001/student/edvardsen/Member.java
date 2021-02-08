package no.ntnu.idata2001.student.edvardsen;

public class Member
{
    private String name;
    private int age;

    /**
     * Creates an object of member
     *
     * @param name, name of the member
     * @param age, age of the member
     */
    public Member(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    /**
     * Calculates new bonus-point-balance based on membership deal
     *
     * @param bonusPointBalance, current bonus-point-balance
     * @param newPoints, points to be added
     * @return newBonusPointBalance, the new bonus point balance for the customer after calculating with their respective membership
     */
    public int registerPoints(int bonusPointBalance, int newPoints)
    {
        return 0;
    }

    /**
     * Returns the name of the memberhship as a string, or "error" if something went wrong
     *
     * @return membership name, name of the membership
     */
    public String getMembershipName()
    {
        return "error";
    }
}
