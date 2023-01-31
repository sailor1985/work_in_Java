package OOP.DZ_to_Sem6;

import org.jetbrains.annotations.NotNull;

class Worker {
    private final String name;
    private final String lastName;
    private final float salary;
    private final Passport passport;
    private final int phoneNumber;
    private final byte cabinet;
    Worker(@NotNull EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        lastName = employeeBuilder.lastName;
        salary = employeeBuilder.salary;
        passport = employeeBuilder.passportId;
        phoneNumber = employeeBuilder.phoneNumber;
        cabinet = employeeBuilder.cabinet;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public float getSalary() {
        return salary;
    }
    public Passport getPassport() {
        return passport;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public byte getCabinet() {
        return cabinet;
    }
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", passport=" + passport +
                ", phoneNumber=" + phoneNumber +
                ", cabinet=" + cabinet +
                '}';
    }

}
