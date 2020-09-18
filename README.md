# JavaBasicsCode
学习Java的代码
> 记录初始化提交时报错 refusing to merge unrelated histories
  
  这是因为远程仓库已经存在代码记录了，并且那部分代码没有和本地仓库进行关联，我们可以使用如下操作允许pull未关联的远程仓库旧代码：
  
```git
  git pull origin master --allow-unrelated-histories
```
 