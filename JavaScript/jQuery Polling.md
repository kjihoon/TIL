## jQuery Polling 

### (Long polling을 이용한 ajax 재귀호출 최적화)



###### Polling

- 통신에서, 폴링은 한 프로그램이나 장치에서 다른 프로그램이나 장치로부터 상태를 지속적으로 체크하는 전송제어 방식을 의미함
- `Dash Board` , `Status Bar`  등에 쓰이는 실시간 처리 방식
- 초기에는  `Auto Refresh`를 이용하여 구현 했지만 현재는 비동기 통신 `jQuery Ajax `을 통해 구현이 가능하다.



###### Tradintional Polling

```javascript
// setInterval()을 사용하여 ajax 재귀호출

setInterval(function(){ 
    $.ajax({ 
        url: "server", 
        dataType: "json",
        success: function(data){ 
        //Update your dashboard gauge 
        salesGauge.setValue(data.value); 
    } 
    }); 
}, 30000);
```

- `setInterval()` 을 사용한 polling 기법은 서버에서 응답하는 시간을 고려하지 못한다. 
- 위 코드를 토대로 시행시 서버가  30초안에 응답을 하지 못한다면 최악의 경우, `Ajax`   큐 배열이 모두 뻗을 가능성이 다분하다.

```javascript
// setTimeOut()을 사용하여 ajax 재귀 호출

(function poll(){ 
    setTimeout(function(){ 
        $.ajax({ 
            url: "server", 
            success: function(data){ 
                //Update your dashboard gauge
                salesGauge.setValue(data.value); 
                //Setup the next poll recursively 
                poll(); 
            }, dataType: "json"});
    }, 30000);
})();

```

- `setInterval()`과 비교하여 이는 재귀 호출 과정에서 무슨일이 일어났는지 파악하기가 용이하다.

- jQuery reference 발췌

  ```
  As you can see, jQuery's Ajax call can take as long as it wants to. So, this pattern doesn't guarantee execution on a fixed interval per se. But, it doesn't guarantee that the previous interval has completed before the next interval is called.
  ```



###### Long Polling - An Efficient Server-Push Technique 

```javascript
(function poll(){ 
    $.ajax({ 
        url: "server",
        success: function(data){ 
            //Update your dashboard gauge
            salesGauge.setValue(data.value);
        }, 
        dataType: "json",
        complete: poll,// poll() 재귀호출
        timeout: 30000 
    }); 
})();

```

- 서버와 접속을 열어둔 상태를 유지하여 요청을 처리할 수 있게된다.

- 요청이 없을 시 서버 자원을 거의 먹지 않는다.

- jQuery Reference 발췌

  ```
  Applications built with Long Polling in mind attempt to offer realtime interaction, using a persistent or long-lasting HTTP connection between the server and the client.
  
  The self executing JavaScript poll function combined jQuery Ajax's repeating timeout interval means this is a very efficient server-push technique.
  
  ```

