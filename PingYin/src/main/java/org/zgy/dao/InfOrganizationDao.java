package org.zgy.dao.impl;

import org.zgy.entity.InfOrganization;
import org.zgy.dao.InfOrganizationRepository;
import org.zgy.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @title: InfOrganizationRepositoryImpl
 * @Author ZhangGuanYi
 * @Date: 2022/6/7 15:51
 * @Version 1.0
 */
public class InfOrganizationRepositoryImpl implements InfOrganizationRepository {
    @Override
    public void update(String namePinyin){
        try {
            Connection connection = JDBCUtil.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql = "update inf_organization set name_pinyin = ? where name = ?";

    }

    @Override
    public List<InfOrganization> findAll(){
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql = "select * from inf_organization";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<InfOrganization> list = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(new InfOrganization(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getDate(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection,preparedStatement,resultSet);
        }
        return list;
    }
}
