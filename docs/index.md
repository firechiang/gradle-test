#### 一、Windows开发环境搭建
```bash
$ https://services.gradle.org/distributions/gradle-6.3-bin.zip # 下载安装包并配置好环境变量
$ gradle -v                                                    # 查看gradle版本（验证gradle是否安装成功） 
```
#### 二、IDEA配置Gradle目录（注意：在创建工程之前配置，而且这个是Gradle的数据目录，非Gradle安装目录）
![image](https://github.com/firechiang/gradle-test/blob/master/images/gradle01.png)

#### 三、IDEA创建Gradle项目（注意：项目创建完成后，会自动下载一个默认的Gradle和构建（数据会在上面配置的那个目录里面），下载构建可能会有点慢，但是这个是必须的）
![image](https://github.com/firechiang/gradle-test/blob/master/images/gradle02.png)
![image](https://github.com/firechiang/gradle-test/blob/master/images/gradle03.png)
#### 四、IDEA为单个项目配置Gradle（注意：这个一般不配置，直接用默认下载的那个即可）
![image](https://github.com/firechiang/gradle-test/blob/master/images/gradle04.png)