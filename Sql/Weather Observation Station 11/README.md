https://www.hackerrank.com/challenges/weather-observation-station-11/problem

#### Answer:

MYSQL
```MYSQL
SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '^[^aeiou]' OR CITY REGEXP'[^aeiou]$'
```
