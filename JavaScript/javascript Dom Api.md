## JavaScript Dom API

#### Object Model

- 웹브라우저의 구성요소들은 하나하나가 객체화 되어있다. 자바 스크립트로 이 객체를 제어해서 웹브라우저를 제어할 수 있게 된다. 이 객체들은 서로 계층적인 관계로 구조화되어 있다. BOM 과 DOM 은 이 구조를 구성하고 있는 가장 큰 틀의 분류라고 할 수 있다.

   

#### Element 

- 식별자 API

  - Element.tagName  => 해당 엘리먼트의 태그이름을 알아냄. 태그이름 변경은 불가능

  - Element.id => 문서전체에서 한번만 등장하는 식별자

    ~~~html
    <script>
    var active = document.getElementById('active');
    console.log(active.id);  // => active
    active.id = 'deactive';
    console.log(active.id); // => deactive
    </script>
    ~~~

  - Element.className

  - Element.classList

    ~~~html
    <li id = "active" class="marked current">JavaScript</li>
    
    <script>
    var active = document.getElementById('active');
    active.classList[0];  //=> "marked"
    active.classList[1];  //=> "current"
    active.classList.length;  //=>2
    
    active.classList.add('important');
    active.classList.remove('important');
    active.classList.toggle('important'); //실행할때마다 important클래스가 없으면 add, 
                                          //있으면 remove
    </script>
    ~~~




- 조회 API

  - document 객체는 문서 전체를 의미하는 엘리먼트이기 때문에 document의 조회 메소드는 문서 전체를 대상으로 엘리먼트를 조회한다. Element 객체 역시도 getElementsBy* 엘리먼트를 가지고 있는데 Element 객체의 조회 메소드는 해당 엘리먼트의 하위 엘리먼트를 대상으로 조회를 수행한다.



- 속성 API

  - Element.getAttribute(name);

  - Element.setAttribute(name, value);

  - Element.removeAttribute(name);

  - Element.has Attribute(name)     => 해당 이름의 속성이  있으면 true , 없으면 false

    

- 속성과 프로퍼티

  - setAttribute('class','important')와 className = 'important'는 같은 결과를 만든다. 하지만 전자는 attribute(속성) 방식이고 후자는 property 방식이다.  property 방식이 조금 더 간편하고 빠르지만, 실제 html 속성의 이름과 다른 이름을 갖는 경우가 있다.

  - class => className

    Rowspan = > rowSpan

    maxlength => maxLength 등등



#### jQuery 속성 제어 API

- .attr

  ~~~html
  <a id="target" href = "https://www.naver.com/"> naver </a>
  
  <script>
      var t = $('#target');
      console.log(t.attr('href'));   //get
      t.attr('title','https://www.google.com/');   //set
      t.removeAttr('title')  //title 속성 제거
  </script>
  ~~~

  

#### jQuery 조회 범위 제한

- 자바스크립트에서 document 객체는 문서 전체를 의미하는 엘리먼트이기 때문에 document의 조회 메소드는 문서 전체를 대상으로 엘리먼트를 조회한다. Element 객체 역시도 getElementsBy* 엘리먼트를 가지고 있는데 Element 객체의 조회 메소드는 해당 엘리먼트의 하위 엘리먼트를 대상으로 조회를 수행한다.  그렇다면 jQuery 에서의 조회 범위를 제한하는 방법은?

  ~~~html
  <ul>
      <li class="marked">html</li>
      <li>css</li>
      <li id ="active">JavaScript
          <ul>
              <li>JavaScript Core</li>
              <li class="marked"></li>
              <li class="marked"></li>
          </ul>
      </li>   
  </ul>
  
  <script>   //#active 하위의 .marked만 선택하고자 할때 
      $(".marked","#active").css("backgrond-color","red");
      $("#active .marked").css("backgrond-color","red");
      $("#active").find(".marked").css("backgrond-color","red");
      
      $("#active").css("color","blue").find(".marked").css("backgrond-color","red");
      //이렇게 할 경우 #active하위의 모든 폰트색은 파란색으로 변하고, 하위 엘리먼트 중 .marked는 
      //배경색도 빨간색으로 변한다
  </script>
  ~~~

  

#### Node 객체

