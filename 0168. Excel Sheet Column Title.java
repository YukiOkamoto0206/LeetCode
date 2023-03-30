class Solution {
    // 28
    // 28/26 = 1->A
    // 28%26 = 2->B

    // 701
    // 701/26 = 26 ->Z
    // 701%26 = 25 ->Y

    // AAB
    // (26*26)+(26)+2=677+27+2= 704
    // 704 % 26 = 2
    // 704/26 = 27
    // 27 % 26 = 1
    // 27 / 26 = 1
    // 1 % 26 = 1
    // 1 / 26 = 0
    public String convertToTitle(int columnNumber) {
        // 1-26 -> single
        // 27-26*26+26
        // 26*26+26+1-
        // A-Z
        // AA-ZZ
        // AAA-ZZZ
        StringBuilder sb = new StringBuilder();
        // [A,B,C,...,Z]
        // [0,1,2,...,25]
        while (columnNumber > 0) {
            sb.append((char) ('A' + (columnNumber-1) % 26));
            columnNumber = (columnNumber-1) / 26;
        }
        sb.reverse();
        return sb.toString();
    }
}
