package com.yupi.qingojcodesandbox;

import com.yupi.qingojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.qingojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * java原生实现 复用模板方法
 */
@Component
public class JavaNativeCodeSandbox extends JavaSandboxTemplate {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
