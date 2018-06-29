## jQuery Dom (Document Object Model) Handling(0629)

[JQueryUI](https://jqueryui.com/)

#### 1. `$('selector')` 접근방법

- `$('#idName')` => id 접근

- `$('.classNaem')` => class 접근

- `$('tagName')` => tag 접근

- `$('[attributeName]')` => attribute 접근

- `$('[attributeName="element"]')` => attribute 의  element와 동일한것에 접근

- `$('parent > child > grandchild')` => 부모요소안에 있는 자식요소(직접관계) 접근

-  `$('parent child grandchild')` => 부모요소안에 있는 자손요소(모든) 접근

  

##### 1-1)  주의점(jQuery Dom index 접근)

-  `$('selector')[index]` 접근은 jquery의 Dom 조작을 할 수가 없다
-  `$('selector').eq(index)` 접근이 jQuery의 Dom 조작이 가능하다
- `$('selector:eq(index)')` 접근도 가능

```javascript
$('span.an_icon:eq(4)').attr('style','display:none')
$('span.an_icon').eq(4).attr('style','display:none')
// 위 아래 둘 다 가능
//.attr('style','display:none') == .css('display:none')
```



##### 1-2)  추가 사용method

###### 1. text, html

- ` $('selector').html()`   // return html문서(tag까지 포함)

```javascript
$('a.an_a.mn_cafe').html()

// <a><span>카페</span></a>
```

- ` $('selector').text()`  // return text(오직  text만)

```javascript
$('a.an_a.mn_cafe').text()
// "카페"
```

- 값 전달도 가능

```javascript
$('a.an_a.mn_cafe').html("<a><span>식당</span></a>")
$('a.an_a.mn_cafe').text("식당")
```



###### 2. value

- `$('selector'),val()` //return value

```javascript
$('input#query').val()  //입력창에 입력한 텍스트 값을 불러옴

$('input#query').val("귀차나")  //입력창에 입력한 텍스트 값을 '귀차나'로 변경
```



###### 3. 선택자들 조합

- `$('a.class1.class2')`  // => class1과 class2를 가진 모든 a tag를 가져오줌
- ` $('a.an_a.mn_cafe')`

```javascript
$('[href].class1.class2')  // => class1과 class2를 가진 모든 a tag를 가져오줌
```



###### 4. find

```javascript
$('ul.an_l > li > a > span')
$('ul.an_l').find('span')
```



###### 5. first last prev next parent children

```javascript
$('selector').first() //첫번째 element 접근
$('selector').last() //마지막 element 접근
$('selector').prev() //이전 element 접근
$('selector').next() //다음 element 접근
$('selector').parent() //부모 element 접근
$('selector').children() //자식 element 접근
```

- 주의점

```javascript
$('selector').first().next() //$('selector')의 첫번째 요소 다음 두번째 요소를 접근하는게 아니라 $('selector').first()의 다음 요소(형제 관겨 요소) 접근
```



###### 6. append, prepend (자식요소에 **pend)

- prepend

```html
<!-- prepend 예시 -->
<ul>
	<li><li>
</ul>
```

```javascript
$('ul').prepend('<l1 class="new"></li>')
```

```html
<ul>
    <l1 class="new"></li>
	<li><li>
</ul>
```

- append

```html
<!-- append 예시 -->
<ul>
	<li><li>
</ul>
```

```javascript
$('ul').append('<l1 class="new"></li>')
```

```html
<ul>
	<li><li>
    <l1 class="new"></li>
</ul>
```



###### 7. before, after

- append, prepend와 다른점 : 다음요소에 붙히는가 자식관계 요소에 붙히는가

- before

```html
<!-- before 예시 -->
<ul>
	<li><li>
</ul>
```

```javascript
$('ul').before('<l1 class="new"></li>')
```

```html
<l1 class="new"></li>
<ul>
	<li><li>
</ul>
```

- after

```html
<!-- after 예시 -->
<ul>
	<li><li>
</ul>
```

```javascript
$('ul').after('<l1 class="new"></li>')
```

```html
<ul>
	<li><li>
</ul>
<l1 class="new"></li>
```



###### 7. remove hide show toggle

```javascript
$('selector').remove() // element 삭제
$('selector').hide() // element 숨김
$('selector').show() // element 보여줌
$('selector').toggle() // element가 숨겨져있으면 보여주고 보이는상태면 보여준다
```



###### 8. replaceWith

```javascript
$('selector').replaceWith(new_element) // => element가 new_element로 바뀜
//example
$('#search').replaceWith("<p id='search'>좋은 아침입니다.</p>")
```



###### 9. attr

```javascript
$('selector').attr("attribute") //해당 selector의 attribute 리턴

$('selector').attr("attribute","element") //해당 selector의 attribute에 element 삽입
```



###### 10. on  ( == addEventLinstener  * in Javascript) 

```javascript
$('selector').on('event',function(){}) //해당 selector에 event 발생시 function(){} 실행

$('parent_selector').on("event","child_selector",function(){}) // child에서 이벤트 발생시 parent에서 function(){} 실행

//ex
$('a').on('mouseover',function(){
    alert("Mouseover on a_tag?")
})
//위랑 같음
$('a').mouseover(function(){
    alert("Mouseover on a_tag?")
}) 
```

- 주의점

```javascript
$(document).on('mouseover',"a",function(){
    alert("hi")
})

$('a').mouseover(function(){
    alert("Mouseover on a_tag?")
})
```

