# 협업

보통 Fork and Merge 방식을 사용한다.
커밋 할 시에는 완전히 작동하는 코드만 올려야 한다.

## **순서** 
---
### **팀장**
1. organization 생성
2. issue template 생성
3. clone 후 git flow init
4. 대상파일 생성 후 origin develop으로 푸쉬
5. 팀원 초대
6. 팀원 역할 분배 후 수행
7. 팀원이 한 작업을 open pull request
8. 팀원이 작성한 코드 리뷰 후 코멘트
9. 팀원의 추가 작업 후 origin develop으로 푸쉬
10. Merge Conflict가 있다면 조직의 develop을 local로 pull하여 conflict 해결후 add, commit, push
11. Merge pull request
12. 다음은 까먹음..


----
### **팀원**
1. 팀장이 organization을 만들고 배포후 fork
2. 나의 repo 방문 전 내 할일 issue 등록
3. fork한 repo clone, git flow init
4. git flow feature start {브랜치}
5. 할 일 작성
6. git add, commit, push (처음 푸쉬할때는 -u 붙이기)
7. github 이동 후 pull requests
8. 팀장이 확인 후 코멘트
9. 코멘트 받은 것 보고 수정
10. 다시 반복


