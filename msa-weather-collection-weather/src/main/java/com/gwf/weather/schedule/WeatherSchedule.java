package com.gwf.weather.schedule;

import com.gwf.weather.service.CityClient;
import com.gwf.weather.service.WeatherDataCollectionService;
import com.gwf.weather.vo.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @author zhanshixia
 * @package com.gwf.weather.schedule
 * @describe 定时同步天气
 * @date 2018/12
 */
@Service
@Slf4j
public class WeatherSchedule {

    private static final String LOG_PRE = "weather data sync job->";


    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;

    @Autowired
    private CityClient cityClient;


    @Scheduled(cron = "0 0/1 * * * *")
    public void weatherDataSyncJob(){
        log.info(buildLog("start"));

        List<City> cityList = null;

        try {
            cityList = cityClient.listCitys();
        } catch (Exception e) {
            log.error("获取城市列表失败",e);
        }

        cityList.stream().forEach(city -> {
            String cityId = city.getCityId();
            log.info(buildLog("cityId:"+cityId));

            weatherDataCollectionService.syncDataByCityId(cityId);

        });

        log.info(buildLog("end"));
    }

    private String buildLog(String msg){
        return new StringBuilder().append(LOG_PRE).append(msg).toString();
    }
}
