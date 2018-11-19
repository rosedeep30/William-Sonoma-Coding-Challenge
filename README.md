# William-Sonoma-Coding-Challenge

We will sort the ranges with their lowerbounds. Then we will take the first zipcode range and compare its upperbound with the next ranges's lowerbound. If they overlap, we will update the upperbound of the range to the upperbound of the overlapping ranges. Once we encounter a non overlapping range, we will add the previous extented range and start over.

Sorting will take O(n log(n)) time and merging the ranges will take O(n). So the algorithm takes O(n log(n)) time.
