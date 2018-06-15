## intro - Sinatra

`mkdir sinatra-test`

`cd sinatra-test`

`touch app.rb`

`gem install sinatra`

~~~ruby
#app.rb
require 'sinatra'

get '/' do 
    "hello world welcome"
end
~~~

`ruby app.rb -o $IP`

