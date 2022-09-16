## Rename
 - Worst <br>
 ` $ mv server.py main.py` -> deleted, new file
 
 - Best<br>
 -` $ git my server.py main.py` -> renamed
 
 **파일의 history를 남기기 위해서는 삭제 후 생성이 아닌 이름바꾸기로 추적**
 
 
 ## Undoing
 
 ` $ git checkout --.`  or ` $ git checkout -- {filename}`
 
 ## unstaging 
  **스테이징 올린거 되돌리기(add 까지 되었을 때)** <br>
` $ git reset HEAD {filename}`

 ## Unstaging and Remove
 
 ` $ git rm -f {filename}`
 
 ## Edit latest commit
 
 ` $ git commit --amend`
 
 ## Edit prior commit
 
 ` $ git rebase -i <commit>
 
 ## abort rebase
 
 ` $ git rebase --abort`
 
 ## Complete rebase
 
 ` $ git rebase --continue`
 
 git a. 은 현재 모든파일 돌리기(습관 되면 안된다. 하나하나 작업하는게 좋다) <br>
 이 모든 행동은 push 하기 전까지만 가능하다. <br>
 push는 가능한 많이 하지 않도록 하자. <br>
