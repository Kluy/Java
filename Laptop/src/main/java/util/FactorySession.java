//package util;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class FactorySession {
//    private static SessionFactory sessionFactory;
//    static {
//        sessionFactory = new Configuration().configure().buildSessionFactory();
//    }
//    public Session getSession() {
//            return sessionFactory.openSession();
//        }
//        public static void close() {
//            sessionFactory.close();
//        }
//}
