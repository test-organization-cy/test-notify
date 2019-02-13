package enums;

import lombok.Getter;

/**
 * @author dyrone
 * @date 18/5/18
 */
@Getter
public enum JavaVersionEnum {
    VERSION_1_8("1.8");

    private String version;

    JavaVersionEnum(String version) {
        this.version = version;
    }
}
