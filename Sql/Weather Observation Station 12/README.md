https://www.hackerrank.com/challenges/weather-observation-station-12/problem

#### Answer:

MYSQL
```MYSQL
SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '^[^aeiou](.*)?[^aeiou]$' ORDER BY CITY ASC
```
