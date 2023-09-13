/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.vn.itf;

import edu.vn.models.Employee;
import java.util.List;

/**
 *
 * @author numpa
 */
public interface InterfaceEmployee {
    /**
    * Cung cấp hoặc cập nhật nhân viên. Phương pháp này được gọi để đáp ứng khi người dùng nhấp vào nút lưu trong danh
    * 
    * @param e - Nhân viên để lưu hoặc cập nhật. Nếu nó là không hợp lệ hoặc không hợp lệ Nhân viên một NullPointerException sẽ
    * 
    * @return Số hàng được cập nhật hoặc nhập (0 hoặc 1).
    */
    int save(Employee e);
    /**
    * Xóa một nút từ cơ sở dữ liệu. Đây là một lệnh không - op nếu nút không tồn tại.
    * 
    * @param id - ID của nút để xóa. Nó phải là một chuỗi xác định một nút duy nhất trong cơ sở dữ liệu.
    * 
    * @return Số lượng nút bị xóa hoặc - 1 khi lỗi (không tìm thấy / không có nút như vậy). Lưu ý rằng đây có thể
    */
    int del(String id);
    /**
    * Tìm hàng với ID được cung cấp. Điều này được sử dụng bởi cột ID để xác định hàng nào để chọn.
    * 
    * @param id - ID của hàng để chọn. Nếu null hoặc " " tất cả hàng được chọn.
    * 
    * @return Số hàng hoặc - 1 nếu không được tìm thấy (hoặc không có hàng được tìm thấy).
    */
    int findByID(String id);
    /**
    * Trả lại nhân viên vào vị trí được chỉ định. Phương pháp này hữu ích để xác định liệu có người dùng có khả năng
    * 
    * @param index - vị trí của nhân viên được trả về
    * 
    * @return nhân viên tại vị trí được chỉ định trong danh sách nhân viên hoặc không có việc làm nếu không có nhân viên
    */
    Employee getEmployeeByPosition (int index);
    /**
    * Mở tệp nhân viên. Phương pháp này được gọi bởi người dùng khi anh ta nhấp vào nút tệp.
    * 
    * 
    * @return danh sách các đối tượng nhân viên có thể được sử dụng để tương tác với tệp hoặc không hiệu quả nếu có
    */
    List<Employee> openFile();
    /**
    * Cung cấp danh sách nhân viên để lưu. Phương pháp này được gọi là File. save () và có thể được sử dụng để
    * 
    * @param ls - Danh sách nhân viên để lưu vào tệp. Danh sách được sắp xếp
    */
    void saveFile(List<Employee> ls);
    /**
    * Trả lại danh sách tất cả nhân viên. Điều này hữu ích để gỡ lỗi và để tránh phải gọi getAll () mỗi khi bạn
    * 
    * 
    * @return danh sách tất cả
    */
    List <Employee> getAlls();
    /**
    * Trả lại số lượng các yếu tố trong danh sách này. Đây là một hoạt động thời gian liên tục. Không sử dụng trong mã
    * 
    * 
    * @return số các yếu tố trong danh sách này hoặc - 1 nếu không có yếu tố trong danh sách này (hoặc nó là danh sách trống
    */
    int count();
}

