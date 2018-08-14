package enums;

/**
 * 仓库索引状态表
 *
 * @author dyrone
 */
public enum RepoIndexStatusEnum {
    /**
     * 未索引
     */
    UN_INDEX(0),
    /**
     * 索引中
     */
    INDEXING(1),
    /**
     * 索引失败
     */
    FAILED(2),
    /**
     * 部分索引成功
     */
    PARTIAL_SUCCESS(3),

    ALL_SUCCESS(4);

    private int status;

    public int getStatus() {
        return status;
    }

    RepoIndexStatusEnum(int status) {
        this.status = status;
    }
}
