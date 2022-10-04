package campus.assignment3;

//문구는 대문자를 모두 소문자로 변환하고 영숫자가 아닌 문자를 모두 제거한 후
// 앞뒤로 동일한 내용을 읽으면 회문이다.
// 영숫자 문자에는 문자와 숫자가 포함됩니다.
public class Practice07 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        //String match = "[^a-z0-9]";
        s = s.replaceAll("[^a-z0-9]","");

        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        if(s .equals(reverse)){
            return true;
        }else {
            return  false;
        }
    }

}
