package com.lihaiyang.seed.base.core.result;

import lombok.Data;

import java.util.List;

@Data
public class ResultList<T> {

    private Long totalElements;
    private List<T> content;

    public ResultList() {
    }

    public ResultList(Long totalElements, List<T> content) {
        this.totalElements = totalElements;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ResultList(totalElements=" + this.getTotalElements() + ", content=" + this.getContent() + ")";
    }
}
