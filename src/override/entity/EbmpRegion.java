package override.entity;

import java.io.Serializable;

/**
 * 行政区域表(EbmpRegion)实体类
 *
 * @author makejava
 * @since 2022-08-18 23:58:19
 */
public class EbmpRegion implements Serializable {
    private static final long serialVersionUID = -26576973425931800L;
    /**
     * 区域id
     */
    private Integer ebmpRegionId;
    /**
     * 区域父节点id（0没有父节点）
     */
    private Integer ebmpRegionParentId;
    /**
     * 区域名称
     */
    private String ebmpRegionName;
    /**
     * 区域层次，0是中国，1是省级，2是市级，3是县级
     */
    private Integer ebmpRegionType;


    public Integer getEbmpRegionId() {
        return ebmpRegionId;
    }

    public void setEbmpRegionId(Integer ebmpRegionId) {
        this.ebmpRegionId = ebmpRegionId;
    }

    public Integer getEbmpRegionParentId() {
        return ebmpRegionParentId;
    }

    public void setEbmpRegionParentId(Integer ebmpRegionParentId) {
        this.ebmpRegionParentId = ebmpRegionParentId;
    }

    public String getEbmpRegionName() {
        return ebmpRegionName;
    }

    public void setEbmpRegionName(String ebmpRegionName) {
        this.ebmpRegionName = ebmpRegionName;
    }

    public Integer getEbmpRegionType() {
        return ebmpRegionType;
    }

    public void setEbmpRegionType(Integer ebmpRegionType) {
        this.ebmpRegionType = ebmpRegionType;
    }

}

