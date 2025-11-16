import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public static void main(String[] args) {
        // 电话号码后加L，表示long类型（关键修复）
        HealthProfessional gp = new GeneralPractitioner(
                101, "张医生", 13800001111L, "内科、全科"
        );
        HealthProfessional ped = new Pediatrician(
                201, "李医生", 13900002222L, "0-12岁"
        );

        System.out.println("===== 医生信息 =====");
        gp.displayDetails();
        ped.displayDetails();

        List<Appointment> appointments = new ArrayList<>();

        // 患者电话加L
        appointments.add(new Appointment("丰兆", 13500000000L, gp));
        appointments.add(new Appointment("旺仔", 13600004444L, ped));
        appointments.add(new Appointment("水壶", 13700005555L, gp));

        System.out.println("\n===== 所有预约 =====");
        for (Appointment app : appointments) {
            app.displayAppointment();
        }

        // 取消的电话加L
        long cancelPhone = 13500000000L;
        appointments.removeIf(app -> app.getPatientPhone() == cancelPhone);

        System.out.println("\n===== 取消电话为" + cancelPhone + "的预约后 =====");
        for (Appointment app : appointments) {
            app.displayAppointment();
        }
    }
}
