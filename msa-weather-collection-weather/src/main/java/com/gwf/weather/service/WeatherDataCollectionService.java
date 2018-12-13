package com.gwf.weather.service;

/**
 * @author zhanshixia
 * @package com.gwf.weather.service
 * @describe 天气数据采集接口
 * @date 2018/12
 */
public interface WeatherDataCollectionService {

    /**
     * 根据城市Id同步天气
     * @param cityId
     */
    void syncDataByCityId(String cityId);
}
