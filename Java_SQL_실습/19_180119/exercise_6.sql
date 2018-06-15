--QUESTION
--1. 'MARRY'���� ������ ���� �޴� ������� �̸��� ������ ����Ͻÿ�.(12��)
--ENAME             SAL
---------- ----------
--ALLEN            1600
--WARD             1250
select ename,sal from emp
where sal>(select sal from emp where ename ='MARRY')

--2. 10�� �μ��� ������ ���� ������ �޴� ������� �̸�, ����, (3��)
--   �μ���ȣ�� ����Ͻÿ�.
ENAME             SAL     DEPTNO
---------- ---------- ----------
CLARK            2450         10
KING             5000         10
MILLER           1300         10
select ename,sal,deptno from emp
where sal in (select sal from emp where deptno =10)


--3. 'BLAKE'�� ���� �μ��� �ִ� ������� �̸��� ������� �̴µ� 'BLAKE'�� ���� ����Ͻÿ�. (5��)
--ENAME      HIREDATE
---------- --------
--JAMES      81/10/03
--TURNER     81/09/08

select ename,hiredate from emp 
where deptno=(select deptno from emp where ename='BLAKE') and ename <> 'BLAKE'
--4. ��ձ޿����� ���� �޿��� �޴� ������� �����ȣ, �̸�, ������
-- ����ϵ�, ������ ���� ��� ������ ����Ͻÿ�.(6��)
--  EMPNO ENAME             SAL
---------- ---------- ----------
--   7839 KING             5000
--   7902 FORD             3000
select empno,ename,sal from emp 
where sal>(select avg(sal) from emp) order by sal desc

--5. �̸��� 'T'�� �����ϰ� �ִ� ������ ���� �μ����� �ٹ��ϰ�
--   �ִ� ����� �����ȣ�� �̸��� ����Ͻÿ�.(11��)
--     EMPNO ENAME     
---------- ----------
--      7902 FORD      
--      7876 ADAMS     
--      7788 SCOTT   
select empno,ename from emp
where deptno in (select deptno from emp where ename in (select ename from emp where ename LIKE '%T%'))




--6 �ڽ��� �޿��� ��ձ޿����� ����,�̸��� S�ڰ� ���� ����� ������
--  �μ����� �ٹ��ϴ� ��� ����� �����ȣ,�̸� �� �޿��� ����Ͻÿ�(4��)
--     EMPNO    ENAME      SAL
--    --------  --------  -------
--      7902     FORD       3000
--      7788     SCOTT      3000
--      7566     JONES      2975
--      7698     BLAKE     2850


select empno,ename,sal from emp
  where sal>(select avg(sal) from emp) 
  and 
  deptno in (select deptno from emp where ename in (select ename from emp where ename LIKE '%S%'))


--7. 30�� �μ��� �ִ� ����� �߿��� ���� ���� ������ �޴� �������
--   ���� ������ �޴� ������� �̸�, �μ���ȣ, ������ ����Ͻÿ�. (4��)
--   (��, ALL �Ǵ� ANY �����ڸ� ����� ��)
--  �̸�    �μ���ȣ   ����
--------------------------------
--  JONES     20     2975
--  SCOTT     20     3000
--  KING       10     5000
--  FORD      20     3000

select ename as �̸�, deptno as �μ���ȣ,sal as ���� from emp
where ename in (select ename from emp where sal >all (select sal from emp where deptno =30))

--8. 'DALLAS'���� �ٹ��ϰ� �ִ� ����� ���� �μ����� ���ϴ� �����
--   �̸�, �μ���ȣ, ������ ����Ͻÿ�.(5��)
--ENAME          DEPTNO JOB      
---------- ---------- ---------
--FORD               20 ANALYST  
--ADAMS              20 CLERK    
--SCOTT              20 ANALYST  
--JONES              20 MANAGER  
--SMITH              20 CLERK 

select ename,deptno,job from emp
where deptno = (select deptno from dept where loc='DALLAS')

--9. SALES �μ����� ���ϴ� ������� �μ���ȣ, �̸�, ������ ����Ͻÿ�.(6��)
--    DEPTNO ENAME      JOB      
---------- ---------- ---------
--    30 JAMES      CLERK    
--    30 TURNER     SALESMAN 
--    30 BLAKE      MANAGER  

select deptno,ename,job from emp
where deptno = (select deptno from dept where dname='SALES')



--10. 'KING'���� �����ϴ� ��� ����� �̸��� �޿��� ����Ͻÿ�. (3��)
--     (KING���� �����ϴ� ����̶� mgr�� KING�� ����� �ǹ���) 
--ENAME             SAL
---------- ----------
--CLARK            2450
--BLAKE            2850
--JONES            2975
select ename,sal from emp
where mgr = (select empno from emp where ename ='KING')



--11. Ŀ�̼��� �޴� ����� / �μ���ȣ, ������ ���� �����
--    �̸�, ����, �μ���ȣ�� ����Ͻÿ�. (6��)
--	ALLEN	1600	30
--	MARTIN	1250	30
--	WARD	1250	30
--	JONES	2975	20
--	KING	5000	10
--	TURNER	1500	30
select ename, sal,deptno from emp
where deptno in (select deptno from emp where comm is not null) and sal in (select sal from emp where comm is not null)


--12. 30�� �μ� ������ ���ް� Ŀ�̼��� ���� ����
--    ������� �̸�, ����, Ŀ�̼��� ����Ͻÿ�.(30�� �μ� ����) (2��)
--  ENAME      SAL    COMM
---------- ---------- ----------
--	JONES	2975	30
--	KING	5000	3500

select ename,sal,comm from emp
where sal not in (select sal from emp where deptno=30) and comm not in (select comm from emp where deptno=30 and comm is not null)

***************************************************************
--4. �μ��� �ִ� ������ "�μ���", "�ִ����" ���� ����Ͻÿ�.(�ִ������ ū ��)
--6.�μ��� ��տ����� ����ϵ�, ��տ��ް� 2000����
-- ū �μ��� �μ� �̸��� ��տ����� ����Ͻÿ�.
--9. Ŀ�̼��� ������ ������ �߿��� �μ��� �ִ������ ����Ͻÿ�. 
--�ִ� ������ ���� ������ �����Ͽ� ����Ͻÿ�.

�� �������� ���� ������ �ǽ��Դϴ�. emp_dept ��� �̸��� �並 ����
�����ϴ� �ڵ�� ������ ���ϴ�. ���� ��Ī�� ������ ���̰� �並 ���鶧 � �÷�����
�����Ͽ� ������ �������� ���Ƿ� ���մϴ�.
13. ����� SQL
Create view newemp2 (depart,salary,departno,newcomm) 
as
select d.dname as depart,e.sal as salary,e.deptno as departno,e.comm as newcomm from emp e 
join dept d
on d.deptno = e.deptno

14. ���� 4�� ���ۼ�
select depart,max(salary) from newemp2
group by depart

15. ���� 6�� ���ۼ�
select depart,avg(salary) from newemp2
group by depart
having avg(salary) >2000

16. ���� 9�� ���ۼ� 
--9. Ŀ�̼��� ������ ������ �߿��� �μ��� �ִ������ ����Ͻÿ�. 
--�ִ� ������ ���� ������ �����Ͽ� ����Ͻÿ�.

select depart,max(salary) from newemp2
where newcomm is not null
group by depart
order by max(salary) desc