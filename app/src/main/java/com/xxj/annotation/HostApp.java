package com.xxj.annotation;

import com.beyondxia.annotation.ExportMethod;
import com.beyondxia.annotation.ExportService;

/**
 * Created by xiaojunxia on 2018/9/21.
 */
@ExportService(moduleName = "Host")
public class HostApp {
    @ExportMethod
    public String getHostAppName() {
        return "Host";
    }
}
