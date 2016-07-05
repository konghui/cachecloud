package com.sohu.tv.builder;

/**
 * cachecloud-redis客户端builder
 * @author leifu
 * @Date 2015年2月5日
 * @Time 下午12:11:26
 */
public class ClientBuilder {

    /**
     * 构造redis cluster的builder
     *
     * @param appToken
     * @return
     */
    public static RedisClusterBuilder redisCluster(final String appToken) {
        return new RedisClusterBuilder(appToken);
    }

    /**
     * 构造redis sentinel的builder
     *
     * @param appToken
     * @return
     */
    public static RedisSentinelBuilder redisSentinel(final String appToken) {
        return new RedisSentinelBuilder(appToken);
    }

    /**
     * 构造redis standalone的builder
     * @param appToken
     * @return
     */
    public static RedisStandaloneBuilder redisStandalone(final String appToken) {
        return new RedisStandaloneBuilder(appToken;
    }
}
