/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.util;

import poly.cafe.entity.User;

/**
 *
 * @author lengh
 */
public class XAuth {
    public static User user = User.builder()
            .username("DUY")
            .password("2005")
            .enabled(true)
            .manager(true)
            .fullname("Ngo Nguyen Khanh Duy")
            .photo("trump-small.png")
            .build(); // biến user này sẽ được thay thế sau khi đăng nhập
}
