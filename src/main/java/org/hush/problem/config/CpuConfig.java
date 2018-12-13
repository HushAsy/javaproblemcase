package org.hush.problem.config;


import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by admin on 2017/8/4.
 */
public class CpuConfig {
    public static AtomicBoolean PROCESS_KILL = new AtomicBoolean(false);
    public static AtomicBoolean CPU_US_HIGH = new AtomicBoolean(false);
    public static AtomicBoolean CPU_SY_HIGH = new AtomicBoolean(false);
    public static AtomicBoolean CPU_IO_WAIT = new AtomicBoolean(false);
    public static AtomicBoolean OOM_HEAP = new AtomicBoolean(false);
    public static AtomicBoolean OOM_STACK = new AtomicBoolean(false);
    public static AtomicBoolean OOM_PERMANENT = new AtomicBoolean(false);
}
