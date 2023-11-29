/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venda.modelo;

/**
 *
 * @author user
 */
import java.math.BigDecimal;
import java.util.Date;

public class ValorRecebidoPorDia {
    private Date data;
    private BigDecimal valorTotal;

    // Construtor vazio
    public ValorRecebidoPorDia() {
    }

    // Getters e Setters
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
