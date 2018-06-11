package com.lotus.development.LearnSpringBootEasy;

/**
 * Created by jbalakr on 6/11/18.
 */
public class Department {
    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    private int deptId;

    private String deptName;

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }
}
