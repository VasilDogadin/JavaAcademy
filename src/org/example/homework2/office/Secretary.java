package org.example.homework2.office;

public class Secretary {

    public void calmDown(Boss boss, Manager manager, SecurityGuard securityGuard) {
        System.out.println(boss.getName() + " не волнуйтесь, " + manager.getName() +
                " всё успеет. " + securityGuard.getName() + " подождите!");
    }
}
