package com.spring.core.session04.proxy.practice4;

public class PackageServiceProxy implements PackageService {
    private PackageService packageService;
    
    public PackageServiceProxy(PackageService packageService) {
        this.packageService = packageService;
    }
    
    @Override
    public void sendPackage(Package packageObj) {
        recordDelivery(packageObj);
        packageService.sendPackage(packageObj);
        notifyRecipient(packageObj);
    }
    
    private void recordDelivery(Package packageObj) {
        System.out.println("Delivery recorded for package " + packageObj.getPackageId());
    }
    
    private void notifyRecipient(Package packageObj) {
        Notifier.notify(packageObj.getRecipient());
    }
}

