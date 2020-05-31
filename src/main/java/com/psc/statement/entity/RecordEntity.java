package com.psc.statement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "record", schema = "psc1", catalog = "")
public class RecordEntity {
    private int recordId;
    private String excelName;
    private String excelState;

    @Id
    @Column(name = "record_id")
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "excel_name")
    public String getExcelName() {
        return excelName;
    }

    public void setExcelName(String excelName) {
        this.excelName = excelName;
    }

    @Basic
    @Column(name = "excel_state")
    public String getExcelState() {
        return excelState;
    }

    public void setExcelState(String excelState) {
        this.excelState = excelState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordEntity that = (RecordEntity) o;
        return recordId == that.recordId &&
                Objects.equals(excelName, that.excelName) &&
                Objects.equals(excelState, that.excelState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, excelName, excelState);
    }
}
