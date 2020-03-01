package leetcode;

public class Lc1108_DefangingIpAddress extends BaseSolution {

    @Override
    public void solveIt() {
        System.out.println(defangIPaddr("1.2.2.3"));
    }

    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for(char ch : address.toCharArray()) {
            if(ch == '.') {
                builder.append("[.]");
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}
