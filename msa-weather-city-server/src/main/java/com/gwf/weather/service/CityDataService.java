package com.gwf.weather.service;


import com.gwf.weather.vo.City;

import java.util.List;

/**
 * @author zhanshixia
 * @package com.gwf.weather.service
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
