package NO1101_1199.NO1108;

class Solution {
    public String defangIPaddr(String address) {
        String[] arr = address.split(".");
        return arr[0] + "[.]" + arr[1] + "[.]" + arr[2] + "[.]" + arr[3];
    }
}