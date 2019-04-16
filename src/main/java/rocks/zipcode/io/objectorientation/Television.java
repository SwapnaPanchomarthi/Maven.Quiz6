package rocks.zipcode.io.objectorientation;

public class Television {

    private Integer channel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private TVChannel tvChannel;

    public Television(){
        this.tvChannel=null;
    }

    public TVChannel getTvChannel() {
        return tvChannel;
    }

    public void setTvChannel(TVChannel tvChannel) {
        this.tvChannel = tvChannel;
    }


    public void turnOn() {


    }

    public void setChannel(Integer channel) {
        try {
            this.channel = channel;
        } catch (IllegalStateException e){
            System.out.println(e);
        }
    }

    public TVChannel getChannel() {
        TVChannel tvChannel = TVChannel.getByOrdinal(channel);
        return tvChannel;
    }
}
