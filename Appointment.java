public class Appointment {
    private String patientName;
    private long patientPhone;  // 改为long类型
    private HealthProfessional doctor;

    // 患者电话参数改为long
    public Appointment(String patientName, long patientPhone, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.doctor = doctor;
    }

    public void displayAppointment() {
        System.out.println("患者姓名: " + patientName);
        System.out.println("患者电话: " + patientPhone);  // 自动适配long类型
        System.out.println("预约医生: " + doctor.getName() + " (ID: " + doctor.getId() + ")");
        System.out.println("---------------------");
    }

    public long getPatientPhone() { return patientPhone; }  // 返回类型改为long
}
