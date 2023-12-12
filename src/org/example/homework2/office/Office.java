package org.example.homework2.office;

public class Office {
    private Boss boss;
    private Manager manager;
    private Secretary secretary;
    private SecurityGuard security;

    public Office(Boss boss, Manager manager, Secretary secretary, SecurityGuard security) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void startWorkingDay() {
        boss.pushManager(manager);
        manager.scream();
        security.askForAdvance();
        secretary.calmDown(boss, manager, security);

    }
}
