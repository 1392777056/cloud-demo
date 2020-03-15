
## Hystrix的注解说明


//设置隔离策略，THREAD 表示线程池 SEMAPHORE：信号池隔离
@HystrixProperty(name = "execution.isolation.strategy",value = "THREAD"),
//当隔离策略选择信号池隔离的时候，用来设置信号池的大小（最大并发数）
@HystrixProperty(name = "execution.isolation.semaphore.maxConcurrentRequests",value = "10"),
//配置命令执行的超时时间
@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "10"),
//是否启用超时时间
@HystrixProperty(name = "execution.timeout.enabled",value = "true"),
//执行超时的时候是否中断
@HystrixProperty(name = "execution.isolation.thread.interruptOnTimeout",value = "true"),
//执行被取消的时候是否中断
@HystrixProperty(name = "execution.isolation.thread.interruptOnFutureCancel",value = "true"),
//允许回调的方法执行最大并发数
@HystrixProperty(name = "fallback.isolation.semaphore.maxConcurrentRequests",value = "10"),
//服务降级是否启用，是否执行回调函数
@HystrixProperty(name = "fallback.enabled",value = "true"),
//是否开启熔断器
@HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
//该属性用来设置在滚动时间窗口，断路器熔断的最小请求数，例如，默认值为20的时候，
//如果滚动时间窗口（默认10秒）内仅剩收到了19个请求都失败了，断路器也不会打开
@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "20"),
//该属性用来设置在滚动时间窗中，表示在滚动时间窗，在请求量超过
//circuitBreaker.requestVolumeThreshold 的情况下，如果错误请求数百分比超过50
//就把断路器设置为打开状态，否则就设置为失败状态，
@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "50"),
//该属性用来设置当断路器打开之后的休眠时间，休眠时间窗结束后，
// 会将断路器设置为“半开”状态，尝试熔断的请求命令，如果依然失败就将熔断器继续设置为“打开”状态
//如果成功就设置为“关闭”状态
@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
//熔断器强制打开
@HystrixProperty(name = "circuitBreaker.forceOpen",value = "false"),