package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Veiculo {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @NotNull(message = "O placa não pode ser nulo.")
     private String placa;

     @NotNull(message = "O modelo não pode ser nulo.")
     private String modelo;

     @NotNull(message = "O marca não pode ser nulo.")
     private String marca;

     @NotNull(message = "O ano modelo não pode ser nulo.")
     private Integer anoModelo;

     @NotNull(message = "O ano fabricacao não pode ser nulo.")
     private Integer anoFabricacao;

     @NotNull(message = "O cor não pode ser nulo.")
     private String cor;

     @NotNull(message = "O preço deve ser informado.")
     private BigDecimal preco;

}
