https://www.hackerrank.com/challenges/more-than-75-marks/problem

#### Answer:

MYSQL
```MYSQL
SELECT NAME FROM STUDENTS WHERE MARKS > 75 ORDER BY RIGHT(NAME, 3) ASC, ID ASC;
/* or  */
SELECT NAME FROM STUDENTS WHERE MARKS > 75 ORDER BY SUBSTRING(NAME, -3) ASC, ID ASC;
```
