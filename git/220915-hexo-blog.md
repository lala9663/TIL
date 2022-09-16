## 순서에 따른 hexo 블로그 만들고 게시물 작성하는 법

  hexo라는 툴을 npm을 이용해서 설치할것인데 npm을 가장 빠르게 설치하는 방법이 node를 설치하는 것이기 때문에 node를 설치
 
 1. nodejs.org에 들어가 LTS 다운 (최신버전은 안정적이지 않을 수 있으므로)
 2. 터미널에서 node -v 과 npm -v 으로 버전 확인하기
 3. npm install -g hexo-cli
 4. (원하는 곳에) hexo init {이름-blog} 
 5. cd {이름-blog}
    ls를 해보면 여러가지가 나오는데 package.json 이건 Node.js라는 언어를 가지고 움직이기 때문에 중요한 역할을 한다.<br>
    그리고 _config.yml은 블로그의 환경을 설정하는 곳이다. 
 6. npm install (빠진 패키지 설치)
 7. hexo new post "{글의제목 영어로 }"
 8. vi source/_posts/My-first-post.md<br>
    title, date, tags 선 아래부터 글 작성
 9. hexo generate <br>
    1세대 static이기 때문에 한개의 컨텐츠를 만들기 위해선 하나의 페이지 가 필요하다. 그걸 끼워맞추는 행동이 generate이다. 
 10. hexo server<br>
  **블로그 첫 포스팅 완료**
 11. hexo deploy (push와 같은 개념)  
 
 
 ## 다른 사람들도 이 블로그를 볼 수 있게 하는 법
 
  1. github에 들어가 새로 repo를 만든다
  2. repo 이름은 꼭 **내 아이디.github.io** 로 설정한다고 create repo
  3. mpn install hexo-deployer-git --save
  
  ## 블로그 환경 설정
  
  1. vi _config.yml
  2. title, author 설정하기 language는 테마에 지원안하는 언어가 있기때문에 확인하고 바꾸기
  3. url 설정하기 **https:// 내주소** 여기서 https로 해야 하는 것 주의하기
  4. 아래에 있는 theme 원하는 테마에 맞춰 변경
  5. hexo clean && generate 
