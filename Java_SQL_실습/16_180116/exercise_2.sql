
--1. ��� ���̺��� ����̸��� ù���ڴ� �빮�ڷ�, �������� �ҹ��ڷ� ����Ͻÿ�.

select upper(substr(ENAME,1,1))||lower(substr(ENAME,2,length(ENAME))) as ����̸� from emp

--2. ������̺��� ����̸��� �̰� �� �̸��� �ι�° ���ں��� �׹�° ���ڱ���
-- ����Ͻÿ�.
select ENAME,substr(ENAME,2,3) from emp

--3. ������̺��� ��� �̸��� ���� ������ ����Ͻÿ�.
select length(ENAME) from emp;

--4. ������̺��� ��� �̸��� �� ���� �ϳ��� ������ ���� �ϳ��� ����ϵ� 
-- ��� �ҹ��ڷ� ���� ����Ͻÿ�.
select lower(substr(ENAME,1,1))||lower(substr(ENAME,length(ENAME),1)) from emp

--5. 3456.78�� �ݿø��Ͽ� �Ҽ��� �Ʒ� ù��° �ڸ� ������ ��Ÿ���ÿ�.
select round(3456.76,1) from dual 

--6. ���޿� 55�� ���ϰ� �ʴ����� �����Ͽ� ����ϴµ� ���޵ڿ� '��'�� ���̰� 
--    õ�������� ','�� �ٿ��� ����Ѵ�.
select to_char(trunc(sal*55,-2),'999,999')||'��' from emp

--7. ���� �̸��� Ŀ�̼� ���� ���θ� ����ϴµ� �����Ǿ����� '����'
--    �������� �ʾ����� '����'�� ����Ͻÿ�.
select ENAME,case when comm>0 then '����' ||comm
             else '�̼���'||comm
            end as new_comm
            from emp
--8. ���� �̸��� �μ���ȣ �׸��� �μ���ȣ�� ���� �μ����� ����Ͻÿ�.
select ENAME,DEPTNO,
  case DEPTNO
    when 10 then 'A�μ�'
    when 20 then 'B�μ�'
    when 30 then 'C�μ�'
    else null
end as DEPTNAME from emp

--9. ������ 'SALESMAN'�̰� ������ 1000�̻��� �����
-- �̸��� ������ ����Ͻÿ�.
select ENAME,SAL from emp where sal>=1000 and job='SALESMAN'

--10. ���ó�¥�� ���ó�¥���� 10���� ���� ��¥�� ����Ͻÿ�.
select sysdate,sysdate+10 from dual

--11. ���� �ð��� "....�� ..�� ..�� ..�� ..��" ���� ����Ͻÿ�.
select to_char(sysdate,'yyyy"��"mm"��"dd"��"hh"��"mi"��"') as time from dual



--12. ������ �̸�, ���޿�, ������ ��ȸ�ϴ� ���Ǹ� �ۼ��Ͻÿ�.
--(��, ������ ������ $200�� �� ���ʽ��� �����Ͽ� ����մϴ�.)

--�̸�              ���޿�               ����
select ename ,sal,sal*12+2400 as yearsal from emp


--13.  ��������2_�߰�.docx �� ��ü
select ename as �̸�,sal as ����,case when sal<1000 then 'A'
      when sal>=1000 and sal <2000 then 'B'
      when sal>=2000 and sal <3000 then 'C'
      when sal>=3000 and sal <4000 then 'D'
      else 'F'
    end as �ڵ�
  from emp
--14. ��������2_��.docx �� ��ü
select ename as �̸�, deptno as �μ���ȣ,decode(deptno,10,'A',20,'B',30,'C',40,'E','F') as  �ڵ�
from emp

--15.  ���̸��� Employee and Job Title�̰�, �޸��� �������� ���е� �����̸��� 
--������ ����ǵ��� �ϴ� ���Ǹ� �ۼ��Ͻÿ�.
select ENAME||', '||JOB as "Employee and Job Title" from emp

--16. �̸��� �ι�° ���ڰ� ��A���� ��� ������ �̸��� ��ȸ�ϴ� ���Ǹ� �ۼ��Ͻÿ� 

select ENAME from emp where substr(ENAME,2,1)='A'

--17. �̸�, �Ի���, �Ի��� ������ ��ȸ�ϴ� ���Ǹ� �ۼ��Ͻÿ�
select ENAME as �̸� ,to_char(HIREDATE,'YYYY"��"MM"��"DD"��"') as �Ի���, to_char(HiREDATE,'DAY') as �Ի����
from emp order by to_char(HIREDATE-1,'d')
--order by decode(to_char(HIREDATE,'DAY'),'������',1,'ȭ����',2,'������',3,'�����',4,'�ݿ���',5,'�����',6,'�Ͽ���',7)
TO
--18.   ��� ������ �̸��� ��������� �Ի�Ⱓ�� ������(���� ����� ���� �ݿø��� ��)�� 
select ENAME,HIREDATE,round(MONTHS_BETWEEN(sysdate,HIREDATE)) as "MONTHS WORKED" from emp order by HIREDATE DESC


--19. ������̺��� ����̸��� ������� ���� ��¥������ �ٹ��ϼ��� ���Ͻÿ�.
select ENAME as ����̸�,ROUND(SYSDATE-HIREDATE) AS �ٹ��ϼ� from emp


--20. 1981�⵵�� �Ի��� �������� �̸�, ���� �׸��� �Ի�����
--         �Ի��� ������ ����Ͻÿ�.
select ename,job,hiredate from emp order by hiredate

--21. �������� �������� ������ ����ϴ� SQL  ����� �ۼ��Ͻÿ�.
select to_char(to_date(19920914,'yyyymmdd'),'day') as "My Birthday" from dual

--22. ���縦 �������� ���� �¾�� �� ���� �Ǿ����� �� �� �ִ� 
--      SQL ����� �ۼ��Ͻÿ�.
select round(MONTHS_BETWEEN(sysdate,to_date('19920914','yyyymmdd'))) as "�¾�� n����"from dual

--23. �������� �̸��� ���� �׸��� Ŀ�̼� ������ ����ϴµ�
--     Ŀ�̼��� �������� ���� ������ "����"�̶�� ����Ͻÿ�.
select ename,sal,nvl(to_char(comm),'����') from emp

--24. ������̺��� �̸��� ù���ڰ� A�̰� ������ ���ڰ� N�� �ƴ� �����
-- �̸��� ����Ͻÿ�.
select ename from emp where substr(ename,1,1)<>'A' and substr(ename,length(ename),1)<>'N'

--25. ������ �̸�, �Ի� ��¥ �׸��� �⵵�� �������� �Ͽ� �ݿø��� ��¥��
--     ����Ͻÿ�.        
select ename,hiredate,round(hiredate,'YEAR') from emp