package top.yekongle.shopmanager.common;

/**
 * @author Yekongle
 * @date 2020/10/24 18:55
 */
public class JwtConstant {
    public static final long EXPIRATION_TIME = 432_000_000;     // 5天(以毫秒ms计)
    public static final String SECRET = "YekongleSecret";      // JWT密码
    public static final String TOKEN_PREFIX = "Bearer";         // Token前缀
    public static final String HEADER_STRING = "Authorization"; // 存放Token的Header Key
}
