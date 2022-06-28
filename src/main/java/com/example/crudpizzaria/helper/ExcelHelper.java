package com.example.crudpizzaria.helper;

import com.example.crudpizzaria.domain.Pedido;
import com.example.crudpizzaria.domain.Pizza;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelHelper {
    public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    static String[] HEADERs = {"Mesa", "Valor Total", "Valor Desconto"};
    static String SHEET = "Pedidos";

    public static ByteArrayInputStream pedidosToExcel(List<Pedido> pedidos) {
        try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
            Sheet sheet = workbook.createSheet(SHEET);
            // Header
            Row headerRow = sheet.createRow(0);
            for (int col = 0; col < HEADERs.length; col++) {
                Cell cell = headerRow.createCell(col);
                cell.setCellValue(HEADERs[col]);
            }
            int rowIdx = 1;
            for (Pedido pedido : pedidos) {
                Row row = sheet.createRow(rowIdx++);
                row.createCell(0).setCellValue(pedido.getIdMesa());
                row.createCell(1).setCellValue(pedido.getValorTotal());
                row.createCell(2).setCellValue(pedido.getValorDesconto());
            }
            workbook.write(out);
            return new ByteArrayInputStream(out.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
        }
    }
}
