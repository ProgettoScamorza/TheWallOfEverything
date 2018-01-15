package com.thewallofeverything.unitydatalibrary;

import com.thewallofeverything.unitydatalibrary.enumerations.ResultCode;

public class PlayResultPack {

    private ResultCode resultCode;
    private String error;
    private Integer lastWallNumber;

    public PlayResultPack() {
    }

    public PlayResultPack(ResultCode resultCode, String error, Integer lastWallNumber) {
        this.resultCode = resultCode;
        this.error = error;
        this.lastWallNumber = lastWallNumber;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getLastWallNumber() {
        return lastWallNumber;
    }

    public void setLastWallNumber(Integer lastWallNumber) {
        this.lastWallNumber = lastWallNumber;
    }
}
