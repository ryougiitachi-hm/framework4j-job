package per.itachi.framework4j.job.elasticjob.joint.job;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        log.info("ShardingContext is {}. ", shardingContext);
    }
}
