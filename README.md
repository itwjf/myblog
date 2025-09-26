# 个人博客系统 (Personal Blog System)

一个基于Spring Boot和原生JavaScript开发的全栈博客系统，支持文章的发布、浏览和管理。

### 在线访问
- 本地运行：http://localhost:8080/index.html
- 后端API文档：http://localhost:8080/api/articles

## 📋 功能特性

### ✅ 已实现功能
- **文章管理**
  - 文章发布、编辑、删除
  - 文章列表分页展示
  - 文章详情查看
- **用户界面** 
  - 响应式设计，支持移动端
  - 简洁美观的UI界面
  - 实时加载状态提示
- **后端API**
  - RESTful风格接口设计
  - 统一异常处理
  - 跨域请求支持

### 🔄 规划中功能
- 用户注册登录系统
- 文章评论和互动
- 文章分类和标签
- 全文搜索功能
- 数据统计和分析

## 🛠 技术栈

### 后端技术
| 技术 | 版本 | 用途 |
|------|------|------|
| Java | 17 | 后端编程语言 |
| Spring Boot | 3.x | 应用框架 |
| Spring Data JPA | 3.x | 数据持久化 |
| MySQL | 8.0 | 数据库 |
| Maven | 3.6+ | 项目管理 |

### 前端技术
| 技术 | 用途 |
|------|------|
| HTML5 | 页面结构 |
| CSS3 | 样式设计 |
| JavaScript (ES6+) | 交互逻辑 |
| Fetch API | 前后端通信 |

### 开发工具
- **IDE**: IntelliJ IDEA
- **版本控制**: Git + Gitee
- **API测试**: Postman
- **数据库管理**: MySQL Workbench

## 📁 项目结构

```
myblog/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── wjf/
│   │   │           └── myblog/
│   │   │               ├── MyblogApplication.java     # 启动类
│   │   │               ├── controller/
│   │   │               │   └── ArticleController.java # 控制器
│   │   │               ├── entity/
│   │   │               │   └── Article.java           # 实体类
│   │   │               ├── repository/
│   │   │               │   └── ArticleRepository.java # 数据访问
│   │   │               └── service/
│   │   │                   └── ArticleService.java    # 业务逻辑
│   │   └── resources/
│   │       ├── static/         # 前端静态资源
│   │       │   ├── index.html  # 首页
│   │       │   ├── detail.html # 详情页
│   │       │   ├── edit.html   # 编辑页
│   │       │   └── css/
│   │       │       └── style.css # 样式文件
│   │       └── application.properties # 配置文件
├── README.md                   # 项目说明
└── pom.xml                    # Maven配置
```

## 🚀 快速开始

### 环境要求
- JDK 17+
- MySQL 8.0+
- Maven 3.6+

### 数据库配置
1. 创建MySQL数据库：
```sql
CREATE DATABASE myblog CHARACTER SET utf8mb4;
配置数据库连接，修改 src/main/resources/application.properties：

properties
spring.datasource.url=jdbc:mysql://localhost:3306/myblog?useSSL=false&serverTimezone=Asia/Shanghai
spring.datasource.username=root
spring.datasource.password=你的密码

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
运行项目
克隆项目：

bash
git clone https://gitee.com/你的用户名/myblog.git
cd myblog
使用IDEA导入Maven项目

运行主类：MyblogApplication.java

访问应用：

前端页面：http://localhost:8080/index.html

后端API：http://localhost:8080/api/articles

📚 API接口文档
文章相关接口
获取文章列表
http
GET /api/articles
Response: [{"id":1,"title":"文章标题","content":"内容","createdTime":"2024-01-01T00:00:00"}]
获取文章详情
http
GET /api/articles/{id}
Response: {"id":1,"title":"文章标题","content":"内容","createdTime":"2024-01-01T00:00:00"}
创建新文章
http
POST /api/articles
Content-Type: application/json
Request: {"title":"新文章","content":"文章内容"}
Response: {"id":2,"title":"新文章","content":"文章内容","createdTime":"2024-01-01T00:00:00"}
更新文章
http
PUT /api/articles/{id}
Content-Type: application/json
Request: {"title":"更新标题","content":"更新内容"}
删除文章
http
DELETE /api/articles/{id}
💡 开发笔记
技术亮点
分层架构设计：采用Controller-Service-Repository分层，代码结构清晰

RESTful API：规范的接口设计，前后端分离

异常处理：统一的错误处理机制

跨域解决方案：使用@CrossOrigin注解处理跨域请求

遇到的问题及解决方案
跨域问题：通过配置@CrossOrigin注解解决

日期格式化：使用JavaScript的toLocaleString()优化显示

前后端数据交互：掌握Fetch API的使用方法

🔮 后续规划
短期目标
实现用户认证和授权

添加文章评论功能

优化前端用户体验

长期目标
引入Vue.js重构前端

集成Elasticsearch实现全文搜索

使用Docker容器化部署

添加数据统计和分析功能

🤝 贡献指南
欢迎提交Issue和Pull Request来帮助改进这个项目！

📄 许可证
本项目采用 MIT 许可证 - 查看 LICENSE 文件了解详情。

👨‍💻 作者
你的名字

Gitee: @你的用户名

邮箱: 你的邮箱@example.com

如果这个项目对你有帮助，请给个⭐Star支持一下！
