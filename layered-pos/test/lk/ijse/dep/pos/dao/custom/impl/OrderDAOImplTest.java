package lk.ijse.dep.pos.dao.custom.impl;


import lk.ijse.dep.pos.dao.DAOFactory;
import lk.ijse.dep.pos.dao.DAOTypes;
import lk.ijse.dep.pos.dao.custom.OrderDAO;

class OrderDAOImplTest {

    public static void main(String[] args) throws Exception {
        new OrderDAOImplTest().existByCustomerId();
    }

    void existByCustomerId() throws Exception {
        OrderDAO dao= DAOFactory.getInstance().getDAO(DAOTypes.ORDER);
        System.out.println(dao.existByCustomerId("C001"));
    }
}