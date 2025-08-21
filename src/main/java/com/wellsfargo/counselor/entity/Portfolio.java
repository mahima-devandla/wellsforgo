package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "portfolios")
public class Portfolio {

    @Id
    @GeneratedValue()
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private LocalDate creationDate;

    protected Portfolio() {
    }

    public Portfolio(Client client, LocalDate creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
