
--1. ��� ������ ������ ����� ���Ͻÿ�. 
       (�Ҽ��� ���� ��°�ڸ������� ��Ÿ���� ��°�ڸ� ���ʹ� �����Ͻÿ�)
select trunc(avg(sal),2) as "���� ���" from emp

--2. ��� �������� �޴� Ŀ�̼��� ���� ���Ͻÿ�.
select sum(comm) as "Ŀ�̼��� ��" from emp
--3. 'DALLAS'���� �ٹ����� ������ ����� ������ ���� ������ ���� �������� �����Ͻÿ�.

select '�������� '||count(*)||'���̰� ������ ���� '||sum(e.sal)||'�� �Դϴ�.' as ó����� 
from emp e
join dept d
on e.deptno = d.deptno
where d.loc ='DALLAS'

--4. �μ��� �ִ� ������ "�μ���", "�ִ����" ���� ����Ͻÿ�.(�ִ������ ū ��)

select d.dname as �μ���,max(e.sal) as �ִ���� 
from emp e
join dept d
on e.deptno = d.deptno
group by d.dname
order by �ִ���� desc

--5. ���޺� �ּ� ������ 3000 �̻��� �Ǵ� ������ ���޸�� �ּ� ������  ����Ͻÿ�. 
select job as �μ���, min(sal) as �ּҿ��� 
from emp
where sal>=3000
group by job



--6. �μ��� ��տ����� ����ϵ�, ��տ��ް� 2000����
-- ū �μ��� �μ� �̸��� ��տ����� ����Ͻÿ�.

select d.dname as �μ���, avg(e.sal) as ��տ��� 
from emp e
join dept d
on e.deptno = d.deptno
group by d.dname
having avg(e.sal)>2000


--7. �� ���޺��� �ѿ����� ����ϵ� �ѿ����� ���� ������ ����Ͻÿ�.
select job as ���޸�,sum(sal) as �ѿ��� from emp
group by job
order by �ѿ���



--8. ���޺� �ѿ����� ����ϵ�, ������ 'MANAGER'�� �������� �����Ͻÿ�. 
--   �׸��� �� �ѿ����� 5000���� ū ���޿� �ѿ��޸� ����Ͻÿ�.

select job as ���޸�,sum(sal) as �ѿ��� 
from emp
where job<>'MANAGER'
group by job
having sum(sal) > 5000



--9. Ŀ�̼��� �޴� ������ �߿��� �μ��� �ִ������ ����Ͻÿ�. 
--�ִ� ������ ���� ������ �����Ͽ� ����Ͻÿ�.

select d.dname as �μ���, max(e.sal) as �ִ����
from emp e
join dept d
on e.deptno = d.deptno
where e.comm is not null
group by d.dname

  