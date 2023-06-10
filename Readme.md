# Finding a Gene - A Simplified Algorithm

## Description

In this code we will determine if a DNA strand has a gene in it by using a simplified algorithm.  
And this project have two modes

### Part 1

You can find this part inside the `PartOne` file  In this file
> The class has one parameter which is a string called dna, representing the string of DNA.  
> The method does the following.
>> Find the index position of the start codeon `ATG`. if there is no start codon return empty string.  
>> Find the index of the first stop codon `TAA` and if the dna in the middle is a multiple of 3 then retun the dna codon in the middle.  
>> else return empty string.

### Part 2

You can find this part inside the `PartTwo` file In this file  
In this project there is two methods to solve some problems using strings and third method to test these two methods.  

1. method `twoOccurrences` that has two parameters named stringa and stringb. The method returns true if stringa appears at least twice in the stringb, otherwise false.
2. The method `main` is a void method that calls the `twoOccurrences` method and check the results are correct or not. Also check the `lastPath` with couple of inputs.
3. The method `lastPath` has two parameters named stringa and stringb. The method finds the first occurrence of stringa in stringb and returns the part of stirngb follows the stringa. If stringa is not found in the stringb, return the stringb.
