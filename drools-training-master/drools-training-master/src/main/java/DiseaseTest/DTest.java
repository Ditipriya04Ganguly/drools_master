package DiseaseTest;


import model.Patient;
import model.PatientDisease;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class DTest {
    public static void main(String[] args){
        try {
            KieSession ksession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("diseaserules");
            Set<String> ICD10= new HashSet<>();
//
//            Set<String> icdcode= new HashSet<String>();
//            icdcode.add("R13.1");
//            icdcode.add("R63.4");

            Patient p= new Patient(1,"R13.1", "Active", LocalDate.of(2022,06,30) );
            Patient p3= new Patient(1,"R63.4", "Active", LocalDate.of(2022,06,30) );
            Patient pp1= new Patient(2, "E46", "Active", LocalDate.of(2021, 05,01));
            Patient pp2= new Patient(3,"E46","inactive", LocalDate.of(2022,04,01));


            PatientDisease patientDisease= new PatientDisease();

            ksession.insert(p);
            ksession.insert(p3);
            ksession.insert(pp1);
            ksession.insert(pp2);

            ksession.insert(LocalDate.now());
            ksession.insert(patientDisease);
            ksession.fireAllRules();
            ksession.dispose();
            //System.out.println(p);

            for(Patient p1: patientDisease.getMaplist().keySet())
            {
                System.out.print("patient with id "+p1.getId()+" has disease ");
                System.out.println(patientDisease.getMaplist().get(p1));
                System.out.println("Prefill value: "+ p1.getPreFill());

            }



        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}

