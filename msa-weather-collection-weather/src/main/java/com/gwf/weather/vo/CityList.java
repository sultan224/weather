package com.gwf.weather.vo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author zhanshixia
 * @package com.gwf.weather.vo
 * @describe 城市列表结合
 * @date 2018/12
 */
@Data
public class CityList {

    private List<City> cityList;
}
