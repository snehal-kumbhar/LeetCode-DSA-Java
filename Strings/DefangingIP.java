/*
Leetcode Question Number = 1108
Name = Defanging an IP Address
given IP address
task is to retun defanged version of it
i.e. replacing every "." with "[.]"
*/
class Solution {
    public String defangIPaddr(String address) {
        String ans=address.replace(".","[.]");
        return ans;
    }
}