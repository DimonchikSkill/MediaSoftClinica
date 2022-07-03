package src.main.java;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<PatientCreator> patients = new ArrayList<>();
        List<DoctorCreator> doctors = new ArrayList<>();
        List<ReceptionCreator> receptionList = new ArrayList<>();
        String[] statuses = {"New", "In progress", "Cancel"};

        if(Authentication.authenticate() == 0) {

            Scanner sc = new Scanner(System.in);
            int value;

            do {
                System.out.println("1-Create doctor");
                System.out.println("2-Create patient");
                System.out.println("3-Create reception");
                System.out.println("4-Change reception status");
                System.out.println("5-Get patient reception");
                System.out.println("6-Get all patients");
                System.out.println("7-Edit patient");
                System.out.println("8-Delete patient");
                System.out.println("9-exit");
                System.out.println("Type command: ");
                value = sc.nextInt();

                switch (value) {
                    case 1:
                        String doctorName;
                        String doctorLastname;
                        String doctorPatronymic;
                        String post;
                        System.out.println("Type firstname");
                        doctorName = sc.next();
                        System.out.println("Type lastname");
                        doctorLastname = sc.next();
                        System.out.println("Type patronymic");
                        doctorPatronymic = sc.next();
                        System.out.println("Type post");
                        post = sc.next();
                        DoctorCreator doctor = new DoctorCreator(doctorName, doctorLastname, doctorPatronymic, post);
                        doctors.add(doctor);
                        break;

                    case 2:
                        String patientName;
                        String patientLastName;
                        String patientPatronymic;
                        System.out.println("Type firstname");
                        patientName = sc.next();
                        System.out.println("Type lastname");
                        patientLastName = sc.next();
                        System.out.println("Type patronymic");
                        patientPatronymic = sc.next();
                        PatientCreator patient = new PatientCreator(patientName, patientLastName, patientPatronymic, Date.from(Instant.now()));
                        patients.add(patient);
                        break;

                    case 3:
                        String date;
                        int doctorId;
                        int patientId;
                        int indexStatus;

                        try {
                        System.out.println("Type date");
                        date = sc.next();
                        System.out.println("Type doctor id");
                        doctorId = sc.nextInt();
                        DoctorCreator selectDoctor = doctors.get(doctorId);
                        System.out.println("Type patient id");
                        patientId = sc.nextInt();
                        PatientCreator selectPatient = patients.get(patientId);
                        System.out.println("Select status 0-New");
                        System.out.println("Select status 1-In progress");
                        System.out.println("Select status 1-Cancel");
                        System.out.println("Select status 1-Finish");
                        indexStatus = sc.nextInt();
                        ReceptionCreator reception = new ReceptionCreator(selectDoctor, selectPatient, date, statuses[indexStatus]);
                        receptionList.add(reception); } catch (Exception e){
                            System.out.println("Invalid data try again");
                        }
                        break;

                    case 4:
                        int receptionId;

                        try {
                        System.out.println("Type reception id");
                        receptionId = sc.nextInt();
                        System.out.println("Select status 0-New");
                        System.out.println("Select status 1-In progress");
                        System.out.println("Select status 1-Cancel");
                        System.out.println("Select status 1-Finish");
                        indexStatus = sc.nextInt();
                        receptionList.get(receptionId).setStatus(statuses[indexStatus]);
                        break;} catch (Exception e) {
                            System.out.println("Invalid data try again");
                        }

                    case 5:
                        try{
                        System.out.println("Type patient id");
                        patientId = sc.nextInt();
                            for (ReceptionCreator receptionCreator : receptionList) {
                                if (receptionCreator.getPatient() == patients.get(patientId)) {
                                    System.out.println("Patient firstname: " + receptionCreator.getPatient().getFirstname());
                                    System.out.println("Patient lastname: " + receptionCreator.getPatient().getLastname());
                                    System.out.println("Visit date: " + receptionCreator.getDate());
                                    System.out.println("Doctor: " + receptionCreator.getDoctor().getFirstname() + " " + receptionCreator.getDoctor().getLastname());
                                    System.out.println("Visit status: " + receptionCreator.getStatus());
                                }
                            }


                        break;} catch (Exception e){
                            System.out.println("Invalid data try again");
                        }
                    case 6:
                        for (int i = 0; i < patients.size(); i ++){
                            System.out.println("Id: "+ i + " Patient name: "+ patients.get(i).getFirstname()+ " Patient lastname: "+ patients.get(i).getLastname() + " Register/edit date: "+ patients.get(i).getDate());

                        }
                        break;

                    case 7:
                        try{
                        System.out.println("Type patientId");
                        patientId = sc.nextInt();
                        System.out.println("Type firstname");
                        patientName = sc.next();
                        System.out.println("Type lastname");
                        patientLastName = sc.next();
                        System.out.println("Type patronymic");
                        patientPatronymic = sc.next();
                        patients.set(patientId, new PatientCreator(patientName, patientLastName, patientPatronymic, Date.from(Instant.now())));
                        break;} catch (Exception e) {
                            System.out.println("Invalid data try again");
                        }

                    case 8:
                        try {
                        System.out.println("Type patientId");
                        patientId = sc.nextInt();
                        patients.remove(patientId);
                        break;} catch (Exception e){
                            System.out.println("Invalid data try again");
                        }

                    case 9:
                        System.out.println("Exit");
                        break;

                }

            } while (value != 9);


        }else {
            System.out.println("fail");

        }

    }
}
