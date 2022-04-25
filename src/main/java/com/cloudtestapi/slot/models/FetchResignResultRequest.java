package com.cloudtestapi.slot.models;

import com.cloudtestapi.common.AbstractRequestWithoutSpecificBodyGenerator;
import com.cloudtestapi.common.profile.HttpProfile;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;

public class FetchResignResultRequest extends AbstractRequestWithoutSpecificBodyGenerator {
    @SerializedName("slot_out_addr")
    @Expose
    private String slotOutAddr;

    @SerializedName("file_id")
    @Expose
    private String fileId;

    public FetchResignResultRequest(){
        this.setHttpMethod(HttpProfile.REQ_POST);
        this.withApiInfo("v1", "/slot/resign/status");
    }

    @Override
    protected void toQueryParamMap(HashMap<String, Object> map, String prefix) {

    }

    @Override
    protected void toPathParamMap(HashMap<String, String> map, String prefix) {

    }

    public String getSlotOutAddr() {
        return slotOutAddr;
    }

    public void setSlotOutAddr(String slotOutAddr) {
        this.slotOutAddr = slotOutAddr;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
