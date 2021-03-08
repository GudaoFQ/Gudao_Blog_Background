# 开发说明

## 开发规范
### 返回信息规范
> 阅读`src/main/java/com/gudao/blog/utils/result/ResultResponse.java`实体类，错误信息全部在`src/main/java/com/gudao/blog/utils/result/ResponseEnum.java`中创建，不要在自己业务逻辑中临时定义状态值和返回信息

### generator使用说明
> 此项目已经集成`mybatis-generator`,配置类中修改