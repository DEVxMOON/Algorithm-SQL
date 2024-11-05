-- 코드를 작성해주세요
select A.ID, A.GENOTYPE, B.GENOTYPE PARENT_GENOTYPE from ECOLI_DATA A, ECOLI_DATA B
where A.PARENT_ID = B.ID
AND B.GENOTYPE & A.GENOTYPE = B.GENOTYPE
ORDER BY ID