-- 코드를 작성해주세요

select COUNT(*) as FISH_COUNT, N.FISH_NAME
from FISH_INFO I join FISH_NAME_INFO N on I.FISH_TYPE = N.FISH_TYPE
group by N.FISH_NAME
order by FISH_COUNT DESC