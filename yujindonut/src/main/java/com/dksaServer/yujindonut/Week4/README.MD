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
