public class Pediatrician extends HealthProfessional {
    private String ageRange;

    // 父类电话参数改为long
    public Pediatrician(int id, String name, long phone, String ageRange) {
        super(id, name, phone);
        this.ageRange = ageRange;
    }

    @Override
    public void displayDetails() {
        System.out.println("儿科医生 ID: " + getId());
        System.out.println("姓名: " + getName());
        System.out.println("电话: " + getPhone());  // 自动适配long类型
        System.out.println("接诊年龄: " + ageRange);
        System.out.println("---------------------");
    }
}
