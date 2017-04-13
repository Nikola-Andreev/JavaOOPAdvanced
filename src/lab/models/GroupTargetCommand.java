package lab.models;

public class GroupTargetCommand implements Command {

    private Target target;
    private AttackGroup group;

    public GroupTargetCommand(AttackGroup group, Target target) {
        this.target = target;
        this.group = group;
    }

    @Override
    public void execute() {
        group.groupTarget(target);
    }
}
