public class MemberInfo
{
    String memberName;
    int graduatingYear;
    boolean standing;
    
    /** Constructs a MemberInfo object for the club member with name name,
    * graduation year gradYear, and standing hasGoodStanding.
    */
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding)
    {
        memberName = name;
        graduatingYear = gradYear;
        standing = hasGoodStanding;
    }

    /** Returns the graduation year of the club member. */
    public int getGradYear()
    {
        return graduatingYear;
    }

    /** Returns true if the member is in good standing and false otherwise. */
    public boolean inGoodStanding()
    {
        return standing;
    }

    public String toString()
    {
        return "\""+memberName+"\" "+graduatingYear+" "+standing;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}