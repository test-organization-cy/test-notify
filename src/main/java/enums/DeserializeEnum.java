package enums;

/**
 * @author dyrone
 *         2017/08/24
 *
 *         用于表明是何种验权方式
 */
public enum DeserializeEnum {
    /**
     * 默认类型,无特殊反序列化规则
     */
    NONE,
    /**
     * GRPC序列化规则
     */
    GRPC_ENUM,
    /**
     * 根据Value反序列化规则
     */
    VALUE_BASIC_ENUM,
}
