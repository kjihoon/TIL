## Javascript 주의할점 [Hoisting] 예제



### 예제1

```javascript
//실제 코드

console.log(i);
var i = 0;

func();

function func(){
    console.log("func!!");
}
```

```javascript
//변수 호이스팅으로 변수와 함수가 먼저 메모리에 할당된다.

function func(){
    console.log("func!!");
}

var i;
console.log(i);    //undefined
i=0;
func();           //func!!
```



### 예제2

```javascript
//실제 코드
var i = 0;
function func2(){
    console.log(i);
    var i = 10;
}

func2();   //=> undefined
```

```
//변수 호이스팅으로 변수와 함수가 먼저 메모리에 할당된다.
var i = 0;
function func2(){
    var i;
    console.log(i);
    i = 10;
}

func2();   //=> undefined
```



### 예제3

```
//실제 코드
var language  = 'java';
function checkScript(script){
    if(script){
        var language = "ruby";
        console.log(language);
    }else{
        console.log(language);
    }
}

checkScript(true);    //ruby
chechScript(false);    //undefined
```

```javascript
//변수 호이스팅으로 변수와 함수가 먼저 메모리에 할당된다.

var language  = 'java';

function checkScript(script){
    var language;
    if(script){
        language = "ruby";
        console.log(language);
    }else{
        console.log(language);
    }
}

checkScript(true);    //ruby
chechScript(false);    //undefined
//해결책 - 1
var language  = 'java';

function checkScript(script){
    if(script){
        language = "ruby";
        console.log(language);
    }else{
        console.log(language);
    }
}

checkScript(true);    //ruby
chechScript(false);    //undefined
//해결책 - 2
var language  = 'java';

function checkScript(script){
    if(script){
        let language = "ruby";
        console.log(language);
    }else{
        console.log(language);
    }
}

checkScript(true);    //ruby
chechScript(false);    //undefined
```



### 예제 4

```javascript
//해결책 - 2
var language  = 'java';

function checkScript(script){
    if(script){
        let language = "ruby";
        console.log(language);
    }else{
        console.log(language);
    }
}

checkScript(true);    //ruby
chechScript(false);    //java //let으로 선언하면 변수 hoisting 적용 x
```



#### 



