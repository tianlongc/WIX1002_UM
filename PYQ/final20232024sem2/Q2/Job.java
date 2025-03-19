/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
public class Job {
    private String jobName;
    private String partition;
    private String memory;
    private String qos;
    
    public Job(String jobName, String partition, String memory, String qos){
        this.jobName = jobName;
        this.partition = partition;
        this.memory = memory;
        this.qos = qos;
    }
    
    // Accessor
    public String getPartition(){
        return partition;
    }
    
    public String getQoS(){
        return qos;
    }
    
    @Override
    public String toString(){
        return String.format("Job Name: %s, Partition: %s, Memory: %s, QoS: %s", jobName, partition, memory, qos);
    }
}
