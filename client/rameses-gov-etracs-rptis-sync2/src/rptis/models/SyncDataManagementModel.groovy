package rptis.models;

import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*;
import com.rameses.osiris2.common.*;
import com.rameses.osiris2.client.*;
import com.rameses.seti2.models.*;

class SyncDataManagementModel
{
    @Binding
    def binding;
    
    @Service('RPTSyncDataManagementService')
    def svc;
    
    String title = "Synchronization Management";
    
    def info;
    def selectedFile;
    
    
    void init() {
        info= svc.getInfo();
    }
    
    /*================================
     **
     ** SERVICES
     **
     =================================*/
    void startUploader() {
        svc.updateUploaderStatus("on");
        info.service.uploader = "on";
    }
    
    void stopUploader() {
        svc.updateUploaderStatus("off");
        info.service.uploader = "off";
    }
    
    def getUploaderIcon() {
        if (info.service?.uploader == "on") {
            return "rptis/images/on.png"
        }
        return "rptis/images/off.png"
        
    }
    
    void startDownloader() {
        svc.updateDownloaderStatus("on");
        info.service.downloader = "on";
    }
    
    void stopDownloader() {
        svc.updateDownloaderStatus("off");
        info.service.downloader = "off";
    }
    
    
    def getDownloaderIcon() {
        if (info.service?.downloader == "on") {
            return "rptis/images/on.png"
        }
        return "rptis/images/off.png"
    }
    
    
    
    
    void rescheduleErrors() {
        if (MsgBox.confirm('Clear all errors?')) {
            svc.rescheduleErrors();
            reload();
        }
    }

    void deleteAllErrors() {
        if (MsgBox.confirm('Deelte all errors from file server?')) {
            svc.deleteErrors();
            reload();
        }
    }
    
    def getErrorOpener() {
        return Inv.lookupOpener("syncdata_error:list", [:])
    }
    
    void refreshUploads() {
        info.files = svc.getFilesForUpload();
        uploadListHandler.reload();
    }
    
    def uploadListHandler = [
        fetchList : { info.files}
    ] as BasicListModel
    

}