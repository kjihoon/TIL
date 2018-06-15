# Ruby

#### 0. 개요

1. 루비는 순수 객체 지향 언어이다
2. 모든것이 객체
3. Ruby on Rails 프레임워크 등장으로 유명해짐



#### 1. puts vs print 

~~~ruby
3.time {print "hello"}  # => hellohellohello
3.time {puts "hello"}   # => hello
                        # => hello
                        # => hello
~~~

> puts는 개행문자 포함



#### 2. p vs puts

~~~ruby
string = "hello"
puts string    # hello => null
p string       # "hello" => "hello"
~~~



#### 3. Naming conventions

- 변수
  - snake_case
- 상수
  - CONSTANT
- 클래스
  - CamelCase



#### 4. pry

- 설치
  - `gem install pry`
- 실행
  - `pry`



#### 5. inline statement 

~~~ruby
#if문
a = 0
puts "a=0" if a == 0  # "a=0"
puts "a=0" if a == 1  # 출력안됨   오른쪽 조건문이 참이면 왼쪽에 명령 실행

#while문
c = 0
result = c+=2 while c<50
puts result     
   
puts "hi" if 0 # "hi"  => 0은 true 
~~~



#### 6. case

~~~ruby
name = "dahye"
case name
when "dahye" then puts "hi dahye"  
when "duohui" then puts "hi duohui"                                                                                                        
else puts "hi"  
end   
    
# => hi dahye
~~~



#### 7. method

- 대부분의 언어

  - 클래스 밖 : function
  - 클래스 안 : method

- 루비에서는 모든 function은 method

- ~~~ruby
  #루비에서의 메서드 선언
  [2] pry(main)> def simple                                                                                                                                      
  [2] pry(main)*   puts "simple"
  [2] pry(main)* end  
  => :simple
  => nil
  
  #괄호를 쓰기도 한다
  [4] pry(main)> def asdf()
  [4] pry(main)*   puts "simple"
  [4] pry(main)* end 
  simple
  => nil
  ~~~

- ~~~ruby
  #루비에서는 리턴이 없을 때 마지막 연산 값을 return 
  
  #return을 선택적으로 사용할 수 있습니다
  [14] pry(main)> def divide(a,b)
  [14] pry(main)*   return "I don't think so" if b==0
  [14] pry(main)*   a/b
  [14] pry(main)* end  
  ~~~

  

- 기본 매개변수

- ~~~ruby
  def factorial(n)
      n ==0 ? 1 : n*factorial(n-1)
  end
  
  # => factorial(3) 매개변수의 값을 넣어줘야함
  
  def factorial(n=5)
      n ==0 ? 1 : n*factorial(n-1)
  end
  
  # => 5가 디폴트값으로 들어가서 factorial만써서 호출 가능
  ~~~

- 



#### 8. block

~~~ruby
3.times do |asdf|
 puts asdf
end
~~~

~~~ruby
def hihi
    return "no block" unless block_given?
    yield
end  

hihi # => "No Block"
hihi {puts "hihi"} #hihi
~~~



#### 9. stirng

~~~ruby
a = "안녕하세요.\n 멋사입니다."
#=> "안녕하세요.\n 멋사입니다."
b = '안녕하세요. \n 멋사입니다.'              
#=> "안녕하세요. \\n 멋사입니다."
puts a
#안녕하세요.
# 멋사입니다.

puts b
#안녕하세요. \n 멋사입니다.

name = "5chang2"
a = "#{name}님 안녕하세요"                    
# => "5chang2님 안녕하세요"
b = '#{name}님 안녕하세요'                    
# => "\#{name}님 안녕하세요"
~~~

~~~
my_name = "dahye"
my_name.upcase # => "DAHYE"
my_name # => "dahye"
my_name.upcase! # => "DAHYE"
my_name # => "DAHYE"
~~~



#### 10. hash

- key, value 로 이루어져 있다

- ~~~ruby
  hash = {:key => value}
  hash2 = {key: value}
  hash3 = {"key" => value}
  ~~~

  ~~~
  hash1.each do |k,v|   
      # k, v 는 어떠한 문자로 적어도 됩니다.
  	puts "#{k} : #{v}"
  end  
  ~~~



#### 11. Ruby on Rails

- [Go Rails](https://gorails.com/setup/osx/10.13-high-sierra)







