/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author ChiaHsuan
 */
public class DatabaseErrorConverter {

    private int errorCode;
    private String errorMessage;
    private String message = "";
    private String type = "TW";

    private void codeConvert() {
        switch (this.errorCode) {
            case 1062:
                this.message = "值重複";
                break;
            default:
                this.message = "資料庫錯誤";
        }
    }

    private String getMessage() {
        return this.message;
    }
}
