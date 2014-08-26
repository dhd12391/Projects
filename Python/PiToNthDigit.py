from math import pi

n = int(raw_input("Please input an integer greater than 0: "))

piToNthDigit = (float)((int)(pi*pow(10,n-1))) / pow(10,n-1)

"""
e.g. For N=3: 3.1415... * (10 ^ 2) = 314.15... ;
int casting -> 314.15... becomes 314;
float casting -> 314 becomes 314.0; 314.0 / 10^2 = 3.14			
"""

print "Pi with %d digits is %f." %(n,piToNthDigit)
