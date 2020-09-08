# Spring 整合 KafKa Zookeeper 
#### 安装 Zookeeper Kafka
kafka（kafka_2.12-2.1.0.tgz (asc, sha512)）下载地址 `http://kafka.apache.org/downloads.html`    
注意kafka自带zookeeper    
启动zookeeper服务    
kafka_2.12-2.1.0\bin\windows 目录下执行      
```
zookeeper-server-start.bat ..\..\config\zookeeper.properties    
```
启动kafka服务    
kafka_2.12-2.1.0\bin\windows 目录下执行      
```
kafka-server-start.bat ..\..\config\server.properties    
```
#### 启动生产者和消费者程序  
SprProviderApplication      
SprConsumerApplication    
  
#### 访问测试URL,并查看日志
http://127.0.0.1:8081/orderBill?name=zzzzzz  

