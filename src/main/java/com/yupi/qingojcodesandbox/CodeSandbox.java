package com.yupi.qingojcodesandbox;

import com.yupi.qingojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.qingojcodesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
