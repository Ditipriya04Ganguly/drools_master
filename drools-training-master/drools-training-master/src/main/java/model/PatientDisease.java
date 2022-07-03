package model;

import java.time.LocalDate;
import java.util.*;

public class PatientDisease {

   private Map<Patient, Set<String>> maplist= new HashMap<>();

    public void addPatient(Patient patient, String disease)
    {
       Set<String> diseaseset=new HashSet<>();
       if(maplist.get(patient)==null)
       {
          diseaseset.add(disease);
          maplist.put(patient,diseaseset);
       }
       else {
          diseaseset=maplist.get(patient);
          diseaseset.add(disease);
          maplist.put(patient,diseaseset);

       }

    }

   public Map<Patient, Set<String>> getMaplist() {
      return maplist;
   }

   public void setMaplist(Map<Patient, Set<String>> maplist) {
      this.maplist = maplist;
   }

   public boolean checkDisease(Patient p) {
      if (maplist.get(p) == null) {
         return false;
      }
      return true;
   }
}
