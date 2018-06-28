## jQuery(0628)

```javascript
var scriptJ = document.createElement("script")
scriptJ
//=> <script></script>
scriptJ.src="https://code.jquery.com/jquery-3.3.1.js"
document.head.appendChild(scriptJ) // head 태그내에 script 태그(jquery 추가됨) 추가 
jQuery
```

```javascript
$("tagName") //해당 태그 Dom
$(".className") //해당 클래스 Dom
$("#idName") //해당 id Dom
$("[attributeName]") //해당 attribute Dom
$("[attributeName=='...']")
$("tagName[attributeName=='...']") // 조합 가능
```



- 주의점

```javascript
$("div < li")
$("div li")
// <가 있고 없고 차이는 바로 아래 자식 태그 접근이냐 자손태그 접근이냐의 차이!
```

```javascript
//jquery Dom index 접근 방법
$(".class").first()
```

