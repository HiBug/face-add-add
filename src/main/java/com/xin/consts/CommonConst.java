package com.xin.consts;

/**
 * @author Three
 * @since 18/6/13下午5:50
 */
public interface CommonConst {
    String API_KEY = "api_key";
    String API_SECRET = "api_secret";

    String REQUEST_ID = "request_id";//用于区分每一次请求的唯一的字符串。此字符串可以用于后续数据反查。
    String TIME_USED = "time_used";//整个请求所花费的时间，单位为毫秒。
    String ERROR_MESSAGE = "error_message";//当请求失败时才会返回此字符串，具体返回内容见后续错误信息章节。否则此字段不存在
    String RETURN_LANDMARK = "return_landmark";//是否检测并返回人脸关键点。合法值为：0:不检测 1：检测。返回83个人脸关键点。 2：检测。返回 106 个人脸关键点。
    String RETURN_ATTRIBUTES = "return_attributes";// 希望检测并返回的属性。需要将属性组成一个用逗号分隔的字符串，属性之间的顺序没有要求。gender age smiling headpose facequality blur eyestatus emotion ethnicity beauty mouthstatus eyegaze skinstatus
}
