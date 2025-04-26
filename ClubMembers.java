import java.util.ArrayList;

public class ClubMembers
{
    private ArrayList<MemberInfo> memberList;

    public ClubMembers(ArrayList<MemberInfo> mList) {
        memberList = mList;
    }

    /** Adds new club members to memberList, as described in part (a).
    * Precondition: names is a non-empty array.
    */
    public void addMembers(String[] names, int gradYear)
    {
        for (int i=0;i<names.length;i++) {
            memberList.add(new MemberInfo(names[i],gradYear,true));
        }
    }

    /** Removes members who have graduated and returns a list of members who have graduated
    * and are in good standing, as described in part (b).
    */
    public ArrayList<MemberInfo> removeMembers(int year)
    {
        ArrayList<MemberInfo> newList = new ArrayList<MemberInfo>();
        for (int i=0;i<memberList.size();i++) {
            if (memberList.get(i).getGradYear()<=year) {
                if (memberList.get(i).inGoodStanding()) newList.add(memberList.get(i));
                memberList.remove(i);
                i--;
            }
        }
        return newList;
    }

    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}