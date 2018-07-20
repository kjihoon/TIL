## Rails Simple WebSocket for Chatting (0720)

### https://pusher.com/



```ruby
# in Gemfile
...
gem "figaro"
gem "devise"
gem "pusher"
...
```

```cmd
$ bundle install
$ figaro install
$ rails g devise:install
$ rails g devise users
```





#### 채팅: model

- 채팅방: 채팅내용(1:N)

  ```cmd
  $ rails g scaffold chat_room title master_id max_count:integer admission_count:integer 
  $ rails g model chat user:references chat_room:references message:text
  ```

- 채팅방: 사람(M:N)

  ```cmd
  $ rails g model admission user:references chat_room:references
  ```



#### admission_count 디폴트 값 추가

```ruby
# db/mirgrate/xxxxx.create_chat_rooms.rb

class CreateChatRooms < ActiveRecord::Migration
  def change
    create_table :chat_rooms do |t|
      t.string :title
      t.string :master_id
      t.integer :max_count
      t.integer :admission_count, default: 0

      t.timestamps null: false
    end
  end
end
```

```cmd
$ rake db:migrate
```



#### 관계설정

```ruby
# model/chat_room.rb
class ChatRoom < ActiveRecord::Base
 
  # chat 1:N
  has_many :chats
  
  # user M:N, admission
  has_many :users, through: :admission
  has_many :admission
end
```

```ruby
# model/user.rb
class User < ActiveRecord::Base
  # Include default devise modules. Others available are:
  # :confirmable, :lockable, :timeoutable and :omniauthable
  devise :database_authenticatable, :registerable,
         :recoverable, :rememberable, :trackable, :validatable
  
    #채팅이랑 1:N
  has_many :chats
  
    #채팅방이랑 M:N
  has_many :admission
  has_many :chat_rooms, through: :admission
end
```

```ruby
# model/admission.rb
class Admission < ActiveRecord::Base
  belongs_to :user
  belongs_to :chat_room, count_cache: true
end
```



#### Pusher API 설정

![1532051234797](C:\Users\wlwl0\AppData\Local\Temp\1532051234797.png)

```ruby
# config/application.yml
pusher_app_id: '563863'
pusher_key: '2972102a18065275cb51'
pusher_secret: 'c6862b088db977d83ae2'
pusher_cluster: 'ap1'
```

```ruby
# config/initializers/pusher.rb
require 'pusher'

Pusher.app_id = ENV['pusher_app_id']
Pusher.key = ENV['pusher_key']
Pusher.secret = ENV['pusher_secret']
Pusher.cluster = ENV['pusher_cluster']
Pusher.logger = Rails.logger
Pusher.encrypted = true
```

