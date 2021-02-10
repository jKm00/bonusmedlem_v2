package no.ntnu.idata2001.student.edvardsen;

public abstract class Membership
{

    /**
     * Creates an object of member
     */
    public Membership()
    {
    }

    /**
     * Calculates new bonus-point-balance based on membership deal
     *
     * @param bonusPointBalance, current bonus-point-balance
     * @param newPoints, points to be added
     * @return newBonusPointBalance, the new bonus point balance for the customer after calculating with their respective membership
     */
    public abstract int registerPoints(int bonusPointBalance, int newPoints);

    /**
     * Returns the name of the memberhship as a string, or "error" if something went wrong
     *
     * @return membership name, name of the membership
     */
    public abstract String getMembershipName();
}
