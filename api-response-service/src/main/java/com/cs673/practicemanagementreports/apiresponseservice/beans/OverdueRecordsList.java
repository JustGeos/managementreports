package com.cs673.practicemanagementreports.apiresponseservice.beans;

import java.util.List;

public class OverdueRecordsList {

    private List<OverdueRecordsBean> overdueRecordsList;

    public OverdueRecordsList(List<OverdueRecordsBean> overdueRecordsList) {
        this.overdueRecordsList = overdueRecordsList;
    }

    public List<OverdueRecordsBean> getOverdueRecordsList() {
        return overdueRecordsList;
    }

    public void setOverdueRecordsList(List<OverdueRecordsBean> overdueRecordsList) {
        this.overdueRecordsList = overdueRecordsList;
    }
}
