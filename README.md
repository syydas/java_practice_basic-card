# 作业模板
# 自动抽牌机
写一个程序模拟自动抽牌机，从一幅扑克中随机抽取 n 张，然后在控制台上打印出来。具体的：
- 扑克没有小丑牌，共 52 张，花色为黑桃, 红桃, 梅花, 方片，点数为A, 2~10, J, Q, K
- n 由用户从控制台输入
- 打印的格式为 方片10 黑桃3 红桃10 梅花8
## 要求：

- 用面向对象编程， Card 类表示扑克，CardMachine 表示抽牌机，抽牌的核心逻辑封装在 CardMachine 的 drawCard 方法中
- 要对 n 做校验，输入超过范围时打印提示信息

