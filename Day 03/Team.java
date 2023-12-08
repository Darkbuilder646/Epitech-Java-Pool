import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Astronaut> teamMember;

    public String getName() {
        return name;
    }

    public Team(String nameOfTheTeam) {
        this.name = nameOfTheTeam;
        this.teamMember = new ArrayList<>();
    }

    public void add(Astronaut astronautToAdd) {
        this.teamMember.add(astronautToAdd);
    }

    public void remove(Astronaut astronautToRemove) {
        boolean removed = teamMember.remove(astronautToRemove);

        if (!removed) {
            System.out.println(astronautToRemove.getName() + " is not in the team.");
        }
    }

    public int countMembers() {
        return teamMember.size();
    }

    public void showMembers() {
        if(this.teamMember.isEmpty()) {
            return;
        }

        StringBuilder message = new StringBuilder(this.name + ": ");
        for (Astronaut astronaut : teamMember) {
            message.append(astronaut.getName());
            if(astronaut.getDestination() != null) {
                message.append(" on mission, ");
            } else {
                message.append(" on standby, ");
            }
        }

        message.delete(message.length()-2, message.length());
        message.append(".");
        System.out.println(message);

    }

}
