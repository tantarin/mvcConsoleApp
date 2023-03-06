package controller;

import model.Student;
import model.StudentService;
import view.StudentView;

import java.util.List;

public class StudentController {
    private StudentView view;
    private StudentService studentService;

    public StudentController(StudentView view) {
        this.view = view;
    }

    public void run() {
        do {
            int menuSelection = getMenuSelection();

            switch(menuSelection) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    getStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 6:
                    keepGoing = false;
                    break;
                default:
                    showIDK();
            }
        } while (state);
        BankUtil.scanner.close();
    }

    private int getMenuSelection(){
        return view.printMenuAndGetSelection();
    }

    private void listStudents() {
        view.displayDisplayAllBanner();
        List<Student> dvdList = studentService.getAllStudents();
        view.displayStudentsList(dvdList);
    }

    private void createStudent() {
        view.displayCreateStudent();
        Student student = view.getStudentInfo();
        studentService.addStudent(student.geId(), student);
        view.displayCreateSuccessBanner();
    }

    private void updateStudent() {
        view.displayDisplayDvdBanner();
        String dvdID = view.getDvdIDChoice();
        DvdCollection dvdCollection = dao.getDvd(dvdID);
        view.displayDvd(dvdCollection);
    }

    private void removeDvd() {
        view.displayRemoveDvdBanner();
        String dvdID = view.getDvdIDChoice();
        DvdCollection removedDvd = dao.removeDvd(dvdID);
        view.displayRemoveResult(removedDvd);
    }

}
