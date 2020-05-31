package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "record_detail", schema = "psc1", catalog = "")
public class RecordDetailEntity {
    private int recordDetailId;
    private Integer recordId;
    private String tableName;
    private String tableFieldName;
    private String tableFieldNameZh;
    private String tableFieldType;

    @Id
    @Column(name = "record_detail_id")
    public int getRecordDetailId() {
        return recordDetailId;
    }

    public void setRecordDetailId(int recordDetailId) {
        this.recordDetailId = recordDetailId;
    }

    @Basic
    @Column(name = "record_id")
    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "table_name")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "table_field_name")
    public String getTableFieldName() {
        return tableFieldName;
    }

    public void setTableFieldName(String tableFieldName) {
        this.tableFieldName = tableFieldName;
    }

    @Basic
    @Column(name = "table_field_name_zh")
    public String getTableFieldNameZh() {
        return tableFieldNameZh;
    }

    public void setTableFieldNameZh(String tableFieldNameZh) {
        this.tableFieldNameZh = tableFieldNameZh;
    }

    @Basic
    @Column(name = "table_field_type")
    public String getTableFieldType() {
        return tableFieldType;
    }

    public void setTableFieldType(String tableFieldType) {
        this.tableFieldType = tableFieldType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordDetailEntity that = (RecordDetailEntity) o;
        return recordDetailId == that.recordDetailId &&
                Objects.equals(recordId, that.recordId) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(tableFieldName, that.tableFieldName) &&
                Objects.equals(tableFieldNameZh, that.tableFieldNameZh) &&
                Objects.equals(tableFieldType, that.tableFieldType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordDetailId, recordId, tableName, tableFieldName, tableFieldNameZh, tableFieldType);
    }
}
