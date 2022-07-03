package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class Patient {

    private int id;
    private String ICD10;
    private String status;
    private LocalDate timeframe;
    private String preFill;

    public Patient(int id,String ICD10, String status, LocalDate timeframe) {
        this.id=id;
        this.ICD10 = ICD10;
        this.status = status;
        this.timeframe = timeframe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getICD10() {
        return ICD10;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getTimeframe() {
        return timeframe;
    }


    public void setICD10(String ICD10) {
        this.ICD10 = ICD10;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTimeframe(LocalDate timeframe) {
        this.timeframe = timeframe;
    }


    public String getPreFill() {
        return preFill;
    }

    public void setPreFill(String preFill) {
        this.preFill = preFill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", ICD10='" + ICD10 + '\'' +
                ", status='" + status + '\'' +
                ", timeframe=" + timeframe +
                ", preFill='" + preFill + '\'' +
                '}';
    }
}
