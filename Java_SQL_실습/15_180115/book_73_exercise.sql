
--1
select register_date,goods_name from goods where register_date>'2009-04-28'

--2 后凯捞 积己等促
select *from goods where buy_price =null;
select *from goods where buy_price <>null;
select *from goods where goods_name >null;

--3
select goods_name,sell_price,buy_price from goods where buy_price +500 <= sell_price

select goods_name,sell_price,buy_price from goods where -buy_price+sell_price>=500

--4
select goods_name,goods_classify,sell_price*0.9-buy_price as profit 
from goods 
where (sell_price*0.9-buy_price>100) and ((goods_classify='林规侩前')or (goods_classify='荤公侩前'))