package com.xin.consts;

/**
 * @author Three
 * @since 18/6/14下午8:47
 */
public enum Api {
    DETECT("https://api-cn.faceplusplus.com/facepp/v3/detect"),
    FACE_ANALYZE("https://api-cn.faceplusplus.com/facepp/v3/face/analyze"),
    COMPARE("https://api-cn.faceplusplus.com/facepp/v3/compare"),
    SEARCH("https://api-cn.faceplusplus.com/facepp/v3/search"),
    FACE_GETDETAIL("https://api-cn.faceplusplus.com/facepp/v3/face/getdetail"),
    FACE_SETUSERID("https://api-cn.faceplusplus.com/facepp/v3/face/setuserid"),
    FACESET_CREATE("https://api-cn.faceplusplus.com/facepp/v3/faceset/create"),
    FACESET_ADDFACE("https://api-cn.faceplusplus.com/facepp/v3/faceset/addface"),
    FACESET_REMOVEFACE("https://api-cn.faceplusplus.com/facepp/v3/faceset/removeface"),
    FACESET_DELETE("https://api-cn.faceplusplus.com/facepp/v3/faceset/delete"),
    FACESET_UPDATE("https://api-cn.faceplusplus.com/facepp/v3/faceset/update"),
    FACESET_GETDETAIL("https://api-cn.faceplusplus.com/facepp/v3/faceset/getdetail"),
    FACESET_GETFACESETS("https://api-cn.faceplusplus.com/facepp/v3/faceset/getfacesets"),;
    private String value;

    Api(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
