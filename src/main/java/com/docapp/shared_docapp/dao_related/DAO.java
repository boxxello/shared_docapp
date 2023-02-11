package com.docapp.shared_docapp.dao_related;

import java.util.List;
import java.sql.SQLException;
import java.util.logging.Logger;

public interface DAO<T> {
    Logger logger= Logger.getLogger(DAO.class.getName());
    List<T> doRetrieveByCondition(String condition) throws SQLException;
    List<T> doRetrieveByConditionWithLimit(String condition, int limit) throws SQLException;
    List<T> doRetrieveByConditionWithLimitAndOffset(String condition, int limit, int offset) throws SQLException;
    T doRetrieveByKey(String key) throws SQLException;
    List<T> doRetrieveAll() throws SQLException;
    List<T> doRetrieveAllWithLimit(int limit) throws SQLException;
    List<T> doRetrieveAllWithLimitAndOffset(int limit, int offset) throws SQLException;
    void doSave(T object) throws SQLException;
    List<T> doUpdate(String condition, T object) throws SQLException;
    void doDelete(T object) throws SQLException;
    void doSaveOrUpdate(T object) throws SQLException;
}
