class Solution {
    static int dataTypeSize(String str) {
        switch(str.toLowerCase()) {
            case "character":
                return 1; // Size of char data type in bytes
            case "integer":
                return Integer.BYTES;
            case "long":
                return Long.BYTES;
            case "float":
                return Float.BYTES;
            case "double":
                return Double.BYTES;
            default:
                return -1; // Indicate invalid input
        }
    }
}
