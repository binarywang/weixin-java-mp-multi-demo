[![Build Status](https://travis-ci.org/binarywang/weixin-java-mp-multi-demo.svg?branch=master)](https://travis-ci.org/binarywang/weixin-java-mp-multi-demo)
### 本项目为WxJava的Demo演示程序，更多Demo请查阅：https://github.com/Wechat-Group/WxJava

#### 本Demo使用Spring MVC 框架实现微信公众号开发功能，支持多公众号，欢迎帮忙维护添加新功能，或提供更好的实现。
1. 如果想使用更多公众号，请复制相关配置文件，修改spring配置文件添加相应配置，同时还需要增加相应的controller和service，具体可以参考已有源码进行操作。
1. 如果只是使用一个公众号，建议使用另外的项目：
https://github.com/binarywang/weixin-java-mp-demo-springmvc 或者 https://github.com/binarywang/weixin-java-mp-demo-springboot 。

## 使用步骤：
1. 配置:
	1. 复制/src/main/resources/wx-gzh1.properties.template 生成wx-gzh1.properties 文件，填写相关配置;
	2. 复制/src/main/resources/wx-gzh2.properties.template 生成wx-gzh2.properties 文件，填写相关配置。		
1. 使用maven运行demo程序: `mvn jetty:run`  或者自己打 war包发布到tomcat运行；
1. 配置微信公众号中的接口地址：http://xxx/api/gzh1/portal 或 http://xxx/api/gzh2/portal （注意XXX需要是外网可访问的域名，需要符合微信官方的要求）
1. 根据自己需要修改各个handler的实现，加入自己的业务逻辑
	
