package com.mcylm.microservice.mission.service.utils.StringUtil;

import java.util.UUID;

/**
 * Created by Administrator on 2017/10/21.
 */
public class StringUtils {

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    //获取 UUid
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        return removeHorizontalLine(uuid);
    }

    /**
     * 去除 uuid 中的 -
     * @param uuid
     * @return
     */
    public static String removeHorizontalLine(String uuid){
        return uuid.replaceAll("-", "");
    }

}
