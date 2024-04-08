



[TOC]


# Markdown
**这样加粗；**  
换行就加俩空格；


# 环境信息

### 第一套环境（ctyunOS）

节点0：  
8.46.135.54  
节点1：  
8.46.135.53


### 阵列

8.46.203.102/104  
ibc_os_hs/Storage@21st


### 公用MySQL
8.46.208.33  
Huawei123@#  
```sql
mysql -uroot -S /home/innodb_data/mysql.sock -p222 
```
 


### 杨佳垲麒麟环境
杨佳垲给的环境：  
节点0	8.46.131.209	root	huawei@1234  
节点1	8.46.131.211	root	huawei@1234  
测试机1	8.46.130.113	root	huawei@1234  
阵列 8.46.132.132/133	admin	Admin@storage1  

物理拉起节点0的MySQL：  
```shell
su - cantiandba
export LD_LIBRARY_PATH=/opt/cantian/mysql/install/mysql/lib:/opt/cantian/image/cantian_connector/cantian-connector-mysql/daac_lib:$LD_LIBRARY_PATH
/opt/cantian/mysql/install/mysql/bin/mysqld --defaults-file=/opt/cantian/image/cantian_connector/cantian-connector-mysql/scripts/my.cnf --datadir=/mnt/dbdata/remote/metadata_metadata_fs2/node0 --plugin-dir=/opt/cantian/mysql/install/mysql/lib/plugin --early-plugin-load="ctc_ddl_rewriter=ha_ctc.so;ctc=ha_ctc.so;" --default-storage-engine=CTC --core-file >> /mnt/dbdata/remote/metadata_metadata_fs2/node0/mysql.log 2>&1 &

```
物理拉起节点1的MySQL：

```shell
su - cantiandba
export LD_LIBRARY_PATH=/opt/cantian/mysql/install/mysql/lib:/opt/cantian/image/cantian_connector/cantian-connector-mysql/daac_lib:$LD_LIBRARY_PATH
/opt/cantian/mysql/install/mysql/bin/mysqld --defaults-file=/opt/cantian/image/cantian_connector/cantian-connector-mysql/scripts/my.cnf --datadir=/mnt/dbdata/remote/metadata_metadata_fs2/node1 --plugin-dir=/opt/cantian/mysql/install/mysql/lib/plugin --early-plugin-load="ctc_ddl_rewriter=ha_ctc.so;ctc=ha_ctc.so;" --default-storage-engine=CTC --core-file >> /mnt/dbdata/remote/metadata_metadata_fs2/node1/mysql.log 2>&1 &
```

### 陶小霞麒麟环境
节点0：  
8.46.202.73  
节点1：  
8.46.202.75 1  

查看容器：
```sql
/root/k9s
```

进入MySQL：
```sql
mysql -uroot -pmysql@123 -h172.20.254.167
```

安装命令：
```shell
echo -e 'dbstor1\nhuawei@123\nhuawei@123\nhuawei@123\n123456' |sh -x /ctdb/cantian_install/cantian_connector/action/appctl.sh install /ctdb/cantian_install/cantian_connector/action/config_params.json
```



预埋数据1：
```shell
sysbench oltp_read_write --mysql-host=172.20.254.167 --mysql-port=3306 --mysql-user=root --mysql-password=mysql@123 --mysql-db=cz2 --tables=3 --table-size=100000 --threads=3 --mysql-storage-engine=ctc prepare

sysbench oltp_read_write --mysql-host=172.20.254.167 --mysql-port=3306 --mysql-user=root --mysql-password=mysql@123 --mysql-db=cz2 --tables=3 --table-size=100000 --threads=3 --mysql-storage-engine=ctc prewarm

sysbench oltp_read_write --mysql-host=172.20.254.167 --mysql-port=3306 --mysql-user=root --mysql-password=mysql@123 --mysql-db=cz2 --tables=3 --table-size=100000 --threads=3 --time=30000 --report-interval=1 run

```


预埋数据：
```shell
sysbench --db-driver=mysql --mysql-host=172.20.254.167 --mysql-port=3306 --mysql-db=cz2 --mysql-user=root --mysql-password=mysql@123 --table_size=100000 --tables=50 --threads=32 --events=0 --mysql_storage_engine=ctc --report-interval=1 --time=0 oltp_write_only prepare
```


连接6个实例：
```shell
nohup sysbench /home/sysbench-1.0.20/src/lua/oltp_write_only.lua --db-driver=mysql --mysql-host=172.20.254.167,172.20.254.164,172.20.254.165,172.20.250.98,172.20.250.94,172.20.250.93 --mysql-port=3306 --mysql-db=cz2 --mysql-user=root --mysql-password=mysql@123 --table_size=100000 --tables=50 --threads=32 --events=0 --mysql-ignore-errors=all --time=1209600 --percentile=95 --report-interval=1 --rand-type=uniform run > /tmp/sysbench_write_only_2024_0402.log 2>&1 &
```





# Cantian
重启cantian:  
```shell
reboot
```

查看cantian的版本信息：  
```shell
cat /opt/cantian/versions.yml
```

查看参天状态：  
```shell
su -s /bin/bash - cantian
cms stat
```

查看cantian拉起状态：
```shell
vim /mnt/dbdata/local/cantian/tmp/data/log/run/cantiand.rlog
```

**一定记得，重启以后，先stop两个节点，把节点0执行start以后再执行节点1的start。**  

Inactive：
```shell
[INFO ] ntp status is: inactive, chrony status is: inactive
ntp and chrony service is inactive, please active it before install
[ERROR] ntp and chrony service is inactive

systemctl restart chronyd
systemctl status chronyd
systemctl enable chronyd
```

**一定记得，重新安装的时候使用新的cluster_name。**  






# MySQL

查看当前MySQL引擎：  
```mysql
SHOW VARIABLES LIKE 'default_storage_engine';
```

设置引擎为Cantian引擎： 
```mysql
SET GLOBAL default_storage_engine=CTC;
```

查看当前编码方式：  
SHOW VARIABLES LIKE '%character_set%';

查看当前的触发器：  
SHOW TRIGGERS;

查看当前分区信息：  
SHOW CREATE TABLE table_name;

# Python

pip下载包：
```python
pip install toc -i http://cmc-cd-mirror.rnd.huawei.com/pypi/simple/ --trusted-host cmc-cd-mirror.rnd.huawei.com
```


隐藏属性：  
self.__name = name  
p.__name = 'riven' # 不生效  
p._Person__name = 'riven' # 访问隐藏属性的方式  

私有属性：  
p._name  # 一个下划线


```python
list_test = list(range(10))
r = filter(lambda i : i > 5, list_test)
r = map(lambda i : i ** 2, list_test)
list_test.sort(key = int)
sorted(list_test, key = int)
```

# 答辩

## 主题
| 日期范围 | 第一月主题  |
| ------------ | ------------ |
|  02.29-03.03 | 入职培训与考试  |
|  03.04-03.10 | Cantian安装部署升级  |
|  03.11-03.17 | Cantian规格测试  |
|  03.18-03.24 |  原生MySQL第三方对接部署升级 |
|03.25-03.31| 去NAS+麒麟数据库能力测试 |


## 第一次答辩
各位领导、评委以及导师下午好，我叫陈哲，我的入职时间是今年2.29，此次答辩是我的第一次工作答辩。
我将以工作概览、学习内容、工作输出和总结反思四个方面来进行此次答辩。

首先是工作概览，入职至今一共在岗21天，在入职的这四周里，我进行了多个主题的测试的尝试，第一周的主题是熟悉Cantian的安装部署与升级，第二周的主题是进行Cantian的规格测试，主要是一些MySQL特性，第三周是第三方对接的内容，主要是基于原生MySQL+NAS的Cantian部署升级，第三周遇到了两次较大的问题，第一次提交了问题单，第四周主要在进行去NAS的麒麟数据库能力测试。我的这四周工作的主要主题可以总结为两个，可靠性与可服务性。

第二个模块是学习内容，首先，我有每日工作之余加餐学习的习惯，每日坚持在ilearning上学习，入职至今，平均每日额外学习93分钟，主要的学习主题入职学习方面，如新员工上岗学习，计算机基础方面，如Python进阶与数据结构，数据库方面，比如Cantian的安装部署问题定位与MySQL架构以及常用语句。工作中我也有总结收获，比如Linux的结构与MySQL脚本的使用，右边是一些我平日里学习的笔记。

第三个模块是我的工作输出，我的工作输出主要有四个方面，Cantian环境搭建、MySQL测试脚本、提交问题单与手工测试执行通过用例。定量上看，我一共搭建cantian环境4套，MySQL测试脚本9个，提交问题单2个以及手工测试执行通过用例20个。
先说说cantian规格测试，我的工作中一共形成MySQL脚本9个，涵盖数据大小、分区数目、键以及触发器的内容，在这一块的工作里我有一些心得总结，第一是一定要和开发明确好规格的定义，比如上图，我把列数据大小理解错了，导致写入非常多的数据也没测出结果，与开发对了以后，发现是我把定义弄错了，本该将这个规格理解为列宽的，其次就是测试一定得给出具体的实际精确临界值，第三个，要确定好编码的方式，找到精确字节的字符，后续的测试工作就用它来展开，最后，要区分引用对象，不能用引用对象如BLOB来测试表格的真实大小。
下一个是手工测试执行，工作期间一共通过手工测试执行用例20个，主要涵盖可服务、可靠性与安装部署，这一块工作我也有一些总结心得，首先，针对不同的报错要形成文档，在定位问题的时候要做到迅速匹配，其次对于测试流程也要形成一份笔记，比如我在安装时会忘记修改cluster name，这得自己日常总结出来，第三个，遇到网络和配置问题，不理解的问题时，先执行，把效果执行出来以后，再去理解现象，不能一直卡在理解层面而丢弃了进度，最后就是不能害怕出错，对于测试的业务，我的理解就是应该找到尽可能多的bug，然后召集一切力量解决它们。
最后一个是提问题单，工作期间一共提交问题单2个，主题分别为离线升级commit失败与cantian启动出错，第一个问题单是在第三方对接任务里，cantian引擎离线升级的提交失败，报错提出是删除快照失败，我之前没碰到过类似的报错，于是找到开发一起定位，于是后来发现是去NAS适配遗漏的问题，导致快照删除失败，开发便在此基础上添加了NAS部署场景判定条件，添加这个条件以后，升级便不需要回滚快照，这个问题单的启发就是报错以后，自己最多复盘三遍操作问题，然后及时找到开发来解决问题。
第二个问题单是关于cantian启动的报错，也是第三方对接上，启动过程报错，但是查询日志没有看到明显的问题，指导人便带着我一起找到开发来定位，最终发现是配置文件的redo_num错了，而未在我的安装过程进行提示，所以这个问题单也启发我，不能过于纠结自己的配置问题，测试应当把自己当作用户，出现了问题立马找到供应方，看是否出现了类似的隐藏错误而未进行报错提示的问题。

最后一个模块是总结反思，在工作中我发现我有一定的优势与需要改进的不足，优势比如我有一定的主见，遇到工作、业务与个人发展问题都会及时向领导以及指导人提出，可以拿定自己的观点，其次就是较好的沟通能力，对于不熟悉的模块，可以做到有耐心有分析地进行沟通，与开发和指导人及时交流，第三就是肯动手，不会干看着问题，一直坚信正确的经验一定是实践出来的。不足上，比如大局观，暂未形成对产品、产品线、用户需求的大局观，这需要在后续工作学习里进行补充，其次就是容易过度深究问题，爱问十万个为什么，这方面有好处，但时常把控不好度，容易影响业务进度。

最后是学习规划，业务能力提升上我的计划是要形成安装部署问题定位的一篇字典型笔记，对于存储的相关知识，要形成一篇文档，或是树状图，形成自己的大局观。其次是网络相关知识，我的计划是在实战中遇到的网络问题一定要及时记录，比如服务器、网卡、网络、存储相关的网络问题，记录好，并发表博客，第三是可信认证，争取一个月内把科目一的专业级通过了，最后是python的能力提升，通过学习python官方文档来提升，并形成自己的笔记和博客，我希望先把当前对于分布式数据库和数据库引擎知识图谱形成，打好基础，有机会可以往开发去靠。

以上就是全部内容，感谢我的导师彭涵，感谢各位领导、评委与指导我的人

1. 文档一定写出来成为成品；
2. 工作的意义，Cantian的意义，国内首发
3. 提单数+代码量
