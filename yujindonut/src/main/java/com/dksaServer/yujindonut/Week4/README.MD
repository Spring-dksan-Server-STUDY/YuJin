### SELECT
##### 과일로 만든 아이스크림 고르기
````
SELECT A.FLAVOR
FROM FIRST_HALF A JOIN
ICECREAM_INFO B
ON A.FLAVOR = B.FLAVOR
WHERE A.TOTAL_ORDER > 3000
AND B.INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER DESC
````
조건 : 

아이스크림 총 주문량이 3000 보다 높다 = A.TOTAL_ORDER > 3000
그리고 = AND 
아이스크림듸 주 성분이 과일이여야한다 = B.INGREDIENT_TYPE = 'fruit_based'
조회는 주문량이 큰 순서대로 내림차순 = ORDER BY TOTAL_ORDER DESC

### SUM, MAX, MIN
##### 최대값 구하기
````
SELECT MAX(DATETIME) AS 시간
FROM ANIMAL_INS;
````
조건 :
가장 최근에 들어온 동물 (시간이 가장 늦은) = MAX

### GROUP BY
##### 고양이와 개는 몇 마리 있을까
````
SELECT ANIMAL_TYPE, COUNT (ANIMAL_TYPE) AS count
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE;
````
조건 :
고양이를 개보다 먼저 조회 = ORDER BY ANIMAL_TYPE;
이부분을 안넣어서 처음에 틀렸다

### IS NULL
##### 이름이 없는 동물의 아이디
````
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NULL;
````
조건 :
이름이 없는 동물의 ID 조회
ID는 오름차순으로 = ASC (생략가능)

### JOIN
##### 없어진 기록 찾기
````
SELECT B.ANIMAL_ID, B.NAME
FROM ANIMAL_INS A RIGHT JOIN ANIMAL_OUTS B
ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE A.ANIMAL_ID IS NULL;
````
풀이 :
입양은 나갔는데 보호소에 들어온 기록이 없다 => 입양 나간 테이블쪽으로 RIGHT JOIN
보호소에 들어온 기록 중 NULL인 것을 찾으면 된다

### STRING, DATE
##### 루시와 엘라 찾기
````
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN (
'Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY ANIMAL_ID;
````
풀이 :
동물 보호소에 들어온 동물 중 이름이 Lucy, Ella, Pickle, Rogan, Sabrina, Mitty
WHERE NAME IN (
'Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')

동물의 아이디와 이름, 성별 및 중성화 여부를 조회하는 SQL 문
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE

아이디 순으로 조회
ORDER BY ANIMAL_ID;