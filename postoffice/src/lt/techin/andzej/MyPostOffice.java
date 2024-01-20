package lt.techin.andzej;

import lt.vtvpmc.java.postoffice.IllegalPackageException;
import lt.vtvpmc.java.postoffice.Package;
import lt.vtvpmc.java.postoffice.PostOffice;

import java.util.ArrayList;
import java.util.List;

public class MyPostOffice implements PostOffice {

    private List<Package> inventory = new ArrayList<>();
    @Override
    public void postPackage(Package aPackage) throws IllegalPackageException {
        if (aPackage == null || aPackage.getPackageCode() == null || aPackage.getOwner() == null) throw new IllegalPackageException();
        if (aPackage.getOwner().isEmpty() || aPackage.getPackageCode().isEmpty()) throw new IllegalPackageException();
        inventory.add(aPackage);
    }

    @Override
    public long numberOfPackagesForOwner(String s) {
        return inventory.stream().filter(p -> p.getOwner().equals(s)).count();
    }

    @Override
    public Package retrievePackage(String s) {
         Package pac = inventory.stream()
                 .filter(p -> p.getPackageCode().equals(s))
                 .findFirst()
                 .orElse(null);
        if (pac != null) inventory.remove(pac);
        return pac;


    }
}
