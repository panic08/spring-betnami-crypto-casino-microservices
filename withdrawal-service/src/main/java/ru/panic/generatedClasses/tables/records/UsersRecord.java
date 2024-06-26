/*
 * This file is generated by jOOQ.
 */
package ru.panic.generatedClasses.tables.records;


import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import ru.panic.generatedClasses.tables.Users;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.users.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.users.btc_balance</code>.
     */
    public void setBtcBalance(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.users.btc_balance</code>.
     */
    public Double getBtcBalance() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>public.users.eth_balance</code>.
     */
    public void setEthBalance(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.users.eth_balance</code>.
     */
    public Double getEthBalance() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.users.ip_address</code>.
     */
    public void setIpAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.users.ip_address</code>.
     */
    public String getIpAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.users.is_account_non_locked</code>.
     */
    public void setIsAccountNonLocked(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.users.is_account_non_locked</code>.
     */
    public Boolean getIsAccountNonLocked() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.users.is_multi_account</code>.
     */
    public void setIsMultiAccount(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.users.is_multi_account</code>.
     */
    public Boolean getIsMultiAccount() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.users.progress</code>.
     */
    public void setProgress(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.users.progress</code>.
     */
    public Double getProgress() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.users.rank</code>.
     */
    public void setRank(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.users.rank</code>.
     */
    public String getRank() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.users.ltc_balance</code>.
     */
    public void setLtcBalance(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.users.ltc_balance</code>.
     */
    public Double getLtcBalance() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>public.users.matic_balance</code>.
     */
    public void setMaticBalance(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.users.matic_balance</code>.
     */
    public Double getMaticBalance() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>public.users.tethererc20balance</code>.
     */
    public void setTethererc20balance(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.users.tethererc20balance</code>.
     */
    public Double getTethererc20balance() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>public.users.ton_balance</code>.
     */
    public void setTonBalance(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.users.ton_balance</code>.
     */
    public Double getTonBalance() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>public.users.trx_balance</code>.
     */
    public void setTrxBalance(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.users.trx_balance</code>.
     */
    public Double getTrxBalance() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>public.users.xrp_balance</code>.
     */
    public void setXrpBalance(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.users.xrp_balance</code>.
     */
    public Double getXrpBalance() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>public.users.password</code>.
     */
    public void setPassword(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.users.password</code>.
     */
    public String getPassword() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.users.timestamp</code>.
     */
    public void setTimestamp(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.users.timestamp</code>.
     */
    public Long getTimestamp() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>public.users.city</code>.
     */
    public void setCity(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.users.city</code>.
     */
    public String getCity() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.users.country</code>.
     */
    public void setCountry(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.users.country</code>.
     */
    public String getCountry() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.users.postcode</code>.
     */
    public void setPostcode(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.users.postcode</code>.
     */
    public Integer getPostcode() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.users.street</code>.
     */
    public void setStreet(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.users.street</code>.
     */
    public String getStreet() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.users.birthday</code>.
     */
    public void setBirthday(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.users.birthday</code>.
     */
    public String getBirthday() {
        return (String) get(20);
    }

    /**
     * Setter for <code>public.users.firstname</code>.
     */
    public void setFirstname(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.users.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(21);
    }

    /**
     * Setter for <code>public.users.gender</code>.
     */
    public void setGender(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.users.gender</code>.
     */
    public String getGender() {
        return (String) get(22);
    }

    /**
     * Setter for <code>public.users.lastname</code>.
     */
    public void setLastname(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.users.lastname</code>.
     */
    public String getLastname() {
        return (String) get(23);
    }

    /**
     * Setter for <code>public.users.username</code>.
     */
    public void setUsername(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.users.username</code>.
     */
    public String getUsername() {
        return (String) get(24);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Long id, Double btcBalance, Double ethBalance, String ipAddress, Boolean isAccountNonLocked, Boolean isMultiAccount, Double progress, String rank, Double ltcBalance, Double maticBalance, Double tethererc20balance, Double tonBalance, Double trxBalance, Double xrpBalance, String password, Long timestamp, String city, String country, Integer postcode, String street, String birthday, String firstname, String gender, String lastname, String username) {
        super(Users.USERS);

        setId(id);
        setBtcBalance(btcBalance);
        setEthBalance(ethBalance);
        setIpAddress(ipAddress);
        setIsAccountNonLocked(isAccountNonLocked);
        setIsMultiAccount(isMultiAccount);
        setProgress(progress);
        setRank(rank);
        setLtcBalance(ltcBalance);
        setMaticBalance(maticBalance);
        setTethererc20balance(tethererc20balance);
        setTonBalance(tonBalance);
        setTrxBalance(trxBalance);
        setXrpBalance(xrpBalance);
        setPassword(password);
        setTimestamp(timestamp);
        setCity(city);
        setCountry(country);
        setPostcode(postcode);
        setStreet(street);
        setBirthday(birthday);
        setFirstname(firstname);
        setGender(gender);
        setLastname(lastname);
        setUsername(username);
        resetChangedOnNotNull();
    }
}
