
--1. 사원 테이블에서 사원이름을 첫글자는 대문자로, 나머지는 소문자로 출력하시오.

select upper(substr(ENAME,1,1))||lower(substr(ENAME,2,length(ENAME))) as 사원이름 from emp

--2. 사원테이블에서 사원이름을 뽑고 또 이름의 두번째 글자부터 네번째 글자까지
-- 출력하시오.
select ENAME,substr(ENAME,2,3) from emp

--3. 사원테이블의 사원 이름의 문자 개수를 출력하시오.
select length(ENAME) from emp;

--4. 사원테이블에서 사원 이름의 앞 글자 하나와 마지막 글자 하나만 출력하되 
-- 모두 소문자로 각각 출력하시오.
select lower(substr(ENAME,1,1))||lower(substr(ENAME,length(ENAME),1)) from emp

--5. 3456.78을 반올림하여 소수점 아래 첫번째 자리 까지만 나타내시오.
select round(3456.76,1) from dual 

--6. 월급에 55를 곱하고 십단위는 절삭하여 출력하는데 월급뒤에 '원'을 붙이고 
--    천단위마다 ','를 붙여서 출력한다.
select to_char(trunc(sal*55,-2),'999,999')||'원' from emp

--7. 직원 이름과 커미션 설정 여부를 출력하는데 설정되었으면 '설정'
--    설정되지 않았으면 '미정'을 출력하시오.
select ENAME,case when comm>0 then '설정' ||comm
             else '미설정'||comm
            end as new_comm
            from emp
--8. 직원 이름과 부서번호 그리고 부서번호에 따른 부서명을 출력하시오.
select ENAME,DEPTNO,
  case DEPTNO
    when 10 then 'A부서'
    when 20 then 'B부서'
    when 30 then 'C부서'
    else null
end as DEPTNAME from emp

--9. 직위가 'SALESMAN'이고 월급이 1000이상인 사원의
-- 이름과 월급을 출력하시오.
select ENAME,SAL from emp where sal>=1000 and job='SALESMAN'

--10. 오늘날짜와 오늘날짜에서 10일을 더한 날짜를 출력하시오.
select sysdate,sysdate+10 from dual

--11. 현재 시간을 "....년 ..월 ..일 ..시 ..분" 으로 출력하시오.
select to_char(sysdate,'yyyy"년"mm"월"dd"일"hh"시"mi"분"') as time from dual



--12. 직원의 이름, 월급여, 연봉을 조회하는 질의를 작성하시오.
--(단, 직원의 연봉은 $200의 월 보너스를 포함하여 계산합니다.)

--이름              월급여               연봉
select ename ,sal,sal*12+2400 as yearsal from emp


--13.  연숩문제2_추가.docx 로 대체
select ename as 이름,sal as 월급,case when sal<1000 then 'A'
      when sal>=1000 and sal <2000 then 'B'
      when sal>=2000 and sal <3000 then 'C'
      when sal>=3000 and sal <4000 then 'D'
      else 'F'
    end as 코드
  from emp
--14. 연숩문제2_추.docx 로 대체
select ename as 이름, deptno as 부서번호,decode(deptno,10,'A',20,'B',30,'C',40,'E','F') as  코드
from emp

--15.  열이름이 Employee and Job Title이고, 콤마와 공백으로 구분된 직원이름과 
--직무를 연결되도록 하는 질의를 작성하시오.
select ENAME||', '||JOB as "Employee and Job Title" from emp

--16. 이름의 두번째 문자가 “A”인 모든 직원의 이름을 조회하는 질의를 작성하시오 

select ENAME from emp where substr(ENAME,2,1)='A'

--17. 이름, 입사일, 입사한 요일을 조회하는 질의를 작성하시오
select ENAME as 이름 ,to_char(HIREDATE,'YYYY"년"MM"월"DD"일"') as 입사일, to_char(HiREDATE,'DAY') as 입사요일
from emp order by to_char(HIREDATE-1,'d')
--order by decode(to_char(HIREDATE,'DAY'),'월요일',1,'화요일',2,'수요일',3,'목요일',4,'금요일',5,'토요일',6,'일요일',7)
TO
--18.   모든 직원의 이름과 현재까지의 입사기간을 월단위(가장 가까운 월로 반올림할 것)로 
select ENAME,HIREDATE,round(MONTHS_BETWEEN(sysdate,HIREDATE)) as "MONTHS WORKED" from emp order by HIREDATE DESC


--19. 사원테이블에서 사원이름과 사원들의 오늘 날짜까지의 근무일수를 구하시오.
select ENAME as 사원이름,ROUND(SYSDATE-HIREDATE) AS 근무일수 from emp


--20. 1981년도에 입사한 직원들의 이름, 직위 그리고 입사일을
--         입사한 순으로 출력하시오.
select ename,job,hiredate from emp order by hiredate

--21. 내생일을 기준으로 요일을 출력하는 SQL  명령을 작성하시오.
select to_char(to_date(19920914,'yyyymmdd'),'day') as "My Birthday" from dual

--22. 현재를 기준으로 내가 태어난지 몇 개월 되었는지 알 수 있는 
--      SQL 명령을 작성하시오.
select round(MONTHS_BETWEEN(sysdate,to_date('19920914','yyyymmdd'))) as "태어난지 n개월"from dual

--23. 직원들의 이름과 월급 그리고 커미션 정보를 출력하는데
--     커미션이 정해지지 않은 직원은 "미정"이라고 출력하시오.
select ename,sal,nvl(to_char(comm),'미정') from emp

--24. 사원테이블에서 이름의 첫글자가 A이고 마지막 글자가 N이 아닌 사원의
-- 이름을 출력하시오.
select ename from emp where substr(ename,1,1)<>'A' and substr(ename,length(ename),1)<>'N'

--25. 직원의 이름, 입사 날짜 그리고 년도를 기준으로 하여 반올림한 날짜를
--     출력하시오.        
select ename,hiredate,round(hiredate,'YEAR') from emp