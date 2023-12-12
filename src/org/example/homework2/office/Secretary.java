package org.example.homework2.office;

public class Secretary {

    public void calmDown(Boss boss, Manager manager, SecurityGuard security) {
        System.out.printf("%s не волнуйтесь, %s всё успеет. %s - подождите\n",
                boss.getName(), manager.getName(), security.getName());
    }
}
