package com.wch.euexam.service;


import com.wch.euexam.domain.User;

/**
 * @author WCH
 */
public interface AuthenticationService {

    /**
     * authUser
     *
     * @param username username
     * @param password password
     * @return boolean
     */
    boolean authUser(String username, String password);



    /**
     * authUser
     *
     * @param user     user
     * @param username username
     * @param password password
     * @return boolean
     */
    boolean authUser(User user, String username, String password);

    /**
     * pwdEncode
     *
     * @param password password
     * @return String
     */
    String pwdEncode(String password);

    /**
     * pwdDecode
     *
     * @param endodePwd endodePwd
     * @return String
     */
    String pwdDecode(String endodePwd);
}
