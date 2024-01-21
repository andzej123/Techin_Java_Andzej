package lt.techin.andzej;

import lt.vtvpmc.java.postoffice.IllegalPackageException;
import lt.vtvpmc.java.postoffice.Package;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IllegalPackageException {

        Package p = new Package("jonas", "jonas");
        MyPostOffice off = new MyPostOffice();
        off.postPackage(p);
        System.out.println(off.retrievePackage("jonas"));
        System.out.println(off.retrievePackage("jonas"));



    }
}
