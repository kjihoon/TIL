## Heroku Deploy (헤로쿠 배포)

```cmd
$ heroku login
Email: kjihoon0914@naver.com
Password: **********
Logged in as kjihoon0914@naver.com
$ heroku create ApplicationName
```



```ruby
#In Gemfile

ruby '2.3.5' # heroku에서 지원하는 ruby랑 버전이 다르기때문에
#gem 'sqlite' 수정 
gem 'sqlite3', :group => :development
gem 'pg', :group => :production
gem 'rails_12factor', :group => :production
```

`$ bundle install`



```ruby
# /config/database.yml파일 수정

# 변경전
# production:
#   <<: *default
#   database: db/production.sqlite3

# 변경후  
production:
  <<: *default
  adapter: postgresql
  encoding: unicode
```

```cmd
$ git init
$ git add .
$ git commit -m "first deploy"
$ git push heroku master
```

