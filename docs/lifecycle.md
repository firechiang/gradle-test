#### 一、生命周期流程图
![object](https://github.com/firechiang/gradle-test/blob/master/images/lifecycle01.svg)
```bash
// 在初始化后解析构建Pobject对象阶段之前执行（生命周期相关: https://github.com/firechiang/gradle-test/blob/master/docs/lifecycle.md）
this.gradle.beforeProject {
    gras ->
        println "测试在初始化后解析构建Pobject对象阶段之前执行的监听"
}

// 在初始化后解析构建Pobject对象阶段之后执行（生命周期相关: https://github.com/firechiang/gradle-test/blob/master/docs/lifecycle.md）
this.gradle.afterProject {
    gras ->
        println "测试在初始化后解析构建Pobject对象阶段之后执行的监听"
}

// 在初始化后配置阶段之前执行（生命周期相关: https://github.com/firechiang/gradle-test/blob/master/docs/lifecycle.md）
this.beforeEvaluate {
    gras ->
        println "测试在初始化后配置阶段之前执行的监听"
}

// 在配置阶段之后执行阶段之前执行（生命周期相关: https://github.com/firechiang/gradle-test/blob/master/docs/lifecycle.md）
this.afterEvaluate {
    gras ->
        println "测试在配置阶段之后执行阶段之前执行的监听"
}

// 在整个生命周期完成以后执行（这个就是构建完成以后执行）
this.gradle.buildFinished {
    gras ->
        println "测试在整个生命周期完成以后执行的监听"
}
```