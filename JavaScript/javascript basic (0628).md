### 자료형

1. 숫자

2. 문자

3. null

4. undefined

5. boolean

6. JSON(Object) => {}

   1) 키와 값을 쌍으로 가진다

   2) var o = {key: value}

   3) 함수를 값으로 가질 수 있다.

   4) method, property (value에 함수가 들어있을 경우 method, 그 외의 값은 property)

   5) 배열(array) => []

   1. 유용한 methods: pop(맨 뒤에서 값을 뺀다), push(맨 뒤에 값을 넣는다), shift(맨 앞의 값 뺀다), unshift(맨앞에 값 넣음), sort, reverse, indexOf, forEach

   2. map, filter, reduce

      ```javascript
      //map 배열 내의 모든 값에 적용
      var arr = [1,2,3,4,5];
      arr.map(function(x){return x*x;});  //[1,4,9,16,25]
      
      //filter 배열의 모든 값에 함수를 적용시켜서 true인 값만 반환한다.
      var arr = [1,2,3,4,5];
      arr.filter(fucntion(x){return x>2});  //[3,4,5]
      
      //reduce
      ```

      - map, filter는 배열의 값을 바꾸지 않고 바뀐 값을 리턴한다.

### 함수

1. 함수 선언식

   ```javascript
   function sum(x,y){
       return x+y;
   }
   ```

2. 함수 표현식

   ```javascript
   var sum = function(x,y){
       return x+y;
   }
   ```

3. 함수 선언식과 함수 표현식의 차이점

   ```javascript
   //함수 선언식은 함수를 먼저 쓰고 나중에 선언해도 동작한다.
   //자바스크립트 hoisting => 함수나 변수는 자바스크립트가 실행될 때 맨 위로 가져온다
   //hoisting 선언된 함수와 변수가 메모리에 기 저장된 상태로 호출됨
   sum(1,2);
   
   function sum(x,y){
       return x+y;
   }
   
   //실제 실행되는 순서
   function sum(x,y){
       return x+y;
   }
   
   sum(1,2);
   ```

   ```javascript
   //함수 표현식에서는 에러, 변수 선언만 hoisting 되기 때문에
   sum2(1,2);
   
   var sum2 = function(x,y){
       return x+y;
   }
   
   //실제 실행되는 순서
   var sum2;
   
   sum2(1,2);
   
   sum2 = function(x,y){
       return x+y;
   }
   ```

4. 함수의 다양한 용도 (인자, 리턴값)

   ```javascript
   //map함수 구현
   
   var arr = [1,2,3,4,5];
   var double = function(x){return x*2;};
   //var arr2 = arr.map(double);
   var arr2 = map(double,arr);
   function map(func,arr){
       new_arr = [];
       for (element of arr){
           new_arr.push(func(element));
       }
       return new_arr;
   }
   ```

   ```javascript
   //filter함수 구현
   
   var positive = function(x){return x>0;}
   //positive(1) //=> true
   //positive(2) //=> false
   
   var arr=[-1,3,-5,7,-9];
   var arr2 = filter(positive,arr);
   function filter(func,arr){
       var new_arr = [];
       for (element of arr){
           if (func(element)){
               new_arr.push(element);
           }   
       }
       return new_arr;
   }
   ```

   ```javascript
   //함수 리턴
   function func1(){
       return function func2(){
           console.log("im inner function");
       }
   };
   
   var test = func1();
   test();
   ```

5. 함수의 인자 사용법

   ```javascript
   function sum(a,b){
       console.log(a+b);
   }
   
   sum(1) //들어오지 않은 값은 undefined
   //console.log(1+undefined);
   // => NaN
   
   sum(1,2,3) // 더 들어오는 인자값도 arguments로 사용가능
   //더 들어오는 인자값도 arguments에 들어간다.
   //arguments = [1,2,3]
   
   
   //들어오는 모든 인자값을 더하기
   function sum(a,b){
       var total = 0;
       for(element of arguments){
           total += element;
       }
       console.log(total);
   }
   
   sum(1,2,3,4,5);  //=>15
   
   
   //들어오는 모든 인자값을 곱해서 리턴하는 함수
   function multiple(a,b){
       var total = 1;
       for(element of arguments){
           total *= element;
       }
       console.log(total);
   }
   
   multiple(1,1,3,1,5)  //=> 15
   ```

