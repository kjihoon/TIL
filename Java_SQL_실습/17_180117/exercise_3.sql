-- 1. DALLAS���� �ٹ��ϴ� ����� �̸�, ����, �μ���ȣ, �μ��̸��� ����Ͻÿ�.(5��)
--�̸�         ����        �μ��̸�          
---------- --------- --------------
--SMITH      CLERK     RESEARCH      
--JONES      MANAGER   RESEARCH      
--SCOTT      ANALYST   RESEARCH      
--ADAMS      CLERK     RESEARCH      
--FORD       ANALYST   RESEARCH      
select e.ename as �̸�,e.job as ����,d.dname as �μ��̸�
from emp e
join dept d
on d.deptno = e.deptno
where d.loc = 'DALLAS'

-- 2. �̸��� 'A'�� ���� ������� �̸��� �μ��̸��� ����Ͻÿ�.(7��)
--�̸�         �μ��̸�          
---------- --------------
--ALLEN      SALES         
--WARD       SALES         
--MARTIN     SALES 
select e.ename as �̸� ,d.dname as �μ��̸�
from emp e
join dept d
on d.deptno = e.deptno
where e.ename like '%A%'

-- 3. ����̸��� �� ����� ���� �μ��� �μ���, �׸��� ������ 
--����ϴµ� ������ 3000�̻��� ����� ����Ͻÿ�. (3��)
--����̸�       �μ���                    ����
---------- -------------- ----------
--KING       ACCOUNTING           5000
--FORD       RESEARCH             3000
--SCOTT      RESEARCH             3000
select e.ename as ����̸�,d.dname as �μ��� ,e.sal as ����
from emp e
join dept d
on d.deptno = e.deptno
where e.sal>=3000

-- 4. ������ 'SALESMAN'�� ������� ������ �� ����̸�, �׸���
-- �� ����� ���� �μ� �̸��� ����Ͻÿ�. (4��)
--����        ����̸�       �μ��̸�          
--------- ---------- --------------
--SALESMAN  TURNER     SALES         
--SALESMAN  MARTIN     SALES         
--SALESMAN  WARD       SALES         
--SALESMAN  ALLEN      SALES       
select e.job as ����, e.ename as ����̸�, d.dname
from emp e
join dept d
on d.deptno = e.deptno
where e.job ='SALESMAN'

-- 5. Ŀ�̼��� å���� ������� �����ȣ, �̸�, ����, ����+Ŀ�̼�,
-- �޿������ ����ϵ�, ������ �÷����� '�����ȣ', '����̸�',
-- '����','�Ǳ޿�', '�޿����'���� �Ͽ� ����Ͻÿ�. (6��)
--  �����ȣ ����̸�               ����        �Ǳ޿�       �޿����
---------- ---------- ---------- ---------- ----------
--  7521 WARD            15000      15200          2
--  7654 MARTIN          15000      15300          2
--  7844 TURNER          18000      18000          3
select e.empno as �����ȣ, e.ename as ����̸�, e.sal*12 as ����, e.sal+e.comm as �Ǳ޿�, s.grade
from emp e
join salgrade s
on e.sal between s.losal and s.hisal
where nvl(e.comm,1)<>1

-- 6. �μ���ȣ�� 10���� ������� �μ���ȣ, �μ��̸�, ����̸�,
-- ����, �޿������ ����Ͻÿ�. (3��)
--   �μ���ȣ �μ��̸�           ����̸�               ����       �޿����
---------- -------------- ---------- ---------- ----------
--      10 ACCOUNTING     CLARK            2450          4
--      10 ACCOUNTING     KING             5000          5
--      10 ACCOUNTING     MILLER           1300          2 
select d.deptno as �μ���ȣ, d.dname as �μ��̸�, e.ename as ����̸�, e.sal as ����, s.grade as �޿����
from emp e
join dept d
on e.deptno = d.deptno
join salgrade s
on e.sal between s.losal and s.hisal
where e.deptno = 10

-- 7. �μ���ȣ�� 10��, 20���� ������� �μ���ȣ, �μ��̸�, 
-- ����̸�, ����, �޿������ ����Ͻÿ�. �׸��� �� ��µ� 
-- ������� �μ���ȣ�� ���� ������, ������ ���� ������ �����Ͻÿ�. (8��)
--   �μ���ȣ �μ��̸�           ����̸�               ����       �޿����
---------- -------------- ---------- ---------- ----------
--    10 ACCOUNTING     KING             5000          5
--    10 ACCOUNTING     CLARK            2450          4
select e.deptno as �μ���ȣ, d.dname as �μ��̸�, e.ename as ����̸�, e.sal as ����, s.grade as �޿����
from emp e
join dept d
on e.deptno = d.deptno
join salgrade s
on e.sal between s.losal and s.hisal
where e.deptno = 10 or e.deptno = 20 
order by �μ��̸�,���� desc 

-- 8. ������� �̸�, �μ���ȣ, �μ��̸��� ����Ͻÿ�. (16��) 
-- ��, ������ ���� �μ��� ����ϸ� �̰�� �̸��� '����'�̶��
-- ����Ѵ�.        
--�̸�               �μ���ȣ �μ��̸�          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH      
select e.ename as �̸�, d.deptno as �μ���ȣ, 
case when e.ename is null then '����'
else d.dname
end as �μ��̸�
from emp e
right join dept d
on e.deptno = d.deptno


-- 9. ������� �̸�, �μ���ȣ, �μ��̸��� ����Ͻÿ�. (15��) 
-- ��, ���� �μ� ��ġ�� ������ ������  ����ϸ� �̰�� �μ���ȣ��  0 ����
-- ����Ѵ�.        
--�̸�               �μ���ȣ �μ��̸�          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH    
select e.ename as �̸�, 
case when d.deptno is null then 0 else d.deptno
end as �μ���ȣ,d.dname as �μ��̸�
from emp e
left join dept d
on e.deptno = d.deptno


-- 10. ������� �̸�, �μ���ȣ, �μ��̸��� ����Ͻÿ�. (16��) 
-- ��, ������ ���� �μ��� ����ϸ� �̰�� �̸��� �μ���ȣ�� '����'�̶��
-- ����Ѵ�. ���� �μ� ��ġ�� ������ ������  ����ϸ� �μ� ��ȣ�� �μ� �̸���
-- '����' �̶�� ����Ѵ�.     
--�̸�               �μ���ȣ �μ��̸�          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH    
select e.ename as �̸�,
case when e.ename is not null then to_char(d.deptno) else '����' end as �μ���ȣ,
case when e.ename is null then '����' else d.dname end as �μ��̸�
from emp e
full join dept d
on e.deptno = d.deptno


--11. ���ʽ��� �޴� ��� ������ �̸�, ���ʽ�, �μ��̸�, ��ġ�� ��ȸ�ϴ� ���Ǹ� �ۼ��Ͻÿ�.

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

-- 12. DALLAS���� �ٹ��ϴ� ����� �̸�,  ����, ����� ����Ͻÿ�.(5��)
--�̸�         ����        ���          
---------- --------- --------------
--SMITH      800         1      
--JONES      2975       4   
--SCOTT            
--ADAMS           
--FORD
select e.ename as �̸�, e.sal as ����, s.grade as ���
from emp e
join salgrade s
on e.sal between s.losal and s.hisal
join dept d
on e.deptno = d.deptno
where d.loc ='DALLAS'

--13. �����ȣ�� ����̸�, �׸��� �� ����� �����ϴ� �������� 
-- �����ȣ�� ����̸��� ����ϵ� ������ �÷����� '�����ȣ',
-- '����̸�', '�����ڹ�ȣ', '�������̸�'���� �Ͽ� ����Ͻÿ�. (14��)
      �����ڰ� ������ '����'�� ��� ����Ѵ�.
--    �����ȣ ����̸�            �����ڹ�ȣ �������̸�     
---------- ---------- ---------- ----------
--  7902 FORD             7566 JONES     
--  7788 SCOTT            7566 JONES     
--   7900 JAMES            7698 BLAKE   
select e.empno as �����ȣ, e.ename as ����̸�, ee.empno as �����ڹ�ȣ,  
case when ee.ename is null then '����' else ee.ename end as �������̸�
from emp e  
left join emp ee
on e.mgr = ee.empno