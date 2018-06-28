## Prototype(0628)

- 상속, class 변수를 정의하는 것과 유사한 역할을 함

```javascript
function Person(){
    this.purpose ="happiness";
}

function Adult(){
    this.age ="higher than 20";
}

function Child(){
    this.age ="lower than 20";
}

// Adult, Child 객체에 Person 객체의 변수 상속
Adult.prototype = new Person();
Child.prototype = new Person();
var a1 = new Adult();
a1.purpose;
//=> "happiness"
var c1 = new Child();
c1.purpose
//=> "happiness"

var p1 = new Person();
var p2 = new Person();
Person.prototype.name = "jihoon"
Person.prototype.printName = function(){ console.log(this.name) }

//1, prototype 을 통해 상속을 구현할 수 있다.
Child.prototype = new Person();

//2. Prototype을 통해 method와 property를 객체간에 공유할 수 있다.
Child.prototype.name = "jihoon"
var c1 = new Child()
var c2 = new Child()
c1.name == c2.name 


Child.prototype.name = "jihoon2"
c1.name 
```

