package com.xy.android.crininalintent.db;

/**
 * Created by xy on 2017/11/10.
 */

public class CrimeDBSchema {
    public static final class CrimeTable{
        public static final String NAME = "crimes"; //表名

        // 字段
        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
