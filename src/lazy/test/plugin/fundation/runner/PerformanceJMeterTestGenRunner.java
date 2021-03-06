package lazy.test.plugin.fundation.runner;

import lazy.test.plugin.fundation.model.AGTApplicationContext;
import lazy.test.plugin.fundation.model.TestCaseDataModel;

/**
 * Created by wyzhouqiang on 2016/1/4.
 */
public class PerformanceJMeterTestGenRunner extends PerformanceAbstractTestGenRunner {

    public PerformanceJMeterTestGenRunner(TestCaseDataModel model) {
        super(model);
    }

    @Override
    public void init(AGTApplicationContext context) {
    }

    @Override
    public void run() {
        writeTestCaseSource();
        writeTestCaseData();
    }
}
