package com.in28minutes.spring.basics.step15.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component("JdbcConnectionStep15")

//i21c PROTOTYPE
//i21c: v1
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//i21c: w tym przypadku zawsze bedzie zwracany ten sam obiekt bo obiekt nadrzędny został stworzony tylko raz i nie ma potrzeby tworzenia obiektu podrzędnego ponownie

//i21c: v2
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,  proxyMode = ScopedProxyMode.TARGET_CLASS)
//i21c: w tym przypadku mówimy, HEY spring, jakikolwiek scope ma obiekt nadrzędny to wymuś Tworzenie tego obiektu od nowa przy każdym zapytaniu

//i21c: RULE OF THUMB: trzymac ilosc nowych obiektow minimalna - lepiej singletony niz proxy miec

public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
