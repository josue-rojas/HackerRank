https://www.hackerrank.com/challenges/weather-observation-station-10/problem

#### Answer:

MYSQL
```MYSQL
SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '[^aeiou]$';
```
