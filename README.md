# JavaBasicsCode
学习Java的代码
> 记录初始化提交时报错 refusing to merge unrelated histories
  
  这是因为远程仓库已经存在代码记录了，并且那部分代码没有和本地仓库进行关联，我们可以使用如下操作允许pull未关联的远程仓库旧代码：
  
```git
  git pull origin master --allow-unrelated-histories
```
 
 ##### IntelliJ IDEA 的 .idea 目录加入.gitignore无效的解决方法
     无效的原因是：对应的目录或者文件已经被git跟踪，此时再加入.gitignore后就无效了，
     解决办法：
     先执行
     [文件夹]  git rm -r --cached .idea
      
     再重新加入.gitignore文件