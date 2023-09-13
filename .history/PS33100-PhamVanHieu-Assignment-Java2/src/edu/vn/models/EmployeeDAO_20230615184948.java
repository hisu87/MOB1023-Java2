/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.models;

import edu.vn.itf.InterfaceEmployee;
import edu.vn.ultils.FileUltil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author numpa
 */
public class EmployeeDAO implements InterfaceEmployee{
    
    public static List<Employee> ls = new ArrayList<>();

    /**
    * Bảo lưu nhân viên vào cơ sở dữ liệu. Nếu nhân viên đã có trong cơ sở dữ liệu nó được cập nhật nếu không một hồ
    * 
    * @param e - Nhân viên được cứu
    * 
    * @return 1 nếu thành công 0 nếu không (trừ exception được ném trong trường hợp này) - 1 được trả về để chỉ ra rằng đã
    */
    @Override
    public int save(Employee e) {
        int position = findByID(e.getId());
        // Đặt vị trí của danh sách
        if (position < 0) {
            ls.add(e);
        }else{
            ls.set(position, e);
        }
        return 1;
    }

    /**
    * Xóa phần tử với id được chỉ định khỏi danh sách. Nếu phần tử không được tìm thấy không xảy ra gì.
    * 
    * @param id - ID của yếu tố để xóa. Nó phải là một chuỗi dài ít nhất 2
    * 
    * @return vị trí của
    */
    @Override
    public int del(String id) {
        int position = findByID(id);
        // Xóa vị trí tại vị trí được đưa ra khỏi danh sách.
        if (position >= 0) {
            ls.remove(position);
        }
        return position;
    }

    /**
    * Tìm vị trí của nút với id được cung cấp. Nếu không có nút với id được cung cấp được tìm thấy - 1 được trả về
    * 
    * @param id - ID của nút
    * 
    * @return vị trí của nút với id được đưa ra hoặc - 1 nếu không có nút với id được đưa ra là
    */
    @Override
    public int findByID(String id) {
        int position = -1;
        // Tìm vị trí của sự xuất hiện đầu tiên trong danh sách.
        for (int i = 0; i < ls.size(); i++) {
            // Tìm vị trí của mục trong danh sách.
            if (ls.get(i).getId().equals(id)) {
                position = i;
                break;
            }
        }
       return position;
    }

    /**
    * Trả lại nhân viên vào vị trí được chỉ định. Phương pháp này được sử dụng để lấy nhân viên từ danh sách và có
    * 
    * @param index - vị trí của nhân viên để lấy lại
    * 
    * @return nhân viên tại vị trí được chỉ định hoặc không có nếu không trong danh sách hoặc chỉ số là ngoài phạm vi
    */
    @Override
    public Employee getEmployeeByPosition(int index) {
        // Trả lại phần tử ở chỉ số được đưa ra.
        if(index >=0 && index < ls.size()){
            return ls.get(index);
        }
        return null;
    }

    /**
    * Mở và đọc tập tin. Phương pháp này được gọi là FileUltil. readFile () và nên trả lại danh sách
    * 
    * 
    * @return Danh sách các đối tượng nhân viên có thể được sử dụng để tạo tài khoản mới trong tệp hoặc không hiệu lực nếu có
    */
    @Override
    public List<Employee> openFile() {
        try {
            ls.clear();
            ls = FileUltil.readFile();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: "+e.getMessage());
        }
        return ls;
    }

    /**
    * Cung cấp dữ liệu nhân viên để lưu. Không được hỗ trợ. Phương pháp này được gọi bởi Neo4j để lưu dữ
    * 
    * @param ls - Danh sách nhân viên
    */
    @Override
    public void saveFile(List<Employee> ls) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
    * Trả lại một danh sách các đối tượng Nhân viên. Điều này được sử dụng để lấp đầy danh sách nhân viên trong cơ sở
    * 
    * 
    * @return danh sách các đối tượng nhân viên hoặc không có nếu không có đối tượng nhân viên trong cơ sở dữ liệu (trong trường hợp này
    */
    @Override
    public List<Employee> getAlls() {
        return ls;
    }

    /**
    * Trả lại số lượng các yếu tố trong danh sách này. Điều này tương đương với kích thước ls. lưu ý rằng danh sách
    * 
    * 
    * @return số các yếu tố trong danh sách này; không bao giờ là null nhưng có thể nhỏ hơn ls. size () nếu có
    */
    @Override
    public int count() {
        return ls.size();
    }
}
