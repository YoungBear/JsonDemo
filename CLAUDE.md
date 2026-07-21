# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 构建与测试

```bash
mvn compile              # 编译 (Java 8, -Xlint:all)
mvn test                 # 运行全部测试 (JUnit Jupiter 5)
mvn test -Dtest=JsonFieldOrderTest   # 运行单个测试类
```

## 架构

这是一个对比四种 JSON 解析框架的 Demo 项目：**fastjson 1.x**、**fastjson2**、**Gson**、**Jackson**。

**策略模式** — `IJsonStrategy` 接口定义 `toJSONString(Object)` 和 `fromJSON(String, Class)` 两个方法。四个实现类分别封装各框架的序列化/反序列化调用。其中 `JacksonStrategy` 将受检异常 `JsonProcessingException` 包装为 `RuntimeException`。

**单例** — `JsonUtils` 持有一个 `IJsonStrategy` 实例（默认使用 `Fastjson2Strategy`），替换注入的策略即可切换使用的 JSON 框架。

**实体模型** — `Student` 包含 `List<Book>` 和 `Computer`。`StudentUtils.genStudent()` 构建示例对象，`StudentUtils.STUDENT_STRING` 是对应的 JSON 字符串，所有 Demo 共用。

**Demo 类**（`FastjsonDemo`、`GsonDemo`、`JacksonDemo`）各自包含 `main` 方法，展示对应框架的序列化再反序列化流程。

**测试** 演练各框架特有注解：Jackson 的 `@JsonProperty`/`@JsonAlias`/`@JsonPropertyOrder`，fastjson2 的 `@JSONField(ordinal)`/`@JSONType(orders)`。测试内部类使用 Lombok 的 `@Getter`/`@Setter`。
