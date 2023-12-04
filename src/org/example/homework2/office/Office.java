package org.example.homework2.office;

public class Office {
    private Boss boss;
    private Manager manager;
    private Secretary secretary;
    private SecurityGuard securityGuard;

    public Office(Boss boss, Manager manager, Secretary secretary, SecurityGuard securityGuard) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.securityGuard = securityGuard;
    }

    public void startWorkingDay() {
        boss.pushManager(manager);
        manager.scream();
        securityGuard.askForAdvance();
        secretary.calmDown(boss, manager, securityGuard);
    }
}
