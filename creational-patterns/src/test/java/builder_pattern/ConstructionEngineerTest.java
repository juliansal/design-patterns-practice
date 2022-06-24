package builder_pattern;


import helpers.ObjectToJson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConstructionEngineerTest {

    HouseBuilder houseBuilder;
    House house;

    @BeforeEach
    void setup() {
        house = new House();
    }

    @Test
    void shouldConstructConcreteHouse() {
        // Given
        houseBuilder = new ConcreteHouseBuilder(house);
        ConstructionEngineer engineerUnderTest = new ConstructionEngineer(houseBuilder);
        // When
        house = engineerUnderTest.constructHouse();
        // Then
        System.out.println(ObjectToJson.toJson(house));
        assertThat(house)
                .isExactlyInstanceOf(House.class)
                .hasFieldOrPropertyWithValue(
                        "foundation",
                        "Concrete, mortar, brick, and reinforced steel");
    }

    @Test
    void shouldConstructPrefabricatedHouse() {
        houseBuilder = new PrefabricatedHouseBuilder(house);
        ConstructionEngineer engineerUnderTest = new ConstructionEngineer(houseBuilder);

        house = engineerUnderTest.constructHouse();

        System.out.println(ObjectToJson.toJson(house));
        assertThat(house)
                .isExactlyInstanceOf(House.class)
                .hasFieldOrPropertyWithValue(
                        "foundation",
                        "Structural steels and wooden wall panels");
    }
}