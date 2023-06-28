package test.session04.practice;

import com.spring.core.session04.proxy.practice4.DeliveryStatus;
import com.spring.core.session04.proxy.practice4.Package;
import com.spring.core.session04.proxy.practice4.PackageService;
import com.spring.core.session04.proxy.practice4.PackageServiceProxy;
import com.spring.core.session04.proxy.practice4.PackageServiceImpl;

public class PackageServiceProxyTest {
    public static void main(String[] args) {
        PackageService packageService = new PackageServiceImpl();
        PackageService proxy = new PackageServiceProxy(packageService);
        
        Package package1 = new Package("10001", "Alice", "Bob", DeliveryStatus.CREATED);
        Package package2 = new Package("10002", "Charlie", "David", DeliveryStatus.CREATED);
        
        proxy.sendPackage(package1);
        proxy.sendPackage(package2);
    }
}

