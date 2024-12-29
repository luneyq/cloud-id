
[English](README.md), [中文](README_zh.md)

### 技术选型
- UUID：基于snowflake雪花算法
- ULID：基于ulid-creator

### 引入方法
* jar包引入
```
<dependency>
    <groupId>com.luneyq</groupId>
    <artifactId>cloud-id</artifactId>
    <version>3.0.0</version>
</dependency>
```

### UUID：基于snowflake雪花算法 
- 使用工具类UuidUtil.uuid()即可生成，
```
UuidUtil.uuid();
```
- 格式说明：<br/>
 结果为19位数字，样例：1873185103874985984
- 按时间顺序生成，因此可排序

### ULID：基于ulid-creator
- 使用工具类UlidUtil：
```
UlidUtil.ulid();
UlidUtil.ulidMonotonic();
UlidUtil.ulidHash(time, name)
```
- 格式说明：ULID 是一个 128 位标识符。<br/>
前 48 位表示自 Unix 纪元 1970-01-01 以来的毫秒数。<br/>
其余 80 位由安全随机数生成器生成。<br/>
其规范字符串表示长度为 26 个字符。
```
01EX8Y21KC6ZBWQ0JBV337R1CN<br/>
|---------|--------------|
time      random
```
- ulidMonotonic()方法生成的"单调ULID"是ULID的一个变种，在相同毫秒内生成的ULID能够保持单调递增的顺序。<br/>
需要在同一时间点生成多个唯一标识符时非常有用，特别是在分布式系统中。<br/>
每当当前毫秒等于前一个毫秒时，随机分量就会加 1。它的主要优点是速度。<br/>
一系列单调 ULID 的结构：
```
01EX8Y7M8MDVX3M3EQG69EEMJW
01EX8Y7M8MDVX3M3EQG69EEMJX
01EX8Y7M8MDVX3M3EQG69EEMJY
01EX8Y7M8MDVX3M3EQG69EEMJZ
```

- ulidHash(time, name)为特定的特定时间和名称参数返回相同的ULID，参数不变则生成结果保持不变
- getTime(String ulid)获取ulid创建时间
- isValid(String ulid)判断ULID有效性