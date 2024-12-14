package com.yupi.qingojcodesandbox.security;

import java.security.Permission;

/**
 * 默认所有权限安全管理器
 */
public class DefaultSecurityManager extends SecurityManager{

    //检查所有权限
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何权限限制。");
        System.out.println(perm);
//        super.checkPermission(perm);
    }
}
