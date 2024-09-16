//package com.java.jvm_ebook.config
//
//import jakarta.persistence.EntityManagerFactory
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories
//import org.springframework.orm.jpa.JpaTransactionManager
//import org.springframework.transaction.PlatformTransactionManager
//import org.springframework.transaction.annotation.EnableTransactionManagement
//
//
//@Configuration
//@EnableJpaRepositories(enableDefaultTransactions = false)
//@EnableTransactionManagement
//class PersistenceConfig {
////    @Bean
////    fun transactionManager(entityManagerFactory: EntityManagerFactory?): PlatformTransactionManager {
////        val transactionManager = JpaTransactionManager()
////        transactionManager.entityManagerFactory = entityManagerFactory
////        transactionManager.defaultTimeout = 300 // Se necessário, defina o tempo limite padrão
////        transactionManager.isGlobalRollbackOnParticipationFailure =
////            true // Defina o rollback global em caso de falha de participação
////        transactionManager.isNestedTransactionAllowed = true // Permita transações aninhadas se necessário
////        transactionManager.isValidateExistingTransaction = true // Valide transações existentes
////        transactionManager.dataSource = dataSource() // Defina o DataSource
////        transactionManager.commit(false) // Desative o autocommit padrão
////        return transactionManager
////    }
//}