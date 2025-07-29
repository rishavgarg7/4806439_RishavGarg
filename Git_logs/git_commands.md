# Basic Commands

1. git status: Show the state of your working directory and staging area  
2. git diff: Show file differences not yet staged  
3. git add <file_path>: Add specific file(s) to the staging area  
4. git add . : Stage all changes in your working directory  
5. git reset <file_path>: Unstage a file from the staging area  
6. git commit -m "message": Commit staged changes with a message  
7. git commit -a -m "message": Commit all tracked changes (skips staging)  
8. git commit --amend: Modify the last commit (message or content)  

# Branching

9. git branch: List all local branches  
10. git branch branch_name: Create a new branch  
11. git branch -d branch_name: Delete a branch (safe)  
12. git branch -D branch_name: Force delete a branch  
13. git checkout branch_name: Switch to an existing branch  
14. git checkout -b branch_name: Create and switch to a new branch  
15. git switch branch_name: Alternative to checkout (simpler)  
16. git switch -c branch_name: Create and switch to a new branch  

# Remote Operations

17. git remote -v: Show remote repository URLs  
18. git remote add origin <url>: Add a remote repository  
19. git push origin branch_name: Push a local branch to remote  
20. git push -u origin branch_name: Push and set upstream tracking  
21. git pull: Fetch and merge changes from remote  
22. git fetch: Fetch changes from remote (no merge)  
23. git clone <repo_url>: Create a local copy of a remote repository  

# History & Inspection

24. git log: Show commit history  
25. git log --oneline: Show condensed commit history  
26. git log --stat: Show commit history with file change stats  
27. git show commit_id: Show details about a specific commit  
28. git blame <file>: Show who made changes line by line  

# Merging & Rebasing

29. git merge branch_name: Merge a branch into the current one  
30. git rebase branch_name: Reapply commits on top of another base  
31. git rebase -i HEAD~n: Interactively rebase last n commits  
32. git rebase --continue: Continue after resolving conflicts  
33. git rebase --abort: Abort the current rebase  
34. git rebase --skip: Skip a commit during rebase  
35. git cherry-pick commit_id: Apply changes from a specific commit  

# Undo & Cleanup

36. git reset HEAD~1: Undo last commit, keep changes locally  
37. git reset <file>: Unstage a file (keep changes)  
38. git reset --hard commit_id: Reset to a specific commit and delete uncommitted changes  
39. git revert commit_id: Create a new commit to reverse a previous one  

# Stashing

40. git stash: Temporarily save uncommitted changes  
41. git stash list: List all stashes  
42. git stash pop: Apply and remove last stash  
43. git stash apply: Apply last stash (keep stash)  
44. git stash drop: Delete a specific stash  

# Patch Files

45. git format-patch -1 commit_id: Create a patch file for a specific commit  
46. git apply patch_file_name: Apply changes from a patch file  

# Others

47. git config --global user.name "Your Name": Set global Git username  
48. git config --global user.email "you@example.com": Set global Git email  
49. git clean -fd: Remove untracked files and directories  
50. git tag: List tags  
51. git tag -a v1.0 -m "version 1.0": Create an annotated tag  
52. git reflog: Show the history of branch references (useful for recovery)  
