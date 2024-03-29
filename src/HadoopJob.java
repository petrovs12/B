
/*
 * HadoopJob.java
 *
 * Created on 2011/11/18, 14:33:10
 */


// import org.apache.commons.logging.Log;
// import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 *
 * @author Stefan1
 */
public class HadoopJob {
    // The Karmasphere Studio Workflow Log displays logging from Apache Commons Logging, for example:
    // private static final Log LOG = LogFactory.getLog("HadoopJob");

    public static void main(String[] args) throws Exception {
        Job job = new Job();

        /* Autogenerated initialization. */
        initJob(job);

        /* Custom initialization. */
        initCustom(job);

        /* Tell Task Tracker this is the main */
        job.setJarByClass(HadoopJob.class);

        /* This is an example of how to set input and output. */
        FileInputFormat.setInputPaths(job, args[0]);
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        /* You can now do any other job customization. */
        // job.setXxx(...);

        /* And finally, we submit the job. */
        job.submit();

        job.waitForCompletion(true);
    }

    /**
     * This method is executed by the workflow
     */
    public static void initCustom(Job job) {
        // Add custom initialisation here, you may have to rebuild your project before
        // changes are reflected in the workflow.
    }

    /** This method is called from within the constructor to
     * initialize the job.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Job Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initJob
    public static void initJob(Job job) {
        // The code generator will fill in this method in due course.
    }
    // </editor-fold>//GEN-END:initJob

}
