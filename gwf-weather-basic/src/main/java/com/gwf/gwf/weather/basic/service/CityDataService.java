package com.gwf.gwf.weather.basic.service;

import com.gwf.gwf.weather.basic.vo.City;

import java.util.List;

/**
 * @author zhanshixia
 * @package com.gwf.gwf.weather.basic.service
 * @describe 城市数据服务
 * @date 2018/12
 */
public interface CityDataService {

    /**
     * 获取City列表
     * @return
     * @throws Exception
     */
    List<City> listCity() throws Exception;


}
