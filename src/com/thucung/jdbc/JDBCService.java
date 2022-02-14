package com.thucung.jdbc;

import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class JDBCService {

    private static PreparedStatement getPreparedStatement(String sql, Object... objects) {
        try {
            PreparedStatement ps = JDBC.getInstance().getConnection().prepareStatement(sql);
            if (objects.length > 0) {
                for (int i = 0; i < objects.length; i++) {
                    ps.setObject(i + 1, objects[i]);
                }
            }
            return ps;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private static CallableStatement getCallableStatement(String sql, Object... objects) {
        try {
            CallableStatement cs = JDBC.getInstance().getConnection().prepareCall(sql);
            if (objects.length > 0) {
                for (int i = 0; i < objects.length; i++) {
                    cs.setObject(i + 1, objects[i]);
                }
            }
            return cs;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static ResultSet executeProcedure(String sql, Object... objects) {
        CallableStatement cs = getCallableStatement(sql, objects);
        try {
            ResultSet rs = cs.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void executeProcedureIUD(String sql, Object... objects) {
        CallableStatement cs = getCallableStatement(sql, objects);
        try {
            cs.executeUpdate();
            cs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static int executeUpdate(String sql, Object... objects) {
        PreparedStatement ps = getPreparedStatement(sql, objects);
        int rowEffect = 0;
        try {
            rowEffect = ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rowEffect;
    }

    public static int executeUpdateInteger(String sql, Integer... objects) {
        int rowEffect = 0;
        try {
            PreparedStatement ps = JDBC.getInstance().getConnection().prepareStatement(sql);
            if (objects.length > 0) {
                for (int i = 0; i < objects.length; i++) {
                    ps.setObject(i + 1, objects[i]);
                }
            }
            rowEffect = ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rowEffect;
    }

    public static int executeDelete(String sql, Object... objects) {
        return executeUpdate(sql, objects);
    }

    public static int executeInsert(String sql, Object... objects) {
        return executeUpdate(sql, objects);
    }

    public static ResultSet executeSelect(String sql, Object... objects) {
        PreparedStatement ps = getPreparedStatement(sql, objects);
        try {
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static ResultSet executeHaveOutput(String sql, Object... objects) {
        PreparedStatement ps = getPreparedStatement(sql, objects);
        try {
            boolean success = ps.execute();
            if (success) {
                ResultSet rs = ps.getResultSet();
                return rs;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
