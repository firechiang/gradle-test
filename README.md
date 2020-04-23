#### [一、Windows 开发环境搭建以及工程创建](https://github.com/firechiang/gradle-test/blob/master/docs/index.md)
#### [二、Gradle 构建的生命周期以及流程监听](https://github.com/firechiang/gradle-test/blob/master/docs/lifecycle.md)
#### [三、Gradle 定义扩展属性（可以直接使用 "this.属性名" 取值）](https://github.com/firechiang/gradle-test/blob/master/shell-gradles/config.gradle)
#### [四、Gradle Project 相关操作API（包含为所有模块或子模块配置公共属性和添加扩展）](https://github.com/firechiang/gradle-test/blob/master/shell-gradles/project_api.gradle)
#### [五、Gradle 文件操作相关操作API](https://github.com/firechiang/gradle-test/blob/master/shell-gradles/file_api.gradle)
#### [六、Gradle Buildscript相关API使用（包含指定依赖仓库）](https://github.com/firechiang/gradle-test/blob/master/shell-gradles/other_api.gradle)
#### [七、Gradle Task任务的定义](https://github.com/firechiang/gradle-test/blob/master/shell-gradles/task01.gradle)
#### [八、Gradle 指定Task任务的执行顺序](https://github.com/firechiang/gradle-test/blob/master/shell-gradles/task03.gradle)
#### [九、Gradle Task任务的输入输出（就是在task任务初始化的时候传入一些信息，供扩展程序使用）](https://github.com/firechiang/gradle-test/blob/master/shell-gradles/task04.gradle)
#### [十、Gradle 挂载Task任务到构建过程当中（注意：当前这个挂载方式是错误的，不能使用）](https://github.com/firechiang/gradle-test/blob/master/shell-gradles/task05.gradle)
#### [十一、Gradle 获取Build任务（这实际是一个计算Build时长的脚本）](https://github.com/firechiang/gradle-test/blob/master/shell-gradles/task02.gradle)
#### [十二、Gradle 执行本地系统的命令](https://github.com/firechiang/gradle-test/blob/master/shell-gradles/external_command.gradle)
#### [十三、Gradle gradle.properties配置文件里面定义的属性（所有的Gradle脚本里面都可以使用）](https://github.com/firechiang/gradle-test/blob/master/gradle.properties)
#### 十四、构建命令简单使用（注意：要定位到项目所在目录再执行）
```bash
$ gradle tasks                              # 查看构建过程中需要执行的任务
$ gradle projects                           # 查看项目的所有模块

$ gradle 'task名字'                          # 执行某个task
$ gradle task 'task名字'                     # 执行某个task

$ gradle assemble                           # 编译项目
$ gradle clean                              # 清理项目
$ gradle build                              # 构建打包项目
$ gradle test                               # 执行测试
$ gradle jar                                # 生成jar包

$ gradle clean build                        # 清理并构建项目
$ gradle clean build -x test                # 清理构建项目并跳过测试（注意：-x 表示指定要跳过的步骤）
$ gradle clean build --refresh-dependencies # 构建的时候它会下载所有依赖并加入到缓存中（其实就是将依赖放到gradle数据目录中的caches目录）

$ gradle init --type pom                    # maven项目转换为gradle项目
```