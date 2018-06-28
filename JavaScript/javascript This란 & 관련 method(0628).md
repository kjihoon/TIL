## This(0628)



#### this in function

```javascript
//1. function 내에서 사용되는 this

var globalThis = null;
function this1(){
    globalThis = this; // 브라우저가 this * window -> 현재 코드가 실행되는 브라우저의 창을 의미
}
this1()
globalThis
```



#### this in method

```javascript
//2. method 내에서 사용되는 this =>  메소드를 사용하는 객체가 의미됨

var obj = {
    p1: 'property',
    m1: this1   //위에서 선언한 this1 function
}

obj.m1()

//2-1.
var obj2 = {
    p2: 1,
    m2: function(){
        console.log(this.p2)
    }
}

obj2.method(); //console에 찍히는 값은 1, this.p2 == 0bj2.p2
```



#### 생성자 내에서 this

``` javascript
//3. 생성자 내에서 사용되는 this

function Person(name){ //생성자함수, class와 같은 역할을 함
    this.name = name; //this => 생성된 객체를 의미함
}
var person = new Person('jihoon'); //this == person
//person == {name: "jihoon"}

person.name //

//3-1.    
function this1(){
    globalThis = this; 
}
var obj1 = new this1(); // obj1 == globalThis
globalThis // => obj1 
```



### This와 관련된 method



###### 1. call()

`call(this, ...) //function 내  this에 값 전달`   

```javascript
//1. 
function Person(name){ 
    this.name = name;
}
var person1 = new Person('jihoon');

var person2 = {};
Person.call(person2,"jihoon"); //call(this, arg)
// Pserson 함수를 호출해서 첫번째 인자에 그 호출함수의 인자를 넣겠다.
//person2 == pserson1


//2.
function Pserson2(name,age){
    this.name = name;
    this.age = age;
}
var person3 ={}
Person.call(person3,'jihoon',27)

//3. arg없는 function에 인자 전달 하기
var globalThis = null;
function testFunc(){
    globalThis = this;
}

var testVar =20;
testFunc.call(testVar)
```

###### 2. apply()

`apply(this,[...])`

````javascript
//call이랑 동일함, args 를 넣는 방식만 다름
Person.call(person,'jihoon',33) // , 구분 인자 전달

Pserson.apply(person,["jihoon",33]) // list index 순으로 적용
````

###### 3. bind()

`bind(this)`

```javascript
//bind(this에 해당하는 대상) & 함수가 실행되진 않음.
var globalThis = null;
function testFunc(a,b){
    globalThis = this;
    console.log(a+b);
};

// function에 bind(this)의 'this'를 function 내 this로 전달
// this에 해당하는 값을 지정만 해주고 끝
var bindedFunc = testFunc.bind(20)
globalThis
//=> Number {20}

// 아래 처럼 만들어줌
function bindedFunc(a,b){
   globalThis = 20;
    console.log(a+b);
}
```

- `call`, `apply`는 this와 함께 args를 넣어 함수 실행
- `bind`는 this만 선언하여 새로운 function 생성
- this가 선언되지 않으면 this에 자동으로 window가 넣어짐