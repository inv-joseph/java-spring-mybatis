/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.innovaturelabs.spring.web.security;

import java.com.innovaturelabs.spring.web.orm.dao.UserSnsDao;
import java.com.innovaturelabs.spring.web.orm.entity.UserSns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author nirmal
 */
public class DaoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserSnsDao userSnsDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserSns userSns = userSnsDao.getUserSns(username);
        if (null == userSns) {
            throw new UsernameNotFoundException(username);
        }
        return new DaoUserDetails(userSns);
    }
}
