public class GenePartOne {
    public static void main(String[] args) {
        // Run the tests to identify the code is working correctly.
        String text1 = geneCheck("ATGGGACTATAA");
        if (text1.equals("ATGGGACTATAA")) {
            System.out.println("Test 1 succeeded.");
        } else {
            System.out.println("Test 1 failed.");
            System.out.println(text1);
        }
        String text2 = geneCheck("ATGGGACTATGATAAABS");
        if (text2.equals("ATGGGACTATGATAA")) {
            System.out.println("Test 2 succeeded.");
        } else {
            System.out.println("Test 2 failed.");
            System.out.println("ATGGGACTATGATAA");
        }
        String text3 = geneCheck("ATGHTAALASSSTAA");
        if (text3.equals("ATGHTAALASSSTAA")) {
            System.out.println("Test 3 succeeded.");
        } else {
            System.out.println("Test 3 failed.");
            System.out.println(text3);
        }
        String text4 = geneCheck("ATGTSFEFONDFALF");
        if (text4.equals("")) {
            System.out.println("Test 4 succeeded.");
        } else {
            System.out.println("Test 4 failed.");
        }
        String text5 = geneCheck("EHFONEOTAAFEHOGETAA");
        if (text5.equals("")) {
            System.out.println("Test 5 succeeded.");
        } else {
            System.out.println("Test 5 failed.");
        }
    }

    // here is the code where it check for the gene
    public static String geneCheck(String DNA) {
        // Turn the DNA into a upper case string
        DNA = DNA.toUpperCase();
        
        // Find the first `ATG` codon
        int startIndex = DNA.indexOf("ATG");
        if (startIndex == -1) {
            // There is no gene in the sequence
            return "";
        }
        // if there is a start codon
        int endIndex = DNA.indexOf("TAA");
        if (endIndex == -1) {
            // There is no gene in the sequence
            return "";
        }
        // Checking if the diff is multiple of 3
        int diff = endIndex - startIndex;
        while (endIndex != -1) {
            diff = endIndex - startIndex;
            if (diff % 3 == 0) {
                // Return the substring
                return DNA.substring(startIndex, endIndex + 3);
            } else {
                endIndex = DNA.indexOf("TAA", endIndex + 1);
            }
        }

        // return the empty string change later
        return "";
    }
}
