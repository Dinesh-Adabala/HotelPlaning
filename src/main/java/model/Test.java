package model;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Node hotelMG = new Node();
        hotelMG.key="Hotel";
        hotelMG.value="HOTEL DATA";

        List<Node> hotelMGChild = new ArrayList<>();
        Node division = new Node();
        Node department = new Node();
        Node designation = new Node();
        hotelMGChild.add(division);
        hotelMGChild.add(department);
        hotelMGChild.add(designation);

        hotelMG.nodeList=hotelMGChild;

        division.key="Division";
        division.value="Executive Management";
        List<Node> divisionChild = new ArrayList<>();
        Node executiveManagement = new Node();
        executiveManagement.key="division";
        executiveManagement.value="Executive Management";

        List<Node> executiveManagementChild = new ArrayList<>();
        divisionChild.add(executiveManagement);
        division.nodeList=divisionChild;


        department.key="Department";
        department.value="Management Office & Health & Safety ";
        List<Node> departmentChild = new ArrayList<>();
        Node managementOffice = new Node();
        managementOffice.value="Management Office";
        managementOffice.key="Department";
        List<Node> managementOfficeChild = new ArrayList<>();
        departmentChild.add(managementOffice);
        department.nodeList=departmentChild;


        designation.key="Designation";
        designation.value="GM/HM/PA2GM/H&SM";
        List<Node> designationChild = new ArrayList<>();

        Node generalManager = new Node();
        generalManager.key="Designation";
        generalManager.value="generalManager";

        Node hotelManager = new Node();
        hotelManager.key="Designation";
        hotelManager.value="hotelManager";

        Node pa2GeneralManager = new Node();
        pa2GeneralManager.key="Designation";
        pa2GeneralManager.value="pa2GeneralManager";

        Node healthSafetyManager = new Node();
        healthSafetyManager.key="Designation";
        healthSafetyManager.value="healthSafetyManager";
        
        designationChild.add(generalManager);
        designationChild.add(hotelManager);
        designationChild.add(pa2GeneralManager);
        designationChild.add(healthSafetyManager);
        designation.nodeList=designationChild;


        executiveManagementChild.add(managementOffice);
        executiveManagement.nodeList=executiveManagementChild;

        managementOfficeChild.add(generalManager);
        managementOfficeChild.add(hotelManager);
        managementOfficeChild.add(pa2GeneralManager);
        managementOfficeChild.add(healthSafetyManager);
        managementOffice.nodeList=managementOfficeChild;


        NodeService nodeService = new NodeService();
        nodeService.hotelDataInfo(hotelMG);

    }
}
