package enums;

/**
 * avatar type enum
 * @author dyroneteng
 */
public enum AvatarTypeEnum {
    /*
    type group
     */
    GROUP("group"),
    /*
    type project
    */
    PROJECT("project"),
    /*
    type user
    */
    USER("user");

    private String type;

    AvatarTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
