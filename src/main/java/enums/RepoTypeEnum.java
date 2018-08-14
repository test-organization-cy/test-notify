package enums;

import lombok.Getter;

/**
 * @author dyrone
 * @date 18/5/22
 */
@Getter
public enum RepoTypeEnum {
    FORCE("force");

    private String type;

    RepoTypeEnum(String type) {
        this.type = type;
    }
}
