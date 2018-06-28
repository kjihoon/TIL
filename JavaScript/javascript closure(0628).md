## Closure 클로저

### 변수 scope

```javascript
//1.
var i = 0;
function changeI(){
    i = 10;
    console.log(i);
}

changeI();        //=>10
console.log(i);   //=>10


//2.
var i = 0;
function changeI(){
    var i = 10;
    console.log(i);
}

changeI();        //=>10
console.log(i);   //=>0
```

- 정적 유효범위

  ```javascript
  var i = 0;
  
  function a(){
      var i = 10;
      //함수 호출.
      b();   //함수 호출 시 변수를 참조하지 않고, 함수를 선언될 당시에 변수를 가져온다.  //=> 0
  }
  
  function b(){
      console.log(i);    //함수 선언될 떄 변수 참조, 이 때 i = 0;
  }
  
  
  a();   //=>0
  
  i= 10;
  a();  // => 10
  
  
  
  //함수 내 지역 변수를 선언하는 방법은 함수 내에서 함수를 선언해준다.
  var i =0;
  
  function a(){
      var i = 10;
      function b(){
          console.log(i);   //i = 10
      }
      b();   //=> 10
  }
  ```

- 클로저

  ```javascript
  var i = 0;
  function a(){
      var i = 10;
      return function b(){
          console.log(i);
      }
  }
  //초기 선언된 i값이 들어가는게 아니라 마지막에 선언된 i값이 들어감
  
  var closure = a();
  closure()  //=>10
  ```

```javascript
var i = 0;
function outer(){
    var i =10
    var j =20
    var k =30
    function inner(){
        var innerVar = 10;
        console.log(i);
        console.log(j);
        console.log(k);
    }
   
    //console.log(innerVar);  // 외부함수에서 내부 함수의 변수 접근 불가
    
    return inner;
}

var closure = outer() //변수 closure에는 함수 inner가 들어가 있음
//inner함수에는 함수 outer 변수 i j k  접근이 가능
closure()
//=> 10
//=> 20
//=> 30

```



### Closure

- 외부 함수의 변수들에 접근 가능한 내부 함수

```javascript
var arr = []

for (var i=0;i<10;i++){
    arr[i] = (function(){
        return i*20;
    });
};

for (j in arr){
    console.log( arr[j]() );
};
//=> 200이 10번 호출됨
```

```javascript
// 위 함수 실행 과정
var i = 0;
arr[i] = function(){return i*20} // i == 0 =>10 
i += 1
arr[i] = function(){return i*20}
i += 1
arr[i] = function(){return i*20}
i += 1
//...
console.log(arr[0]()); //200
console.log(arr[1]()); //200
console.log(arr[2]()); //200
//...

//초기 선언된 i값이 들어가는게 아니라 마지막에 선언된 i값이 들어감
//이 때문에 i는 모두 10이 된다.
//결과는 200이 10번 호출됨
```

```javascript
// 내부함수는 외부 함수의 변수들에 접근이 가능하다.

//1. 
var arr = [];
for (var i=0;i<10;i++){
    arr[i] = (function outer(i){
        //var i = i 대신 outer의 arg로 선언(둘다 똑같음)
         		function inner(){
      			  return i*20;
   		 };
        return inner
    })(i)    
};

for (j in arr){
    console.log( arr[j]() );
};
// 0,20,30.....180


//2,
var arr = [];
function outer(i){
    return function inner(){
        return i*20;
    };
}
for (var i=0;i<10;i++){
	arr[i] = outer(i);
};
for (j in arr){
    console.log( arr[j]() );
};
// 0,20,30.....180

```

