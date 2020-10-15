package com.wy.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 下拉列表常用数据解释器
 * @author Administrator
 *
 */
public class DataListUtils {
    public static void main(String[] args) {
    }

    /**
    **获取登录角色列表
    */
    public static List<Map<String, Object>> getLoginTypeList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "admin"));
        list.add(getMap("2", "user"));

        return list;
    }

    /**
    **获取is_used数据列表
    */
    public static List<Map<String, Object>> getIsUsedList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "闲置中"));
        list.add(getMap("2", "已使用"));

        return list;
    }

    public static String getIsUsedNameById(String id) { //根据is_used的key值获取名称

        List<Map<String, Object>> list = getIsUsedList();

        return getNameById(id, list);
    }

    /**
    **获取is_deal数据列表
    */
    public static List<Map<String, Object>> getIsDealList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "未处理"));
        list.add(getMap("2", "已处理"));

        return list;
    }

    public static String getIsDealNameById(String id) { //根据is_deal的key值获取名称

        List<Map<String, Object>> list = getIsDealList();

        return getNameById(id, list);
    }

    /**
    **获取is_jf数据列表
    */
    public static List<Map<String, Object>> getIsJfList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "未缴费"));
        list.add(getMap("2", "已缴费"));

        return list;
    }

    public static String getIsJfNameById(String id) { //根据is_jf的key值获取名称

        List<Map<String, Object>> list = getIsJfList();

        return getNameById(id, list);
    }

    /**
    **获取used_status数据列表
    */
    public static List<Map<String, Object>> getUsedStatusList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "使用中"));
        list.add(getMap("2", "已结束"));

        return list;
    }

    public static String getUsedStatusNameById(String id) { //根据used_status的key值获取名称

        List<Map<String, Object>> list = getUsedStatusList();

        return getNameById(id, list);
    }

    public static String getNameById(String id, List<Map<String, Object>> list) {
        if (id == null) {
            return null;
        }

        if (id.endsWith(",")) {
            id = id.substring(0, id.length() - 1);
        }

        String[] idsplit = id.split(",");
        String rs = "";

        for (String tmp : idsplit) {
            for (Map<String, Object> map : list) {
                if (map.get("id").toString().equals(tmp)) {
                    rs += (map.get("name").toString() + ",");
                }
            }
        }

        if (rs.endsWith(",")) {
            rs = rs.substring(0, rs.length() - 1);
        }

        return rs;
    }

    private static Map<String, Object> getMap(String id, String name) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("name", name);

        return map;
    }
}

