import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<MemberInfo> memberList1 = new ArrayList<MemberInfo>();
        MemberInfo[] memberArray1 = {new MemberInfo("SMITH, JANE",2019,false),
                                    new MemberInfo("FOX, STEVE", 2018, true),
                                    new MemberInfo("XIN, MICHAEL", 2017, false)};
        for (MemberInfo mi : memberArray1) memberList1.add(mi);
        ClubMembers cm = new ClubMembers(memberList1);
        String[] names = {"GARCIA, MARIA"};
        cm.addMembers(names, 2020);
        System.out.println(cm.getMemberList());
        ArrayList<MemberInfo> temp = cm.removeMembers(2018);
        System.out.println(cm.getMemberList());
        System.out.println(temp);
    }
}