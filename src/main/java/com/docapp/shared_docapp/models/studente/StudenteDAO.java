package com.docapp.shared_docapp.models.studente;

import com.docapp.shared_docapp.dao_related.DAO;
import com.docapp.shared_docapp.dao_related.GenericDAO;
import com.docapp.shared_docapp.dao_related.SQLDAO;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class StudenteDAO extends SQLDAO implements DAO<Studente> {
    public StudenteDAO(DataSource source) {
        super(source);
    }

    @Override
    public List<Studente> doRetrieveByCondition(String condition) throws SQLException {
        return GenericDAO.genericDoRetrieveByCondition(Studente.TABLE_NAME, condition, new StudenteExtractor(), source);
    }

    @Override
    public List<Studente> doRetrieveByConditionWithLimit(String condition, int limit) throws SQLException {
        return GenericDAO.genericDoRetrieveByConditionWithLimit(Studente.TABLE_NAME, condition, limit, new StudenteExtractor(), source);
    }

    @Override
    public List<Studente> doRetrieveByConditionWithLimitAndOffset(String condition, int limit, int offset) throws SQLException {
        return null;
    }

    @Override
    public List<Studente> doRetrieveByConditionWithLimitAndOffsetAndOrder(String condition, int limit, int offset, String order) throws SQLException {
        return null;
    }

    @Override
    public Studente doRetrieveByKey(String key) throws SQLException {
        return null;
    }

    @Override
    public List<Studente> doRetrieveAll() throws SQLException {
        return GenericDAO.genericDoRetrieveAll(Studente.TABLE_NAME, new StudenteExtractor(), source);
    }

    @Override
    public List<Studente> doRetrieveAllWithLimit(int limit) throws SQLException {
        return GenericDAO.genericDoRetrieveAllWithLimit(Studente.TABLE_NAME, limit, new StudenteExtractor(), source);
    }

    @Override
    public List<Studente> doRetrieveAllWithLimitAndOffset(int limit, int offset) throws SQLException {
        return null;
    }

    @Override
    public void doSave(Studente object) throws SQLException {

    }

    @Override
    public void doUpdate(Studente object) throws SQLException {

    }

    @Override
    public void doDelete(Studente object) throws SQLException {

    }

    @Override
    public void doSaveOrUpdate(Studente object) throws SQLException {

    }


}
