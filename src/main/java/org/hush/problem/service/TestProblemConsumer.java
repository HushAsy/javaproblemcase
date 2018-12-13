package org.hush.problem.service;

import org.hush.problem.cglb.BookFacedeImpl;
import org.hush.problem.cglb.BookProxy;
import org.hush.problem.config.CpuConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by admin on 2017/8/4.
 */
@Service
@Slf4j
public class TestProblemConsumer {
    private volatile Integer cpu_sy_count = 0;
    private static List<String> list = new ArrayList<String>();
    public void processKillStart(){
        CpuConfig.PROCESS_KILL.set(true);
        while (CpuConfig.PROCESS_KILL.get()){
            String str = new String("adjafksdfjksljfkajkljsflskdfkasksdfkasdafkjsdjsdfsdlfkakskdjfkasjlajlskdjfksfjksldjf");
            list.add(str);
        }
    }

    public void processKillStop(){
        CpuConfig.PROCESS_KILL.set(false);
        list.clear();
    }

    public void cpuUsHighStart(){
        CpuConfig.CPU_US_HIGH.set(true);
        while(CpuConfig.CPU_US_HIGH.get()){
            List<String> lists = new ArrayList<String>();
            for(int i = 0; i < 1000; i++){
                lists.add("ajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdfsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkakafsdkjsfkafkjafjafskwieurwoiriqiajsdkajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaaajsdka" +
                        "fsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkafkafkjafjafskwieurwoiriqiajsdkasfkafsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjaffkjaf" +
                        "jafskwieurwoiriqiajsdkafsdkjsfkafkjafajsdkafsdkjsfkafkjafjafajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjfsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaskwieurwoiriqiajsdkajafskwieurw" +
                        "oiriqiajsdkafsdkjsfkafkjafjafskwieurwajsdkafsdkjsfkafkjafjafskwieurwoiriqajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaiajsdkaoiriqfsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafiajsdk" +
                        "afsdkjsfkafkjafjafskwieurwoiriqiajsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkadkajsdkafsdkjsfkafkjafjafskwieurfsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaafsdkjsfkaf" +
                        "kjafjafskwieurwoiriqiajsdkafsdkjsfkajsdkafsdkjsfkafkjafajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdfsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkajafskwieurwoiriqiajsdkaafkjafjafskwi" +
                        "eurwoiriqiajsdkafsdkjsfkafkjafjafskajsdkafsdkjsfkafkjafjafskwieuajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkarwoiriqiajsdkawieurwoirifsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafqia" +
                        "jsdkafsdkjsfkafkjafjafskwieurwoiriqajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkafsdkjsfkfsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaiajsdkafsdkjs" +
                        "fkafkjafjafskwieurwoiriqisdkjsfkafkjafjajsdkafsdkjsfkafkjafjafskwieurwajsdkafsdkjsfkafkjafjafskwieurwfsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaafskwieur" +
                        "woiriqisdkjsfkafkjafjafskajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkfsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafafsdkjsfkafkjafjafskwieurwoiriqiajsdkawieurwoiriqifsdkjsfkafk" +
                        "jafjafskwieurwoiriqikafsdkjsfkafkjafjafajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskfsdajsdajsdkaajsdkafajsdkafajsdkfsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafwieurwoiriqiajsdkaskwieurwo" +
                        "iriqikjsfkafkjafjafskwieuajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdfsdajsdajsdkaajsdkafajsdkafajsdkafsdkjajsdkafsdkjsajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkaajsdkafsdkjsfkafkjafjafskwieurwoiriqiajsdkarwoiriqi");
            }
        }
    }

    public void cpuUsStop(){
        CpuConfig.CPU_US_HIGH.set(false);
    }

    public void cpuSyHighStart(){
        CpuConfig.CPU_SY_HIGH.set(true);
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 10; i++){
            service.submit(new SyThread(String.valueOf(i)));
        }
        service.shutdown();
    }

    public void cpuSyHighStop(){
        CpuConfig.CPU_SY_HIGH.set(false);
    }

    public void cpuIoWaitStart(){
        CpuConfig.CPU_IO_WAIT.set(true);
        File file = new File("/test.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for(int i = 0; i < 20; i++){
            new Thread(new FileWriterThread(file)).start();
        }
    }

    public void iowaitStop(){
        CpuConfig.CPU_IO_WAIT.set(false);
    }

    public void oomHeapStart(){
        CpuConfig.OOM_HEAP.set(true);
        List<String> list = new ArrayList<String>();
        String str = new String("adjafksdfjksljfkajkljsflskdfkasksdfkasdafkjsdjsdfsdlfkakskdjfkasjlajlskdjfksfjksldjf");
        while (CpuConfig.OOM_HEAP.get()){
            list.add(str);
        }
    }

    public void oomHeapStop(){
        CpuConfig.OOM_HEAP.set(false);
    }

    public void oomStackStart(){
        CpuConfig.OOM_STACK.set(true);
        while(CpuConfig.OOM_STACK.get()) {
            StackOutOfM outOfM = new StackOutOfM();
            outOfM.oom(1);
        }
    }

    public void oomStackStop(){
        CpuConfig.OOM_STACK.set(false);
    }


    public void oomPermanentStart(){
        CpuConfig.OOM_PERMANENT.set(true);
        BookProxy bookProxy = new BookProxy();
        while (CpuConfig.OOM_PERMANENT.get()) {
            BookFacedeImpl bookFacede = (BookFacedeImpl) bookProxy.getInstance(new BookFacedeImpl());
        }
    }

    public void oomPermanentStop(){
        CpuConfig.OOM_PERMANENT.set(false);
    }

    //模拟cpu_sy高
    public class SyThread extends Thread{
        public SyThread(String name){
            super.setName(name);
        }
        public void run() {
            while(CpuConfig.CPU_SY_HIGH.get()) {
                synchronized(cpu_sy_count) {
                    cpu_sy_count++;
                    System.out.println(Thread.currentThread().toString());
                }
            }
        }
    }

    /**
     * Created by admin on 2017/7/21.
     * 模拟iowait
     */
    public class FileWriterThread implements Runnable{
        private File file;
        public FileWriterThread(File file){
            this.file = file;
        }

        public void run() {
            synchronized (file) {
                try {
                    writeFile(this.file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void writeFile(File file) throws IOException {
            String writeStr = "";
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
            while (CpuConfig.CPU_IO_WAIT.get()) {
                outputStreamWriter.write(writeStr);
            }
            outputStreamWriter.close();
        }
    }

    /**
     * 模拟栈区溢出
     */
    public class StackOutOfM {
        public void oom(int i){
            if(i < Integer.MAX_VALUE){
                i++;
                oom(i);
            }else{
                return;
            }
        }

    }
}
