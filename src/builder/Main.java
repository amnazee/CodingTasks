package builder;

public class Main {
        public static void main(String[] args) {

            Director director = new Director();

            CarBuilder builder = new CarBuilder();
            director.buildBugatti(builder);
            builder.model("Chiron");
            System.out.println(builder.build());

            CarBuilder builder1=new CarBuilder();
            builder1.color("white");
            builder1.model("Corolla");
            System.out.println(builder1.build());
            Car car=new CarBuilder().color("white").model("toyota").build();


            CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
            director.buildLambo(schemaBuilder);
            schemaBuilder.engine("90").nbrOfDoors(3);
            System.out.println(schemaBuilder.build());

        }
}