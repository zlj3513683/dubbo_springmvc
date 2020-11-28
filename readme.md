#操作说明
###1.启动zookeeper
>下载zookeeper压缩包并解压；(https://zookeeper.apache.org/releases.html)
>进入conf目录将 zoo_sample.cfg 改名为 zoo.cfg；
>进入bin目录双击zkServer.cmd，若启动成功，则windows单机版zookeeper搭建成功！
###2.启动ProviderTest
>运行main方法，console打印出 Dubbo provider start...
###3.启动ConsumerTest
>运行main方法，console打印出 provider hello哈哈哈  成功
###4.再创建一个provider和一个consumer
>注意两个provider的<dubbo:protocol name="dubbo" port="20880" /><dubbo:protocol name="dubbo" port="20881" />端口配置不一样
>然后可以无限的扩展服务方和消费方，服务方的调用实现负载均衡
