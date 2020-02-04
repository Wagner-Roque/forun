package com.baeldung.mapper;

import com.baeldung.dto.DivisionDTO;
import com.baeldung.dto.EmployeeDTO;
import com.baeldung.entity.Division;
import com.baeldung.entity.Employee;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-03T16:51:58-0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDTO employeeToEmployeeDTO(Employee entity) {
        if ( entity == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setEmployeeName( entity.getName() );
        employeeDTO.setEmployeeId( entity.getId() );
        if ( entity.getStartDt() != null ) {
            employeeDTO.setEmployeeStartDt( new SimpleDateFormat( "dd-MM-yyyy HH:mm:ss" ).format( entity.getStartDt() ) );
        }
        employeeDTO.setDivision( divisionToDivisionDTO( entity.getDivision() ) );

        return employeeDTO;
    }

    @Override
    public Employee employeeDTOtoEmployee(EmployeeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setName( dto.getEmployeeName() );
        try {
            if ( dto.getEmployeeStartDt() != null ) {
                employee.setStartDt( new SimpleDateFormat( "dd-MM-yyyy HH:mm:ss" ).parse( dto.getEmployeeStartDt() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        employee.setId( dto.getEmployeeId() );
        employee.setDivision( divisionDTOtoDivision( dto.getDivision() ) );

        return employee;
    }

    @Override
    public DivisionDTO divisionToDivisionDTO(Division entity) {
        if ( entity == null ) {
            return null;
        }

        DivisionDTO divisionDTO = new DivisionDTO();

        divisionDTO.setId( entity.getId() );
        divisionDTO.setName( entity.getName() );

        return divisionDTO;
    }

    @Override
    public Division divisionDTOtoDivision(DivisionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Division division = new Division();

        division.setId( dto.getId() );
        division.setName( dto.getName() );

        return division;
    }

    @Override
    public List<Employee> convertEmployeeDTOListToEmployeeList(List<EmployeeDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Employee> list1 = new ArrayList<Employee>( list.size() );
        for ( EmployeeDTO employeeDTO : list ) {
            list1.add( employeeDTOtoEmployee( employeeDTO ) );
        }

        return list1;
    }

    @Override
    public List<EmployeeDTO> convertEmployeeListToEmployeeDTOList(List<Employee> list) {
        if ( list == null ) {
            return null;
        }

        List<EmployeeDTO> list1 = new ArrayList<EmployeeDTO>( list.size() );
        for ( Employee employee : list ) {
            list1.add( employeeToEmployeeDTO( employee ) );
        }

        return list1;
    }
}
