package pl.sda.finalproject.model;

import javax.persistence.*;

@Entity
public class CommunityAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lg;
    private String bankName;
    private String number;
    private boolean inactive;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(foreignKey = @ForeignKey(name = "FK_COMMUNITY_ID"))
//    private Community community;

    public CommunityAccount() {
    }

    public Long getLg() {
        return lg;
    }

    public void setLg(Long lg) {
        this.lg = lg;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }


}
