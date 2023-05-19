package entity;

import java.io.Serializable;

/**
 * (City)实体类
 *
 * @author makejava
 * @since 2023-04-20 12:47:58
 */
public class City implements Serializable {
    private static final long serialVersionUID = 192351971380948132L;
    
    private Integer id;
    
    private String cityname;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityname='" + cityname + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    private String province;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

}

