package com.cffreedom.utils;

import com.cffreedom.utils.file.FileUtils;

public class CFG2Config {
    private String BASE_DIR = "CFG2";
    private String configDir;
    public String syncDir;
    public String appName;
    public String appDir;
    public String appDataDir;
    public String appLogDir;
    public String appBackupDir;
    public String inboxDir;
    public String backupDir;

    public CFG2Config(String appName) throws Exception {
        this.appName = appName;

        this.syncDir = getSyncDir();

        String dir = this.syncDir+"\\Apps";
        if (!FileUtils.folderExists(dir)) {
            FileUtils.createFolder(dir);
        }
        this.configDir = dir+"\\"+BASE_DIR;
        if (!FileUtils.folderExists(this.configDir)) {
            FileUtils.createFolder(this.configDir);
        }

        dir = this.configDir+"\\"+this.appName;
        if (!FileUtils.folderExists(dir)) {
            FileUtils.createFolder(dir);
        }
        this.appDir = dir;

        dir = this.appDir+"\\Data";
        if (!FileUtils.folderExists(dir)) {
            FileUtils.createFolder(dir);
        }
        this.appDataDir = dir;

        dir = this.appDir+"\\Logs";
        if (!FileUtils.folderExists(dir)) {
            FileUtils.createFolder(dir);
        }
        this.appLogDir = dir;

        dir = this.syncDir+"\\_Inbox";
        if (!FileUtils.folderExists(dir)) {
            FileUtils.createFolder(dir);
        }
        this.inboxDir = dir;

        dir = this.syncDir+"\\Backup";
        if (!FileUtils.folderExists(dir)) {
            FileUtils.createFolder(dir);
        }
        this.backupDir = dir;

        dir = this.backupDir+"\\"+BASE_DIR;
        if (!FileUtils.folderExists(dir)) {
            FileUtils.createFolder(dir);
        }
        dir += "\\"+this.appName;
        if (!FileUtils.folderExists(dir)) {
            FileUtils.createFolder(dir);
        }
        this.appBackupDir = dir;
    }

    private String getSyncDir() throws Exception {
        String syncHome = SystemUtils.getEnvVal("SYNC_DRIVE_HOME");
        if (syncHome == null) {
            throw new Exception("SYNC_DRIVE_HOME environment variable not defined!");
        }
        if (!FileUtils.folderExists(syncHome)) {
            throw new Exception("Sync Dir does not exist: "+syncHome);
        }
        return syncHome;
    }
}
