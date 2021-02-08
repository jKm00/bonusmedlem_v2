package no.ntnu.idata2001.student.edvardsen;

import java.util.HashMap;
import java.time.LocalDate;

/**
 * The member archive holds all the bonus members. The archive provides
 * functionality for adding member to the register. looking up bonuspoints
 * of given members, register new bonuspoints and listing all the members.
 *
 * @author Joakim Edvardsen
 * @version 1.0.0
 */
public class MemberArchive
{
    private HashMap<Integer, BonusMember> members;

    /**
     * Creats a new instance of MemberArchive
     */
    public MemberArchive()
    {
        this.members = new HashMap<>();
        this.fillRegisterWithTestData();
    }

    /**
     * Adds a member to the register
     *
     * @param bonusMember, the member to be added
     * @return int, the number of the member
     */
    public int addMember(BonusMember bonusMember)
    {
        int memberNumber = 0;

        if (this.members.get(this.members.size()) == null)
        {
            memberNumber = this.members.size();
            this.members.put(memberNumber, bonusMember);
        }

        return memberNumber;
    }

    /**
     * Gets the bonus point of a member, if no member is found a negative integer is returned
     *
     * @param memberNumber, number of the member to search for points
     * @return pointsFound, bonus points of the member searched for or negative integer if no member was found
     */
    public int findPoints(int memberNumber, String password)
    {
        int pointsFound = 0;

        if (this.members.get(memberNumber) == null)
        {
            pointsFound = -1;
        }
        else
        {
            BonusMember memberFound = this.members.get(memberNumber);
            if (memberFound.getPassword().equals(password))
            {
                pointsFound = memberFound.getBonusPointBalance();
            }
            else
            {
                pointsFound = -1;
            }
        }

        return pointsFound;
    }

    /**
     * Adds bonus point to the member with the membernumber gives as parameter
     *
     * @param memberNumber, membernumber of the member to add points to
     * @param points, amount of points to be added
     * @return boolean, true if points were added and false if no member was found resulting in no points being added
     */
    public boolean registerPoints(int memberNumber, int points)
    {
        boolean memberFound = false;

        if (this.members.get(memberNumber) != null)
        {
            memberFound = true;
            BonusMember member = this.members.get(memberNumber);
            member.registerBonusPoint(points);
        }

        return memberFound;
    }

    /**
     * Lists out all members in the archive
     */
    public void listAllMembers()
    {
        if (this.members.size() == 0)
        {
            System.out.println("There are no members in this archive");
        }
        else
        {
            for (BonusMember member : this.members.values())
            {
                this.printMemberDetail(member);
            }
        }
    }

    /**
     * Prints out details of a member to the terminal
     *
     * @param member, member to be printed out
     */
    public void printMemberDetail(BonusMember member)
    {
        System.out.println("Member number: " + member.getMemberNumber());
        System.out.println("Name: " + member.getName());
        System.out.println("Email: " + member.getEmailAdress());
        System.out.println("Bonus points: " + member.getBonusPointBalance());
        System.out.println("Membership: " + member.getMembershipName());
        System.out.println();
    }

    /**
     * Fills the register with some arbitrary members, for testing purposes
     */
    private void fillRegisterWithTestData()
    {
        BonusMember member = new BonusMember(1, LocalDate.now(), 10000, "Olsen, Ole", "ole@olsen.biz");
        this.members.put(member.getMemberNumber(), member);
        member = new BonusMember(2, LocalDate.now(), 15000, "Jensen, Jens", "jens@jensen.biz");
        this.members.put(member.getMemberNumber(), member);
        member = new BonusMember(3, LocalDate.now(), 5000, "Lie, Linda", "linda@lie.no");
        this.members.put(member.getMemberNumber(), member);
        member = new BonusMember(4, LocalDate.now(), 30000, "Paulsen, Paul", "paul@paulsen.org");
        this.members.put(member.getMemberNumber(), member);
        member = new BonusMember(5, LocalDate.now(), 75000, "Flo, Finn", "finn.flo@gmail.com");
        this.members.put(member.getMemberNumber(), member);
    }
}
