select ID, EMAIL, FIRST_NAME, LAST_NAME from SKILLCODES S, DEVELOPERS D
where 1=1
    and (D.SKILL_CODE & S.CODE) >0
    and CATEGORY = 'Front End'
group by ID, EMAIL, FIRST_NAME, LAST_NAME
order by ID asc