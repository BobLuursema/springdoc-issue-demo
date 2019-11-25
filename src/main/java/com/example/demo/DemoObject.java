package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Valid
public class DemoObject {

  @Size(min = 1, max = 1000)
  private long id;

  @Schema(description = "This is the name")
  @NotNull
  private String name;

  @Schema(hidden = true)
  private String value;

  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  @Schema(hidden = true)
  private LocalDateTime updateDateTime;

  public String getValue() {
    return this.value;
  }
}
