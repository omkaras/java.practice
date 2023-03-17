package com.os.java.practice;

import java.util.List;

public class DataToUse {

    private List<APIInfo> apiInfos;
    public DataToUse(List<APIInfo> apiInfos) {
        this.apiInfos = apiInfos;
    }

    public List<APIInfo> getApiInfos() {
        return apiInfos;
    }

    public void setApiInfos(List<APIInfo> apiInfos) {
        this.apiInfos = apiInfos;
    }
}
