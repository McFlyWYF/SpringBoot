## SpringBoot

### Controller的使用

* @PathVariable 获取url中的数据
* @RequestParam 获取请求参数的值
* @GetMapping 组合注解

### 数据库操作

* GET		/girls	获取列表

* POST      /girls        创建一个女生

* GET         /girls/id      通过id查询一个女生

* PUT        /girls/id       通过id更新一个女生

* DELETE    /girls/id     通过id删除一个女生

  ![1539070413443](C:\Users\16500\AppData\Local\Temp\1539070413443.png)

不用建表，直接建立一个类来生成对应的数据表，映射到数据库中。

* update 更新数据库，不删掉数据库中的数据。
* create 创建数据库，每次运行删掉原来的表，重新创建。

#### 添加

![1539071749372](C:\Users\16500\AppData\Local\Temp\1539071749372.png)

![1539076849985](C:\Users\16500\AppData\Local\Temp\1539076849985.png)

#### 查询

![1539071789000](C:\Users\16500\AppData\Local\Temp\1539071789000.png)

#### 修改

![1539072681787](C:\Users\16500\AppData\Local\Temp\1539072681787.png)

#### 删除

![1539072775001](C:\Users\16500\AppData\Local\Temp\1539072775001.png)

#### 通过某一属性查询

![1539073164249](C:\Users\16500\AppData\Local\Temp\1539073164249.png)

### 事务管理

* 使用@Valid表单验证
* 使用AOP处理请求
* 统一异常处理
* 单元测试

### application.yml ：配置文件

- 里面可以添加任何属性值，可以直接打印

### Controller

- @Controller：处理http请求，配合模板使用
- @RestController：Spring4之后加入新的注解，原来返回的json需要@ResponseBody配合@Controller，等同于@Controller+@ResponseBody 
- @RequestMapping：配置URL映射

 