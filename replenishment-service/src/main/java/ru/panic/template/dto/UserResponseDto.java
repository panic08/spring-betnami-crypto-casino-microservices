package ru.panic.template.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.panic.template.entity.enums.Gender;
import ru.panic.template.entity.enums.Rank;
@Data
public class UserResponseDto {
    private Long id;
    private String username;
    @JsonIgnore
    private String password;
    private Data data;
    private UserData userData;
    private Long timestamp;
    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data{
        private Double btcBalance;
        private Double ethBalance;
        private Double ltcBalance;
        private Double solBalance;
        private Double trxBalance;
        private Double xrpBalance;
        private Double dogeBalance;
        private String ipAddress;
        @Embedded
        private Level level;
        private Boolean isAccountNonLocked;
        private Boolean isMultiAccount;
        @AllArgsConstructor
        @NoArgsConstructor
        @lombok.Data
        public static class Level{
            private Rank rank;
            private Double progress;
        }
    }
    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserData{
        private String firstname;
        private String lastname;
        private String birthday;
        private Gender gender;
        @Embedded
        private Address address;
        @NoArgsConstructor
        @AllArgsConstructor
        @lombok.Data
        public static class Address{
            private String country;
            private String street;
            private Integer postcode;
            private String city;
        }
    }
}