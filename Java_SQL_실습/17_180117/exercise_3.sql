-- 1. DALLAS에서 근무하는 사원의 이름, 직위, 부서번호, 부서이름을 출력하시오.(5개)
--이름         직위        부서이름          
---------- --------- --------------
--SMITH      CLERK     RESEARCH      
--JONES      MANAGER   RESEARCH      
--SCOTT      ANALYST   RESEARCH      
--ADAMS      CLERK     RESEARCH      
--FORD       ANALYST   RESEARCH      
select e.ename as 이름,e.job as 직위,d.dname as 부서이름
from emp e
join dept d
on d.deptno = e.deptno
where d.loc = 'DALLAS'

-- 2. 이름에 'A'가 들어가는 사원들의 이름과 부서이름을 출력하시오.(7개)
--이름         부서이름          
---------- --------------
--ALLEN      SALES         
--WARD       SALES         
--MARTIN     SALES 
select e.ename as 이름 ,d.dname as 부서이름
from emp e
join dept d
on d.deptno = e.deptno
where e.ename like '%A%'

-- 3. 사원이름과 그 사원이 속한 부서의 부서명, 그리고 월급을 
--출력하는데 월급이 3000이상인 사원을 출력하시오. (3개)
--사원이름       부서명                    월급
---------- -------------- ----------
--KING       ACCOUNTING           5000
--FORD       RESEARCH             3000
--SCOTT      RESEARCH             3000
select e.ename as 사원이름,d.dname as 부서명 ,e.sal as 월급
from emp e
join dept d
on d.deptno = e.deptno
where e.sal>=3000

-- 4. 직위가 'SALESMAN'인 사원들의 직위와 그 사원이름, 그리고
-- 그 사원이 속한 부서 이름을 출력하시오. (4개)
--직위        사원이름       부서이름          
--------- ---------- --------------
--SALESMAN  TURNER     SALES         
--SALESMAN  MARTIN     SALES         
--SALESMAN  WARD       SALES         
--SALESMAN  ALLEN      SALES       
select e.job as 직위, e.ename as 사원이름, d.dname
from emp e
join dept d
on d.deptno = e.deptno
where e.job ='SALESMAN'

-- 5. 커미션이 책정된 사원들의 사원번호, 이름, 연봉, 연봉+커미션,
-- 급여등급을 출력하되, 각각의 컬럼명을 '사원번호', '사원이름',
-- '연봉','실급여', '급여등급'으로 하여 출력하시오. (6개)
--  사원번호 사원이름               연봉        실급여       급여등급
---------- ---------- ---------- ---------- ----------
--  7521 WARD            15000      15200          2
--  7654 MARTIN          15000      15300          2
--  7844 TURNER          18000      18000          3
select e.empno as 사원번호, e.ename as 사원이름, e.sal*12 as 연봉, e.sal+e.comm as 실급여, s.grade
from emp e
join salgrade s
on e.sal between s.losal and s.hisal
where nvl(e.comm,1)<>1

-- 6. 부서번호가 10번인 사원들의 부서번호, 부서이름, 사원이름,
-- 월급, 급여등급을 출력하시오. (3개)
--   부서번호 부서이름           사원이름               월급       급여등급
---------- -------------- ---------- ---------- ----------
--      10 ACCOUNTING     CLARK            2450          4
--      10 ACCOUNTING     KING             5000          5
--      10 ACCOUNTING     MILLER           1300          2 
select d.deptno as 부서번호, d.dname as 부서이름, e.ename as 사원이름, e.sal as 월급, s.grade as 급여등급
from emp e
join dept d
on e.deptno = d.deptno
join salgrade s
on e.sal between s.losal and s.hisal
where e.deptno = 10

-- 7. 부서번호가 10번, 20번인 사원들의 부서번호, 부서이름, 
-- 사원이름, 월급, 급여등급을 출력하시오. 그리고 그 출력된 
-- 결과물을 부서번호가 낮은 순으로, 월급이 높은 순으로 정렬하시오. (8개)
--   부서번호 부서이름           사원이름               월급       급여등급
---------- -------------- ---------- ---------- ----------
--    10 ACCOUNTING     KING             5000          5
--    10 ACCOUNTING     CLARK            2450          4
select e.deptno as 부서번호, d.dname as 부서이름, e.ename as 사원이름, e.sal as 월급, s.grade as 급여등급
from emp e
join dept d
on e.deptno = d.deptno
join salgrade s
on e.sal between s.losal and s.hisal
where e.deptno = 10 or e.deptno = 20 
order by 부서이름,월급 desc 

-- 8. 사원들의 이름, 부서번호, 부서이름을 출력하시오. (16개) 
-- 단, 직원이 없는 부서도 출력하며 이경우 이름을 '미정'이라고
-- 출력한다.        
--이름               부서번호 부서이름          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH      
select e.ename as 이름, d.deptno as 부서번호, 
case when e.ename is null then '미정'
else d.dname
end as 부서이름
from emp e
right join dept d
on e.deptno = d.deptno


-- 9. 사원들의 이름, 부서번호, 부서이름을 출력하시오. (15개) 
-- 단, 아직 부서 배치를 못받은 직원도  출력하며 이경우 부서번호는  0 으로
-- 출력한다.        
--이름               부서번호 부서이름          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH    
select e.ename as 이름, 
case when d.deptno is null then 0 else d.deptno
end as 부서번호,d.dname as 부서이름
from emp e
left join dept d
on e.deptno = d.deptno


-- 10. 사원들의 이름, 부서번호, 부서이름을 출력하시오. (16개) 
-- 단, 직원이 없는 부서도 출력하며 이경우 이름과 부서번호를 '미정'이라고
-- 출력한다. 아직 부서 배치를 못받은 직원도  출력하며 부서 번호와 부서 이름을
-- '미정' 이라고 출력한다.     
--이름               부서번호 부서이름          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH    
select e.ename as 이름,
case when e.ename is not null then to_char(d.deptno) else '미정' end as 부서번호,
case when e.ename is null then '미정' else d.dname end as 부서이름
from emp e
full join dept d
on e.deptno = d.deptno


--11. 보너스를 받는 모든 직원의 이름, 보너스, 부서이름, 위치를 조회하는 질의를 작성하시오.

--ENAME           COMM        DNAME         	LOC
----------------------------------------------------
--KING		3500	ACCOUNTING	NEW YORK
--JONES		30	RESEARCH	DALLAS
--TURNER	0	SALES		CHICAGO
--MARTIN	300	SALES		CHICAGO
--WARD		200	SALES		CHICAGO
--ALLEN		300	SALES		CHICAGO
select e.ename,e.comm,d.dname,d.loc
from emp e
full join dept d
on e.deptno = d.deptno
where e.comm>=0

-- 12. DALLAS에서 근무하는 사원의 이름,  월급, 등급을 출력하시오.(5개)
--이름         월급        등급          
---------- --------- --------------
--SMITH      800         1      
--JONES      2975       4   
--SCOTT            
--ADAMS           
--FORD
select e.ename as 이름, e.sal as 월급, s.grade as 등급
from emp e
join salgrade s
on e.sal between s.losal and s.hisal
join dept d
on e.deptno = d.deptno
where d.loc ='DALLAS'

--13. 사원번호와 사원이름, 그리고 그 사원을 관리하는 관리자의 
-- 사원번호와 사원이름을 출력하되 각각의 컬럼명을 '사원번호',
-- '사원이름', '관리자번호', '관리자이름'으로 하여 출력하시오. (14개)
      관리자가 없으면 '없음'을 대신 출력한다.
--    사원번호 사원이름            관리자번호 관리자이름     
---------- ---------- ---------- ----------
--  7902 FORD             7566 JONES     
--  7788 SCOTT            7566 JONES     
--   7900 JAMES            7698 BLAKE   
select e.empno as 사원번호, e.ename as 사원이름, ee.empno as 관리자번호,  
case when ee.ename is null then '미정' else ee.ename end as 관리자이름
from emp e  
left join emp ee
on e.mgr = ee.empno