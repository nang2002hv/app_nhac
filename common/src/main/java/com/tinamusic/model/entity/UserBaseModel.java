package com.tinamusic.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tinamusic.model.dto.PaymentMethodDto;
import com.tinamusic.model.dto.UserEmailDto;
import com.tinamusic.model.dto.UserPhoneDto;
import com.tinamusic.model.enums.GenderEnum;
import com.tinamusic.model.enums.RoleEnum;
import com.tinamusic.model.mapper.JsonConverter;
import com.tinamusic.util.DateUtil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class UserBaseModel extends BaseModel {
    @Id
    @UuidGenerator
    @Column(name = "id", length = 64, updatable = false, nullable = false)
    private String id;

    @Column(name = "user_lao_id", columnDefinition = "VARCHAR(20)", unique = true)
    private String userLaoId;

    @Column(name = "username", columnDefinition = "VARCHAR(64)")
    private String username;

    @Column(name = "first_name", columnDefinition = "VARCHAR(200)")
    private String firstName;

    @Column(name = "last_name", columnDefinition = "VARCHAR(200)")
    private String lastName;

    @Column(name = "avatar", columnDefinition = "VARCHAR(500)")
    private String avatar;

    @Column(name = "banner", columnDefinition = "VARCHAR(500)")
    private String banner;

    @JsonFormat(pattern = DateUtil.RESPONSE_DATE_FORMAT)
    private LocalDate dateOfBirth;

    @Column(name = "gender", columnDefinition = "TINYINT(4)")
    private GenderEnum gender;

    @Column(name = "public_id", columnDefinition = "VARCHAR(64)")
    private String publicId;

    @Column(name = "language", columnDefinition = "VARCHAR(20)")
    private String language;

    @Column(name = "email", columnDefinition = "LONGTEXT")
    @Convert(converter = JsonConverter.class)
    private List<UserEmailDto> email;

    @Column(name = "phoneNumber", columnDefinition = "LONGTEXT")
    @Convert(converter = JsonConverter.class)
    private List<UserPhoneDto> phoneNumber;

    @Column(name = "is_has_password", columnDefinition = "BIT")
    @JsonProperty("isHasPassword")
    private Boolean isHasPassword;

    @Column(name = "province", columnDefinition = "VARCHAR(200)")
    private String province;

    @Column(name = "country", columnDefinition = "INT(11)")
    private Integer country;

    @Column(name = "province_name", columnDefinition = "VARCHAR(64)")
    private String provinceName;

    @Column(name = "country_name", columnDefinition = "VARCHAR(64)")
    private String countryName;

    @Column(name = "is_verify", columnDefinition = "BIT")
    @JsonProperty("isVerify")
    private Boolean isVerify;

    @Column(name = "payment_methods", columnDefinition = "LONGTEXT")
    @Convert(converter = JsonConverter.class)
    private List<PaymentMethodDto> paymentMethods;

    @Column(name = "is_enable_fa", columnDefinition = "BIT")
    @JsonProperty("is_enable_fa")
    private Boolean isEnableMfa;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "role")
    private RoleEnum role;

    @Column(name ="password", columnDefinition = "VARCHAR(255)")
    @JsonIgnore
    private String password;
}
