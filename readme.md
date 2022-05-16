bug修复：
sql是8.0版本，必须使用8版本的jar包驱动，
driver修改成：
com.mysql.cj.jdbc.Driver
url修改成：
url="jdbc:mysql://127.0.0.1:3306/zhang?useUnicode=true
&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true
&serverTimezone=Asia/Shanghai";
（git 技巧，当本地仓库不存在远程仓库分支时，无法完成推送，需要本地新建跟分支后才能完成推送）

