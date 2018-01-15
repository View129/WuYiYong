package com.sms.wyy;

import java.util.List;

public class QueryResultInfo {
    public int error_code;
    public String reason;
    public List<Result> result;


    public List<Result> getResult() {
        return result;
    }
    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result {

        public String content;
        public String hashId;
        public int unixtime;
        public String updatetime;

            @Override
            public String toString() {
                return "DetailsList [content=" + content + ", hashId=" + hashId + ", unixtime=" + unixtime + ", updatetime=" + updatetime+"]";
            }

        public void setContent(String content) {
            this.content = content;
        }
        public String getContent() {
            return content;
        }

    }

    @Override
    public String toString() {
        return "QueryResultInfo [error_code=" + error_code + ", reason=" + reason + ", result=" + result.toString() + "]";
    }

}

