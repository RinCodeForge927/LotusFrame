package rin.dev.admin.order;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import rin.dev.admin.BaseAdminServlet;
import rin.dev.data.dao.DatabaseDao;
import rin.dev.data.dao.OrderDao;

public class DeleteOrderServlet extends BaseAdminServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int orderId = Integer.parseInt(request.getParameter("id"));

        OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
        boolean success = orderDao.delete(orderId);

        if (success) {
            request.getSession().setAttribute("success", "Order deleted successfully!");
        } else {
            request.getSession().setAttribute("error", "Failed to delete order!");
        }

        response.sendRedirect(request.getContextPath() + "/admin/order");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
