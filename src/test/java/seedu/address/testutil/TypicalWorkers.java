package seedu.address.testutil;

import static seedu.address.model.entity.Sex.FEMALE;
import static seedu.address.model.entity.Sex.MALE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.entity.worker.Worker;

/**
 * A utility class containing a list of {@code Workers} objects to be used in tests.
 */
public class TypicalWorkers {

    public static final Worker ALICE = new WorkerBuilder().withName("Alice Pauline")
        .withPhone("94351253").withDateJoined("12/12/2019").withSex(FEMALE)
        .withEmploymentStatus("cleaning").build();
    public static final Worker BENSON = new WorkerBuilder().withName("Benson Meier")
        .withPhone("98765432").withDateJoined("12/12/2019").withSex(MALE)
        .withEmploymentStatus("transporting").build();
    public static final Worker CHARLIE = new WorkerBuilder().withName("Charlie Binder")
            .withPhone("98765432").withDateJoined("12/12/2019").withSex(MALE)
            .withEmploymentStatus("transporting").build();
    public static final Worker CLARA = new WorkerBuilder().withName("Clara Doe")
            .withPhone("84371233").withDateJoined("13/12/2019").withSex(FEMALE)
            .withEmploymentStatus("cleaning").build();

    private TypicalWorkers() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical bodies and workers.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Worker worker : getTypicalWorkers()) {
            ab.addEntity(worker);
        }

        return ab;
    }

    public static List<Worker> getTypicalWorkers() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CHARLIE));
    }
}
