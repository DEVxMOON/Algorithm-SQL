SELECT ID, 
    CASE
        WHEN (RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) / (SELECT COUNT(*) FROM ECOLI_DATA) * 100) <= 25 THEN 'CRITICAL'
        WHEN (RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) / (SELECT COUNT(*) FROM ECOLI_DATA) * 100) <= 50 THEN 'HIGH'
        WHEN (RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) / (SELECT COUNT(*) FROM ECOLI_DATA) * 100) <= 75 THEN 'MEDIUM'
        ELSE 'LOW'
    END AS COLONY_NAME 
FROM ECOLI_DATA
ORDER BY ID