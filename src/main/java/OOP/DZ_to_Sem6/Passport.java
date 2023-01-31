package OOP.DZ_to_Sem6;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Passport {
        private long id;
        private String name;
        private String lastName;
        private long dateOfBirth;
        private float dateOfGiven;
        private long departmentCode;

        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public Passport setName(String name) {
            this.name = name;
            return this;
        }
        public String getLastName() {
            return lastName;
        }
        public Passport setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public float getDateOfBirth() {
            return dateOfBirth;
        }
        public Passport setDateOfBirth(long dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public float getDateOfGiven() {
            return dateOfGiven;
        }
        public Passport setDateOfGiven(float dateOfGiven) {
            this.dateOfGiven = dateOfGiven;
            return this;

        }
        public long getDepartmentCode() {
            return departmentCode;
        }
        public Passport setDepartmentCode(long departmentCode) {
            this.departmentCode = departmentCode;
            return this;
        }

        @Override
//        public @NotNull String toString() {
//            return "Passport{" +
//                    "id=" + id +
//                    ", name='" + name + '\'' +
//                    ", lastName='" + lastName + '\'' +
//                    ", dateOfBirth=" + dateOfBirth +
//                    ", dateOfGiven=" + dateOfGiven +
//                    ", departmentCode=" + departmentCode +
//                    '}';

        public @NotNull String toString() {

//            if (id == null) {
//
//            }
            return "Passport{" +
                    "id=" + Optional.of(getId()).map(obj -> true) +
                    ", name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    ", dateOfGiven=" + dateOfGiven +
                    ", departmentCode=" + departmentCode +
                    '}';
        }
//    public @NotNull String toString() {
//        return  "\nID:            \t" + Optional.of(id).stream().filter(Objects::nonNull)+
//                "\nИмя:           \t" + Optional.ofNullable(name) +
//                "\nФамилия:       \t" + Optional.ofNullable(lastName) +
//                "\nДень рождения: \t" + Optional.of(dateOfBirth)+
//                "\nДата предоставления:        \t" + Optional.of(dateOfGiven)+
//                "\nКод отдела:     \t" + Optional.of(departmentCode);
//    }
//                Optional.of(name).stream().filter(Objects::nonNull).toString();
//    public @NotNull String toString() {
//            return
//                "\nID:            \t" + Optional.of(id).map(Long::getName()).filter(null).isPresent()+
//                "\nИмя:           \t" + Optional.of(name).map(obj -> true) +
//                "\nФамилия:       \t" + Optional.of(lastName).map(obj -> true) +
//                "\nДень рождения: \t" + Optional.of(dateOfBirth).map(obj -> true)+
//                "\nДата предоставления:        \t" + Optional.of(dateOfGiven).map(obj -> true)+
//                "\nКод отдела:     \t" + Optional.of(departmentCode).map(obj -> true);
    }

