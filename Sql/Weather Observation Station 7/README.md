https://www.hackerrank.com/challenges/weather-observation-STATION-7/problem

#### Answer:

MYSQL
```MYSQL
SELECT DISTINCT CITY FROM STATION
WHERE  CITY  LIKE '%A'
or  CITY  LIKE '%E'
or CITY  LIKE '%I'
or CITY  LIKE '%O'
or CITY  LIKE '%U'

/* i like this one better */
SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '[aeiou]$'
```
