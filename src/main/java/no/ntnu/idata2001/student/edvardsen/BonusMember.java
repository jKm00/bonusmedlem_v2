package no.ntnu.idata2001.student.edvardsen;

import java.time.LocalDate;

public class BonusMember
{
    private int memberNumber;
    private LocalDate enrolledDate;
    private int bonusPointsBalance;
    private String name;
    private String eMailAdress;
    private String password;

    private Membership membership;

    private static final int SILVER_LIMIT = 25000;
    private static final int GOLD_Limit = 75000;

    /**
     * Creates an object of BonusMember
     *
     * @param memberNumber, number for the member
     * @param enrolledDate, date the member was added
     * @param bonusPoint, bouns points the member has
     * @param name, name of the member
     * @param eMailAdress, email of the member
     */
    public BonusMember(int memberNumber, LocalDate enrolledDate, int bonusPoint, String name, String eMailAdress)
    {
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.bonusPointsBalance = bonusPoint;
        this.name = name;
        this.eMailAdress = eMailAdress;
        this.password = password;

        this.checkAndSetMembership(this.bonusPointsBalance);
    }

    /**
     * Returns the email adress as a string
     *
     * @return email adress
     */
    public String getEmailAdress()
    {
        return this.eMailAdress;
    }

    /**
     * Returns the name of the member
     *
     * @return name, the name of the member
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Returns the password
     *
     * @return password
     */
    public String getPassword()
    {
        return this.password;
    }

    /**
     * Returns the bonus point balance
     *
     * @return bonusPointsBalance, bonus point balance
     */
    public int getBonusPointBalance()
    {
        return this.bonusPointsBalance;
    }

    /**
     * Returns the date the member was added
     *
     * @return enrooledDate, the date the member was added
     */
    public LocalDate getDate()
    {
        return this.enrolledDate;
    }

    /**
     * Returns the member number
     *
     * @return memberNumber, the number of the member
     */
    public int getMemberNumber()
    {
        return this.memberNumber;
    }

    /**
     * Returns the membership name (E.g. "Basic", "Silver", "Gold")
     *
     * @return the membership name
     */
    public String getMembershipName()
    {
        return this.membership.getMembershipName();
    }

    /**
     * Checks if the password given in the parameter is equal to the password of the member
     *
     * @param password, password to be checked
     * @return boolean, true if password match and false if not
     */
    public boolean checkPassword(String password)
    {
        boolean passwordCorrect = false;

        if (this.password.equals(password))
        {
            passwordCorrect = true;
        }

        return passwordCorrect;
    }

    /**
     * Registers new points with correct prosent, repective to the membership and updates the membership
     *
     * @param newPoints, points to be added to the bonus point balance
     */
    public void registerBonusPoint(int newPoints)
    {
        int newBounsPointBalance = this.membership.registerPoints(this.bonusPointsBalance, newPoints);

        this.checkAndSetMembership(newBounsPointBalance);
    }

    /**
     * Checks the bonus point balance and updates the membership if the balance exceeds the next membership limit
     *
     * @param bonusPointBalance, bonus point balance to be checked
     */
    public void checkAndSetMembership(int bonusPointBalance)
    {
        this.bonusPointsBalance = bonusPointBalance;
        if (bonusPointBalance >= SILVER_LIMIT && bonusPointBalance < GOLD_Limit)
        {
            this.membership = new SilverMembership();
        }
        else if (bonusPointBalance >= GOLD_Limit)
        {
            this.membership = new GoldMembership();
        }
        else
        {
            this.membership = new BasicMembership();
        }
    }
}
