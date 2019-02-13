package enums;

/**
 * sort type
 *
 * @author van.yzt
 * @date 2017/11/02
 */
public enum SortEnum {
    /**
     * 降序
     */
    desc,
    /**
     * 升序
     */
    asc;

    public static SortEnum get(String sort){
        if(asc.name().equals(sort)){
            return asc;
        }else {
            return desc;
        }
    }
}
