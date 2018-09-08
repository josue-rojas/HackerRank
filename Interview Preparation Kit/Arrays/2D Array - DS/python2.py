#!/bin/python
# solution for python 2

import math
import os
import random
import re
import sys

# Complete the hourglassSum function below.
def hourglassSum(arr):
    maxSum = 0
    # lengths are assumning they are constant, more specifically the col_length, they are there for better understand the code
    row_length = len(arr)
    col_length = len(arr[0])
    # the last 2 rows dont matter cause there is no hourglass pattern so we skip them
    for row in range(row_length-2):
        # similarly the last 2 columns dont make an hourglass pattern so we skip them
        for col in range(col_length-2):
            # the pattern of hourglass is as follow
            firstRow = arr[row][col] + arr[row][col+1] + arr[row][col+2]
            secondRow = arr[row+1][col+1]
            thirdRow = arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2]
            hourglassTotal = firstRow+secondRow+thirdRow
            if(maxSum < hourglassTotal):
                maxSum = hourglassTotal
    return maxSum

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in xrange(6):
        arr.append(map(int, raw_input().rstrip().split()))

    result = hourglassSum(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
