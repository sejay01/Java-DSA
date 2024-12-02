package ArrayProblems;
//linear
public class SearchString {

    public static void main(String[] args) {

        String name = "sejays";
        search(name,'y');
        System.out.println(search(name,'y'));
        System.out.println(search1(name,'h'));
    }
    //enhanced for loop
    static boolean search(String s,char target)
    {
        for(char ch:s.toCharArray())
        {
            if(ch==target)
                return true;
        }
        return false;
    }
    //for loop
    static boolean search1(String s,char target)
    {
        for(int i=0;i<s.length();i++)
        {
            if(target==s.charAt(i))
                return true;
        }
        return false;
    }
}
