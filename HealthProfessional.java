public abstract class HealthProfessional {
    private int id;
    private String name;
    private long phone;  // 改为long类型

    // 构造方法参数改为long
    public HealthProfessional(int id, String name, long phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public abstract void displayDetails();

    public int getId() { return id; }
    public String getName() { return name; }
    public long getPhone() { return phone; }  // 返回类型改为long
}
