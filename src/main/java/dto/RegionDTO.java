package dto;

/**
 * @author: zhounan.zn
 * @date: 2018/7/3
 */
public class RegionDTO {

    private static final long serialVersionUID = 7230296296219872310L;
    private String name;
    private String identifier;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
