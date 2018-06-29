## Rails Ajax(Asynchronous Javascipt And Xml)

- 비동기 자바스크립트 xml형태로 data가 오감
- 현재는 json, text등 다양한 형태의 data 송수신 가능



### (Rails)글 생성시 ajax 

1. `erb` `data-remote = true`

```erb
<form action="/posts/<%= @post.id%>/comments" method="post" data-remote=true >
  <input type="text" name="content" /><br />
  <input type="hidden" name="authenticity_token" value="<%= form_authenticity_token %>">
  <input  type="submit" />
</form>
```

2. `CommentsController` => create action

```ruby
#CommentsController
  def create
    @comment = Post.find(params[:post_id]).comments.new(comment_params)
    @comment.user_id = current_user.id
    if  @comment.save
      respond_to do |format| #요청에 따라 html.erb 와 js.erb로 이동
        format.html {redirect_to :back}
        format.js {render 'create_temp'}
      end
    else
      redirect_to :back
    end
  end
```

3.`create_temp.js.erb` 작성 (escapte_javascript의 약어는 j)

```javascript
$("div#comments").append("<p><%= escape_javascript(@comment.content) %><%= escape_javascript(link_to '삭제하기', destroy_comment_path(@comment.id), method: :delete, remote: true, class: 'delete_comment') %></p><hr/>");
```

4. `show.html.erb`파일에 ajax결과에 따른 event handler 작성

```javascript
<script>
$('form').on('ajax:success',function(){
    $('input[name="content"]').val("");
})
</script>
```





### (Rails)글 삭제시 ajax

1. `remote: true`

 ```javascript
<%= link_to '삭제하기', destroy_comment_path(comment.id),remote: true,method: :delete, class:"delete_comment"%>
 ```

2. `CommentsController` => destroy action

```ruby
def destroy
    @comment = Comment.find(params[:comment_id])
    @comment.destroy
    puts "삭제"
    respond_to do |format|
      format.html {redirect_to :back}
      format.js {}
    end
  end
```

3, `destroy.js.erb`작성

```javascript
<script>
    var parent = $('a[href="/comments/<%= params[:comment_id]%>"]').parent();
    var hr = parent.next();
    parent.remove();
    hr.remove();
</script>
```





### (General) JQuery로 ajax 구현

#### 글 생성

1. erb

```erb
<form action="/posts/<%= @post.id%>/comments" method="post">
  <input type="text" name="content" /><br />
  <input type="hidden" name="authenticity_token" value="<%= form_authenticity_token %>">
  <input  type="submit" />
</form>
```

2.  javascript

```javascript
$('input[type=submit]').click(function(e){
  e.preventDefault();
  //alert('start')
  $.ajax({
    url:$('form').attr('action'),
    type:'POST',
    data:{content: $('input[name="content"]').val(),
          authenticity_token: $('[name="csrf-token"]').attr('content')
    },
    //dataType: 'script',
    success: function(){
      $('input[name="content"]').val("");
    },
    error: function(){
      alert('fail')
    }
  })
})
```



3. 이후 rails의 ajax 구현 순서와 동일



#### 글 삭제

1. erb

```erb
<%= link_to '삭제하기', destroy_comment_path(comment.id),class:"delete_comment"%>
<!--method: :delete를 넣으면 e.preventDefault()가 작동을 안함-->
```

2. javascript

```javascript
$('.delete_comment').click(function(e){
  e.preventDefault();
  //alert("start delete")
  $.ajax({
    url:this.href,
    type:'DELETE',
    data:  {authenticity_token: $('[name="csrf-token"]').attr('content')
        },
    dataType:'script',
    success:function(){},
    error:function(){alert("fail")}
  })
})
```

3. 이후 rails의 ajax 구현 방식과 동일