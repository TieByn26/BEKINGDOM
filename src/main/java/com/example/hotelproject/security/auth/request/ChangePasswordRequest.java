package com.example.hotelproject.security.auth.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChangePasswordRequest {

    @NotEmpty
    @Min(value = 6, message = "Password must be at least 6 characters")
    private String currentPassword;
    @NotEmpty
    @Min(value = 6, message = "Password must be at least 6 characters")
    private String newPassword;
    @NotEmpty
    @Min(value = 6, message = "Password must be at least 6 characters")
    private String confirmationPassword;
}
